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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.s3control.model.*;

/**
 * Interface for accessing AWS S3 Control.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.s3control.AbstractAWSS3Control} instead.
 * </p>
 * <p>
 * <p>
 * AWS S3 Control provides access to Amazon S3 control plane operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSS3Control {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "s3-control";

    /**
     * <p>
     * Creates an access point and associates it with the specified bucket.
     * </p>
     * 
     * @param createAccessPointRequest
     * @return Result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3Control.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAccessPointResult createAccessPoint(CreateAccessPointRequest createAccessPointRequest);

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
     * @return Result of the CreateJob operation returned by the service.
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @sample AWSS3Control.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Deletes the specified access point.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @return Result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAccessPointResult deleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest);

    /**
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * 
     * @param deleteAccessPointPolicyRequest
     * @return Result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccessPointPolicyResult deleteAccessPointPolicy(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest);

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
     * @return Result of the DeleteJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobTaggingResult deleteJobTagging(DeleteJobTaggingRequest deleteJobTaggingRequest);

    /**
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
     * 
     * @param deletePublicAccessBlockRequest
     * @return Result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePublicAccessBlockResult deletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest);

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
     * @return Result of the DescribeJob operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * 
     * @param getAccessPointRequest
     * @return Result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3Control.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccessPointResult getAccessPoint(GetAccessPointRequest getAccessPointRequest);

    /**
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * 
     * @param getAccessPointPolicyRequest
     * @return Result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccessPointPolicyResult getAccessPointPolicy(GetAccessPointPolicyRequest getAccessPointPolicyRequest);

    /**
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3
     * Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @return Result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccessPointPolicyStatusResult getAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest);

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
     * @return Result of the GetJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobTaggingResult getJobTagging(GetJobTaggingRequest getJobTaggingRequest);

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
     * 
     * @param getPublicAccessBlockRequest
     * @return Result of the GetPublicAccessBlock operation returned by the service.
     * @throws NoSuchPublicAccessBlockConfigurationException
     *         Amazon S3 throws this exception if you make a <code>GetPublicAccessBlock</code> request against an
     *         account that doesn't have a <code>PublicAccessBlockConfiguration</code> set.
     * @sample AWSS3Control.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    GetPublicAccessBlockResult getPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest);

    /**
     * <p>
     * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000
     * access points per call. If the specified bucket has more than 1,000 access points (or the number specified in
     * <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to
     * list the additional access points.
     * </p>
     * 
     * @param listAccessPointsRequest
     * @return Result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3Control.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccessPointsResult listAccessPoints(ListAccessPointsRequest listAccessPointsRequest);

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
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws InvalidNextTokenException
     * @sample AWSS3Control.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * 
     * @param putAccessPointPolicyRequest
     * @return Result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutAccessPointPolicyResult putAccessPointPolicy(PutAccessPointPolicyRequest putAccessPointPolicyRequest);

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
     * @return Result of the PutJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws TooManyTagsException
     * @sample AWSS3Control.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    PutJobTaggingResult putJobTagging(PutJobTaggingRequest putJobTaggingRequest);

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account.
     * </p>
     * 
     * @param putPublicAccessBlockRequest
     * @return Result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    PutPublicAccessBlockResult putPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest);

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
     * @return Result of the UpdateJobPriority operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateJobPriorityResult updateJobPriority(UpdateJobPriorityRequest updateJobPriorityRequest);

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
     * @return Result of the UpdateJobStatus operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws JobStatusException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateJobStatusResult updateJobStatus(UpdateJobStatusRequest updateJobStatusRequest);

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
    com.amazonaws.services.s3control.S3ControlResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
