/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;

/**
 * Abstract implementation of {@code AmazonManagedGrafanaAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonManagedGrafanaAsync extends AbstractAmazonManagedGrafana implements AmazonManagedGrafanaAsync {

    protected AbstractAmazonManagedGrafanaAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest request) {

        return associateLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateLicenseRequest, AssociateLicenseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(CreateWorkspaceApiKeyRequest request) {

        return createWorkspaceApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(CreateWorkspaceApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceApiKeyRequest, CreateWorkspaceApiKeyResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(DeleteWorkspaceApiKeyRequest request) {

        return deleteWorkspaceApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(DeleteWorkspaceApiKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceApiKeyRequest, DeleteWorkspaceApiKeyResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest request) {

        return describeWorkspaceAuthenticationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceAuthenticationRequest, DescribeWorkspaceAuthenticationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(DescribeWorkspaceConfigurationRequest request) {

        return describeWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(DescribeWorkspaceConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceConfigurationRequest, DescribeWorkspaceConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest request) {

        return disassociateLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateLicenseRequest, DisassociateLicenseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest request) {

        return updatePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePermissionsRequest, UpdatePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest request) {

        return updateWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(UpdateWorkspaceAuthenticationRequest request) {

        return updateWorkspaceAuthenticationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(UpdateWorkspaceAuthenticationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAuthenticationRequest, UpdateWorkspaceAuthenticationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(UpdateWorkspaceConfigurationRequest request) {

        return updateWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(UpdateWorkspaceConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceConfigurationRequest, UpdateWorkspaceConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
