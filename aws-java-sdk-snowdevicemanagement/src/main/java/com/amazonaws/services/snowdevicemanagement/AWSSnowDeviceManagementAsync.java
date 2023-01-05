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
 * Interface for accessing AWS Snow Device Management asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.snowdevicemanagement.AbstractAWSSnowDeviceManagementAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Snow Device Management documentation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSnowDeviceManagementAsync extends AWSSnowDeviceManagement {

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
     * @return A Java Future containing the result of the CancelTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.CancelTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CancelTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(CancelTaskRequest cancelTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.CancelTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CancelTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(CancelTaskRequest cancelTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelTaskRequest, CancelTaskResult> asyncHandler);

    /**
     * <p>
     * Instructs one or more devices to start a task, such as unlocking or rebooting.
     * </p>
     * 
     * @param createTaskRequest
     * @return A Java Future containing the result of the CreateTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CreateTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest createTaskRequest);

    /**
     * <p>
     * Instructs one or more devices to start a task, such as unlocking or rebooting.
     * </p>
     * 
     * @param createTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CreateTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest createTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTaskRequest, CreateTaskResult> asyncHandler);

    /**
     * <p>
     * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
     * </p>
     * 
     * @param describeDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler);

    /**
     * <p>
     * Checks the current state of the Amazon EC2 instances. The output is similar to <code>describeDevice</code>, but
     * the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the
     * available fields.
     * </p>
     * 
     * @param describeDeviceEc2InstancesRequest
     * @return A Java Future containing the result of the DescribeDeviceEc2Instances operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.DescribeDeviceEc2Instances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(
            DescribeDeviceEc2InstancesRequest describeDeviceEc2InstancesRequest);

    /**
     * <p>
     * Checks the current state of the Amazon EC2 instances. The output is similar to <code>describeDevice</code>, but
     * the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the
     * available fields.
     * </p>
     * 
     * @param describeDeviceEc2InstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeviceEc2Instances operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.DescribeDeviceEc2Instances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(
            DescribeDeviceEc2InstancesRequest describeDeviceEc2InstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceEc2InstancesRequest, DescribeDeviceEc2InstancesResult> asyncHandler);

    /**
     * <p>
     * Checks the status of a remote task running on one or more target devices.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Checks the status of a remote task running on one or more target devices.
     * </p>
     * 
     * @param describeExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler);

    /**
     * <p>
     * Checks the metadata for a given task on a device.
     * </p>
     * 
     * @param describeTaskRequest
     * @return A Java Future containing the result of the DescribeTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest describeTaskRequest);

    /**
     * <p>
     * Checks the metadata for a given task on a device.
     * </p>
     * 
     * @param describeTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTask operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest describeTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskRequest, DescribeTaskResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are
     * the only supported resource type.
     * </p>
     * 
     * @param listDeviceResourcesRequest
     * @return A Java Future containing the result of the ListDeviceResources operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.ListDeviceResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(ListDeviceResourcesRequest listDeviceResourcesRequest);

    /**
     * <p>
     * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are
     * the only supported resource type.
     * </p>
     * 
     * @param listDeviceResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceResources operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.ListDeviceResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(ListDeviceResourcesRequest listDeviceResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceResourcesRequest, ListDeviceResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device
     * Management enabled in the Amazon Web Services Region where the command is run.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device
     * Management enabled in the Amazon Web Services Region where the command is run.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Returns the status of tasks for one or more target devices.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Returns the status of tasks for one or more target devices.
     * </p>
     * 
     * @param listExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a managed device or task.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a managed device or task.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tasks that can be filtered by state.
     * </p>
     * 
     * @param listTasksRequest
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Returns a list of tasks that can be filtered by state.
     * </p>
     * 
     * @param listTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler);

    /**
     * <p>
     * Adds or replaces tags on a device or task.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or replaces tags on a device or task.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a device or task.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a device or task.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSnowDeviceManagementAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
