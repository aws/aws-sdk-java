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
 * Interface for accessing AWS IoT 1-Click Devices Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot1clickdevices.AbstractAWSIoT1ClickDevicesAsync} instead.
 * </p>
 * <p>
 * <p>
 * Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
 * responses, and errors for the supported web services protocols.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoT1ClickDevicesAsync extends AWSIoT1ClickDevices {

    /**
     * <p>
     * Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
     * the device(s).
     * </p>
     * 
     * @param claimDevicesByClaimCodeRequest
     * @return A Java Future containing the result of the ClaimDevicesByClaimCode operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.ClaimDevicesByClaimCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(ClaimDevicesByClaimCodeRequest claimDevicesByClaimCodeRequest);

    /**
     * <p>
     * Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
     * the device(s).
     * </p>
     * 
     * @param claimDevicesByClaimCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ClaimDevicesByClaimCode operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.ClaimDevicesByClaimCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(ClaimDevicesByClaimCodeRequest claimDevicesByClaimCodeRequest,
            com.amazonaws.handlers.AsyncHandler<ClaimDevicesByClaimCodeRequest, ClaimDevicesByClaimCodeResult> asyncHandler);

    /**
     * <p>
     * Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler);

    /**
     * <p>
     * Given a device ID, finalizes the claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param finalizeDeviceClaimRequest
     * @return A Java Future containing the result of the FinalizeDeviceClaim operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.FinalizeDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/FinalizeDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(FinalizeDeviceClaimRequest finalizeDeviceClaimRequest);

    /**
     * <p>
     * Given a device ID, finalizes the claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param finalizeDeviceClaimRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FinalizeDeviceClaim operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.FinalizeDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/FinalizeDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(FinalizeDeviceClaimRequest finalizeDeviceClaimRequest,
            com.amazonaws.handlers.AsyncHandler<FinalizeDeviceClaimRequest, FinalizeDeviceClaimResult> asyncHandler);

    /**
     * <p>
     * Given a device ID, returns the invokable methods associated with the device.
     * </p>
     * 
     * @param getDeviceMethodsRequest
     * @return A Java Future containing the result of the GetDeviceMethods operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.GetDeviceMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/GetDeviceMethods" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(GetDeviceMethodsRequest getDeviceMethodsRequest);

    /**
     * <p>
     * Given a device ID, returns the invokable methods associated with the device.
     * </p>
     * 
     * @param getDeviceMethodsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceMethods operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.GetDeviceMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/GetDeviceMethods" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(GetDeviceMethodsRequest getDeviceMethodsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceMethodsRequest, GetDeviceMethodsResult> asyncHandler);

    /**
     * <p>
     * Given a device ID, initiates a claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param initiateDeviceClaimRequest
     * @return A Java Future containing the result of the InitiateDeviceClaim operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.InitiateDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InitiateDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(InitiateDeviceClaimRequest initiateDeviceClaimRequest);

    /**
     * <p>
     * Given a device ID, initiates a claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param initiateDeviceClaimRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateDeviceClaim operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.InitiateDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InitiateDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(InitiateDeviceClaimRequest initiateDeviceClaimRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateDeviceClaimRequest, InitiateDeviceClaimResult> asyncHandler);

    /**
     * <p>
     * Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
     * "Example POST" code snippet below.
     * </p>
     * 
     * @param invokeDeviceMethodRequest
     * @return A Java Future containing the result of the InvokeDeviceMethod operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.InvokeDeviceMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(InvokeDeviceMethodRequest invokeDeviceMethodRequest);

    /**
     * <p>
     * Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
     * "Example POST" code snippet below.
     * </p>
     * 
     * @param invokeDeviceMethodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeDeviceMethod operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.InvokeDeviceMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(InvokeDeviceMethodRequest invokeDeviceMethodRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeDeviceMethodRequest, InvokeDeviceMethodResult> asyncHandler);

    /**
     * <p>
     * Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return A Java Future containing the result of the ListDeviceEvents operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDeviceEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest listDeviceEventsRequest);

    /**
     * <p>
     * Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceEvents operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDeviceEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest listDeviceEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceEventsRequest, ListDeviceEventsResult> asyncHandler);

    /**
     * <p>
     * Lists the 1-Click compatible devices associated with your AWS account.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Lists the 1-Click compatible devices associated with your AWS account.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags associated with the specified resource ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags associated with the specified resource ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds or updates the tags associated with the resource ARN. See <a
     * href="https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-appendix.html#1click-limits">AWS IoT
     * 1-Click Service Limits</a> for the maximum number of tags allowed per resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates the tags associated with the resource ARN. See <a
     * href="https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-appendix.html#1click-limits">AWS IoT
     * 1-Click Service Limits</a> for the maximum number of tags allowed per resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates a device from your AWS account using its device ID.
     * </p>
     * 
     * @param unclaimDeviceRequest
     * @return A Java Future containing the result of the UnclaimDevice operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.UnclaimDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UnclaimDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(UnclaimDeviceRequest unclaimDeviceRequest);

    /**
     * <p>
     * Disassociates a device from your AWS account using its device ID.
     * </p>
     * 
     * @param unclaimDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnclaimDevice operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.UnclaimDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UnclaimDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(UnclaimDeviceRequest unclaimDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UnclaimDeviceRequest, UnclaimDeviceResult> asyncHandler);

    /**
     * <p>
     * Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Using a Boolean value (true or false), this operation enables or disables the device given a device ID.
     * </p>
     * 
     * @param updateDeviceStateRequest
     * @return A Java Future containing the result of the UpdateDeviceState operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsync.UpdateDeviceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UpdateDeviceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(UpdateDeviceStateRequest updateDeviceStateRequest);

    /**
     * <p>
     * Using a Boolean value (true or false), this operation enables or disables the device given a device ID.
     * </p>
     * 
     * @param updateDeviceStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceState operation returned by the service.
     * @sample AWSIoT1ClickDevicesAsyncHandler.UpdateDeviceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UpdateDeviceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(UpdateDeviceStateRequest updateDeviceStateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceStateRequest, UpdateDeviceStateResult> asyncHandler);

}
