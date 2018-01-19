/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transcribe.AbstractAmazonTranscribe} instead.
 * </p>
 * <p>
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranscribe {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "transcribe";

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the job, check the <code>Status</code> field.
     * If the status is <code>COMPLETE</code>, the job is finished and you can find the results at the location
     * specified in the <code>TranscriptionFileUri</code> field.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         There is a problem with one of the input fields. Check the S3 bucket name, make sure that the job name is
     *         not a duplicate, and confirm that you are using the correct file format. Then resend your request.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is longer than 2 hours. Wait before you resend
     *         your request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested job. Check the job name and try your request again.
     * @sample AmazonTranscribe.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetTranscriptionJobResult getTranscriptionJob(GetTranscriptionJobRequest getTranscriptionJobRequest);

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         There is a problem with one of the input fields. Check the S3 bucket name, make sure that the job name is
     *         not a duplicate, and confirm that you are using the correct file format. Then resend your request.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is longer than 2 hours. Wait before you resend
     *         your request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTranscriptionJobsResult listTranscriptionJobs(ListTranscriptionJobsRequest listTranscriptionJobsRequest);

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         There is a problem with one of the input fields. Check the S3 bucket name, make sure that the job name is
     *         not a duplicate, and confirm that you are using the correct file format. Then resend your request.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is longer than 2 hours. Wait before you resend
     *         your request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         The <code>JobName</code> field is a duplicate of a previously entered job name. Resend your request with
     *         a different name.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest);

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
