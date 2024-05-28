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

import com.amazonaws.services.codestarconnections.model.*;

/**
 * Interface for accessing AWS CodeStar connections asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestarconnections.AbstractAWSCodeStarconnectionsAsync} instead.
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
public interface AWSCodeStarconnectionsAsync extends AWSCodeStarconnections {

    /**
     * <p>
     * Creates a connection that can then be given to other Amazon Web Services services like CodePipeline so that it
     * can access third-party code repositories. The connection is in pending status until the third-party connection
     * handshake is completed from the console.
     * </p>
     * 
     * @param createConnectionRequest
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a connection that can then be given to other Amazon Web Services services like CodePipeline so that it
     * can access third-party code repositories. The connection is in pending status until the third-party connection
     * handshake is completed from the console.
     * </p>
     * 
     * @param createConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.CreateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest createHostRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.CreateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest createHostRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHostRequest, CreateHostResult> asyncHandler);

    /**
     * <p>
     * Creates a link to a specified external Git repository. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param createRepositoryLinkRequest
     * @return A Java Future containing the result of the CreateRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.CreateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryLinkResult> createRepositoryLinkAsync(CreateRepositoryLinkRequest createRepositoryLinkRequest);

    /**
     * <p>
     * Creates a link to a specified external Git repository. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param createRepositoryLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.CreateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryLinkResult> createRepositoryLinkAsync(CreateRepositoryLinkRequest createRepositoryLinkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryLinkRequest, CreateRepositoryLinkResult> asyncHandler);

    /**
     * <p>
     * Creates a sync configuration which allows Amazon Web Services to sync content from a Git repository to update a
     * specified Amazon Web Services resource. Parameters for the sync configuration are determined by the sync type.
     * </p>
     * 
     * @param createSyncConfigurationRequest
     * @return A Java Future containing the result of the CreateSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.CreateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSyncConfigurationResult> createSyncConfigurationAsync(CreateSyncConfigurationRequest createSyncConfigurationRequest);

    /**
     * <p>
     * Creates a sync configuration which allows Amazon Web Services to sync content from a Git repository to update a
     * specified Amazon Web Services resource. Parameters for the sync configuration are determined by the sync type.
     * </p>
     * 
     * @param createSyncConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.CreateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSyncConfigurationResult> createSyncConfigurationAsync(CreateSyncConfigurationRequest createSyncConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSyncConfigurationRequest, CreateSyncConfigurationResult> asyncHandler);

    /**
     * <p>
     * The connection to be deleted.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * The connection to be deleted.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.DeleteHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest deleteHostRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.DeleteHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest deleteHostRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHostRequest, DeleteHostResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between your connection and a specified external Git repository.
     * </p>
     * 
     * @param deleteRepositoryLinkRequest
     * @return A Java Future containing the result of the DeleteRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.DeleteRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryLinkResult> deleteRepositoryLinkAsync(DeleteRepositoryLinkRequest deleteRepositoryLinkRequest);

    /**
     * <p>
     * Deletes the association between your connection and a specified external Git repository.
     * </p>
     * 
     * @param deleteRepositoryLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.DeleteRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryLinkResult> deleteRepositoryLinkAsync(DeleteRepositoryLinkRequest deleteRepositoryLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryLinkRequest, DeleteRepositoryLinkResult> asyncHandler);

    /**
     * <p>
     * Deletes the sync configuration for a specified repository and connection.
     * </p>
     * 
     * @param deleteSyncConfigurationRequest
     * @return A Java Future containing the result of the DeleteSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.DeleteSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSyncConfigurationResult> deleteSyncConfigurationAsync(DeleteSyncConfigurationRequest deleteSyncConfigurationRequest);

    /**
     * <p>
     * Deletes the sync configuration for a specified repository and connection.
     * </p>
     * 
     * @param deleteSyncConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.DeleteSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSyncConfigurationResult> deleteSyncConfigurationAsync(DeleteSyncConfigurationRequest deleteSyncConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSyncConfigurationRequest, DeleteSyncConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the connection ARN and details such as status, owner, and provider type.
     * </p>
     * 
     * @param getConnectionRequest
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest);

    /**
     * <p>
     * Returns the connection ARN and details such as status, owner, and provider type.
     * </p>
     * 
     * @param getConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler);

    /**
     * <p>
     * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC
     * configuration.
     * </p>
     * 
     * @param getHostRequest
     * @return A Java Future containing the result of the GetHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetHost" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest getHostRequest);

    /**
     * <p>
     * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC
     * configuration.
     * </p>
     * 
     * @param getHostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetHost" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest getHostRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostRequest, GetHostResult> asyncHandler);

    /**
     * <p>
     * Returns details about a repository link. A repository link allows Git sync to monitor and sync changes from files
     * in a specified Git repository.
     * </p>
     * 
     * @param getRepositoryLinkRequest
     * @return A Java Future containing the result of the GetRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryLinkResult> getRepositoryLinkAsync(GetRepositoryLinkRequest getRepositoryLinkRequest);

    /**
     * <p>
     * Returns details about a repository link. A repository link allows Git sync to monitor and sync changes from files
     * in a specified Git repository.
     * </p>
     * 
     * @param getRepositoryLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryLinkResult> getRepositoryLinkAsync(GetRepositoryLinkRequest getRepositoryLinkRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryLinkRequest, GetRepositoryLinkResult> asyncHandler);

    /**
     * <p>
     * Returns details about the sync status for a repository. A repository sync uses Git sync to push and pull changes
     * from your remote repository.
     * </p>
     * 
     * @param getRepositorySyncStatusRequest
     * @return A Java Future containing the result of the GetRepositorySyncStatus operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositorySyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest);

    /**
     * <p>
     * Returns details about the sync status for a repository. A repository sync uses Git sync to push and pull changes
     * from your remote repository.
     * </p>
     * 
     * @param getRepositorySyncStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositorySyncStatus operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositorySyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositorySyncStatusRequest, GetRepositorySyncStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the status of the sync with the Git repository for a specific Amazon Web Services resource.
     * </p>
     * 
     * @param getResourceSyncStatusRequest
     * @return A Java Future containing the result of the GetResourceSyncStatus operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetResourceSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetResourceSyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSyncStatusResult> getResourceSyncStatusAsync(GetResourceSyncStatusRequest getResourceSyncStatusRequest);

    /**
     * <p>
     * Returns the status of the sync with the Git repository for a specific Amazon Web Services resource.
     * </p>
     * 
     * @param getResourceSyncStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceSyncStatus operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetResourceSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetResourceSyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSyncStatusResult> getResourceSyncStatusAsync(GetResourceSyncStatusRequest getResourceSyncStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceSyncStatusRequest, GetResourceSyncStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the most recent sync blockers.
     * </p>
     * 
     * @param getSyncBlockerSummaryRequest
     * @return A Java Future containing the result of the GetSyncBlockerSummary operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetSyncBlockerSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncBlockerSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSyncBlockerSummaryResult> getSyncBlockerSummaryAsync(GetSyncBlockerSummaryRequest getSyncBlockerSummaryRequest);

    /**
     * <p>
     * Returns a list of the most recent sync blockers.
     * </p>
     * 
     * @param getSyncBlockerSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSyncBlockerSummary operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetSyncBlockerSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncBlockerSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSyncBlockerSummaryResult> getSyncBlockerSummaryAsync(GetSyncBlockerSummaryRequest getSyncBlockerSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetSyncBlockerSummaryRequest, GetSyncBlockerSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns details about a sync configuration, including the sync type and resource name. A sync configuration
     * allows the configuration to sync (push and pull) changes from the remote repository for a specified branch in a
     * Git repository.
     * </p>
     * 
     * @param getSyncConfigurationRequest
     * @return A Java Future containing the result of the GetSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.GetSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSyncConfigurationResult> getSyncConfigurationAsync(GetSyncConfigurationRequest getSyncConfigurationRequest);

    /**
     * <p>
     * Returns details about a sync configuration, including the sync type and resource name. A sync configuration
     * allows the configuration to sync (push and pull) changes from the remote repository for a specified branch in a
     * Git repository.
     * </p>
     * 
     * @param getSyncConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.GetSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSyncConfigurationResult> getSyncConfigurationAsync(GetSyncConfigurationRequest getSyncConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSyncConfigurationRequest, GetSyncConfigurationResult> asyncHandler);

    /**
     * <p>
     * Lists the connections associated with your account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return A Java Future containing the result of the ListConnections operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest listConnectionsRequest);

    /**
     * <p>
     * Lists the connections associated with your account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnections operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest listConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler);

    /**
     * <p>
     * Lists the hosts associated with your account.
     * </p>
     * 
     * @param listHostsRequest
     * @return A Java Future containing the result of the ListHosts operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.ListHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListHosts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest listHostsRequest);

    /**
     * <p>
     * Lists the hosts associated with your account.
     * </p>
     * 
     * @param listHostsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHosts operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListHosts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest listHostsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostsRequest, ListHostsResult> asyncHandler);

    /**
     * <p>
     * Lists the repository links created for connections in your account.
     * </p>
     * 
     * @param listRepositoryLinksRequest
     * @return A Java Future containing the result of the ListRepositoryLinks operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.ListRepositoryLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositoryLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoryLinksResult> listRepositoryLinksAsync(ListRepositoryLinksRequest listRepositoryLinksRequest);

    /**
     * <p>
     * Lists the repository links created for connections in your account.
     * </p>
     * 
     * @param listRepositoryLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositoryLinks operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListRepositoryLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositoryLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoryLinksResult> listRepositoryLinksAsync(ListRepositoryLinksRequest listRepositoryLinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoryLinksRequest, ListRepositoryLinksResult> asyncHandler);

    /**
     * <p>
     * Lists the repository sync definitions for repository links in your account.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @return A Java Future containing the result of the ListRepositorySyncDefinitions operation returned by the
     *         service.
     * @sample AWSCodeStarconnectionsAsync.ListRepositorySyncDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(
            ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest);

    /**
     * <p>
     * Lists the repository sync definitions for repository links in your account.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositorySyncDefinitions operation returned by the
     *         service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListRepositorySyncDefinitions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(
            ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositorySyncDefinitionsRequest, ListRepositorySyncDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of sync configurations for a specified repository.
     * </p>
     * 
     * @param listSyncConfigurationsRequest
     * @return A Java Future containing the result of the ListSyncConfigurations operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.ListSyncConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListSyncConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSyncConfigurationsResult> listSyncConfigurationsAsync(ListSyncConfigurationsRequest listSyncConfigurationsRequest);

    /**
     * <p>
     * Returns a list of sync configurations for a specified repository.
     * </p>
     * 
     * @param listSyncConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSyncConfigurations operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListSyncConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListSyncConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSyncConfigurationsResult> listSyncConfigurationsAsync(ListSyncConfigurationsRequest listSyncConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSyncConfigurationsRequest, ListSyncConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets the set of key-value pairs (metadata) that are used to manage the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets the set of key-value pairs (metadata) that are used to manage the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified host with the provided configurations.
     * </p>
     * 
     * @param updateHostRequest
     * @return A Java Future containing the result of the UpdateHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.UpdateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest updateHostRequest);

    /**
     * <p>
     * Updates a specified host with the provided configurations.
     * </p>
     * 
     * @param updateHostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHost operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.UpdateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateHost"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest updateHostRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHostRequest, UpdateHostResult> asyncHandler);

    /**
     * <p>
     * Updates the association between your connection and a specified external Git repository. A repository link allows
     * Git sync to monitor and sync changes to files in a specified Git repository.
     * </p>
     * 
     * @param updateRepositoryLinkRequest
     * @return A Java Future containing the result of the UpdateRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.UpdateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryLinkResult> updateRepositoryLinkAsync(UpdateRepositoryLinkRequest updateRepositoryLinkRequest);

    /**
     * <p>
     * Updates the association between your connection and a specified external Git repository. A repository link allows
     * Git sync to monitor and sync changes to files in a specified Git repository.
     * </p>
     * 
     * @param updateRepositoryLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepositoryLink operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.UpdateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryLinkResult> updateRepositoryLinkAsync(UpdateRepositoryLinkRequest updateRepositoryLinkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryLinkRequest, UpdateRepositoryLinkResult> asyncHandler);

    /**
     * <p>
     * Allows you to update the status of a sync blocker, resolving the blocker and allowing syncing to continue.
     * </p>
     * 
     * @param updateSyncBlockerRequest
     * @return A Java Future containing the result of the UpdateSyncBlocker operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.UpdateSyncBlocker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncBlocker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSyncBlockerResult> updateSyncBlockerAsync(UpdateSyncBlockerRequest updateSyncBlockerRequest);

    /**
     * <p>
     * Allows you to update the status of a sync blocker, resolving the blocker and allowing syncing to continue.
     * </p>
     * 
     * @param updateSyncBlockerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSyncBlocker operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.UpdateSyncBlocker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncBlocker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSyncBlockerResult> updateSyncBlockerAsync(UpdateSyncBlockerRequest updateSyncBlockerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSyncBlockerRequest, UpdateSyncBlockerResult> asyncHandler);

    /**
     * <p>
     * Updates the sync configuration for your connection and a specified external Git repository.
     * </p>
     * 
     * @param updateSyncConfigurationRequest
     * @return A Java Future containing the result of the UpdateSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsync.UpdateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSyncConfigurationResult> updateSyncConfigurationAsync(UpdateSyncConfigurationRequest updateSyncConfigurationRequest);

    /**
     * <p>
     * Updates the sync configuration for your connection and a specified external Git repository.
     * </p>
     * 
     * @param updateSyncConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSyncConfiguration operation returned by the service.
     * @sample AWSCodeStarconnectionsAsyncHandler.UpdateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSyncConfigurationResult> updateSyncConfigurationAsync(UpdateSyncConfigurationRequest updateSyncConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSyncConfigurationRequest, UpdateSyncConfigurationResult> asyncHandler);

}
