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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationdiscovery.model.*;

/**
 * Interface for accessing AWS Application Discovery Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationdiscovery.AbstractAWSApplicationDiscovery} instead.
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
public interface AWSApplicationDiscovery {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "discovery";

    /**
     * Overrides the default endpoint for this client ("https://discovery.us-west-2.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "discovery.us-west-2.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://discovery.us-west-2.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "discovery.us-west-2.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://discovery.us-west-2.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSApplicationDiscovery#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateTags
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteTags
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return Result of the DescribeAgents operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeAgents
     */
    DescribeAgentsResult describeAgents(DescribeAgentsRequest describeAgentsRequest);

    /**
     * <p>
     * Retrieves a list of attributes for a specific configuration ID. For example, the output for a <i>server</i>
     * configuration item includes a list of attributes about the server, including host name, operating system, number
     * of network cards, etc.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @return Result of the DescribeConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeConfigurations
     */
    DescribeConfigurationsResult describeConfigurations(DescribeConfigurationsRequest describeConfigurationsRequest);

    /**
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return Result of the DescribeExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportConfigurations
     */
    DescribeExportConfigurationsResult describeExportConfigurations(DescribeExportConfigurationsRequest describeExportConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeTags
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID which you can query using the <i>GetExportStatus</i> API. The system
     * imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @return Result of the ExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.ExportConfigurations
     */
    ExportConfigurationsResult exportConfigurations(ExportConfigurationsRequest exportConfigurationsRequest);

    /**
     * <p>
     * Retrieves a list of configurations items according to the criteria you specify in a filter. The filter criteria
     * identify relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListConfigurations
     */
    ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Instructs the specified agents to start collecting data. Agents can reside on host servers or virtual machines in
     * your data center.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return Result of the StartDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StartDataCollectionByAgentIds
     */
    StartDataCollectionByAgentIdsResult startDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest);

    /**
     * <p>
     * Instructs the specified agents to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return Result of the StopDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StopDataCollectionByAgentIds
     */
    StopDataCollectionByAgentIdsResult stopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
