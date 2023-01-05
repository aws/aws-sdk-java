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
package com.amazonaws.services.panorama;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;

/**
 * Abstract implementation of {@code AWSPanoramaAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSPanoramaAsync extends AbstractAWSPanorama implements AWSPanoramaAsync {

    protected AbstractAWSPanoramaAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(CreateApplicationInstanceRequest request) {

        return createApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(CreateApplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationInstanceRequest, CreateApplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(CreateJobForDevicesRequest request) {

        return createJobForDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(CreateJobForDevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobForDevicesRequest, CreateJobForDevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(CreateNodeFromTemplateJobRequest request) {

        return createNodeFromTemplateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(CreateNodeFromTemplateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNodeFromTemplateJobRequest, CreateNodeFromTemplateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest request) {

        return createPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(CreatePackageImportJobRequest request) {

        return createPackageImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(CreatePackageImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePackageImportJobRequest, CreatePackageImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request) {

        return deleteDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest request) {

        return deletePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(DeregisterPackageVersionRequest request) {

        return deregisterPackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(DeregisterPackageVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterPackageVersionRequest, DeregisterPackageVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(DescribeApplicationInstanceRequest request) {

        return describeApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(DescribeApplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceRequest, DescribeApplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            DescribeApplicationInstanceDetailsRequest request) {

        return describeApplicationInstanceDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            DescribeApplicationInstanceDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceDetailsRequest, DescribeApplicationInstanceDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(DescribeDeviceJobRequest request) {

        return describeDeviceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(DescribeDeviceJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceJobRequest, DescribeDeviceJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(DescribeNodeRequest request) {

        return describeNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(DescribeNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeRequest, DescribeNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(DescribeNodeFromTemplateJobRequest request) {

        return describeNodeFromTemplateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(DescribeNodeFromTemplateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeFromTemplateJobRequest, DescribeNodeFromTemplateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePackageResult> describePackageAsync(DescribePackageRequest request) {

        return describePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageResult> describePackageAsync(DescribePackageRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePackageRequest, DescribePackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(DescribePackageImportJobRequest request) {

        return describePackageImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(DescribePackageImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePackageImportJobRequest, DescribePackageImportJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            ListApplicationInstanceDependenciesRequest request) {

        return listApplicationInstanceDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            ListApplicationInstanceDependenciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceDependenciesRequest, ListApplicationInstanceDependenciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            ListApplicationInstanceNodeInstancesRequest request) {

        return listApplicationInstanceNodeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            ListApplicationInstanceNodeInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceNodeInstancesRequest, ListApplicationInstanceNodeInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(ListApplicationInstancesRequest request) {

        return listApplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(ListApplicationInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstancesRequest, ListApplicationInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(ListDevicesJobsRequest request) {

        return listDevicesJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(ListDevicesJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDevicesJobsRequest, ListDevicesJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(ListNodeFromTemplateJobsRequest request) {

        return listNodeFromTemplateJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(ListNodeFromTemplateJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNodeFromTemplateJobsRequest, ListNodeFromTemplateJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(ListPackageImportJobsRequest request) {

        return listPackageImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(ListPackageImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackageImportJobsRequest, ListPackageImportJobsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(ProvisionDeviceRequest request) {

        return provisionDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(ProvisionDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<ProvisionDeviceRequest, ProvisionDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(RegisterPackageVersionRequest request) {

        return registerPackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(RegisterPackageVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterPackageVersionRequest, RegisterPackageVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(RemoveApplicationInstanceRequest request) {

        return removeApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(RemoveApplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveApplicationInstanceRequest, RemoveApplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            SignalApplicationInstanceNodeInstancesRequest request) {

        return signalApplicationInstanceNodeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            SignalApplicationInstanceNodeInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<SignalApplicationInstanceNodeInstancesRequest, SignalApplicationInstanceNodeInstancesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(UpdateDeviceMetadataRequest request) {

        return updateDeviceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(UpdateDeviceMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceMetadataRequest, UpdateDeviceMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
