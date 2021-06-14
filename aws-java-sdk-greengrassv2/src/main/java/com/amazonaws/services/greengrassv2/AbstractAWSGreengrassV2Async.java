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
package com.amazonaws.services.greengrassv2;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;

/**
 * Abstract implementation of {@code AWSGreengrassV2Async}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSGreengrassV2Async extends AbstractAWSGreengrassV2 implements AWSGreengrassV2Async {

    protected AbstractAWSGreengrassV2Async() {
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateClientDeviceWithCoreDeviceResult> batchAssociateClientDeviceWithCoreDeviceAsync(
            BatchAssociateClientDeviceWithCoreDeviceRequest request) {

        return batchAssociateClientDeviceWithCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateClientDeviceWithCoreDeviceResult> batchAssociateClientDeviceWithCoreDeviceAsync(
            BatchAssociateClientDeviceWithCoreDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateClientDeviceWithCoreDeviceRequest, BatchAssociateClientDeviceWithCoreDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateClientDeviceFromCoreDeviceResult> batchDisassociateClientDeviceFromCoreDeviceAsync(
            BatchDisassociateClientDeviceFromCoreDeviceRequest request) {

        return batchDisassociateClientDeviceFromCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateClientDeviceFromCoreDeviceResult> batchDisassociateClientDeviceFromCoreDeviceAsync(
            BatchDisassociateClientDeviceFromCoreDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateClientDeviceFromCoreDeviceRequest, BatchDisassociateClientDeviceFromCoreDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(CancelDeploymentRequest request) {

        return cancelDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(CancelDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelDeploymentRequest, CancelDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(CreateComponentVersionRequest request) {

        return createComponentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(CreateComponentVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateComponentVersionRequest, CreateComponentVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(DeleteCoreDeviceRequest request) {

        return deleteCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(DeleteCoreDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCoreDeviceRequest, DeleteCoreDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request) {

        return describeComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(GetComponentVersionArtifactRequest request) {

        return getComponentVersionArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(GetComponentVersionArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComponentVersionArtifactRequest, GetComponentVersionArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(GetCoreDeviceRequest request) {

        return getCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(GetCoreDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCoreDeviceRequest, GetCoreDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClientDevicesAssociatedWithCoreDeviceResult> listClientDevicesAssociatedWithCoreDeviceAsync(
            ListClientDevicesAssociatedWithCoreDeviceRequest request) {

        return listClientDevicesAssociatedWithCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClientDevicesAssociatedWithCoreDeviceResult> listClientDevicesAssociatedWithCoreDeviceAsync(
            ListClientDevicesAssociatedWithCoreDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClientDevicesAssociatedWithCoreDeviceRequest, ListClientDevicesAssociatedWithCoreDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(ListComponentVersionsRequest request) {

        return listComponentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(ListComponentVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentVersionsRequest, ListComponentVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(ListCoreDevicesRequest request) {

        return listCoreDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(ListCoreDevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCoreDevicesRequest, ListCoreDevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(ListEffectiveDeploymentsRequest request) {

        return listEffectiveDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(ListEffectiveDeploymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEffectiveDeploymentsRequest, ListEffectiveDeploymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(ListInstalledComponentsRequest request) {

        return listInstalledComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(ListInstalledComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstalledComponentsRequest, ListInstalledComponentsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(ResolveComponentCandidatesRequest request) {

        return resolveComponentCandidatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(ResolveComponentCandidatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ResolveComponentCandidatesRequest, ResolveComponentCandidatesResult> asyncHandler) {

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

}
