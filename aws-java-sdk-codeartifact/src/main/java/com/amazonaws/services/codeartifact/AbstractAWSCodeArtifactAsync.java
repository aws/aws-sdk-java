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
package com.amazonaws.services.codeartifact;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;

/**
 * Abstract implementation of {@code AWSCodeArtifactAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeArtifactAsync extends AbstractAWSCodeArtifact implements AWSCodeArtifactAsync {

    protected AbstractAWSCodeArtifactAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(AssociateExternalConnectionRequest request) {

        return associateExternalConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(AssociateExternalConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateExternalConnectionRequest, AssociateExternalConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(CopyPackageVersionsRequest request) {

        return copyPackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(CopyPackageVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyPackageVersionsRequest, CopyPackageVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(DeleteDomainPermissionsPolicyRequest request) {

        return deleteDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(DeleteDomainPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainPermissionsPolicyRequest, DeleteDomainPermissionsPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(DeletePackageVersionsRequest request) {

        return deletePackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(DeletePackageVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePackageVersionsRequest, DeletePackageVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            DeleteRepositoryPermissionsPolicyRequest request) {

        return deleteRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            DeleteRepositoryPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPermissionsPolicyRequest, DeleteRepositoryPermissionsPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest request) {

        return describePackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePackageVersionRequest, DescribePackageVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(DescribeRepositoryRequest request) {

        return describeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(DescribeRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoryRequest, DescribeRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(DisassociateExternalConnectionRequest request) {

        return disassociateExternalConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(DisassociateExternalConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateExternalConnectionRequest, DisassociateExternalConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(DisposePackageVersionsRequest request) {

        return disposePackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(DisposePackageVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisposePackageVersionsRequest, DisposePackageVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest request) {

        return getAuthorizationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(GetDomainPermissionsPolicyRequest request) {

        return getDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(GetDomainPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainPermissionsPolicyRequest, GetDomainPermissionsPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(GetPackageVersionAssetRequest request) {

        return getPackageVersionAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(GetPackageVersionAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionAssetRequest, GetPackageVersionAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(GetPackageVersionReadmeRequest request) {

        return getPackageVersionReadmeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(GetPackageVersionReadmeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionReadmeRequest, GetPackageVersionReadmeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(GetRepositoryEndpointRequest request) {

        return getRepositoryEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(GetRepositoryEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryEndpointRequest, GetRepositoryEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(GetRepositoryPermissionsPolicyRequest request) {

        return getRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(GetRepositoryPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPermissionsPolicyRequest, GetRepositoryPermissionsPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(ListPackageVersionAssetsRequest request) {

        return listPackageVersionAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(ListPackageVersionAssetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionAssetsRequest, ListPackageVersionAssetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(ListPackageVersionDependenciesRequest request) {

        return listPackageVersionDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(ListPackageVersionDependenciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionDependenciesRequest, ListPackageVersionDependenciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(ListPackageVersionsRequest request) {

        return listPackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(ListPackageVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionsRequest, ListPackageVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest request) {

        return listPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackagesRequest, ListPackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request) {

        return listRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(ListRepositoriesInDomainRequest request) {

        return listRepositoriesInDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(ListRepositoriesInDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesInDomainRequest, ListRepositoriesInDomainResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(PutDomainPermissionsPolicyRequest request) {

        return putDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(PutDomainPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDomainPermissionsPolicyRequest, PutDomainPermissionsPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(PutRepositoryPermissionsPolicyRequest request) {

        return putRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(PutRepositoryPermissionsPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryPermissionsPolicyRequest, PutRepositoryPermissionsPolicyResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(UpdatePackageVersionsStatusRequest request) {

        return updatePackageVersionsStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(UpdatePackageVersionsStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePackageVersionsStatusRequest, UpdatePackageVersionsStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(UpdateRepositoryRequest request) {

        return updateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(UpdateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
