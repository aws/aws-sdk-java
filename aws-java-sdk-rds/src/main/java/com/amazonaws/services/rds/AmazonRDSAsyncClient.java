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
package com.amazonaws.services.rds;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon RDS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizeable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * database instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Note that Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command has been applied. In this reference, the
 * parameter descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list following some related topics from the user
 * guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonRDSAsyncClient extends AmazonRDSClient implements AmazonRDSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS. A credentials provider chain will
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
    public AmazonRDSAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonRDSAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the provided AWS account
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
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRDSAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon RDS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRDSAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(AddSourceIdentifierToSubscriptionRequest request) {

        return addSourceIdentifierToSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(final AddSourceIdentifierToSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result;

                try {
                    result = addSourceIdentifierToSubscription(request);
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
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request) {

        return applyPendingMaintenanceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(
            final ApplyPendingMaintenanceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResourcePendingMaintenanceActions>() {
            @Override
            public ResourcePendingMaintenanceActions call() throws Exception {
                ResourcePendingMaintenanceActions result;

                try {
                    result = applyPendingMaintenanceAction(request);
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
    public java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(AuthorizeDBSecurityGroupIngressRequest request) {

        return authorizeDBSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(final AuthorizeDBSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSecurityGroup>() {
            @Override
            public DBSecurityGroup call() throws Exception {
                DBSecurityGroup result;

                try {
                    result = authorizeDBSecurityGroupIngress(request);
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
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest request) {

        return copyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(final CopyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result;

                try {
                    result = copyDBClusterParameterGroup(request);
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
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest request) {

        return copyDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(final CopyDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result;

                try {
                    result = copyDBClusterSnapshot(request);
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
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest request) {

        return copyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(final CopyDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBParameterGroupRequest, DBParameterGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBParameterGroup>() {
            @Override
            public DBParameterGroup call() throws Exception {
                DBParameterGroup result;

                try {
                    result = copyDBParameterGroup(request);
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
    public java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(CopyDBSnapshotRequest request) {

        return copyDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(final CopyDBSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyDBSnapshotRequest, DBSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSnapshot>() {
            @Override
            public DBSnapshot call() throws Exception {
                DBSnapshot result;

                try {
                    result = copyDBSnapshot(request);
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
    public java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(CopyOptionGroupRequest request) {

        return copyOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(final CopyOptionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyOptionGroupRequest, OptionGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<OptionGroup>() {
            @Override
            public OptionGroup call() throws Exception {
                OptionGroup result;

                try {
                    result = copyOptionGroup(request);
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
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request) {

        return createDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(final CreateDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = createDBCluster(request);
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
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(CreateDBClusterParameterGroupRequest request) {

        return createDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(final CreateDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterParameterGroup>() {
            @Override
            public DBClusterParameterGroup call() throws Exception {
                DBClusterParameterGroup result;

                try {
                    result = createDBClusterParameterGroup(request);
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
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest request) {

        return createDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(final CreateDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result;

                try {
                    result = createDBClusterSnapshot(request);
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
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest request) {

        return createDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(final CreateDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = createDBInstance(request);
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
    public java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(CreateDBInstanceReadReplicaRequest request) {

        return createDBInstanceReadReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(final CreateDBInstanceReadReplicaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBInstanceReadReplicaRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = createDBInstanceReadReplica(request);
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
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request) {

        return createDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(final CreateDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBParameterGroup>() {
            @Override
            public DBParameterGroup call() throws Exception {
                DBParameterGroup result;

                try {
                    result = createDBParameterGroup(request);
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
    public java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest request) {

        return createDBSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(final CreateDBSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBSecurityGroupRequest, DBSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSecurityGroup>() {
            @Override
            public DBSecurityGroup call() throws Exception {
                DBSecurityGroup result;

                try {
                    result = createDBSecurityGroup(request);
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
    public java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest request) {

        return createDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(final CreateDBSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBSnapshotRequest, DBSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSnapshot>() {
            @Override
            public DBSnapshot call() throws Exception {
                DBSnapshot result;

                try {
                    result = createDBSnapshot(request);
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
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest request) {

        return createDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(final CreateDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result;

                try {
                    result = createDBSubnetGroup(request);
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
    public java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(CreateOptionGroupRequest request) {

        return createOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(final CreateOptionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOptionGroupRequest, OptionGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<OptionGroup>() {
            @Override
            public OptionGroup call() throws Exception {
                OptionGroup result;

                try {
                    result = createOptionGroup(request);
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
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request) {

        return deleteDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(final DeleteDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = deleteDBCluster(request);
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
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(DeleteDBClusterParameterGroupRequest request) {

        return deleteDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(
            final DeleteDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBClusterParameterGroupResult>() {
            @Override
            public DeleteDBClusterParameterGroupResult call() throws Exception {
                DeleteDBClusterParameterGroupResult result;

                try {
                    result = deleteDBClusterParameterGroup(request);
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
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest request) {

        return deleteDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(final DeleteDBClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshot>() {
            @Override
            public DBClusterSnapshot call() throws Exception {
                DBClusterSnapshot result;

                try {
                    result = deleteDBClusterSnapshot(request);
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
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest request) {

        return deleteDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(final DeleteDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = deleteDBInstance(request);
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
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request) {

        return deleteDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(final DeleteDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBParameterGroupResult>() {
            @Override
            public DeleteDBParameterGroupResult call() throws Exception {
                DeleteDBParameterGroupResult result;

                try {
                    result = deleteDBParameterGroup(request);
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
    public java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest request) {

        return deleteDBSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(final DeleteDBSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBSecurityGroupRequest, DeleteDBSecurityGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBSecurityGroupResult>() {
            @Override
            public DeleteDBSecurityGroupResult call() throws Exception {
                DeleteDBSecurityGroupResult result;

                try {
                    result = deleteDBSecurityGroup(request);
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
    public java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest request) {

        return deleteDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(final DeleteDBSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBSnapshotRequest, DBSnapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSnapshot>() {
            @Override
            public DBSnapshot call() throws Exception {
                DBSnapshot result;

                try {
                    result = deleteDBSnapshot(request);
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
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest request) {

        return deleteDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(final DeleteDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDBSubnetGroupResult>() {
            @Override
            public DeleteDBSubnetGroupResult call() throws Exception {
                DeleteDBSubnetGroupResult result;

                try {
                    result = deleteDBSubnetGroup(request);
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
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result;

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
    public java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(DeleteOptionGroupRequest request) {

        return deleteOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(final DeleteOptionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOptionGroupRequest, DeleteOptionGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteOptionGroupResult>() {
            @Override
            public DeleteOptionGroupResult call() throws Exception {
                DeleteOptionGroupResult result;

                try {
                    result = deleteOptionGroup(request);
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

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync() {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the DescribeCertificates operation.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync() {

        return describeCertificatesAsync(new DescribeCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCertificates operation with an AsyncHandler.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler) {

        return describeCertificatesAsync(new DescribeCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest request) {

        return describeDBClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            final DescribeDBClusterParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParameterGroupsResult>() {
            @Override
            public DescribeDBClusterParameterGroupsResult call() throws Exception {
                DescribeDBClusterParameterGroupsResult result;

                try {
                    result = describeDBClusterParameterGroups(request);
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
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync() {

        return describeDBClusterParameterGroupsAsync(new DescribeDBClusterParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {

        return describeDBClusterParameterGroupsAsync(new DescribeDBClusterParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(DescribeDBClusterParametersRequest request) {

        return describeDBClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(final DescribeDBClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterParametersResult>() {
            @Override
            public DescribeDBClusterParametersResult call() throws Exception {
                DescribeDBClusterParametersResult result;

                try {
                    result = describeDBClusterParameters(request);
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
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest request) {

        return describeDBClusterSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            final DescribeDBClusterSnapshotAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result;

                try {
                    result = describeDBClusterSnapshotAttributes(request);
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
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest request) {

        return describeDBClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(final DescribeDBClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClusterSnapshotsResult>() {
            @Override
            public DescribeDBClusterSnapshotsResult call() throws Exception {
                DescribeDBClusterSnapshotsResult result;

                try {
                    result = describeDBClusterSnapshots(request);
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
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync() {

        return describeDBClusterSnapshotsAsync(new DescribeDBClusterSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {

        return describeDBClusterSnapshotsAsync(new DescribeDBClusterSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request) {

        return describeDBClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(final DescribeDBClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBClustersResult>() {
            @Override
            public DescribeDBClustersResult call() throws Exception {
                DescribeDBClustersResult result;

                try {
                    result = describeDBClusters(request);
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
     * Simplified method form for invoking the DescribeDBClusters operation.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync() {

        return describeDBClustersAsync(new DescribeDBClustersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusters operation with an AsyncHandler.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {

        return describeDBClustersAsync(new DescribeDBClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest request) {

        return describeDBEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(final DescribeDBEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBEngineVersionsResult>() {
            @Override
            public DescribeDBEngineVersionsResult call() throws Exception {
                DescribeDBEngineVersionsResult result;

                try {
                    result = describeDBEngineVersions(request);
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
     * Simplified method form for invoking the DescribeDBEngineVersions operation.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync() {

        return describeDBEngineVersionsAsync(new DescribeDBEngineVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation with an AsyncHandler.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {

        return describeDBEngineVersionsAsync(new DescribeDBEngineVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request) {

        return describeDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(final DescribeDBInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBInstancesResult>() {
            @Override
            public DescribeDBInstancesResult call() throws Exception {
                DescribeDBInstancesResult result;

                try {
                    result = describeDBInstances(request);
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
     * Simplified method form for invoking the DescribeDBInstances operation.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync() {

        return describeDBInstancesAsync(new DescribeDBInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBInstances operation with an AsyncHandler.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {

        return describeDBInstancesAsync(new DescribeDBInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(DescribeDBLogFilesRequest request) {

        return describeDBLogFilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(final DescribeDBLogFilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBLogFilesRequest, DescribeDBLogFilesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBLogFilesResult>() {
            @Override
            public DescribeDBLogFilesResult call() throws Exception {
                DescribeDBLogFilesResult result;

                try {
                    result = describeDBLogFiles(request);
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
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest request) {

        return describeDBParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(final DescribeDBParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBParameterGroupsResult>() {
            @Override
            public DescribeDBParameterGroupsResult call() throws Exception {
                DescribeDBParameterGroupsResult result;

                try {
                    result = describeDBParameterGroups(request);
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
     * Simplified method form for invoking the DescribeDBParameterGroups operation.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync() {

        return describeDBParameterGroupsAsync(new DescribeDBParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler) {

        return describeDBParameterGroupsAsync(new DescribeDBParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest request) {

        return describeDBParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(final DescribeDBParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBParametersRequest, DescribeDBParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBParametersResult>() {
            @Override
            public DescribeDBParametersResult call() throws Exception {
                DescribeDBParametersResult result;

                try {
                    result = describeDBParameters(request);
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
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest request) {

        return describeDBSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(final DescribeDBSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBSecurityGroupsResult>() {
            @Override
            public DescribeDBSecurityGroupsResult call() throws Exception {
                DescribeDBSecurityGroupsResult result;

                try {
                    result = describeDBSecurityGroups(request);
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
     * Simplified method form for invoking the DescribeDBSecurityGroups operation.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync() {

        return describeDBSecurityGroupsAsync(new DescribeDBSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler) {

        return describeDBSecurityGroupsAsync(new DescribeDBSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest request) {

        return describeDBSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(final DescribeDBSnapshotAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSnapshotAttributesResult>() {
            @Override
            public DBSnapshotAttributesResult call() throws Exception {
                DBSnapshotAttributesResult result;

                try {
                    result = describeDBSnapshotAttributes(request);
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
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync() {

        return describeDBSnapshotAttributesAsync(new DescribeDBSnapshotAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler) {

        return describeDBSnapshotAttributesAsync(new DescribeDBSnapshotAttributesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest request) {

        return describeDBSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(final DescribeDBSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBSnapshotsResult>() {
            @Override
            public DescribeDBSnapshotsResult call() throws Exception {
                DescribeDBSnapshotsResult result;

                try {
                    result = describeDBSnapshots(request);
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
     * Simplified method form for invoking the DescribeDBSnapshots operation.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync() {

        return describeDBSnapshotsAsync(new DescribeDBSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler) {

        return describeDBSnapshotsAsync(new DescribeDBSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request) {

        return describeDBSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(final DescribeDBSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDBSubnetGroupsResult>() {
            @Override
            public DescribeDBSubnetGroupsResult call() throws Exception {
                DescribeDBSubnetGroupsResult result;

                try {
                    result = describeDBSubnetGroups(request);
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
     * Simplified method form for invoking the DescribeDBSubnetGroups operation.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync() {

        return describeDBSubnetGroupsAsync(new DescribeDBSubnetGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {

        return describeDBSubnetGroupsAsync(new DescribeDBSubnetGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(DescribeEngineDefaultClusterParametersRequest request) {

        return describeEngineDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(final DescribeEngineDefaultClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EngineDefaults>() {
            @Override
            public EngineDefaults call() throws Exception {
                EngineDefaults result;

                try {
                    result = describeEngineDefaultClusterParameters(request);
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
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest request) {

        return describeEngineDefaultParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(final DescribeEngineDefaultParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EngineDefaults>() {
            @Override
            public EngineDefaults call() throws Exception {
                EngineDefaults result;

                try {
                    result = describeEngineDefaultParameters(request);
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
    public java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(DescribeOptionGroupOptionsRequest request) {

        return describeOptionGroupOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(final DescribeOptionGroupOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupOptionsRequest, DescribeOptionGroupOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptionGroupOptionsResult>() {
            @Override
            public DescribeOptionGroupOptionsResult call() throws Exception {
                DescribeOptionGroupOptionsResult result;

                try {
                    result = describeOptionGroupOptions(request);
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
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(DescribeOptionGroupsRequest request) {

        return describeOptionGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(final DescribeOptionGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptionGroupsResult>() {
            @Override
            public DescribeOptionGroupsResult call() throws Exception {
                DescribeOptionGroupsResult result;

                try {
                    result = describeOptionGroups(request);
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
     * Simplified method form for invoking the DescribeOptionGroups operation.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync() {

        return describeOptionGroupsAsync(new DescribeOptionGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation with an AsyncHandler.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler) {

        return describeOptionGroupsAsync(new DescribeOptionGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest request) {

        return describeOrderableDBInstanceOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            final DescribeOrderableDBInstanceOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableDBInstanceOptionsResult>() {
            @Override
            public DescribeOrderableDBInstanceOptionsResult call() throws Exception {
                DescribeOrderableDBInstanceOptionsResult result;

                try {
                    result = describeOrderableDBInstanceOptions(request);
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
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request) {

        return describePendingMaintenanceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            final DescribePendingMaintenanceActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribePendingMaintenanceActionsResult>() {
            @Override
            public DescribePendingMaintenanceActionsResult call() throws Exception {
                DescribePendingMaintenanceActionsResult result;

                try {
                    result = describePendingMaintenanceActions(request);
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
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync() {

        return describePendingMaintenanceActionsAsync(new DescribePendingMaintenanceActionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation with an AsyncHandler.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {

        return describePendingMaintenanceActionsAsync(new DescribePendingMaintenanceActionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest request) {

        return describeReservedDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(final DescribeReservedDBInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedDBInstancesResult>() {
            @Override
            public DescribeReservedDBInstancesResult call() throws Exception {
                DescribeReservedDBInstancesResult result;

                try {
                    result = describeReservedDBInstances(request);
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
     * Simplified method form for invoking the DescribeReservedDBInstances operation.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync() {

        return describeReservedDBInstancesAsync(new DescribeReservedDBInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler) {

        return describeReservedDBInstancesAsync(new DescribeReservedDBInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            DescribeReservedDBInstancesOfferingsRequest request) {

        return describeReservedDBInstancesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            final DescribeReservedDBInstancesOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedDBInstancesOfferingsResult>() {
            @Override
            public DescribeReservedDBInstancesOfferingsResult call() throws Exception {
                DescribeReservedDBInstancesOfferingsResult result;

                try {
                    result = describeReservedDBInstancesOfferings(request);
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
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync() {

        return describeReservedDBInstancesOfferingsAsync(new DescribeReservedDBInstancesOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler) {

        return describeReservedDBInstancesOfferingsAsync(new DescribeReservedDBInstancesOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(DescribeSourceRegionsRequest request) {

        return describeSourceRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(final DescribeSourceRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSourceRegionsRequest, DescribeSourceRegionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSourceRegionsResult>() {
            @Override
            public DescribeSourceRegionsResult call() throws Exception {
                DescribeSourceRegionsResult result;

                try {
                    result = describeSourceRegions(request);
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
    public java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(DownloadDBLogFilePortionRequest request) {

        return downloadDBLogFilePortionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(final DownloadDBLogFilePortionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DownloadDBLogFilePortionRequest, DownloadDBLogFilePortionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DownloadDBLogFilePortionResult>() {
            @Override
            public DownloadDBLogFilePortionResult call() throws Exception {
                DownloadDBLogFilePortionResult result;

                try {
                    result = downloadDBLogFilePortion(request);
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
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request) {

        return failoverDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(final FailoverDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = failoverDBCluster(request);
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
     * Simplified method form for invoking the FailoverDBCluster operation.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest)
     */
    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync() {

        return failoverDBClusterAsync(new FailoverDBClusterRequest());
    }

    /**
     * Simplified method form for invoking the FailoverDBCluster operation with an AsyncHandler.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {

        return failoverDBClusterAsync(new FailoverDBClusterRequest(), asyncHandler);
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
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request) {

        return modifyDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(final ModifyDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = modifyDBCluster(request);
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
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(ModifyDBClusterParameterGroupRequest request) {

        return modifyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(
            final ModifyDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBClusterParameterGroupResult>() {
            @Override
            public ModifyDBClusterParameterGroupResult call() throws Exception {
                ModifyDBClusterParameterGroupResult result;

                try {
                    result = modifyDBClusterParameterGroup(request);
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
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(ModifyDBClusterSnapshotAttributeRequest request) {

        return modifyDBClusterSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            final ModifyDBClusterSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBClusterSnapshotAttributesResult>() {
            @Override
            public DBClusterSnapshotAttributesResult call() throws Exception {
                DBClusterSnapshotAttributesResult result;

                try {
                    result = modifyDBClusterSnapshotAttribute(request);
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
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest request) {

        return modifyDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(final ModifyDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = modifyDBInstance(request);
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
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest request) {

        return modifyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(final ModifyDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyDBParameterGroupResult>() {
            @Override
            public ModifyDBParameterGroupResult call() throws Exception {
                ModifyDBParameterGroupResult result;

                try {
                    result = modifyDBParameterGroup(request);
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
    public java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(ModifyDBSnapshotAttributeRequest request) {

        return modifyDBSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(final ModifyDBSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBSnapshotAttributeRequest, DBSnapshotAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSnapshotAttributesResult>() {
            @Override
            public DBSnapshotAttributesResult call() throws Exception {
                DBSnapshotAttributesResult result;

                try {
                    result = modifyDBSnapshotAttribute(request);
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
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest request) {

        return modifyDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(final ModifyDBSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSubnetGroup>() {
            @Override
            public DBSubnetGroup call() throws Exception {
                DBSubnetGroup result;

                try {
                    result = modifyDBSubnetGroup(request);
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
    public java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(ModifyOptionGroupRequest request) {

        return modifyOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(final ModifyOptionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyOptionGroupRequest, OptionGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<OptionGroup>() {
            @Override
            public OptionGroup call() throws Exception {
                OptionGroup result;

                try {
                    result = modifyOptionGroup(request);
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
    public java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(PromoteReadReplicaRequest request) {

        return promoteReadReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(final PromoteReadReplicaRequest request,
            final com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = promoteReadReplica(request);
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
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request) {

        return promoteReadReplicaDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(final PromoteReadReplicaDBClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaDBClusterRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = promoteReadReplicaDBCluster(request);
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
    public java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(PurchaseReservedDBInstancesOfferingRequest request) {

        return purchaseReservedDBInstancesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(final PurchaseReservedDBInstancesOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedDBInstancesOfferingRequest, ReservedDBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReservedDBInstance>() {
            @Override
            public ReservedDBInstance call() throws Exception {
                ReservedDBInstance result;

                try {
                    result = purchaseReservedDBInstancesOffering(request);
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
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest request) {

        return rebootDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(final RebootDBInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = rebootDBInstance(request);
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
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(RemoveSourceIdentifierFromSubscriptionRequest request) {

        return removeSourceIdentifierFromSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            final RemoveSourceIdentifierFromSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result;

                try {
                    result = removeSourceIdentifierFromSubscription(request);
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
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(ResetDBClusterParameterGroupRequest request) {

        return resetDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(final ResetDBClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetDBClusterParameterGroupResult>() {
            @Override
            public ResetDBClusterParameterGroupResult call() throws Exception {
                ResetDBClusterParameterGroupResult result;

                try {
                    result = resetDBClusterParameterGroup(request);
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
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest request) {

        return resetDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(final ResetDBParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDBParameterGroupRequest, ResetDBParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetDBParameterGroupResult>() {
            @Override
            public ResetDBParameterGroupResult call() throws Exception {
                ResetDBParameterGroupResult result;

                try {
                    result = resetDBParameterGroup(request);
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
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(RestoreDBClusterFromS3Request request) {

        return restoreDBClusterFromS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(final RestoreDBClusterFromS3Request request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromS3Request, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = restoreDBClusterFromS3(request);
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
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest request) {

        return restoreDBClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(final RestoreDBClusterFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = restoreDBClusterFromSnapshot(request);
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
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest request) {

        return restoreDBClusterToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(final RestoreDBClusterToPointInTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBCluster>() {
            @Override
            public DBCluster call() throws Exception {
                DBCluster result;

                try {
                    result = restoreDBClusterToPointInTime(request);
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
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest request) {

        return restoreDBInstanceFromDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(final RestoreDBInstanceFromDBSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceFromDBSnapshotRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = restoreDBInstanceFromDBSnapshot(request);
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
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest request) {

        return restoreDBInstanceToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(final RestoreDBInstanceToPointInTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceToPointInTimeRequest, DBInstance> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBInstance>() {
            @Override
            public DBInstance call() throws Exception {
                DBInstance result;

                try {
                    result = restoreDBInstanceToPointInTime(request);
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
    public java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest request) {

        return revokeDBSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(final RevokeDBSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DBSecurityGroup>() {
            @Override
            public DBSecurityGroup call() throws Exception {
                DBSecurityGroup result;

                try {
                    result = revokeDBSecurityGroupIngress(request);
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
