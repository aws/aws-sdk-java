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
 * Operations and objects for transcribing speech to text.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranscribeAsync extends AmazonTranscribe {

    /**
     * <p>
     * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time
     * it takes to create your model depends on the size of your training data.
     * </p>
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
     * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time
     * it takes to create your model depends on the size of your training data.
     * </p>
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
     * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio
     * file.
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
     * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio
     * file.
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
     * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
     * audio file.
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
     * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
     * audio file.
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
     * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a
     * transcription job.
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
     * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a
     * transcription job.
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
     * Deletes a custom language model using its name.
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
     * Deletes a custom language model using its name.
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
     * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
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
     * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
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
     * Deletes a vocabulary from Amazon Transcribe Medical.
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
     * Deletes a vocabulary from Amazon Transcribe Medical.
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
     * Deletes a previously submitted transcription job along with any other generated results such as the
     * transcription, models, and so on.
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
     * Deletes a previously submitted transcription job along with any other generated results such as the
     * transcription, models, and so on.
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
     * Deletes a vocabulary from Amazon Transcribe.
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
     * Deletes a vocabulary from Amazon Transcribe.
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
     * Removes a vocabulary filter.
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
     * Removes a vocabulary filter.
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
     * Gets information about a single custom language model. Use this information to see details about the language
     * model in your AWS account. You can also see whether the base language model used to create your custom language
     * model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language
     * model using the updated base model. If the language model wasn't created, you can use this operation to
     * understand why Amazon Transcribe couldn't create it.
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
     * Gets information about a single custom language model. Use this information to see details about the language
     * model in your AWS account. You can also see whether the base language model used to create your custom language
     * model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language
     * model using the updated base model. If the language model wasn't created, you can use this operation to
     * understand why Amazon Transcribe couldn't create it.
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
     * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check
     * the <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished. You
     * find the results of the completed job in the <code>TranscriptFileUri</code> field.
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
     * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check
     * the <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished. You
     * find the results of the completed job in the <code>TranscriptFileUri</code> field.
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
     * Retrieves information about a medical vocabulary.
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
     * Retrieves information about a medical vocabulary.
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
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in <code>RedactedTranscriptFileUri</code>.
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
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in <code>RedactedTranscriptFileUri</code>.
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
     * Gets information about a vocabulary.
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
     * Gets information about a vocabulary.
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
     * Returns information about a vocabulary filter.
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
     * Returns information about a vocabulary filter.
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
     * Provides more information about the custom language models you've created. You can use the information in this
     * list to find a specific custom language model. You can then use the operation to get more information about it.
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
     * Provides more information about the custom language models you've created. You can use the information in this
     * list to find a specific custom language model. You can then use the operation to get more information about it.
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
     * Lists medical transcription jobs with a specified status or substring that matches their names.
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
     * Lists medical transcription jobs with a specified status or substring that matches their names.
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
     * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the
     * request parameters, returns the entire list of vocabularies.
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
     * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the
     * request parameters, returns the entire list of vocabularies.
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
     * Lists transcription jobs with the specified status.
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
     * Lists transcription jobs with the specified status.
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
     * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
     * entire list of vocabularies.
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
     * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
     * entire list of vocabularies.
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
     * Gets information about vocabulary filters.
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
     * Gets information about vocabulary filters.
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
     * Starts a batch job to transcribe medical speech to text.
     * </p>
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
     * Starts a batch job to transcribe medical speech to text.
     * </p>
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
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
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
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
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
     * Updates a vocabulary with new values that you provide in a different text file from the one you used to create
     * the vocabulary. The <code>UpdateMedicalVocabulary</code> operation overwrites all of the existing information
     * with the values that you provide in the request.
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
     * Updates a vocabulary with new values that you provide in a different text file from the one you used to create
     * the vocabulary. The <code>UpdateMedicalVocabulary</code> operation overwrites all of the existing information
     * with the values that you provide in the request.
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
     * Updates an existing vocabulary with new values. The <code>UpdateVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
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
     * Updates an existing vocabulary with new values. The <code>UpdateVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
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
     * Updates a vocabulary filter with a new list of filtered words.
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
     * Updates a vocabulary filter with a new list of filtered words.
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
