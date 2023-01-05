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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSnowDeviceManagement}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSnowDeviceManagement implements AWSSnowDeviceManagement {

    protected AbstractAWSSnowDeviceManagement() {
    }

    @Override
    public CancelTaskResult cancelTask(CancelTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTaskResult createTask(CreateTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeviceEc2InstancesResult describeDeviceEc2Instances(DescribeDeviceEc2InstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTaskResult describeTask(DescribeTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeviceResourcesResult listDeviceResources(ListDeviceResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
