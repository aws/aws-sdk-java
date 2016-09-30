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
package com.amazonaws.services.applicationdiscovery;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The AWS Application Discovery Service helps Systems Integrators quickly and reliably plan application migration
 * projects by automatically identifying applications running in on-premises data centers, their associated
 * dependencies, and their performance profile.
 * </p>
 * <p>
 * Planning data center migrations can involve thousands of workloads that are often deeply interdependent. Application
 * discovery and dependency mapping are important early first steps in the migration process, but difficult to perform
 * at scale due to the lack of automated tools.
 * </p>
 * <p>
 * The AWS Application Discovery Service automatically collects configuration and usage data from servers to develop a
 * list of applications, how they perform, and how they are interdependent. This information is securely retained in an
 * AWS Application Discovery Service database which you can export as a CSV file into your preferred visualization tool
 * or cloud migration solution to help reduce the complexity and time in planning your cloud migration.
 * </p>
 * <p>
 * The Application Discovery Service is currently available for preview. Only customers who are engaged with <a
 * href="https://aws.amazon.com/professional-services/">AWS Professional Services</a> or a certified AWS partner can use
 * the service. To see the list of certified partners and request access to the Application Discovery Service, complete
 * the following <a href="http://aws.amazon.com/application-discovery/preview/">preview form</a>.
 * </p>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for the
 * Discovery Service. The topic for each action shows the API request parameters and the response. Alternatively, you
 * can use one of the AWS SDKs to access an API that is tailored to the programming language or platform that you're
 * using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * This guide is intended for use with the <a
 * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/what-is-appdiscovery.html"> <i>AWS Discovery
 * Service User Guide</i> </a>.
 * </p>
 * <p>
 * The following are short descriptions of each API action, organized by function.
 * </p>
 * <p>
 * <b>Managing AWS Agents Using the Application Discovery Service</b>
 * </p>
 * <p>
 * An AWS agent is software that you install on on-premises servers and virtual machines that are targeted for discovery
 * and migration. Agents run on Linux and Windows Server and collect server configuration and activity information about
 * your applications and infrastructure. Specifically, agents collect the following information and send it to the
 * Application Discovery Service using Secure Sockets Layer (SSL) encryption:
 * </p>
 * <ul>
 * <li>
 * <p>
 * User information (user name, home directory)
 * </p>
 * </li>
 * <li>
 * <p>
 * Group information (name)
 * </p>
 * </li>
 * <li>
 * <p>
 * List of installed packages
 * </p>
 * </li>
 * <li>
 * <p>
 * List of kernel modules
 * </p>
 * </li>
 * <li>
 * <p>
 * All create and stop process events
 * </p>
 * </li>
 * <li>
 * <p>
 * DNS queries
 * </p>
 * </li>
 * <li>
 * <p>
 * NIC information
 * </p>
 * </li>
 * <li>
 * <p>
 * TCP/UDP process listening ports
 * </p>
 * </li>
 * <li>
 * <p>
 * TCPV4/V6 connections
 * </p>
 * </li>
 * <li>
 * <p>
 * Operating system information
 * </p>
 * </li>
 * <li>
 * <p>
 * System performance
 * </p>
 * </li>
 * <li>
 * <p>
 * Process performance
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Application Discovery Service API includes the following actions to manage AWS agents:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>StartDataCollectionByAgentIds</i>: Instructs the specified agents to start collecting data. The Application
 * Discovery Service takes several minutes to receive and process data after you initiate data collection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>StopDataCollectionByAgentIds</i>: Instructs the specified agents to stop collecting data.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeAgents</i>: Lists AWS agents by ID or lists all agents associated with your user account if you did not
 * specify an agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health,
 * host name where the agent resides, and the version number of each agent.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Querying Configuration Items</b>
 * </p>
 * <p>
 * A <i>configuration item</i> is an IT asset that was discovered in your data center by an AWS agent. When you use the
 * Application Discovery Service, you can specify filters and query specific configuration items. The service supports
 * Server, Process, and Connection configuration items. This means you can specify a value for the following keys and
 * query your IT assets:
 * </p>
 * <p class="title">
 * <b>Server</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * server.HostName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * server.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.agentId
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Process</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * process.name
 * </p>
 * </li>
 * <li>
 * <p>
 * process.CommandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * process.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * server.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.agentId
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Connection</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * connection.sourceIp
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.sourcePort
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.destinationIp
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.destinationPort
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.commandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.name
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcessId.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcess.commandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcess.name
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.osVersion
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Application Discovery Service includes the following actions for querying configuration items.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>DescribeConfigurations</i>: Retrieves a list of attributes for a specific configuration ID. For example, the
 * output for a <i>server</i> configuration item includes a list of attributes about the server, including host name,
 * operating system, number of network cards, etc.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListConfigurations</i>: Retrieves a list of configuration items according to the criteria you specify in a filter.
 * The filter criteria identify relationship requirements. For example, you can specify filter criteria of process.name
 * with values of <i>nginx</i> and <i>apache</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging Discovered Configuration Items</b>
 * </p>
 * <p>
 * You can tag discovered configuration items. Tags are metadata that help you categorize IT assets in your data center.
 * Tags use a <i>key</i>-<i>value</i> format. For example, <code>{"key": "serverType", "value": "webServer"}</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>CreateTags</i>: Creates one or more tags for a configuration items.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeTags</i>: Retrieves a list of configuration items that are tagged with a specific tag. <i>Or</i>,
 * retrieves a list of all tags assigned to a specific configuration item.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteTags</i>: Deletes the association between a configuration item and one or more tags.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Exporting Data</b>
 * </p>
 * <p>
 * You can export data as a CSV file to an Amazon S3 bucket or into your preferred visualization tool or cloud migration
 * solution to help reduce the complexity and time in planning your cloud migration.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ExportConfigurations</i>: Exports all discovered configuration data to an Amazon S3 bucket. Data includes tags and
 * tag associations, processes, connections, servers, and system performance. This API returns an export ID which you
 * can query using the GetExportStatus API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeExportConfigurations</i>: Gets the status of the data export. When the export is complete, the service
 * returns an Amazon S3 URL where you can download CSV files that include the data.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
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
     */
    public AWSApplicationDiscoveryAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
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
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest request) {

        return describeAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(final DescribeAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentsResult>() {
            @Override
            public DescribeAgentsResult call() throws Exception {
                DescribeAgentsResult result;

                try {
                    result = describeAgents(request);
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
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest request) {

        return describeConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(final DescribeConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationsResult>() {
            @Override
            public DescribeConfigurationsResult call() throws Exception {
                DescribeConfigurationsResult result;

                try {
                    result = describeConfigurations(request);
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
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(DescribeExportConfigurationsRequest request) {

        return describeExportConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(final DescribeExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportConfigurationsResult>() {
            @Override
            public DescribeExportConfigurationsResult call() throws Exception {
                DescribeExportConfigurationsResult result;

                try {
                    result = describeExportConfigurations(request);
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

    @Override
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest request) {

        return exportConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(final ExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ExportConfigurationsResult>() {
            @Override
            public ExportConfigurationsResult call() throws Exception {
                ExportConfigurationsResult result;

                try {
                    result = exportConfigurations(request);
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
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(final ListConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationsResult>() {
            @Override
            public ListConfigurationsResult call() throws Exception {
                ListConfigurationsResult result;

                try {
                    result = listConfigurations(request);
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
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(StartDataCollectionByAgentIdsRequest request) {

        return startDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            final StartDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartDataCollectionByAgentIdsResult>() {
            @Override
            public StartDataCollectionByAgentIdsResult call() throws Exception {
                StartDataCollectionByAgentIdsResult result;

                try {
                    result = startDataCollectionByAgentIds(request);
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
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(StopDataCollectionByAgentIdsRequest request) {

        return stopDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(final StopDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopDataCollectionByAgentIdsResult>() {
            @Override
            public StopDataCollectionByAgentIdsResult call() throws Exception {
                StopDataCollectionByAgentIdsResult result;

                try {
                    result = stopDataCollectionByAgentIds(request);
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
