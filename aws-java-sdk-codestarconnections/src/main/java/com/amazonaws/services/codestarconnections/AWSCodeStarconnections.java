/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This AWS CodeStar Connections API Reference provides descriptions and usage examples of the operations and data types
 * for the AWS CodeStar Connections API. You can use the connections API to work with connections and installations.
 * </p>
 * <p>
 * <i>Connections</i> are configurations that you use to connect AWS resources to external code repositories. Each
 * connection is a resource that can be given to services such as CodePipeline to connect to a third-party repository
 * such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers your pipeline when a
 * code change is made to your third-party code repository. Each connection is named and associated with a unique ARN
 * that is used to reference the connection.
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
 * You can work with tags in AWS CodeStar Connections by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Connections, see the <a
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
     * Creates a connection that can then be given to other AWS services like CodePipeline so that it can access
     * third-party code repositories. The connection is in pending status until the third-party connection handshake is
     * completed from the console.
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
     * Lists the connections associated with your account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return Result of the ListConnections operation returned by the service.
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
     * Removes tags from an AWS resource.
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
