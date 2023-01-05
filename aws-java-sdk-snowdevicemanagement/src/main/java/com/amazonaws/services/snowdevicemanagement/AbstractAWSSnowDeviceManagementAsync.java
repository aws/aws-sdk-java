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
package com.amazonaws.services.snowdevicemanagement;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;

/**
 * Abstract implementation of {@code AWSSnowDeviceManagementAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSnowDeviceManagementAsync extends AbstractAWSSnowDeviceManagement implements AWSSnowDeviceManagementAsync {

    protected AbstractAWSSnowDeviceManagementAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(CancelTaskRequest request) {

        return cancelTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(CancelTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelTaskRequest, CancelTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest request) {

        return createTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTaskRequest, CreateTaskResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(DescribeDeviceEc2InstancesRequest request) {

        return describeDeviceEc2InstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(DescribeDeviceEc2InstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceEc2InstancesRequest, DescribeDeviceEc2InstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest request) {

        return describeTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskRequest, DescribeTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(ListDeviceResourcesRequest request) {

        return listDeviceResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(ListDeviceResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeviceResourcesRequest, ListDeviceResourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {

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
