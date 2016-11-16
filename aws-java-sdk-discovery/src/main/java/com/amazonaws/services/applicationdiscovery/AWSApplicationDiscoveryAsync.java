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

/**
 * Interface for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationdiscovery.AbstractAWSApplicationDiscoveryAsync} instead.
 * </p>
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
public interface AWSApplicationDiscoveryAsync extends AWSApplicationDiscovery {

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return A Java Future containing the result of the DescribeAgents operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeAgents
     */
    java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest describeAgentsRequest);

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgents operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeAgents
     */
    java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest describeAgentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of attributes for a specific configuration ID. For example, the output for a <i>server</i>
     * configuration item includes a list of attributes about the server, including host name, operating system, number
     * of network cards, etc.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @return A Java Future containing the result of the DescribeConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeConfigurations
     */
    java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest describeConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of attributes for a specific configuration ID. For example, the output for a <i>server</i>
     * configuration item includes a list of attributes about the server, including host name, operating system, number
     * of network cards, etc.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeConfigurations
     */
    java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest describeConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return A Java Future containing the result of the DescribeExportConfigurations operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.DescribeExportConfigurations
     */
    java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(
            DescribeExportConfigurationsRequest describeExportConfigurationsRequest);

    /**
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportConfigurations operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeExportConfigurations
     */
    java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(
            DescribeExportConfigurationsRequest describeExportConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID which you can query using the <i>GetExportStatus</i> API. The system
     * imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @return A Java Future containing the result of the ExportConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.ExportConfigurations
     */
    java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest exportConfigurationsRequest);

    /**
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID which you can query using the <i>GetExportStatus</i> API. The system
     * imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.ExportConfigurations
     */
    java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest exportConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of configurations items according to the criteria you specify in a filter. The filter criteria
     * identify relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsync.ListConfigurations
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of configurations items according to the criteria you specify in a filter. The filter criteria
     * identify relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AWSApplicationDiscoveryAsyncHandler.ListConfigurations
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Instructs the specified agents to start collecting data. Agents can reside on host servers or virtual machines in
     * your data center.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.StartDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Instructs the specified agents to start collecting data. Agents can reside on host servers or virtual machines in
     * your data center.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.StartDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler);

    /**
     * <p>
     * Instructs the specified agents to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsync.StopDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(
            StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Instructs the specified agents to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
     *         service.
     * @sample AWSApplicationDiscoveryAsyncHandler.StopDataCollectionByAgentIds
     */
    java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(
            StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest,
            com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler);

}
