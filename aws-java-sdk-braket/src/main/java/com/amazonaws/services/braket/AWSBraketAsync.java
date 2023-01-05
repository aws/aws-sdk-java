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

import com.amazonaws.services.braket.model.*;

/**
 * Interface for accessing Braket asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.braket.AbstractAWSBraketAsync} instead.
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
public interface AWSBraketAsync extends AWSBraket {

    /**
     * <p>
     * Cancels an Amazon Braket job.
     * </p>
     * 
     * @param cancelJobRequest
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSBraketAsync.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels an Amazon Braket job.
     * </p>
     * 
     * @param cancelJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSBraketAsyncHandler.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * Cancels the specified task.
     * </p>
     * 
     * @param cancelQuantumTaskRequest
     * @return A Java Future containing the result of the CancelQuantumTask operation returned by the service.
     * @sample AWSBraketAsync.CancelQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(CancelQuantumTaskRequest cancelQuantumTaskRequest);

    /**
     * <p>
     * Cancels the specified task.
     * </p>
     * 
     * @param cancelQuantumTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelQuantumTask operation returned by the service.
     * @sample AWSBraketAsyncHandler.CancelQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(CancelQuantumTaskRequest cancelQuantumTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelQuantumTaskRequest, CancelQuantumTaskResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Braket job.
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSBraketAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates an Amazon Braket job.
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSBraketAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * Creates a quantum task.
     * </p>
     * 
     * @param createQuantumTaskRequest
     * @return A Java Future containing the result of the CreateQuantumTask operation returned by the service.
     * @sample AWSBraketAsync.CreateQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(CreateQuantumTaskRequest createQuantumTaskRequest);

    /**
     * <p>
     * Creates a quantum task.
     * </p>
     * 
     * @param createQuantumTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQuantumTask operation returned by the service.
     * @sample AWSBraketAsyncHandler.CreateQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(CreateQuantumTaskRequest createQuantumTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQuantumTaskRequest, CreateQuantumTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSBraketAsync.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSBraketAsyncHandler.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified Amazon Braket job.
     * </p>
     * 
     * @param getJobRequest
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSBraketAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Retrieves the specified Amazon Braket job.
     * </p>
     * 
     * @param getJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSBraketAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified quantum task.
     * </p>
     * 
     * @param getQuantumTaskRequest
     * @return A Java Future containing the result of the GetQuantumTask operation returned by the service.
     * @sample AWSBraketAsync.GetQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(GetQuantumTaskRequest getQuantumTaskRequest);

    /**
     * <p>
     * Retrieves the specified quantum task.
     * </p>
     * 
     * @param getQuantumTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQuantumTask operation returned by the service.
     * @sample AWSBraketAsyncHandler.GetQuantumTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(GetQuantumTaskRequest getQuantumTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetQuantumTaskRequest, GetQuantumTaskResult> asyncHandler);

    /**
     * <p>
     * Shows the tags associated with this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBraketAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Shows the tags associated with this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBraketAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Searches for devices using the specified filters.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return A Java Future containing the result of the SearchDevices operation returned by the service.
     * @sample AWSBraketAsync.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest searchDevicesRequest);

    /**
     * <p>
     * Searches for devices using the specified filters.
     * </p>
     * 
     * @param searchDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDevices operation returned by the service.
     * @sample AWSBraketAsyncHandler.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest searchDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDevicesRequest, SearchDevicesResult> asyncHandler);

    /**
     * <p>
     * Searches for Amazon Braket jobs that match the specified filter values.
     * </p>
     * 
     * @param searchJobsRequest
     * @return A Java Future containing the result of the SearchJobs operation returned by the service.
     * @sample AWSBraketAsync.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(SearchJobsRequest searchJobsRequest);

    /**
     * <p>
     * Searches for Amazon Braket jobs that match the specified filter values.
     * </p>
     * 
     * @param searchJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchJobs operation returned by the service.
     * @sample AWSBraketAsyncHandler.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(SearchJobsRequest searchJobsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchJobsRequest, SearchJobsResult> asyncHandler);

    /**
     * <p>
     * Searches for tasks that match the specified filter values.
     * </p>
     * 
     * @param searchQuantumTasksRequest
     * @return A Java Future containing the result of the SearchQuantumTasks operation returned by the service.
     * @sample AWSBraketAsync.SearchQuantumTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(SearchQuantumTasksRequest searchQuantumTasksRequest);

    /**
     * <p>
     * Searches for tasks that match the specified filter values.
     * </p>
     * 
     * @param searchQuantumTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchQuantumTasks operation returned by the service.
     * @sample AWSBraketAsyncHandler.SearchQuantumTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(SearchQuantumTasksRequest searchQuantumTasksRequest,
            com.amazonaws.handlers.AsyncHandler<SearchQuantumTasksRequest, SearchQuantumTasksResult> asyncHandler);

    /**
     * <p>
     * Add a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBraketAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBraketAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBraketAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBraketAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
