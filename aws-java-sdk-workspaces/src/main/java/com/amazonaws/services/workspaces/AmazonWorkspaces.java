/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing Amazon WorkSpaces.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspaces.AbstractAmazonWorkspaces} instead.
 * </p>
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows desktops for your users.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspaces {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workspaces";

    /**
     * Overrides the default endpoint for this client ("https://workspaces.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://workspaces.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
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
     *        The endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://workspaces.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonWorkspaces#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates tags for the specified WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Deletes the specified tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Describes the tags for the specified WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundles(DescribeWorkspaceBundlesRequest)
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles();

    /**
     * <p>
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest)
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories();

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results using bundle ID, directory ID, or owner, but you can specify only one filter at a
     * time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspaces(DescribeWorkspacesRequest)
     */
    DescribeWorkspacesResult describeWorkspaces();

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Modifies the specified WorkSpace properties.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the WorkSpace is not valid for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The configuration of this WorkSpace is not supported for this operation. For more information, see the <a
     *         href="http://docs.aws.amazon.com/workspaces/latest/adminguide/">Amazon WorkSpaces Administration
     *         Guide</a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code>, <code>IMPAIRED</code>, or
     * <code>INOPERABLE</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest);

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code> or <code>ERROR</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="http://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild a
     * WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest);

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StartWorkspacesResult startWorkspaces(StartWorkspacesRequest startWorkspacesRequest);

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest);

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services before terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
     * </p>
     * 
     * @param terminateWorkspacesRequest
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest);

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
