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
     * Returns information about a transcription job. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is <code>COMPLETED</code>, the job is finished and you
     * can find the results at the location specified in the <code>TranscriptionFileUri</code> field.
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
     * can find the results at the location specified in the <code>TranscriptionFileUri</code> field.
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

}
