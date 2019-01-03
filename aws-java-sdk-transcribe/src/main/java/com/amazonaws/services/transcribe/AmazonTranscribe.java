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
     * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
     * audio file.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         When you are using the <code>StartTranscriptionJob</code> operation, the <code>JobName</code> field is a
     *         duplicate of a previously entered job name. Resend your request with a different name.</p>
     *         <p>
     *         When you are using the <code>UpdateVocabulary</code> operation, there are two jobs running at the same
     *         time. Resend the second request later.
     * @sample AmazonTranscribe.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest);

    /**
     * <p>
     * Deletes a previously submitted transcription job along with any other generated results such as the
     * transcription, models, and so on.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return Result of the DeleteTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTranscriptionJobResult deleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest);

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptionFileUri</code> field.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetTranscriptionJobResult getTranscriptionJob(GetTranscriptionJobRequest getTranscriptionJobRequest);

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return Result of the GetVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    GetVocabularyResult getVocabulary(GetVocabularyRequest getVocabularyRequest);

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTranscriptionJobsResult listTranscriptionJobs(ListTranscriptionJobsRequest listTranscriptionJobsRequest);

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
     * entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return Result of the ListVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    ListVocabulariesResult listVocabularies(ListVocabulariesRequest listVocabulariesRequest);

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         When you are using the <code>StartTranscriptionJob</code> operation, the <code>JobName</code> field is a
     *         duplicate of a previously entered job name. Resend your request with a different name.</p>
     *         <p>
     *         When you are using the <code>UpdateVocabulary</code> operation, there are two jobs running at the same
     *         time. Resend the second request later.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest);

    /**
     * <p>
     * Updates an existing vocabulary with new values. The <code>UpdateVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return Result of the UpdateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the transcription you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws ConflictException
     *         When you are using the <code>StartTranscriptionJob</code> operation, the <code>JobName</code> field is a
     *         duplicate of a previously entered job name. Resend your request with a different name.</p>
     *         <p>
     *         When you are using the <code>UpdateVocabulary</code> operation, there are two jobs running at the same
     *         time. Resend the second request later.
     * @sample AmazonTranscribe.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest updateVocabularyRequest);

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
