/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows desktops for your users.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspacesAsync extends AmazonWorkspaces {

    /**
     * <p>
     * Creates tags for the specified WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates tags for the specified WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the tags for the specified WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags for the specified WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

    /**
     * <p>
     * Describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
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
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

    /**
     * <p>
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
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
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results using bundle ID, directory ID, or owner, but you can specify only one filter at a
     * time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
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
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesConnectionStatusRequest, DescribeWorkspacesConnectionStatusResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified WorkSpace properties.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Modifies the specified WorkSpace properties.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler);

}
