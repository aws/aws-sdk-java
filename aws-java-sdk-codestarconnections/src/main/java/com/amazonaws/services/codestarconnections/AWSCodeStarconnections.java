/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codestarconnections.model.*;

/**
 * Interface for accessing AWS CodeStar connections.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestarconnections.AbstractAWSCodeStarconnections} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeStar Connections</fullname>
 * <p>
 * This Amazon Web Services CodeStar Connections API Reference provides descriptions and usage examples of the
 * operations and data types for the Amazon Web Services CodeStar Connections API. You can use the connections API to
 * work with connections and installations.
 * </p>
 * <p>
 * <i>Connections</i> are configurations that you use to connect Amazon Web Services resources to external code
 * repositories. Each connection is a resource that can be given to services such as CodePipeline to connect to a
 * third-party repository such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers
 * your pipeline when a code change is made to your third-party code repository. Each connection is named and associated
 * with a unique ARN that is used to reference the connection.
 * </p>
 * <p>
 * When you create a connection, the console initiates a third-party connection handshake. <i>Installations</i> are the
 * apps that are used to conduct this handshake. For example, the installation for the Bitbucket provider type is the
 * Bitbucket app. When you create a connection, you can choose an existing installation or create one.
 * </p>
 * <p>
 * When you want to create a connection to an installed provider type such as GitHub Enterprise Server, you create a
 * <i>host</i> for your connections.
 * </p>
 * <p>
 * You can work with connections by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateConnection</a>, which creates a uniquely named connection that can be referenced by services such as
 * CodePipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteConnection</a>, which deletes the specified connection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetConnection</a>, which returns information about the connection, including the connection status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListConnections</a>, which lists the connections associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with hosts by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateHost</a>, which creates a host that represents the infrastructure where your provider is installed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteHost</a>, which deletes the specified host.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetHost</a>, which returns information about the host, including the setup status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListHosts</a>, which lists the hosts associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with tags in Amazon Web Services CodeStar Connections by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about Amazon Web Services tags for a specified Amazon Resource
 * Name (ARN) in Amazon Web Services CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in Amazon Web Services CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in Amazon Web Services CodeStar Connections.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use Amazon Web Services CodeStar Connections, see the <a
 * href="https://docs.aws.amazon.com/dtconsole/latest/userguide/welcome-connections.html">Developer Tools User
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeStarconnections {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codestar-connections";

    /**
     * <p>
     * Creates a connection that can then be given to other Amazon Web Services services like CodePipeline so that it
     * can access third-party code repositories. The connection is in pending status until the third-party connection
     * handshake is completed from the console.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeStarconnections.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a resource that represents the infrastructure where a third-party provider is installed. The host is used
     * when you create connections to an installed third-party provider type, such as GitHub Enterprise Server. You
     * create one host for all connections to that provider.
     * </p>
     * <note>
     * <p>
     * A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE`
     * by setting up the host in the console.
     * </p>
     * </note>
     * 
     * @param createHostRequest
     * @return Result of the CreateHost operation returned by the service.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @sample AWSCodeStarconnections.CreateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateHost"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHostResult createHost(CreateHostRequest createHostRequest);

    /**
     * <p>
     * Creates a link to a specified external Git repository. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param createRepositoryLinkRequest
     * @return Result of the CreateRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceAlreadyExistsException
     *         Unable to create resource. Resource already exists.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.CreateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRepositoryLinkResult createRepositoryLink(CreateRepositoryLinkRequest createRepositoryLinkRequest);

    /**
     * <p>
     * Creates a sync configuration which allows Amazon Web Services to sync content from a Git repository to update a
     * specified Amazon Web Services resource. Parameters for the sync configuration are determined by the sync type.
     * </p>
     * 
     * @param createSyncConfigurationRequest
     * @return Result of the CreateSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceAlreadyExistsException
     *         Unable to create resource. Resource already exists.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.CreateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSyncConfigurationResult createSyncConfiguration(CreateSyncConfigurationRequest createSyncConfigurationRequest);

    /**
     * <p>
     * The connection to be deleted.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeStarconnections.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * The host to be deleted. Before you delete a host, all connections associated to the host must be deleted.
     * </p>
     * <note>
     * <p>
     * A host cannot be deleted if it is in the VPC_CONFIG_INITIALIZING or VPC_CONFIG_DELETING state.
     * </p>
     * </note>
     * 
     * @param deleteHostRequest
     * @return Result of the DeleteHost operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeStarconnections.DeleteHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteHost"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHostResult deleteHost(DeleteHostRequest deleteHostRequest);

    /**
     * <p>
     * Deletes the association between your connection and a specified external Git repository.
     * </p>
     * 
     * @param deleteRepositoryLinkRequest
     * @return Result of the DeleteRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws SyncConfigurationStillExistsException
     *         Unable to continue. The sync blocker still exists.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UnsupportedProviderTypeException
     *         The specified provider type is not supported for connections.
     * @sample AWSCodeStarconnections.DeleteRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRepositoryLinkResult deleteRepositoryLink(DeleteRepositoryLinkRequest deleteRepositoryLinkRequest);

    /**
     * <p>
     * Deletes the sync configuration for a specified repository and connection.
     * </p>
     * 
     * @param deleteSyncConfigurationRequest
     * @return Result of the DeleteSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.DeleteSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSyncConfigurationResult deleteSyncConfiguration(DeleteSyncConfigurationRequest deleteSyncConfigurationRequest);

    /**
     * <p>
     * Returns the connection ARN and details such as status, owner, and provider type.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeStarconnections.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetConnection"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest);

    /**
     * <p>
     * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC
     * configuration.
     * </p>
     * 
     * @param getHostRequest
     * @return Result of the GetHost operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeStarconnections.GetHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetHost" target="_top">AWS
     *      API Documentation</a>
     */
    GetHostResult getHost(GetHostRequest getHostRequest);

    /**
     * <p>
     * Returns details about a repository link. A repository link allows Git sync to monitor and sync changes from files
     * in a specified Git repository.
     * </p>
     * 
     * @param getRepositoryLinkRequest
     * @return Result of the GetRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.GetRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    GetRepositoryLinkResult getRepositoryLink(GetRepositoryLinkRequest getRepositoryLinkRequest);

    /**
     * <p>
     * Returns details about the sync status for a repository. A repository sync uses Git sync to push and pull changes
     * from your remote repository.
     * </p>
     * 
     * @param getRepositorySyncStatusRequest
     * @return Result of the GetRepositorySyncStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositorySyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetRepositorySyncStatusResult getRepositorySyncStatus(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest);

    /**
     * <p>
     * Returns the status of the sync with the Git repository for a specific Amazon Web Services resource.
     * </p>
     * 
     * @param getResourceSyncStatusRequest
     * @return Result of the GetResourceSyncStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.GetResourceSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetResourceSyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceSyncStatusResult getResourceSyncStatus(GetResourceSyncStatusRequest getResourceSyncStatusRequest);

    /**
     * <p>
     * Returns a list of the most recent sync blockers.
     * </p>
     * 
     * @param getSyncBlockerSummaryRequest
     * @return Result of the GetSyncBlockerSummary operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.GetSyncBlockerSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncBlockerSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetSyncBlockerSummaryResult getSyncBlockerSummary(GetSyncBlockerSummaryRequest getSyncBlockerSummaryRequest);

    /**
     * <p>
     * Returns details about a sync configuration, including the sync type and resource name. A sync configuration
     * allows the configuration to sync (push and pull) changes from the remote repository for a specified branch in a
     * Git repository.
     * </p>
     * 
     * @param getSyncConfigurationRequest
     * @return Result of the GetSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.GetSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetSyncConfigurationResult getSyncConfiguration(GetSyncConfigurationRequest getSyncConfigurationRequest);

    /**
     * <p>
     * Lists the connections associated with your account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return Result of the ListConnections operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeStarconnections.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListConnections"
     *      target="_top">AWS API Documentation</a>
     */
    ListConnectionsResult listConnections(ListConnectionsRequest listConnectionsRequest);

    /**
     * <p>
     * Lists the hosts associated with your account.
     * </p>
     * 
     * @param listHostsRequest
     * @return Result of the ListHosts operation returned by the service.
     * @sample AWSCodeStarconnections.ListHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListHosts" target="_top">AWS
     *      API Documentation</a>
     */
    ListHostsResult listHosts(ListHostsRequest listHostsRequest);

    /**
     * <p>
     * Lists the repository links created for connections in your account.
     * </p>
     * 
     * @param listRepositoryLinksRequest
     * @return Result of the ListRepositoryLinks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.ListRepositoryLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositoryLinks"
     *      target="_top">AWS API Documentation</a>
     */
    ListRepositoryLinksResult listRepositoryLinks(ListRepositoryLinksRequest listRepositoryLinksRequest);

    /**
     * <p>
     * Lists the repository sync definitions for repository links in your account.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @return Result of the ListRepositorySyncDefinitions operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.ListRepositorySyncDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListRepositorySyncDefinitionsResult listRepositorySyncDefinitions(ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest);

    /**
     * <p>
     * Returns a list of sync configurations for a specified repository.
     * </p>
     * 
     * @param listSyncConfigurationsRequest
     * @return Result of the ListSyncConfigurations operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.ListSyncConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListSyncConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListSyncConfigurationsResult listSyncConfigurations(ListSyncConfigurationsRequest listSyncConfigurationsRequest);

    /**
     * <p>
     * Gets the set of key-value pairs (metadata) that are used to manage the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeStarconnections.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @sample AWSCodeStarconnections.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeStarconnections.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a specified host with the provided configurations.
     * </p>
     * 
     * @param updateHostRequest
     * @return Result of the UpdateHost operation returned by the service.
     * @throws ConflictException
     *         Two conflicting operations have been made on the same resource.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @throws UnsupportedOperationException
     *         The operation is not supported. Check the connection status and try again.
     * @sample AWSCodeStarconnections.UpdateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateHost"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateHostResult updateHost(UpdateHostRequest updateHostRequest);

    /**
     * <p>
     * Updates the association between your connection and a specified external Git repository. A repository link allows
     * Git sync to monitor and sync changes to files in a specified Git repository.
     * </p>
     * 
     * @param updateRepositoryLinkRequest
     * @return Result of the UpdateRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConditionalCheckFailedException
     *         The conditional check failed. Try again later.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UpdateOutOfSyncException
     *         The update is out of sync. Try syncing again.
     * @sample AWSCodeStarconnections.UpdateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRepositoryLinkResult updateRepositoryLink(UpdateRepositoryLinkRequest updateRepositoryLinkRequest);

    /**
     * <p>
     * Allows you to update the status of a sync blocker, resolving the blocker and allowing syncing to continue.
     * </p>
     * 
     * @param updateSyncBlockerRequest
     * @return Result of the UpdateSyncBlocker operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws RetryLatestCommitFailedException
     *         Retrying the latest commit failed. Try again later.
     * @throws SyncBlockerDoesNotExistException
     *         Unable to continue. The sync blocker does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeStarconnections.UpdateSyncBlocker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncBlocker"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSyncBlockerResult updateSyncBlocker(UpdateSyncBlockerRequest updateSyncBlockerRequest);

    /**
     * <p>
     * Updates the sync configuration for your connection and a specified external Git repository.
     * </p>
     * 
     * @param updateSyncConfigurationRequest
     * @return Result of the UpdateSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UpdateOutOfSyncException
     *         The update is out of sync. Try syncing again.
     * @sample AWSCodeStarconnections.UpdateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSyncConfigurationResult updateSyncConfiguration(UpdateSyncConfigurationRequest updateSyncConfigurationRequest);

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
