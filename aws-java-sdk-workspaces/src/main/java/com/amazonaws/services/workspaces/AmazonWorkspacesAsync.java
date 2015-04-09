/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.workspaces;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing AmazonWorkspaces asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon WorkSpaces Service <p>
 * This is the <i>Amazon WorkSpaces API Reference</i> . This guide
 * provides detailed information about Amazon WorkSpaces operations, data
 * types, parameters, and errors.
 * </p>
 */
public interface AmazonWorkspacesAsync extends AmazonWorkspaces {
    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and returns before the
     * WorkSpaces are created.
     * </p>
     *
     * @param createWorkspacesRequest Container for the necessary parameters
     *           to execute the CreateWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         CreateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and returns before the
     * WorkSpaces are created.
     * </p>
     *
     * @param createWorkspacesRequest Container for the necessary parameters
     *           to execute the CreateWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest,
            AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceBundlesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceBundles operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceBundles service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceBundlesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceBundles operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceBundles service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest,
            AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> , <code>IMPAIRED</code> , or
     * <code>INOPERABLE</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have rebooted.
     * </p>
     *
     * @param rebootWorkspacesRequest Container for the necessary parameters
     *           to execute the RebootWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         RebootWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> , <code>IMPAIRED</code> , or
     * <code>INOPERABLE</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have rebooted.
     * </p>
     *
     * @param rebootWorkspacesRequest Container for the necessary parameters
     *           to execute the RebootWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest,
            AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspacesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaces operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspacesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaces operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest,
            AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceDirectories operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceDirectories service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceDirectories operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceDirectories service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest,
            AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can
     * result in the loss of data. Rebuilding a WorkSpace causes the
     * following to occur:
     * </p>
     * 
     * <ul>
     * <li>The system is restored to the image of the bundle that the
     * WorkSpace is created from. Any applications that have been installed,
     * or system settings that have been made since the WorkSpace was created
     * will be lost.</li>
     * <li>The data drive (D drive) is re-created from the last automatic
     * snapshot taken of the data drive. The current contents of the data
     * drive are overwritten. Automatic snapshots of the data drive are taken
     * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
     * 
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely rebuilt.
     * </p>
     *
     * @param rebuildWorkspacesRequest Container for the necessary parameters
     *           to execute the RebuildWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can
     * result in the loss of data. Rebuilding a WorkSpace causes the
     * following to occur:
     * </p>
     * 
     * <ul>
     * <li>The system is restored to the image of the bundle that the
     * WorkSpace is created from. Any applications that have been installed,
     * or system settings that have been made since the WorkSpace was created
     * will be lost.</li>
     * <li>The data drive (D drive) is re-created from the last automatic
     * snapshot taken of the data drive. The current contents of the data
     * drive are overwritten. Automatic snapshots of the data drive are taken
     * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
     * 
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely rebuilt.
     * </p>
     *
     * @param rebuildWorkspacesRequest Container for the necessary parameters
     *           to execute the RebuildWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest,
            AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone.
     * The user's data is not maintained and will be destroyed. If you need
     * to archive any user data, contact Amazon Web Services before
     * terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except
     * <code>SUSPENDED</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely terminated.
     * </p>
     *
     * @param terminateWorkspacesRequest Container for the necessary
     *           parameters to execute the TerminateWorkspaces operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone.
     * The user's data is not maintained and will be destroyed. If you need
     * to archive any user data, contact Amazon Web Services before
     * terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except
     * <code>SUSPENDED</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely terminated.
     * </p>
     *
     * @param terminateWorkspacesRequest Container for the necessary
     *           parameters to execute the TerminateWorkspaces operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest,
            AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        