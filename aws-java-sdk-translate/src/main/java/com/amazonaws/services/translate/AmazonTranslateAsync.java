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
package com.amazonaws.services.translate;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.translate.AbstractAmazonTranslateAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides translation between one source language and another of the same set of languages.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranslateAsync extends AmazonTranslate {

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return A Java Future containing the result of the DeleteTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest);

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTerminologyRequest, DeleteTerminologyResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with an asycnhronous batch translation job including name, ID, status, source and
     * target languages, input/output S3 buckets, and so on.
     * </p>
     * 
     * @param describeTextTranslationJobRequest
     * @return A Java Future containing the result of the DescribeTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsync.DescribeTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DescribeTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(
            DescribeTextTranslationJobRequest describeTextTranslationJobRequest);

    /**
     * <p>
     * Gets the properties associated with an asycnhronous batch translation job including name, ID, status, source and
     * target languages, input/output S3 buckets, and so on.
     * </p>
     * 
     * @param describeTextTranslationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.DescribeTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DescribeTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(
            DescribeTextTranslationJobRequest describeTextTranslationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTextTranslationJobRequest, DescribeTextTranslationJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return A Java Future containing the result of the GetTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest);

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return A Java Future containing the result of the ImportTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest importTerminologyRequest);

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest importTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler);

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return A Java Future containing the result of the ListTerminologies operation returned by the service.
     * @sample AmazonTranslateAsync.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest listTerminologiesRequest);

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTerminologies operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest listTerminologiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the batch translation jobs that you have submitted.
     * </p>
     * 
     * @param listTextTranslationJobsRequest
     * @return A Java Future containing the result of the ListTextTranslationJobs operation returned by the service.
     * @sample AmazonTranslateAsync.ListTextTranslationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTextTranslationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(ListTextTranslationJobsRequest listTextTranslationJobsRequest);

    /**
     * <p>
     * Gets a list of the batch translation jobs that you have submitted.
     * </p>
     * 
     * @param listTextTranslationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTextTranslationJobs operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.ListTextTranslationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTextTranslationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(ListTextTranslationJobsRequest listTextTranslationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTextTranslationJobsRequest, ListTextTranslationJobsResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous batch translation job. Batch translation jobs can be used to translate large volumes of
     * text across multiple documents at once. For more information, see <a>async</a>.
     * </p>
     * <p>
     * Batch translation jobs can be described with the <a>DescribeTextTranslationJob</a> operation, listed with the
     * <a>ListTextTranslationJobs</a> operation, and stopped with the <a>StopTextTranslationJob</a> operation.
     * </p>
     * <note>
     * <p>
     * Amazon Translate does not support batch translation of multiple source languages at once.
     * </p>
     * </note>
     * 
     * @param startTextTranslationJobRequest
     * @return A Java Future containing the result of the StartTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsync.StartTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StartTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(StartTextTranslationJobRequest startTextTranslationJobRequest);

    /**
     * <p>
     * Starts an asynchronous batch translation job. Batch translation jobs can be used to translate large volumes of
     * text across multiple documents at once. For more information, see <a>async</a>.
     * </p>
     * <p>
     * Batch translation jobs can be described with the <a>DescribeTextTranslationJob</a> operation, listed with the
     * <a>ListTextTranslationJobs</a> operation, and stopped with the <a>StopTextTranslationJob</a> operation.
     * </p>
     * <note>
     * <p>
     * Amazon Translate does not support batch translation of multiple source languages at once.
     * </p>
     * </note>
     * 
     * @param startTextTranslationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.StartTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StartTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(StartTextTranslationJobRequest startTextTranslationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTextTranslationJobRequest, StartTextTranslationJobResult> asyncHandler);

    /**
     * <p>
     * Stops an asynchronous batch translation job that is in progress.
     * </p>
     * <p>
     * If the job's state is <code>IN_PROGRESS</code>, the job will be marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state. Otherwise, the job is put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * Asynchronous batch translation jobs are started with the <a>StartTextTranslationJob</a> operation. You can use
     * the <a>DescribeTextTranslationJob</a> or <a>ListTextTranslationJobs</a> operations to get a batch translation
     * job's <code>JobId</code>.
     * </p>
     * 
     * @param stopTextTranslationJobRequest
     * @return A Java Future containing the result of the StopTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsync.StopTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StopTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(StopTextTranslationJobRequest stopTextTranslationJobRequest);

    /**
     * <p>
     * Stops an asynchronous batch translation job that is in progress.
     * </p>
     * <p>
     * If the job's state is <code>IN_PROGRESS</code>, the job will be marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state. Otherwise, the job is put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * Asynchronous batch translation jobs are started with the <a>StartTextTranslationJob</a> operation. You can use
     * the <a>DescribeTextTranslationJob</a> or <a>ListTextTranslationJobs</a> operations to get a batch translation
     * job's <code>JobId</code>.
     * </p>
     * 
     * @param stopTextTranslationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTextTranslationJob operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.StopTextTranslationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StopTextTranslationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(StopTextTranslationJobRequest stopTextTranslationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopTextTranslationJobRequest, StopTextTranslationJobResult> asyncHandler);

    /**
     * <p>
     * Translates input text from the source language to the target language. For a list of available languages and
     * language codes, see <a>what-is-languages</a>.
     * </p>
     * 
     * @param translateTextRequest
     * @return A Java Future containing the result of the TranslateText operation returned by the service.
     * @sample AmazonTranslateAsync.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest);

    /**
     * <p>
     * Translates input text from the source language to the target language. For a list of available languages and
     * language codes, see <a>what-is-languages</a>.
     * </p>
     * 
     * @param translateTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TranslateText operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest,
            com.amazonaws.handlers.AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler);

}
