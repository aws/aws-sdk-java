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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotjobsdataplane.model.*;

/**
 * Interface for accessing AWS IoT Jobs Data Plane.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotjobsdataplane.AbstractAWSIoTJobsDataPlane} instead.
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
public interface AWSIoTJobsDataPlane {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "data.jobs.iot";

    /**
     * <p>
     * Gets details of a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return Result of the DescribeJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws TerminalStateException
     *         The job is in a terminal state.
     * @sample AWSIoTJobsDataPlane.DescribeJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/DescribeJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeJobExecutionResult describeJobExecution(DescribeJobExecutionRequest describeJobExecutionRequest);

    /**
     * <p>
     * Gets the list of all jobs for a thing that are not in a terminal status.
     * </p>
     * 
     * @param getPendingJobExecutionsRequest
     * @return Result of the GetPendingJobExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @sample AWSIoTJobsDataPlane.GetPendingJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/GetPendingJobExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    GetPendingJobExecutionsResult getPendingJobExecutions(GetPendingJobExecutionsRequest getPendingJobExecutionsRequest);

    /**
     * <p>
     * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
     * </p>
     * 
     * @param startNextPendingJobExecutionRequest
     * @return Result of the StartNextPendingJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @sample AWSIoTJobsDataPlane.StartNextPendingJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/StartNextPendingJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartNextPendingJobExecutionResult startNextPendingJobExecution(StartNextPendingJobExecutionRequest startNextPendingJobExecutionRequest);

    /**
     * <p>
     * Updates the status of a job execution.
     * </p>
     * 
     * @param updateJobExecutionRequest
     * @return Result of the UpdateJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws InvalidStateTransitionException
     *         An update attempted to change the job execution to a state that is invalid because of the job execution's
     *         current state (for example, an attempt to change a request in state SUCCESS to state IN_PROGRESS). In
     *         this case, the body of the error message also contains the executionState field.
     * @sample AWSIoTJobsDataPlane.UpdateJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateJobExecutionResult updateJobExecution(UpdateJobExecutionRequest updateJobExecutionRequest);

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
