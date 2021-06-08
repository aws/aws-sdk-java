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
package com.amazonaws.services.prometheus;

import javax.annotation.Generated;

import com.amazonaws.services.prometheus.model.*;

/**
 * Abstract implementation of {@code AmazonPrometheusAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPrometheusAsync extends AbstractAmazonPrometheus implements AmazonPrometheusAsync {

    protected AbstractAmazonPrometheusAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request) {

        return createWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {

        return deleteWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest request) {

        return describeWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request) {

        return listWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest request) {

        return updateWorkspaceAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAliasRequest, UpdateWorkspaceAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
