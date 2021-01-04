/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.services.signer.waiters.AWSsignerWaiters;

/**
 * Interface for accessing signer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.signer.AbstractAWSsigner} instead.
 * </p>
 * <p>
 * <p>
 * AWS Signer is a fully managed code signing service to help you ensure the trust and integrity of your code.
 * </p>
 * <p>
 * AWS Signer supports the following applications:
 * </p>
 * <p>
 * With <i>code signing for AWS Lambda</i>, you can sign AWS Lambda deployment packages. Integrated support is provided
 * for Amazon S3, Amazon CloudWatch, and AWS CloudTrail. In order to sign code, you create a signing profile and then
 * use Signer to sign Lambda zip files in S3.
 * </p>
 * <p>
 * With <i>code signing for IoT</i>, you can sign code for any IoT device that is supported by AWS. IoT code signing is
 * available for <a href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and is integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate using ACM, and use that to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management.
 * </p>
 * <p>
 * For more information about AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">AWS Signer Developer Guide</a>.
 * </p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSsigner {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "signer";

    /**
     * <p>
     * Adds cross-account permissions to a signing profile.
     * </p>
     * 
     * @param addProfilePermissionRequest
     * @return Result of the AddProfilePermission operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceLimitExceededException
     *         The client is making a request that exceeds service limits.
     * @throws ConflictException
     *         The resource encountered a conflicting state.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.AddProfilePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/AddProfilePermission" target="_top">AWS
     *      API Documentation</a>
     */
    AddProfilePermissionResult addProfilePermission(AddProfilePermissionRequest addProfilePermissionRequest);

    /**
     * <p>
     * Changes the state of an <code>ACTIVE</code> signing profile to <code>CANCELED</code>. A canceled profile is still
     * viewable with the <code>ListSigningProfiles</code> operation, but it cannot perform new signing jobs, and is
     * deleted two years after cancelation.
     * </p>
     * 
     * @param cancelSigningProfileRequest
     * @return Result of the CancelSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.CancelSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/CancelSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSigningProfileResult cancelSigningProfile(CancelSigningProfileRequest cancelSigningProfileRequest);

    /**
     * <p>
     * Returns information about a specific code signing job. You specify the job by using the <code>jobId</code> value
     * that is returned by the <a>StartSigningJob</a> operation.
     * </p>
     * 
     * @param describeSigningJobRequest
     * @return Result of the DescribeSigningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.DescribeSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSigningJobResult describeSigningJob(DescribeSigningJobRequest describeSigningJobRequest);

    /**
     * <p>
     * Returns information on a specific signing platform.
     * </p>
     * 
     * @param getSigningPlatformRequest
     * @return Result of the GetSigningPlatform operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningPlatform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
     *      Documentation</a>
     */
    GetSigningPlatformResult getSigningPlatform(GetSigningPlatformRequest getSigningPlatformRequest);

    /**
     * <p>
     * Returns information on a specific signing profile.
     * </p>
     * 
     * @param getSigningProfileRequest
     * @return Result of the GetSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetSigningProfileResult getSigningProfile(GetSigningProfileRequest getSigningProfileRequest);

    /**
     * <p>
     * Lists the cross-account permissions associated with a signing profile.
     * </p>
     * 
     * @param listProfilePermissionsRequest
     * @return Result of the ListProfilePermissions operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListProfilePermissions" target="_top">AWS
     *      API Documentation</a>
     */
    ListProfilePermissionsResult listProfilePermissions(ListProfilePermissionsRequest listProfilePermissionsRequest);

    /**
     * <p>
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that code signing returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @return Result of the ListSigningJobs operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListSigningJobsResult listSigningJobs(ListSigningJobsRequest listSigningJobsRequest);

    /**
     * <p>
     * Lists all signing platforms available in code signing that match the request parameters. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @return Result of the ListSigningPlatforms operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningPlatforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS
     *      API Documentation</a>
     */
    ListSigningPlatformsResult listSigningPlatforms(ListSigningPlatformsRequest listSigningPlatformsRequest);

    /**
     * <p>
     * Lists all available signing profiles in your AWS account. Returns only profiles with an <code>ACTIVE</code>
     * status unless the <code>includeCanceled</code> request field is set to <code>true</code>. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @return Result of the ListSigningProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListSigningProfilesResult listSigningProfiles(ListSigningProfilesRequest listSigningProfilesRequest);

    /**
     * <p>
     * Returns a list of the tags associated with a signing profile resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a
     * pre-defined signing job. For more information, see <a
     * href="http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html"
     * >http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html</a>
     * </p>
     * 
     * @param putSigningProfileRequest
     * @return Result of the PutSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.PutSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    PutSigningProfileResult putSigningProfile(PutSigningProfileRequest putSigningProfileRequest);

    /**
     * <p>
     * Removes cross-account permissions from a signing profile.
     * </p>
     * 
     * @param removeProfilePermissionRequest
     * @return Result of the RemoveProfilePermission operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The resource encountered a conflicting state.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RemoveProfilePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RemoveProfilePermission" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveProfilePermissionResult removeProfilePermission(RemoveProfilePermissionRequest removeProfilePermissionRequest);

    /**
     * <p>
     * Changes the state of a signing job to REVOKED. This indicates that the signature is no longer valid.
     * </p>
     * 
     * @param revokeSignatureRequest
     * @return Result of the RevokeSignature operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RevokeSignature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSignature" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeSignatureResult revokeSignature(RevokeSignatureRequest revokeSignatureRequest);

    /**
     * <p>
     * Changes the state of a signing profile to REVOKED. This indicates that signatures generated using the signing
     * profile after an effective start date are no longer valid.
     * </p>
     * 
     * @param revokeSigningProfileRequest
     * @return Result of the RevokeSigningProfile operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RevokeSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSigningProfileResult revokeSigningProfile(RevokeSigningProfileRequest revokeSigningProfileRequest);

    /**
     * <p>
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
     * <code>ListSigningJobs</code> operation for two years after they are performed. Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create an Amazon S3 source bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/CreatingABucket.html">Create a Bucket</a> in the <i>Amazon
     * S3 Getting Started Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your S3 source bucket must be version enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify the name of the source and destination buckets when calling the <code>StartSigningJob</code>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also specify a request token that identifies your request to code signing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call the <a>DescribeSigningJob</a> and the <a>ListSigningJobs</a> actions after you call
     * <code>StartSigningJob</code>.
     * </p>
     * <p>
     * For a Java example that shows how to use this action, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/">http://docs.aws.amazon.com/acm/latest/userguide/</a>
     * </p>
     * 
     * @param startSigningJobRequest
     * @return Result of the StartSigningJob operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         Instead of this error, <code>TooManyRequestsException</code> should be used.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.
     *         </p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.StartSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartSigningJobResult startSigningJob(StartSigningJobRequest startSigningJobRequest);

    /**
     * <p>
     * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. To specify the signing profile, use its Amazon
     * Resource Name (ARN). To specify the tag, use a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a signing profile. To remove the tags, specify a list of tag keys.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/UntagResource" target="_top">AWS API
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

    AWSsignerWaiters waiters();

}
