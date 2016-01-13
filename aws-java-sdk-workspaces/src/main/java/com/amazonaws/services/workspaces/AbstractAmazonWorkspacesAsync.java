/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import com.amazonaws.services.workspaces.model.*;

/**
 * Abstract implementation of {@code AmazonWorkspacesAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonWorkspacesAsync extends AbstractAmazonWorkspaces
        implements AmazonWorkspacesAsync {

    protected AbstractAmazonWorkspacesAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(
            CreateWorkspacesRequest request) {

        return createWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(
            CreateWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            DescribeWorkspaceBundlesRequest request) {

        return describeWorkspaceBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            DescribeWorkspaceBundlesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles
     * operation.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync() {

        return describeWorkspaceBundlesAsync(new DescribeWorkspaceBundlesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles
     * operation with an AsyncHandler.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        return describeWorkspaceBundlesAsync(
                new DescribeWorkspaceBundlesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest request) {

        return describeWorkspaceDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories
     * operation.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync() {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories
     * operation with an AsyncHandler.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        return describeWorkspaceDirectoriesAsync(
                new DescribeWorkspaceDirectoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            DescribeWorkspacesRequest request) {

        return describeWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            DescribeWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync() {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation with
     * an AsyncHandler.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(
            RebootWorkspacesRequest request) {

        return rebootWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(
            RebootWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(
            RebuildWorkspacesRequest request) {

        return rebuildWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(
            RebuildWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(
            TerminateWorkspacesRequest request) {

        return terminateWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(
            TerminateWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
