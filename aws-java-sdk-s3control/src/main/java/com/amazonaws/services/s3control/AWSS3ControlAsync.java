/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Creates an access point and associates it with the specified bucket.
     * </p>
     * 
     * @param createAccessPointRequest
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest);

    /**
     * <p>
     * Creates an access point and associates it with the specified bucket.
     * </p>
     * 
     * @param createAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler);

    /**
     * <p>
     * You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3
     * Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3
     * Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3
     * Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3
     * Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * Deletes the specified access point.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest);

    /**
     * <p>
     * Deletes the specified access point.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler);

    /**
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * 
     * @param deleteAccessPointPolicyRequest
     * @return A Java Future containing the result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest);

    /**
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * 
     * @param deleteAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointPolicyRequest, DeleteAccessPointPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes the entire tag set from the specified Amazon S3 Batch Operations job. To use this operation, you must
     * have permission to perform the <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @return A Java Future containing the result of the DeleteJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest deleteJobTaggingRequest);

    /**
     * <p>
     * Removes the entire tag set from the specified Amazon S3 Batch Operations job. To use this operation, you must
     * have permission to perform the <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest deleteJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobTaggingRequest, DeleteJobTaggingResult> asyncHandler);

    /**
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
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
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
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
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * 
     * @param getAccessPointRequest
     * @return A Java Future containing the result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest getAccessPointRequest);

    /**
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * 
     * @param getAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest getAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointRequest, GetAccessPointResult> asyncHandler);

    /**
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * 
     * @param getAccessPointPolicyRequest
     * @return A Java Future containing the result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest getAccessPointPolicyRequest);

    /**
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * 
     * @param getAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest getAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyRequest, GetAccessPointPolicyResult> asyncHandler);

    /**
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3
     * Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @return A Java Future containing the result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(
            GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest);

    /**
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3
     * Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(
            GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyStatusRequest, GetAccessPointPolicyStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the tags on an Amazon S3 Batch Operations job. To use this operation, you must have permission to perform
     * the <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @return A Java Future containing the result of the GetJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest getJobTaggingRequest);

    /**
     * <p>
     * Returns the tags on an Amazon S3 Batch Operations job. To use this operation, you must have permission to perform
     * the <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest getJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobTaggingRequest, GetJobTaggingResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
     * 
     * @param getPublicAccessBlockRequest
     * @return A Java Future containing the result of the GetPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest getPublicAccessBlockRequest);

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
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
     * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000
     * access points per call. If the specified bucket has more than 1,000 access points (or the number specified in
     * <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to
     * list the additional access points.
     * </p>
     * 
     * @param listAccessPointsRequest
     * @return A Java Future containing the result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsync.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest listAccessPointsRequest);

    /**
     * <p>
     * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000
     * access points per call. If the specified bucket has more than 1,000 access points (or the number specified in
     * <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to
     * list the additional access points.
     * </p>
     * 
     * @param listAccessPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest listAccessPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPointsRequest, ListAccessPointsResult> asyncHandler);

    /**
     * <p>
     * Lists current Amazon S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS
     * account making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * Lists current Amazon S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS
     * account making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * 
     * @param putAccessPointPolicyRequest
     * @return A Java Future containing the result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest putAccessPointPolicyRequest);

    /**
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * 
     * @param putAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest putAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessPointPolicyRequest, PutAccessPointPolicyResult> asyncHandler);

    /**
     * <p>
     * Set the supplied tag-set on an Amazon S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT
     * request against the tagging subresource that is associated with the job. To modify the existing tag set, you can
     * either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the
     * existing tag set using <a>GetJobTagging</a>, modify that tag set, and use this API action to replace the tag set
     * with the one you have modified.. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your batch operations job, <a>DeleteJobTagging</a> request is preferred because it
     * achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <p/>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutJobTagging</code> action.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @return A Java Future containing the result of the PutJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest putJobTaggingRequest);

    /**
     * <p>
     * Set the supplied tag-set on an Amazon S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT
     * request against the tagging subresource that is associated with the job. To modify the existing tag set, you can
     * either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the
     * existing tag set using <a>GetJobTagging</a>, modify that tag set, and use this API action to replace the tag set
     * with the one you have modified.. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job
     * Tags</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your batch operations job, <a>DeleteJobTagging</a> request is preferred because it
     * achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <p/>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutJobTagging</code> action.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest putJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<PutJobTaggingRequest, PutJobTaggingResult> asyncHandler);

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
     * 
     * @param putPublicAccessBlockRequest
     * @return A Java Future containing the result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest putPublicAccessBlockRequest);

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
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
     * Updates an existing Amazon S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * Updates an existing Amazon S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * an existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
     * an existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in
     * the Amazon Simple Storage Service Developer Guide.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
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
