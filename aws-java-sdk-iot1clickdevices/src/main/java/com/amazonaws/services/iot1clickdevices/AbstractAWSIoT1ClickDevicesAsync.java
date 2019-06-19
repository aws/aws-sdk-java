/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot1clickdevices;

import javax.annotation.Generated;

import com.amazonaws.services.iot1clickdevices.model.*;

/**
 * Abstract implementation of {@code AWSIoT1ClickDevicesAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoT1ClickDevicesAsync extends AbstractAWSIoT1ClickDevices implements AWSIoT1ClickDevicesAsync {

    protected AbstractAWSIoT1ClickDevicesAsync() {
    }

    @Override
    public java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(ClaimDevicesByClaimCodeRequest request) {

        return claimDevicesByClaimCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(ClaimDevicesByClaimCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<ClaimDevicesByClaimCodeRequest, ClaimDevicesByClaimCodeResult> asyncHandler) {

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
    public java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(FinalizeDeviceClaimRequest request) {

        return finalizeDeviceClaimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(FinalizeDeviceClaimRequest request,
            com.amazonaws.handlers.AsyncHandler<FinalizeDeviceClaimRequest, FinalizeDeviceClaimResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(GetDeviceMethodsRequest request) {

        return getDeviceMethodsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(GetDeviceMethodsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeviceMethodsRequest, GetDeviceMethodsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(InitiateDeviceClaimRequest request) {

        return initiateDeviceClaimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(InitiateDeviceClaimRequest request,
            com.amazonaws.handlers.AsyncHandler<InitiateDeviceClaimRequest, InitiateDeviceClaimResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(InvokeDeviceMethodRequest request) {

        return invokeDeviceMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(InvokeDeviceMethodRequest request,
            com.amazonaws.handlers.AsyncHandler<InvokeDeviceMethodRequest, InvokeDeviceMethodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest request) {

        return listDeviceEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeviceEventsRequest, ListDeviceEventsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(UnclaimDeviceRequest request) {

        return unclaimDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(UnclaimDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<UnclaimDeviceRequest, UnclaimDeviceResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(UpdateDeviceStateRequest request) {

        return updateDeviceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(UpdateDeviceStateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceStateRequest, UpdateDeviceStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
