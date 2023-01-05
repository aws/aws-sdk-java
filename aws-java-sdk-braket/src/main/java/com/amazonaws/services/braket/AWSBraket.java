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
package com.amazonaws.services.braket;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.braket.model.*;

/**
 * Interface for accessing Braket.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.braket.AbstractAWSBraket} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Braket API Reference provides information about the operations and structures supported in Amazon Braket.
 * </p>
 * <p>
 * Additional Resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/braket/latest/developerguide/what-is-braket.html">Amazon Braket Developer
 * Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBraket {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "braket";

    /**
     * <p>
     * Cancels an Amazon Braket job.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         An error occurred due to a conflict.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels the specified task.
     * </p>
     * 
     * @param cancelQuantumTaskRequest
     * @return Result of the CancelQuantumTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         An error occurred due to a conflict.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.CancelQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelQuantumTaskResult cancelQuantumTask(CancelQuantumTaskRequest cancelQuantumTaskRequest);

    /**
     * <p>
     * Creates an Amazon Braket job.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws ConflictException
     *         An error occurred due to a conflict.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws DeviceRetiredException
     *         The specified device has been retired.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a quantum task.
     * </p>
     * 
     * @param createQuantumTaskRequest
     * @return Result of the CreateQuantumTask operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws DeviceOfflineException
     *         The specified device is currently offline.
     * @throws DeviceRetiredException
     *         The specified device has been retired.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.CreateQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateQuantumTaskResult createQuantumTask(CreateQuantumTaskRequest createQuantumTaskRequest);

    /**
     * <p>
     * Retrieves the devices available in Amazon Braket.
     * </p>
     * <note>
     * <p>
     * For backwards compatibility with older versions of BraketSchemas, OpenQASM information is omitted from GetDevice
     * API calls. To get this information the user-agent needs to present a recent version of the BraketSchemas (1.8.0
     * or later). The Braket SDK automatically reports this for you. If you do not see OpenQASM results in the GetDevice
     * response when using a Braket SDK, you may need to set AWS_EXECUTION_ENV environment variable to configure
     * user-agent. See the code examples provided below for how to do this for the AWS CLI, Boto3, and the Go, Java, and
     * JavaScript/TypeScript SDKs.
     * </p>
     * </note>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Retrieves the specified Amazon Braket job.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Retrieves the specified quantum task.
     * </p>
     * 
     * @param getQuantumTaskRequest
     * @return Result of the GetQuantumTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.GetQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetQuantumTaskResult getQuantumTask(GetQuantumTaskRequest getQuantumTaskRequest);

    /**
     * <p>
     * Shows the tags associated with this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Searches for devices using the specified filters.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return Result of the SearchDevices operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchDevices" target="_top">AWS API
     *      Documentation</a>
     */
    SearchDevicesResult searchDevices(SearchDevicesRequest searchDevicesRequest);

    /**
     * <p>
     * Searches for Amazon Braket jobs that match the specified filter values.
     * </p>
     * 
     * @param searchJobsRequest
     * @return Result of the SearchJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    SearchJobsResult searchJobs(SearchJobsRequest searchJobsRequest);

    /**
     * <p>
     * Searches for tasks that match the specified filter values.
     * </p>
     * 
     * @param searchQuantumTasksRequest
     * @return Result of the SearchQuantumTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The throttling rate limit is met.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.SearchQuantumTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasks" target="_top">AWS API
     *      Documentation</a>
     */
    SearchQuantumTasksResult searchQuantumTasks(SearchQuantumTasksRequest searchQuantumTasksRequest);

    /**
     * <p>
     * Add a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSBraket.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
