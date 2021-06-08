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
     * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time
     * it takes to create your model depends on the size of your training data.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @return Result of the CreateLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLanguageModelResult createLanguageModel(CreateLanguageModelRequest createLanguageModelRequest);

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio
     * file.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return Result of the CreateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMedicalVocabularyResult createMedicalVocabulary(CreateMedicalVocabularyRequest createMedicalVocabularyRequest);

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
     * audio file.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest);

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a
     * transcription job.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return Result of the CreateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVocabularyFilterResult createVocabularyFilter(CreateVocabularyFilterRequest createVocabularyFilterRequest);

    /**
     * <p>
     * Deletes a custom language model using its name.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return Result of the DeleteLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLanguageModelResult deleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest);

    /**
     * <p>
     * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return Result of the DeleteMedicalTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMedicalTranscriptionJobResult deleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe Medical.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return Result of the DeleteMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMedicalVocabularyResult deleteMedicalVocabulary(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest);

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
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     * Removes a vocabulary filter.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return Result of the DeleteVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVocabularyFilterResult deleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest);

    /**
     * <p>
     * Gets information about a single custom language model. Use this information to see details about the language
     * model in your AWS account. You can also see whether the base language model used to create your custom language
     * model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language
     * model using the updated base model. If the language model wasn't created, you can use this operation to
     * understand why Amazon Transcribe couldn't create it.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return Result of the DescribeLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLanguageModelResult describeLanguageModel(DescribeLanguageModelRequest describeLanguageModelRequest);

    /**
     * <p>
     * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check
     * the <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished. You
     * find the results of the completed job in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return Result of the GetMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return Result of the GetMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    GetMedicalVocabularyResult getMedicalVocabulary(GetMedicalVocabularyRequest getMedicalVocabularyRequest);

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    GetVocabularyResult getVocabulary(GetVocabularyRequest getVocabularyRequest);

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return Result of the GetVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @sample AmazonTranscribe.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    GetVocabularyFilterResult getVocabularyFilter(GetVocabularyFilterRequest getVocabularyFilterRequest);

    /**
     * <p>
     * Provides more information about the custom language models you've created. You can use the information in this
     * list to find a specific custom language model. You can then use the operation to get more information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return Result of the ListLanguageModels operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListLanguageModelsResult listLanguageModels(ListLanguageModelsRequest listLanguageModelsRequest);

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return Result of the ListMedicalTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest);

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the
     * request parameters, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return Result of the ListMedicalVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    ListMedicalVocabulariesResult listMedicalVocabularies(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest);

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return Result of the ListVocabularyFilters operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @sample AmazonTranscribe.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    ListVocabularyFiltersResult listVocabularyFilters(ListVocabularyFiltersRequest listVocabularyFiltersRequest);

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return Result of the StartMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws ConflictException
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest);

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text file from the one you used to create
     * the vocabulary. The <code>UpdateMedicalVocabulary</code> operation overwrites all of the existing information
     * with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return Result of the UpdateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMedicalVocabularyResult updateMedicalVocabulary(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest);

    /**
     * <p>
     * Updates an existing vocabulary with new values. The <code>UpdateVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return Result of the UpdateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
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
     *         There is already a resource with that name.
     * @sample AmazonTranscribe.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest updateVocabularyRequest);

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return Result of the UpdateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. For example, if the entity that you're trying to
     *         delete doesn't exist or if it is in a non-terminal state (for example, it's "in progress"). See the
     *         exception <code>Message</code> field for more information.
     * @throws LimitExceededException
     *         Either you have sent too many requests or your input file is too long. Wait before you resend your
     *         request, or use a smaller file and resend the request.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check the name and try your request again.
     * @sample AmazonTranscribe.UpdateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVocabularyFilterResult updateVocabularyFilter(UpdateVocabularyFilterRequest updateVocabularyFilterRequest);

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
