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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iot1clickdevices.model.*;

/**
 * Interface for accessing AWS IoT 1-Click Devices Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot1clickdevices.AbstractAWSIoT1ClickDevices} instead.
 * </p>
 * <p>
 * <p>
 * Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
 * responses, and errors for the supported web services protocols.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoT1ClickDevices {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "devices.iot1click";

    /**
     * <p>
     * Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
     * the device(s).
     * </p>
     * 
     * @param claimDevicesByClaimCodeRequest
     * @return Result of the ClaimDevicesByClaimCode operation returned by the service.
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSIoT1ClickDevices.ClaimDevicesByClaimCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode"
     *      target="_top">AWS API Documentation</a>
     */
    ClaimDevicesByClaimCodeResult claimDevicesByClaimCode(ClaimDevicesByClaimCodeRequest claimDevicesByClaimCodeRequest);

    /**
     * <p>
     * Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest);

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
     * @return Result of the FinalizeDeviceClaim operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws PreconditionFailedException
     *         412 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.FinalizeDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/FinalizeDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    FinalizeDeviceClaimResult finalizeDeviceClaim(FinalizeDeviceClaimRequest finalizeDeviceClaimRequest);

    /**
     * <p>
     * Given a device ID, returns the invokable methods associated with the device.
     * </p>
     * 
     * @param getDeviceMethodsRequest
     * @return Result of the GetDeviceMethods operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.GetDeviceMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/GetDeviceMethods" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceMethodsResult getDeviceMethods(GetDeviceMethodsRequest getDeviceMethodsRequest);

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
     * @return Result of the InitiateDeviceClaim operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.InitiateDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InitiateDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    InitiateDeviceClaimResult initiateDeviceClaim(InitiateDeviceClaimRequest initiateDeviceClaimRequest);

    /**
     * <p>
     * Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
     * "Example POST" code snippet below.
     * </p>
     * 
     * @param invokeDeviceMethodRequest
     * @return Result of the InvokeDeviceMethod operation returned by the service.
     * @throws InvalidRequestException
     *         400 response
     * @throws PreconditionFailedException
     *         412 response
     * @throws InternalFailureException
     *         500 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.InvokeDeviceMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
     *      Documentation</a>
     */
    InvokeDeviceMethodResult invokeDeviceMethod(InvokeDeviceMethodRequest invokeDeviceMethodRequest);

    /**
     * <p>
     * Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return Result of the ListDeviceEvents operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDeviceEvents" target="_top">AWS API
     *      Documentation</a>
     */
    ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest);

    /**
     * <p>
     * Lists the 1-Click compatible devices associated with your AWS account.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Lists the tags associated with the specified resource ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds or updates the tags associated with the resource ARN. See <a
     * href="https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-appendix.html#1click-limits">AWS IoT
     * 1-Click Service Limits</a> for the maximum number of tags allowed per resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates a device from your AWS account using its device ID.
     * </p>
     * 
     * @param unclaimDeviceRequest
     * @return Result of the UnclaimDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UnclaimDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UnclaimDevice" target="_top">AWS API
     *      Documentation</a>
     */
    UnclaimDeviceResult unclaimDevice(UnclaimDeviceRequest unclaimDeviceRequest);

    /**
     * <p>
     * Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Using a Boolean value (true or false), this operation enables or disables the device given a device ID.
     * </p>
     * 
     * @param updateDeviceStateRequest
     * @return Result of the UpdateDeviceState operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UpdateDeviceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UpdateDeviceState" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDeviceStateResult updateDeviceState(UpdateDeviceStateRequest updateDeviceStateRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
