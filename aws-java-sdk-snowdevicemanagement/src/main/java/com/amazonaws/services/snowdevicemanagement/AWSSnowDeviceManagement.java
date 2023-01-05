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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.snowdevicemanagement.model.*;

/**
 * Interface for accessing AWS Snow Device Management.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.snowdevicemanagement.AbstractAWSSnowDeviceManagement} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Snow Device Management documentation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSnowDeviceManagement {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "snow-device-management";

    /**
     * <p>
     * Sends a cancel request for a specified task. You can cancel a task only if it's still in a <code>QUEUED</code>
     * state. Tasks that are already running can't be cancelled.
     * </p>
     * <note>
     * <p>
     * A task might still run if it's processed from the queue before the <code>CancelTask</code> operation changes the
     * task's state.
     * </p>
     * </note>
     * 
     * @param cancelTaskRequest
     * @return Result of the CancelTask operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.CancelTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CancelTask"
     *      target="_top">AWS API Documentation</a>
     */
    CancelTaskResult cancelTask(CancelTaskRequest cancelTaskRequest);

    /**
     * <p>
     * Instructs one or more devices to start a task, such as unlocking or rebooting.
     * </p>
     * 
     * @param createTaskRequest
     * @return Result of the CreateTask operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CreateTask"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTaskResult createTask(CreateTaskRequest createTaskRequest);

    /**
     * <p>
     * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Checks the current state of the Amazon EC2 instances. The output is similar to <code>describeDevice</code>, but
     * the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the
     * available fields.
     * </p>
     * 
     * @param describeDeviceEc2InstancesRequest
     * @return Result of the DescribeDeviceEc2Instances operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeDeviceEc2Instances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeviceEc2InstancesResult describeDeviceEc2Instances(DescribeDeviceEc2InstancesRequest describeDeviceEc2InstancesRequest);

    /**
     * <p>
     * Checks the status of a remote task running on one or more target devices.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeExecution"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeExecutionResult describeExecution(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Checks the metadata for a given task on a device.
     * </p>
     * 
     * @param describeTaskRequest
     * @return Result of the DescribeTask operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeTask"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTaskResult describeTask(DescribeTaskRequest describeTaskRequest);

    /**
     * <p>
     * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are
     * the only supported resource type.
     * </p>
     * 
     * @param listDeviceResourcesRequest
     * @return Result of the ListDeviceResources operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListDeviceResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeviceResourcesResult listDeviceResources(ListDeviceResourcesRequest listDeviceResourcesRequest);

    /**
     * <p>
     * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device
     * Management enabled in the Amazon Web Services Region where the command is run.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns the status of tasks for one or more target devices.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Returns a list of tags for a managed device or task.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tasks that can be filtered by state.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks"
     *      target="_top">AWS API Documentation</a>
     */
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Adds or replaces tags on a device or task.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a device or task.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
