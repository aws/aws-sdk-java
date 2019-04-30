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
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;

/**
 * Interface for accessing AWS S3 Control asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.s3control.AbstractAWSS3ControlAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS S3 Control provides access to Amazon S3 control plane operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSS3ControlAsync extends AWSS3Control {

    /**
     * <p>
     * Creates an Amazon S3 batch operations job.
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSS3ControlAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates an Amazon S3 batch operations job.
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * Deletes the block public access configuration for the specified account.
     * </p>
     * 
     * @param deletePublicAccessBlockRequest
     * @return A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest);

    /**
     * <p>
     * Deletes the block public access configuration for the specified account.
     * </p>
     * 
     * @param deletePublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePublicAccessBlockRequest, DeletePublicAccessBlockResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration parameters and status for a batch operations job.
     * </p>
     * 
     * @param describeJobRequest
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSS3ControlAsync.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Retrieves the configuration parameters and status for a batch operations job.
     * </p>
     * 
     * @param describeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <p/>
     * 
     * @param getPublicAccessBlockRequest
     * @return A Java Future containing the result of the GetPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest getPublicAccessBlockRequest);

    /**
     * <p/>
     * 
     * @param getPublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest getPublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<GetPublicAccessBlockRequest, GetPublicAccessBlockResult> asyncHandler);

    /**
     * <p>
     * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSS3ControlAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p/>
     * 
     * @param putPublicAccessBlockRequest
     * @return A Java Future containing the result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest putPublicAccessBlockRequest);

    /**
     * <p/>
     * 
     * @param putPublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest putPublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<PutPublicAccessBlockRequest, PutPublicAccessBlockResult> asyncHandler);

    /**
     * <p>
     * Updates an existing job's priority.
     * </p>
     * 
     * @param updateJobPriorityRequest
     * @return A Java Future containing the result of the UpdateJobPriority operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest updateJobPriorityRequest);

    /**
     * <p>
     * Updates an existing job's priority.
     * </p>
     * 
     * @param updateJobPriorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobPriority operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest updateJobPriorityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobPriorityRequest, UpdateJobPriorityResult> asyncHandler);

    /**
     * <p>
     * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
     * an existing job.
     * </p>
     * 
     * @param updateJobStatusRequest
     * @return A Java Future containing the result of the UpdateJobStatus operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest updateJobStatusRequest);

    /**
     * <p>
     * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
     * an existing job.
     * </p>
     * 
     * @param updateJobStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobStatus operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest updateJobStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobStatusRequest, UpdateJobStatusResult> asyncHandler);

}
