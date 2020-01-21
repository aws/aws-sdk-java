/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Application Discovery Service</fullname>
 * <p>
 * AWS Application Discovery Service helps you plan application migration projects. It automatically identifies servers,
 * virtual machines (VMs), and network dependencies in your on-premises data centers. For more information, see the <a
 * href="http://aws.amazon.com/application-discovery/faqs/">AWS Application Discovery Service FAQ</a>. Application
 * Discovery Service offers three ways of performing discovery and collecting data about your on-premises servers:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Agentless discovery</b> is recommended for environments that use VMware vCenter Server. This mode doesn't require
 * you to install an agent on each host. It does not work in non-VMware environments.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Agentless discovery gathers server information regardless of the operating systems, which minimizes the time required
 * for initial on-premises infrastructure assessment.
 * </p>
 * </li>
 * <li>
 * <p>
 * Agentless discovery doesn't collect information about network dependencies, only agent-based discovery collects that
 * information.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <b>Agent-based discovery</b> collects a richer set of data than agentless discovery by using the AWS Application
 * Discovery Agent, which you install on one or more hosts in your data center.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The agent captures infrastructure and application information, including an inventory of running processes, system
 * performance information, resource utilization, and network dependencies.
 * </p>
 * </li>
 * <li>
 * <p>
 * The information collected by agents is secured at rest and in transit to the Application Discovery Service database
 * in the cloud.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <b>AWS Partner Network (APN) solutions</b> integrate with Application Discovery Service, enabling you to import
 * details of your on-premises environment directly into Migration Hub without using the discovery connector or
 * discovery agent.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Third-party application discovery tools can query AWS Application Discovery Service, and they can write to the
 * Application Discovery Service database using the public API.
 * </p>
 * </li>
 * <li>
 * <p>
 * In this way, you can import data into Migration Hub and view it, so that you can associate applications with servers
 * and track migrations.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Recommendations</b>
 * </p>
 * <p>
 * We recommend that you use agent-based discovery for non-VMware environments, and whenever you want to collect
 * information about network dependencies. You can run agent-based and agentless discovery simultaneously. Use agentless
 * discovery to complete the initial infrastructure assessment quickly, and then install agents on select hosts to
 * collect additional information.
 * </p>
 * <p>
 * <b>Working With This Guide</b>
 * </p>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for
 * Application Discovery Service. The topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * Remember that you must set your Migration Hub home region before you call any of these APIs.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must make API calls for write actions (create, notify, associate, disassociate, import, or put) while in your
 * home region, or a <code>HomeRegionNotSetException</code> error is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * API calls for read actions (list, describe, stop, and delete) are permitted outside of your home region.
 * </p>
 * </li>
 * <li>
 * <p>
 * Although it is unlikely, the Migration Hub home region could change. If you call APIs outside the home region, an
 * <code>InvalidInputException</code> is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must call <code>GetHomeRegion</code> to obtain the latest Migration Hub home region.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * This guide is intended for use with the <a
 * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/">AWS Application Discovery Service User
 * Guide</a>.
 * </p>
 * <important>
 * <p>
 * All data is handled according to the <a href="http://aws.amazon.com/privacy/">AWS Privacy Policy</a>. You can operate
 * Application Discovery Service offline to inspect collected data before it is shared with the service.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSApplicationDiscoveryAsyncClient extends AWSApplicationDiscoveryClient implements AWSApplicationDiscoveryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service. A
     * credentials provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service. A
     * credentials provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
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
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSApplicationDiscoveryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSApplicationDiscoveryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSApplicationDiscoveryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSApplicationDiscoveryAsyncClientBuilder asyncBuilder() {
        return AWSApplicationDiscoveryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSApplicationDiscoveryAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest request) {

        return associateConfigurationItemsToApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            final AssociateConfigurationItemsToApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateConfigurationItemsToApplicationRequest, AssociateConfigurationItemsToApplicationResult> asyncHandler) {
        final AssociateConfigurationItemsToApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateConfigurationItemsToApplicationResult>() {
            @Override
            public AssociateConfigurationItemsToApplicationResult call() throws Exception {
                AssociateConfigurationItemsToApplicationResult result = null;

                try {
                    result = executeAssociateConfigurationItemsToApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImportDataResult> batchDeleteImportDataAsync(BatchDeleteImportDataRequest request) {

        return batchDeleteImportDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImportDataResult> batchDeleteImportDataAsync(final BatchDeleteImportDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteImportDataRequest, BatchDeleteImportDataResult> asyncHandler) {
        final BatchDeleteImportDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteImportDataResult>() {
            @Override
            public BatchDeleteImportDataResult call() throws Exception {
                BatchDeleteImportDataResult result = null;

                try {
                    result = executeBatchDeleteImportData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest request) {

        return deleteApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(final DeleteApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationsRequest, DeleteApplicationsResult> asyncHandler) {
        final DeleteApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationsResult>() {
            @Override
            public DeleteApplicationsResult call() throws Exception {
                DeleteApplicationsResult result = null;

                try {
                    result = executeDeleteApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest request) {

        return describeAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(final DescribeAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler) {
        final DescribeAgentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentsResult>() {
            @Override
            public DescribeAgentsResult call() throws Exception {
                DescribeAgentsResult result = null;

                try {
                    result = executeDescribeAgents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest request) {

        return describeConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(final DescribeConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler) {
        final DescribeConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationsResult>() {
            @Override
            public DescribeConfigurationsResult call() throws Exception {
                DescribeConfigurationsResult result = null;

                try {
                    result = executeDescribeConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousExportsResult> describeContinuousExportsAsync(DescribeContinuousExportsRequest request) {

        return describeContinuousExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousExportsResult> describeContinuousExportsAsync(final DescribeContinuousExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContinuousExportsRequest, DescribeContinuousExportsResult> asyncHandler) {
        final DescribeContinuousExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContinuousExportsResult>() {
            @Override
            public DescribeContinuousExportsResult call() throws Exception {
                DescribeContinuousExportsResult result = null;

                try {
                    result = executeDescribeContinuousExports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(DescribeExportConfigurationsRequest request) {

        return describeExportConfigurationsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(final DescribeExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler) {
        final DescribeExportConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportConfigurationsResult>() {
            @Override
            public DescribeExportConfigurationsResult call() throws Exception {
                DescribeExportConfigurationsResult result = null;

                try {
                    result = executeDescribeExportConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(final DescribeExportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {
        final DescribeExportTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportTasksResult>() {
            @Override
            public DescribeExportTasksResult call() throws Exception {
                DescribeExportTasksResult result = null;

                try {
                    result = executeDescribeExportTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImportTasksResult> describeImportTasksAsync(DescribeImportTasksRequest request) {

        return describeImportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportTasksResult> describeImportTasksAsync(final DescribeImportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImportTasksRequest, DescribeImportTasksResult> asyncHandler) {
        final DescribeImportTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportTasksResult>() {
            @Override
            public DescribeImportTasksResult call() throws Exception {
                DescribeImportTasksResult result = null;

                try {
                    result = executeDescribeImportTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
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
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest request) {

        return disassociateConfigurationItemsFromApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            final DisassociateConfigurationItemsFromApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConfigurationItemsFromApplicationRequest, DisassociateConfigurationItemsFromApplicationResult> asyncHandler) {
        final DisassociateConfigurationItemsFromApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConfigurationItemsFromApplicationResult>() {
            @Override
            public DisassociateConfigurationItemsFromApplicationResult call() throws Exception {
                DisassociateConfigurationItemsFromApplicationResult result = null;

                try {
                    result = executeDisassociateConfigurationItemsFromApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest request) {

        return exportConfigurationsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(final ExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler) {
        final ExportConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportConfigurationsResult>() {
            @Override
            public ExportConfigurationsResult call() throws Exception {
                ExportConfigurationsResult result = null;

                try {
                    result = executeExportConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest request) {

        return getDiscoverySummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(final GetDiscoverySummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiscoverySummaryRequest, GetDiscoverySummaryResult> asyncHandler) {
        final GetDiscoverySummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiscoverySummaryResult>() {
            @Override
            public GetDiscoverySummaryResult call() throws Exception {
                GetDiscoverySummaryResult result = null;

                try {
                    result = executeGetDiscoverySummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(final ListConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {
        final ListConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationsResult>() {
            @Override
            public ListConfigurationsResult call() throws Exception {
                ListConfigurationsResult result = null;

                try {
                    result = executeListConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest request) {

        return listServerNeighborsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(final ListServerNeighborsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServerNeighborsRequest, ListServerNeighborsResult> asyncHandler) {
        final ListServerNeighborsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServerNeighborsResult>() {
            @Override
            public ListServerNeighborsResult call() throws Exception {
                ListServerNeighborsResult result = null;

                try {
                    result = executeListServerNeighbors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartContinuousExportResult> startContinuousExportAsync(StartContinuousExportRequest request) {

        return startContinuousExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContinuousExportResult> startContinuousExportAsync(final StartContinuousExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContinuousExportRequest, StartContinuousExportResult> asyncHandler) {
        final StartContinuousExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContinuousExportResult>() {
            @Override
            public StartContinuousExportResult call() throws Exception {
                StartContinuousExportResult result = null;

                try {
                    result = executeStartContinuousExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(StartDataCollectionByAgentIdsRequest request) {

        return startDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            final StartDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler) {
        final StartDataCollectionByAgentIdsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDataCollectionByAgentIdsResult>() {
            @Override
            public StartDataCollectionByAgentIdsResult call() throws Exception {
                StartDataCollectionByAgentIdsResult result = null;

                try {
                    result = executeStartDataCollectionByAgentIds(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest request) {

        return startExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(final StartExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExportTaskRequest, StartExportTaskResult> asyncHandler) {
        final StartExportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExportTaskResult>() {
            @Override
            public StartExportTaskResult call() throws Exception {
                StartExportTaskResult result = null;

                try {
                    result = executeStartExportTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartImportTaskResult> startImportTaskAsync(StartImportTaskRequest request) {

        return startImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportTaskResult> startImportTaskAsync(final StartImportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImportTaskRequest, StartImportTaskResult> asyncHandler) {
        final StartImportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImportTaskResult>() {
            @Override
            public StartImportTaskResult call() throws Exception {
                StartImportTaskResult result = null;

                try {
                    result = executeStartImportTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopContinuousExportResult> stopContinuousExportAsync(StopContinuousExportRequest request) {

        return stopContinuousExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContinuousExportResult> stopContinuousExportAsync(final StopContinuousExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContinuousExportRequest, StopContinuousExportResult> asyncHandler) {
        final StopContinuousExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContinuousExportResult>() {
            @Override
            public StopContinuousExportResult call() throws Exception {
                StopContinuousExportResult result = null;

                try {
                    result = executeStopContinuousExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(StopDataCollectionByAgentIdsRequest request) {

        return stopDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(final StopDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler) {
        final StopDataCollectionByAgentIdsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDataCollectionByAgentIdsResult>() {
            @Override
            public StopDataCollectionByAgentIdsResult call() throws Exception {
                StopDataCollectionByAgentIdsResult result = null;

                try {
                    result = executeStopDataCollectionByAgentIds(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
