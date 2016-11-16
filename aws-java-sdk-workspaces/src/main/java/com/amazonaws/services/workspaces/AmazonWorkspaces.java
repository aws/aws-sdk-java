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
package com.amazonaws.services.workspaces;

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
 * This reference provides detailed information about the Amazon WorkSpaces operations.
 * </p>
 */
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
     */
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
     */
    void setRegion(Region region);

    /**
     * <p>
     * Creates tags for a WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     *        The request of the <a>CreateTags</a> operation.
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * </note>
     * 
     * @param createWorkspacesRequest
     *        Contains the inputs for the <a>CreateWorkspaces</a> operation.
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     */
    CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Deletes tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     *        The request of the <a>DeleteTags</a> operation.
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Describes tags for a WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     *        The request of the <a>DescribeTags</a> operation.
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code> parameter, or the <code>Owner</code> parameter,
     * but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>NextToken</code> response member contains a token that you pass in the next
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     *        Contains the inputs for the <a>DescribeWorkspaceBundles</a> operation.
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
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
     * Retrieves information about the AWS Directory Service directories in the region that are registered with Amazon
     * WorkSpaces and are available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>NextToken</code> response member contains a token that you pass in the next
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     *        Contains the inputs for the <a>DescribeWorkspaceDirectories</a> operation.
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
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
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code>, <code>DirectoryId</code>, or
     * <code>WorkspaceIds</code>, can be specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>NextToken</code> response member contains a token that you pass in the next
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeWorkspacesRequest
     *        Contains the inputs for the <a>DescribeWorkspaces</a> operation.
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
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
     * Describes the connection status of a specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     */
    DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Modifies the WorkSpace properties, including the RunningMode and AutoStop time.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The specified WorkSpace has an invalid state for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The WorkSpace does not have the supported configuration for this operation. For more information, see the
     *         <a href="http://docs.aws.amazon.com/workspaces/latest/adminguide">Amazon WorkSpaces Administration
     *         Guide</a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     */
    ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a <b>State</b> of <code>AVAILABLE</code>,
     * <code>IMPAIRED</code>, or <code>INOPERABLE</code>.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * </note>
     * 
     * @param rebootWorkspacesRequest
     *        Contains the inputs for the <a>RebootWorkspaces</a> operation.
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     */
    RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest);

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. Rebuilding a
     * WorkSpace causes the following to occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The system is restored to the image of the bundle that the WorkSpace is created from. Any applications that have
     * been installed, or system settings that have been made since the WorkSpace was created will be lost.
     * </p>
     * </li>
     * <li>
     * <p>
     * The data drive (D drive) is re-created from the last automatic snapshot taken of the data drive. The current
     * contents of the data drive are overwritten. Automatic snapshots of the data drive are taken every 12 hours, so
     * the snapshot can be as much as 12 hours old.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a <b>State</b> of <code>AVAILABLE</code> or
     * <code>ERROR</code>.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * </note>
     * 
     * @param rebuildWorkspacesRequest
     *        Contains the inputs for the <a>RebuildWorkspaces</a> operation.
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     */
    RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest);

    /**
     * <p>
     * Starts the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to “STOPPED.”
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     */
    StartWorkspacesResult startWorkspaces(StartWorkspacesRequest startWorkspacesRequest);

    /**
     * <p>
     * Stops the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     */
    StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest);

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is not maintained and will be
     * destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
     * </p>
     * </note>
     * 
     * @param terminateWorkspacesRequest
     *        Contains the inputs for the <a>TerminateWorkspaces</a> operation.
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
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
