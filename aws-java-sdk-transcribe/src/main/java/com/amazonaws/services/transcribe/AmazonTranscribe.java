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
 * Amazon Transcribe offers three main types of batch transcription: <b>Standard</b>, <b>Medical</b>, and <b>Call
 * Analytics</b>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Standard transcriptions</b> are the most common option. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Medical transcriptions</b> are tailored to medical professionals and incorporate medical terms. A common use case
 * for this service is transcribing doctor-patient dialogue into after-visit notes. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Call Analytics transcriptions</b> are designed for use with call center audio on two different channels; if you're
 * looking for insight into customer service calls, use this option. Refer to for details.
 * </p>
 * </li>
 * </ul>
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
     * Creates a new Call Analytics category.
     * </p>
     * <p>
     * All categories are automatically applied to your Call Analytics transcriptions. Note that in order to apply
     * categories to your transcriptions, you must create them before submitting your transcription request, as
     * categories cannot be applied retroactively.
     * </p>
     * <p>
     * When creating a new category, you can use the <code>InputType</code> parameter to label the category as a batch
     * category (<code>POST_CALL</code>) or a streaming category (<code>REAL_TIME</code>). Batch categories can only be
     * applied to batch transcriptions and streaming categories can only be applied to streaming transcriptions. If you
     * do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * <p>
     * Call Analytics categories are composed of rules. For each category, you must create between 1 and 20 rules. Rules
     * can include these parameters: , , , and .
     * </p>
     * <p>
     * To update an existing category, see .
     * </p>
     * <p>
     * To learn more about Call Analytics categories, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html">Creating categories for batch
     * transcriptions</a> and <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html">Creating categories for
     * streaming transcriptions</a>.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @return Result of the CreateCallAnalyticsCategory operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCallAnalyticsCategoryResult createCallAnalyticsCategory(CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Creates a new custom language model.
     * </p>
     * <p>
     * When creating a new custom language model, you must specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband (audio sample rates under 16,000 Hz)
     * base model
     * </p>
     * </li>
     * <li>
     * <p>
     * The location of your training and tuning files (this must be an Amazon S3 URI)
     * </p>
     * </li>
     * <li>
     * <p>
     * The language of your model
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique name for your model
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLanguageModelRequest
     * @return Result of the CreateLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLanguageModelResult createLanguageModel(CreateLanguageModelRequest createLanguageModelRequest);

    /**
     * <p>
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * Before creating a new custom medical vocabulary, you must first upload a text file that contains your new
     * entries, phrases, and terms into an Amazon S3 bucket. Note that this differs from , where you can include a list
     * of terms within your request using the <code>Phrases</code> flag; <code>CreateMedicalVocabulary</code> does not
     * support the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a>.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return Result of the CreateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMedicalVocabularyResult createMedicalVocabulary(CreateMedicalVocabularyRequest createMedicalVocabularyRequest);

    /**
     * <p>
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new custom vocabulary, you can either upload a text file that contains your new entries, phrases,
     * and terms into an Amazon S3 bucket and include the URI in your request. Or you can include a list of terms
     * directly in your request using the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a>.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest);

    /**
     * <p>
     * Creates a new custom vocabulary filter.
     * </p>
     * <p>
     * You can use custom vocabulary filters to mask, delete, or flag specific words from your transcript. Custom
     * vocabulary filters are commonly used to mask profanity in transcripts.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Vocabulary filtering</a>.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return Result of the CreateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVocabularyFilterResult createVocabularyFilter(CreateVocabularyFilterRequest createVocabularyFilterRequest);

    /**
     * <p>
     * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete
     * using <code>CategoryName</code>. Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return Result of the DeleteCallAnalyticsCategory operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCallAnalyticsCategoryResult deleteCallAnalyticsCategory(DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using
     * <code>CallAnalyticsJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return Result of the DeleteCallAnalyticsJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCallAnalyticsJobResult deleteCallAnalyticsJob(DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest);

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete
     * using <code>ModelName</code>. custom language model names are case sensitive.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return Result of the DeleteLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLanguageModelResult deleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest);

    /**
     * <p>
     * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return Result of the DeleteMedicalTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMedicalTranscriptionJobResult deleteMedicalTranscriptionJob(DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to
     * delete using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return Result of the DeleteMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMedicalVocabularyResult deleteMedicalVocabulary(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest);

    /**
     * <p>
     * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return Result of the DeleteTranscriptionJob operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTranscriptionJobResult deleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete
     * using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest);

    /**
     * <p>
     * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you
     * want to delete using <code>VocabularyFilterName</code>. Custom vocabulary filter names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return Result of the DeleteVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVocabularyFilterResult deleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest);

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This operation also shows if the base language model that you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return Result of the DescribeLanguageModel operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLanguageModelResult describeLanguageModel(DescribeLanguageModelRequest describeLanguageModelRequest);

    /**
     * <p>
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return Result of the GetCallAnalyticsCategory operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    GetCallAnalyticsCategoryResult getCallAnalyticsCategory(GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Provides information about the specified Call Analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>. If the status is <code>COMPLETED</code>,
     * the job is finished. You can find your completed transcript at the URI specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     * on why your transcription job failed.
     * </p>
     * <p>
     * If you enabled personally identifiable information (PII) redaction, the redacted transcript appears at the
     * location specified in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * If you chose to redact the audio in your media file, you can find your redacted media file at the location
     * specified in <code>RedactedMediaFileUri</code>.
     * </p>
     * <p>
     * To get a list of your Call Analytics jobs, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @return Result of the GetCallAnalyticsJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetCallAnalyticsJobResult getCallAnalyticsJob(GetCallAnalyticsJobRequest getCallAnalyticsJobRequest);

    /**
     * <p>
     * Provides information about the specified medical transcription job.
     * </p>
     * <p>
     * To view the status of the specified medical transcription job, check the <code>TranscriptionJobStatus</code>
     * field. If the status is <code>COMPLETED</code>, the job is finished. You can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * <p>
     * To get a list of your medical transcription jobs, use the operation.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return Result of the GetMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Provides information about the specified custom medical vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom medical vocabulary, check the <code>VocabularyState</code> field. If
     * the status is <code>READY</code>, your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why your vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom medical vocabularies, use the operation.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return Result of the GetMedicalVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    GetMedicalVocabularyResult getMedicalVocabulary(GetMedicalVocabularyRequest getMedicalVocabularyRequest);

    /**
     * <p>
     * Provides information about the specified transcription job.
     * </p>
     * <p>
     * To view the status of the specified transcription job, check the <code>TranscriptionJobStatus</code> field. If
     * the status is <code>COMPLETED</code>, the job is finished. You can find the results at the location specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     * on why your transcription job failed.
     * </p>
     * <p>
     * If you enabled content redaction, the redacted transcript can be found at the location specified in
     * <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * To get a list of your transcription jobs, use the operation.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return Result of the GetTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @sample AmazonTranscribe.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetTranscriptionJobResult getTranscriptionJob(GetTranscriptionJobRequest getTranscriptionJobRequest);

    /**
     * <p>
     * Provides information about the specified custom vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom vocabulary, check the <code>VocabularyState</code> field. If the
     * status is <code>READY</code>, your custom vocabulary is available to use. If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your custom vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom vocabularies, use the operation.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return Result of the GetVocabulary operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    GetVocabularyResult getVocabulary(GetVocabularyRequest getVocabularyRequest);

    /**
     * <p>
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return Result of the GetVocabularyFilter operation returned by the service.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @sample AmazonTranscribe.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    GetVocabularyFilterResult getVocabularyFilter(GetVocabularyFilterRequest getVocabularyFilterRequest);

    /**
     * <p>
     * Provides a list of Call Analytics categories, including all rules that make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return Result of the ListCallAnalyticsCategories operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListCallAnalyticsCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsCategories"
     *      target="_top">AWS API Documentation</a>
     */
    ListCallAnalyticsCategoriesResult listCallAnalyticsCategories(ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest);

    /**
     * <p>
     * Provides a list of Call Analytics jobs that match the specified criteria. If no criteria are specified, all Call
     * Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return Result of the ListCallAnalyticsJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListCallAnalyticsJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListCallAnalyticsJobsResult listCallAnalyticsJobs(ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest);

    /**
     * <p>
     * Provides a list of custom language models that match the specified criteria. If no criteria are specified, all
     * custom language models are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom language model, use the operation.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return Result of the ListLanguageModels operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListLanguageModelsResult listLanguageModels(ListLanguageModelsRequest listLanguageModelsRequest);

    /**
     * <p>
     * Provides a list of medical transcription jobs that match the specified criteria. If no criteria are specified,
     * all medical transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific medical transcription job, use the operation.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return Result of the ListMedicalTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest);

    /**
     * <p>
     * Provides a list of custom medical vocabularies that match the specified criteria. If no criteria are specified,
     * all custom medical vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom medical vocabulary, use the operation.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return Result of the ListMedicalVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    ListMedicalVocabulariesResult listMedicalVocabularies(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest);

    /**
     * <p>
     * Lists all tags associated with the specified transcription job, vocabulary, model, or resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Provides a list of transcription jobs that match the specified criteria. If no criteria are specified, all
     * transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the operation.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return Result of the ListTranscriptionJobs operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTranscriptionJobsResult listTranscriptionJobs(ListTranscriptionJobsRequest listTranscriptionJobsRequest);

    /**
     * <p>
     * Provides a list of custom vocabularies that match the specified criteria. If no criteria are specified, all
     * custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the operation.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return Result of the ListVocabularies operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    ListVocabulariesResult listVocabularies(ListVocabulariesRequest listVocabulariesRequest);

    /**
     * <p>
     * Provides a list of custom vocabulary filters that match the specified criteria. If no criteria are specified, all
     * custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary filter, use the operation.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return Result of the ListVocabularyFilters operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    ListVocabularyFiltersResult listVocabularyFilters(ListVocabularyFiltersRequest listVocabularyFiltersRequest);

    /**
     * <p>
     * Transcribes the audio from a customer service call and applies any additional Request Parameters you choose to
     * include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Call Analytics provides you with call characteristics, call
     * summarization, speaker sentiment, and optional redaction of your text transcript and your audio file. You can
     * also apply custom categories to flag specified conditions. To learn more about these features and insights, refer
     * to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html">Analyzing call center audio
     * with Call Analytics</a>.
     * </p>
     * <p>
     * If you want to apply categories to your Call Analytics job, you must create them before submitting your job
     * request. Categories cannot be retroactively applied to a job. To create a new category, use the operation. To
     * learn more about Call Analytics categories, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html">Creating categories for batch
     * transcriptions</a> and <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html">Creating categories for
     * streaming transcriptions</a>.
     * </p>
     * <p>
     * To make a <code>StartCallAnalyticsJob</code> request, you must first upload your media file into an Amazon S3
     * bucket; you can then specify the Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartCallAnalyticsJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CallAnalyticsJobName</code>: A custom name that you create for your transcription job that's unique within
     * your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM role that has permissions to access the
     * Amazon S3 bucket that contains your input files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code> or <code>RedactedMediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * With Call Analytics, you can redact the audio contained in your media file by including
     * <code>RedactedMediaFileUri</code>, instead of <code>MediaFileUri</code>, to specify the location of your input
     * audio. If you choose to redact your audio, you can find your redacted media at the location specified in the
     * <code>RedactedMediaFileUri</code> field of your response.
     * </p>
     * </note>
     * 
     * @param startCallAnalyticsJobRequest
     * @return Result of the StartCallAnalyticsJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartCallAnalyticsJobResult startCallAnalyticsJob(StartCallAnalyticsJobRequest startCallAnalyticsJobRequest);

    /**
     * <p>
     * Transcribes the audio from a medical dictation or conversation and applies any additional Request Parameters you
     * choose to include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Amazon Transcribe Medical provides you with a robust medical
     * vocabulary and, optionally, content identification, which adds flags to personal health information (PHI). To
     * learn more about these features, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html">How Amazon Transcribe Medical
     * works</a>.
     * </p>
     * <p>
     * To make a <code>StartMedicalTranscriptionJob</code> request, you must first upload your media file into an Amazon
     * S3 bucket; you can then specify the S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartMedicalTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MedicalTranscriptionJobName</code>: A custom name you create for your transcription job that is unique
     * within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LanguageCode</code>: This must be <code>en-US</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your transcript stored. If you want your
     * output stored in a sub-folder of this bucket, you must also include <code>OutputKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: Choose whether your audio is a conversation or a dictation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return Result of the StartMedicalTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Transcribes the audio from a media file and applies any additional Request Parameters you choose to include in
     * your request.
     * </p>
     * <p>
     * To make a <code>StartTranscriptionJob</code> request, you must first upload your media file into an Amazon S3
     * bucket; you can then specify the Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your <code>StartTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making your request. For a list of Amazon Web
     * Services Regions supported with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TranscriptionJobName</code>: A custom name you create for your transcription job that is unique within your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * One of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>: If
     * you know the language of your media file, specify it using the <code>LanguageCode</code> parameter; you can find
     * all valid language codes in the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * If you don't know the languages spoken in your media, use either <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> and let Amazon Transcribe identify the languages for you.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTranscriptionJobRequest
     * @return Result of the StartTranscriptionJob operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTranscriptionJobResult startTranscriptionJob(StartTranscriptionJobRequest startTranscriptionJobRequest);

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to the specified resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also include <code>ResourceArn</code> and
     * <code>TagKeys</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @sample AmazonTranscribe.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified Call Analytics category with new rules. Note that the
     * <code>UpdateCallAnalyticsCategory</code> operation overwrites all existing rules contained in the specified
     * category. You cannot append additional rules onto an existing category.
     * </p>
     * <p>
     * To create a new category, see .
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return Result of the UpdateCallAnalyticsCategory operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCallAnalyticsCategoryResult updateCallAnalyticsCategory(UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information
     * with your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return Result of the UpdateMedicalVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMedicalVocabularyResult updateMedicalVocabulary(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest);

    /**
     * <p>
     * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with
     * your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return Result of the UpdateVocabulary operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
     * @throws ConflictException
     *         A resource already exists with this name. Resource names must be unique within an Amazon Web Services
     *         account.
     * @sample AmazonTranscribe.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest updateVocabularyRequest);

    /**
     * <p>
     * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all
     * previous entries; you cannot append new terms onto an existing custom vocabulary filter.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return Result of the UpdateVocabularyFilter operation returned by the service.
     * @throws BadRequestException
     *         Your request didn't pass one or more validation tests. This can occur when the entity you're trying to
     *         delete doesn't exist or if it's in a non-terminal state (such as <code>IN PROGRESS</code>). See the
     *         exception message field for more information.
     * @throws LimitExceededException
     *         You've either sent too many requests or your input file is too long. Wait before retrying your request,
     *         or use a smaller file and try your request again.
     * @throws InternalFailureException
     *         There was an internal error. Check the error message, correct the issue, and try your request again.
     * @throws NotFoundException
     *         We can't find the requested resource. Check that the specified name is correct and try your request
     *         again.
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
