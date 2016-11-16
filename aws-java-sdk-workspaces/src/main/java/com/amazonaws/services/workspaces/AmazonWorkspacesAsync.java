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

import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing Amazon WorkSpaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspaces.AbstractAmazonWorkspacesAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * This reference provides detailed information about the Amazon WorkSpaces operations.
 * </p>
 */
public interface AmazonWorkspacesAsync extends AmazonWorkspaces {

    /**
     * <p>
     * Creates tags for a WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     *        The request of the <a>CreateTags</a> operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates tags for a WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     *        The request of the <a>CreateTags</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateTags
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateWorkspaces
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateWorkspaces
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Deletes tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     *        The request of the <a>DeleteTags</a> operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     *        The request of the <a>DeleteTags</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Describes tags for a WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     *        The request of the <a>DescribeTags</a> operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes tags for a WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     *        The request of the <a>DescribeTags</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceBundles
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceBundles
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation with an AsyncHandler.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceDirectories
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceDirectories
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation with an AsyncHandler.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaces
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaces
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation with an AsyncHandler.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Describes the connection status of a specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspacesConnectionStatus
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Describes the connection status of a specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspacesConnectionStatus
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesConnectionStatusRequest, DescribeWorkspacesConnectionStatusResult> asyncHandler);

    /**
     * <p>
     * Modifies the WorkSpace properties, including the RunningMode and AutoStop time.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceProperties
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Modifies the WorkSpace properties, including the RunningMode and AutoStop time.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceProperties
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebootWorkspaces
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebootWorkspaces
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebuildWorkspaces
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebuildWorkspaces
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Starts the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to “STOPPED.”
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StartWorkspaces
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest);

    /**
     * <p>
     * Starts the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to “STOPPED.”
     * </p>
     * 
     * @param startWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StartWorkspaces
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Stops the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StopWorkspaces
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest);

    /**
     * <p>
     * Stops the specified WorkSpaces. The API only works with WorkSpaces that have RunningMode configured as AutoStop
     * and the State set to AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StopWorkspaces
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.TerminateWorkspaces
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.TerminateWorkspaces
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler);

}
