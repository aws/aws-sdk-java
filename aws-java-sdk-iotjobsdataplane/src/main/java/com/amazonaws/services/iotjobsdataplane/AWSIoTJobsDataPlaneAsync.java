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
package com.amazonaws.services.iotjobsdataplane;

import javax.annotation.Generated;

import com.amazonaws.services.iotjobsdataplane.model.*;

/**
 * Interface for accessing AWS IoT Jobs Data Plane asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotjobsdataplane.AbstractAWSIoTJobsDataPlaneAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Jobs is a service that allows you to define a set of jobs — remote operations that are sent to and executed
 * on one or more devices connected to AWS IoT. For example, you can define a job that instructs a set of devices to
 * download and install application or firmware updates, reboot, rotate certificates, or perform remote troubleshooting
 * operations.
 * </p>
 * <p>
 * To create a job, you make a job document which is a description of the remote operations to be performed, and you
 * specify a list of targets that should perform the operations. The targets can be individual things, thing groups or
 * both.
 * </p>
 * <p>
 * AWS IoT Jobs sends a message to inform the targets that a job is available. The target starts the execution of the
 * job by downloading the job document, performing the operations it specifies, and reporting its progress to AWS IoT.
 * The Jobs service provides commands to track the progress of a job on a specific target and for all the targets of the
 * job
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTJobsDataPlaneAsync extends AWSIoTJobsDataPlane {

    /**
     * <p>
     * Gets details of a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return A Java Future containing the result of the DescribeJobExecution operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsync.DescribeJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/DescribeJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest describeJobExecutionRequest);

    /**
     * <p>
     * Gets details of a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobExecution operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsyncHandler.DescribeJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/DescribeJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest describeJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobExecutionRequest, DescribeJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Gets the list of all jobs for a thing that are not in a terminal status.
     * </p>
     * 
     * @param getPendingJobExecutionsRequest
     * @return A Java Future containing the result of the GetPendingJobExecutions operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsync.GetPendingJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/GetPendingJobExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(GetPendingJobExecutionsRequest getPendingJobExecutionsRequest);

    /**
     * <p>
     * Gets the list of all jobs for a thing that are not in a terminal status.
     * </p>
     * 
     * @param getPendingJobExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPendingJobExecutions operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsyncHandler.GetPendingJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/GetPendingJobExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(GetPendingJobExecutionsRequest getPendingJobExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPendingJobExecutionsRequest, GetPendingJobExecutionsResult> asyncHandler);

    /**
     * <p>
     * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
     * </p>
     * 
     * @param startNextPendingJobExecutionRequest
     * @return A Java Future containing the result of the StartNextPendingJobExecution operation returned by the
     *         service.
     * @sample AWSIoTJobsDataPlaneAsync.StartNextPendingJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/StartNextPendingJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(
            StartNextPendingJobExecutionRequest startNextPendingJobExecutionRequest);

    /**
     * <p>
     * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
     * </p>
     * 
     * @param startNextPendingJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartNextPendingJobExecution operation returned by the
     *         service.
     * @sample AWSIoTJobsDataPlaneAsyncHandler.StartNextPendingJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/StartNextPendingJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(
            StartNextPendingJobExecutionRequest startNextPendingJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartNextPendingJobExecutionRequest, StartNextPendingJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a job execution.
     * </p>
     * 
     * @param updateJobExecutionRequest
     * @return A Java Future containing the result of the UpdateJobExecution operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsync.UpdateJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(UpdateJobExecutionRequest updateJobExecutionRequest);

    /**
     * <p>
     * Updates the status of a job execution.
     * </p>
     * 
     * @param updateJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobExecution operation returned by the service.
     * @sample AWSIoTJobsDataPlaneAsyncHandler.UpdateJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(UpdateJobExecutionRequest updateJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobExecutionRequest, UpdateJobExecutionResult> asyncHandler);

}
