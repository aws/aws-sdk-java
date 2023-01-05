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

import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transcribe.AbstractAmazonTranscribeAsync} instead.
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
public interface AmazonTranscribeAsync extends AmazonTranscribe {

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
     * @return A Java Future containing the result of the CreateCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsync.CreateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.CreateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCallAnalyticsCategoryRequest, CreateCallAnalyticsCategoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsync.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLanguageModelResult> createLanguageModelAsync(CreateLanguageModelRequest createLanguageModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.CreateLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLanguageModelResult> createLanguageModelAsync(CreateLanguageModelRequest createLanguageModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLanguageModelRequest, CreateLanguageModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(CreateMedicalVocabularyRequest createMedicalVocabularyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.CreateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(CreateMedicalVocabularyRequest createMedicalVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMedicalVocabularyRequest, CreateMedicalVocabularyResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest createVocabularyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest createVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsync.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(CreateVocabularyFilterRequest createVocabularyFilterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.CreateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(CreateVocabularyFilterRequest createVocabularyFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVocabularyFilterRequest, CreateVocabularyFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete
     * using <code>CategoryName</code>. Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return A Java Future containing the result of the DeleteCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete
     * using <code>CategoryName</code>. Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCallAnalyticsCategoryRequest, DeleteCallAnalyticsCategoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using
     * <code>CallAnalyticsJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return A Java Future containing the result of the DeleteCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest);

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using
     * <code>CallAnalyticsJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCallAnalyticsJobRequest, DeleteCallAnalyticsJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete
     * using <code>ModelName</code>. custom language model names are case sensitive.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return A Java Future containing the result of the DeleteLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLanguageModelResult> deleteLanguageModelAsync(DeleteLanguageModelRequest deleteLanguageModelRequest);

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete
     * using <code>ModelName</code>. custom language model names are case sensitive.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteLanguageModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLanguageModelResult> deleteLanguageModelAsync(DeleteLanguageModelRequest deleteLanguageModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLanguageModelRequest, DeleteLanguageModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return A Java Future containing the result of the DeleteMedicalTranscriptionJob operation returned by the
     *         service.
     * @sample AmazonTranscribeAsync.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMedicalTranscriptionJob operation returned by the
     *         service.
     * @sample AmazonTranscribeAsyncHandler.DeleteMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMedicalTranscriptionJobRequest, DeleteMedicalTranscriptionJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to
     * delete using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return A Java Future containing the result of the DeleteMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMedicalVocabularyResult> deleteMedicalVocabularyAsync(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest);

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to
     * delete using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMedicalVocabularyResult> deleteMedicalVocabularyAsync(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMedicalVocabularyRequest, DeleteMedicalVocabularyResult> asyncHandler);

    /**
     * <p>
     * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return A Java Future containing the result of the DeleteTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest);

    /**
     * <p>
     * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTranscriptionJobRequest, DeleteTranscriptionJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete
     * using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future containing the result of the DeleteVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest);

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete
     * using <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you
     * want to delete using <code>VocabularyFilterName</code>. Custom vocabulary filter names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return A Java Future containing the result of the DeleteVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsync.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest);

    /**
     * <p>
     * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you
     * want to delete using <code>VocabularyFilterName</code>. Custom vocabulary filter names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DeleteVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVocabularyFilterRequest, DeleteVocabularyFilterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsync.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLanguageModelResult> describeLanguageModelAsync(DescribeLanguageModelRequest describeLanguageModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLanguageModel operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.DescribeLanguageModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLanguageModelResult> describeLanguageModelAsync(DescribeLanguageModelRequest describeLanguageModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLanguageModelRequest, DescribeLanguageModelResult> asyncHandler);

    /**
     * <p>
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return A Java Future containing the result of the GetCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsync.GetCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest);

    /**
     * <p>
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetCallAnalyticsCategoryRequest, GetCallAnalyticsCategoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsync.GetCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(GetCallAnalyticsJobRequest getCallAnalyticsJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(GetCallAnalyticsJobRequest getCallAnalyticsJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetCallAnalyticsJobRequest, GetCallAnalyticsJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMedicalTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsync.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMedicalTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetMedicalTranscriptionJobRequest, GetMedicalTranscriptionJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(GetMedicalVocabularyRequest getMedicalVocabularyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(GetMedicalVocabularyRequest getMedicalVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<GetMedicalVocabularyRequest, GetMedicalVocabularyResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsync.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(GetTranscriptionJobRequest getTranscriptionJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(GetTranscriptionJobRequest getTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetTranscriptionJobRequest, GetTranscriptionJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest getVocabularyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest getVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<GetVocabularyRequest, GetVocabularyResult> asyncHandler);

    /**
     * <p>
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return A Java Future containing the result of the GetVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsync.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(GetVocabularyFilterRequest getVocabularyFilterRequest);

    /**
     * <p>
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.GetVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetVocabularyFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(GetVocabularyFilterRequest getVocabularyFilterRequest,
            com.amazonaws.handlers.AsyncHandler<GetVocabularyFilterRequest, GetVocabularyFilterResult> asyncHandler);

    /**
     * <p>
     * Provides a list of Call Analytics categories, including all rules that make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return A Java Future containing the result of the ListCallAnalyticsCategories operation returned by the service.
     * @sample AmazonTranscribeAsync.ListCallAnalyticsCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsCategories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest);

    /**
     * <p>
     * Provides a list of Call Analytics categories, including all rules that make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCallAnalyticsCategories operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListCallAnalyticsCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsCategories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCallAnalyticsCategoriesRequest, ListCallAnalyticsCategoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCallAnalyticsJobs operation returned by the service.
     * @sample AmazonTranscribeAsync.ListCallAnalyticsJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCallAnalyticsJobs operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListCallAnalyticsJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCallAnalyticsJobsRequest, ListCallAnalyticsJobsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListLanguageModels operation returned by the service.
     * @sample AmazonTranscribeAsync.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLanguageModelsResult> listLanguageModelsAsync(ListLanguageModelsRequest listLanguageModelsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLanguageModels operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListLanguageModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLanguageModelsResult> listLanguageModelsAsync(ListLanguageModelsRequest listLanguageModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLanguageModelsRequest, ListLanguageModelsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMedicalTranscriptionJobs operation returned by the
     *         service.
     * @sample AmazonTranscribeAsync.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMedicalTranscriptionJobs operation returned by the
     *         service.
     * @sample AmazonTranscribeAsyncHandler.ListMedicalTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMedicalTranscriptionJobsRequest, ListMedicalTranscriptionJobsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMedicalVocabularies operation returned by the service.
     * @sample AmazonTranscribeAsync.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMedicalVocabularies operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListMedicalVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(ListMedicalVocabulariesRequest listMedicalVocabulariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMedicalVocabulariesRequest, ListMedicalVocabulariesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTranscribeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTranscriptionJobs operation returned by the service.
     * @sample AmazonTranscribeAsync.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(ListTranscriptionJobsRequest listTranscriptionJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTranscriptionJobs operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListTranscriptionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(ListTranscriptionJobsRequest listTranscriptionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTranscriptionJobsRequest, ListTranscriptionJobsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListVocabularies operation returned by the service.
     * @sample AmazonTranscribeAsync.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(ListVocabulariesRequest listVocabulariesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVocabularies operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(ListVocabulariesRequest listVocabulariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVocabulariesRequest, ListVocabulariesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListVocabularyFilters operation returned by the service.
     * @sample AmazonTranscribeAsync.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(ListVocabularyFiltersRequest listVocabularyFiltersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVocabularyFilters operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.ListVocabularyFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularyFilters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(ListVocabularyFiltersRequest listVocabularyFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListVocabularyFiltersRequest, ListVocabularyFiltersResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsync.StartCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(StartCallAnalyticsJobRequest startCallAnalyticsJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCallAnalyticsJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.StartCallAnalyticsJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(StartCallAnalyticsJobRequest startCallAnalyticsJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartCallAnalyticsJobRequest, StartCallAnalyticsJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartMedicalTranscriptionJob operation returned by the
     *         service.
     * @sample AmazonTranscribeAsync.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMedicalTranscriptionJob operation returned by the
     *         service.
     * @sample AmazonTranscribeAsyncHandler.StartMedicalTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMedicalTranscriptionJobRequest, StartMedicalTranscriptionJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsync.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(StartTranscriptionJobRequest startTranscriptionJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTranscriptionJob operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.StartTranscriptionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(StartTranscriptionJobRequest startTranscriptionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTranscriptionJobRequest, StartTranscriptionJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTranscribeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTranscribeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsync.UpdateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCallAnalyticsCategory operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.UpdateCallAnalyticsCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCallAnalyticsCategoryRequest, UpdateCallAnalyticsCategoryResult> asyncHandler);

    /**
     * <p>
     * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information
     * with your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return A Java Future containing the result of the UpdateMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest);

    /**
     * <p>
     * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information
     * with your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMedicalVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.UpdateMedicalVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMedicalVocabularyRequest, UpdateMedicalVocabularyResult> asyncHandler);

    /**
     * <p>
     * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with
     * your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return A Java Future containing the result of the UpdateVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsync.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(UpdateVocabularyRequest updateVocabularyRequest);

    /**
     * <p>
     * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with
     * your new values; you cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVocabulary operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.UpdateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(UpdateVocabularyRequest updateVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVocabularyRequest, UpdateVocabularyResult> asyncHandler);

    /**
     * <p>
     * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all
     * previous entries; you cannot append new terms onto an existing custom vocabulary filter.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return A Java Future containing the result of the UpdateVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsync.UpdateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(UpdateVocabularyFilterRequest updateVocabularyFilterRequest);

    /**
     * <p>
     * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all
     * previous entries; you cannot append new terms onto an existing custom vocabulary filter.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVocabularyFilter operation returned by the service.
     * @sample AmazonTranscribeAsyncHandler.UpdateVocabularyFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(UpdateVocabularyFilterRequest updateVocabularyFilterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVocabularyFilterRequest, UpdateVocabularyFilterResult> asyncHandler);

}
