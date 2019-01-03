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
package com.amazonaws.services.opsworkscm;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing OpsWorksCM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS OpsWorks CM</fullname>
 * <p>
 * AWS OpsWorks for configuration management (CM) is a service that runs and manages configuration management servers.
 * You can use AWS OpsWorks CM to create and manage AWS OpsWorks for Chef Automate and AWS OpsWorks for Puppet
 * Enterprise servers, and add or remove nodes for the servers to manage.
 * </p>
 * <p>
 * <b>Glossary of terms</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A configuration management server that can be highly-available. The configuration management server
 * runs on an Amazon Elastic Compute Cloud (EC2) instance, and may use various other AWS services, such as Amazon
 * Relational Database Service (RDS) and Elastic Load Balancing. A server is a generic abstraction over the
 * configuration manager that you want to use, much like Amazon RDS. In AWS OpsWorks CM, you do not start or stop
 * servers. After you create servers, they continue to run until they are deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Engine</b>: The engine is the specific configuration manager that you want to use. Valid values in this release
 * include <code>Chef</code> and <code>Puppet</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Backup</b>: This is an application-level backup of the data that the configuration manager stores. AWS OpsWorks CM
 * creates an S3 bucket for backups when you launch the first server. A backup maintains a snapshot of a server's
 * configuration-related attributes at the time the backup starts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Events</b>: Events are always related to a server. Events are written during server creation, when health checks
 * run, when backups are created, when system maintenance is performed, etc. When you delete a server, the server's
 * events are also deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Account attributes</b>: Every account has attributes that are assigned in the AWS OpsWorks CM database. These
 * attributes store information about configuration limits (servers, backups, etc.) and your customer account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks CM supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Your
 * servers can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks-cm.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Throttling limits</b>
 * </p>
 * <p>
 * All API operations allow for five requests per second with a burst of 10 requests per second.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpsWorksCMAsyncClient extends AWSOpsWorksCMClient implements AWSOpsWorksCMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM. A credentials provider chain will
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
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the provided AWS account
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
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSOpsWorksCMAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksCMAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSOpsWorksCMAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSOpsWorksCMAsyncClientBuilder asyncBuilder() {
        return AWSOpsWorksCMAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpsWorksCM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksCMAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest request) {

        return associateNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(final AssociateNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateNodeRequest, AssociateNodeResult> asyncHandler) {
        final AssociateNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateNodeResult>() {
            @Override
            public AssociateNodeResult call() throws Exception {
                AssociateNodeResult result = null;

                try {
                    result = executeAssociateNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(final CreateBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {
        final CreateBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackupResult>() {
            @Override
            public CreateBackupResult call() throws Exception {
                CreateBackupResult result = null;

                try {
                    result = executeCreateBackup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request) {

        return createServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(final CreateServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler) {
        final CreateServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServerResult>() {
            @Override
            public CreateServerResult call() throws Exception {
                CreateServerResult result = null;

                try {
                    result = executeCreateServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(final DeleteBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {
        final DeleteBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupResult>() {
            @Override
            public DeleteBackupResult call() throws Exception {
                DeleteBackupResult result = null;

                try {
                    result = executeDeleteBackup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request) {

        return deleteServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(final DeleteServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler) {
        final DeleteServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServerResult>() {
            @Override
            public DeleteServerResult call() throws Exception {
                DeleteServerResult result = null;

                try {
                    result = executeDeleteServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(final DescribeBackupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {
        final DescribeBackupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBackupsResult>() {
            @Override
            public DescribeBackupsResult call() throws Exception {
                DescribeBackupsResult result = null;

                try {
                    result = executeDescribeBackups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(DescribeNodeAssociationStatusRequest request) {

        return describeNodeAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(
            final DescribeNodeAssociationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNodeAssociationStatusRequest, DescribeNodeAssociationStatusResult> asyncHandler) {
        final DescribeNodeAssociationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNodeAssociationStatusResult>() {
            @Override
            public DescribeNodeAssociationStatusResult call() throws Exception {
                DescribeNodeAssociationStatusResult result = null;

                try {
                    result = executeDescribeNodeAssociationStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest request) {

        return describeServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServersResult> describeServersAsync(final DescribeServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServersRequest, DescribeServersResult> asyncHandler) {
        final DescribeServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServersResult>() {
            @Override
            public DescribeServersResult call() throws Exception {
                DescribeServersResult result = null;

                try {
                    result = executeDescribeServers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest request) {

        return disassociateNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(final DisassociateNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateNodeRequest, DisassociateNodeResult> asyncHandler) {
        final DisassociateNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateNodeResult>() {
            @Override
            public DisassociateNodeResult call() throws Exception {
                DisassociateNodeResult result = null;

                try {
                    result = executeDisassociateNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExportServerEngineAttributeResult> exportServerEngineAttributeAsync(ExportServerEngineAttributeRequest request) {

        return exportServerEngineAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportServerEngineAttributeResult> exportServerEngineAttributeAsync(final ExportServerEngineAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportServerEngineAttributeRequest, ExportServerEngineAttributeResult> asyncHandler) {
        final ExportServerEngineAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportServerEngineAttributeResult>() {
            @Override
            public ExportServerEngineAttributeResult call() throws Exception {
                ExportServerEngineAttributeResult result = null;

                try {
                    result = executeExportServerEngineAttribute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest request) {

        return restoreServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(final RestoreServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreServerRequest, RestoreServerResult> asyncHandler) {
        final RestoreServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreServerResult>() {
            @Override
            public RestoreServerResult call() throws Exception {
                RestoreServerResult result = null;

                try {
                    result = executeRestoreServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest request) {

        return startMaintenanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(final StartMaintenanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMaintenanceRequest, StartMaintenanceResult> asyncHandler) {
        final StartMaintenanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMaintenanceResult>() {
            @Override
            public StartMaintenanceResult call() throws Exception {
                StartMaintenanceResult result = null;

                try {
                    result = executeStartMaintenance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request) {

        return updateServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(final UpdateServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler) {
        final UpdateServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServerResult>() {
            @Override
            public UpdateServerResult call() throws Exception {
                UpdateServerResult result = null;

                try {
                    result = executeUpdateServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(UpdateServerEngineAttributesRequest request) {

        return updateServerEngineAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(final UpdateServerEngineAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServerEngineAttributesRequest, UpdateServerEngineAttributesResult> asyncHandler) {
        final UpdateServerEngineAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServerEngineAttributesResult>() {
            @Override
            public UpdateServerEngineAttributesResult call() throws Exception {
                UpdateServerEngineAttributesResult result = null;

                try {
                    result = executeUpdateServerEngineAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
