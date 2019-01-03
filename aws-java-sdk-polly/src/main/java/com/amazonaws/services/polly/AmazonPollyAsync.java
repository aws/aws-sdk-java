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
package com.amazonaws.services.polly;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;

/**
 * Interface for accessing Amazon Polly asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.polly.AbstractAmazonPollyAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
 * Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
 * for your application domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPollyAsync extends AmazonPolly {

    /**
     * <p>
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
     * available for speech synthesis, nor is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @return A Java Future containing the result of the DeleteLexicon operation returned by the service.
     * @sample AmazonPollyAsync.DeleteLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DeleteLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(DeleteLexiconRequest deleteLexiconRequest);

    /**
     * <p>
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
     * available for speech synthesis, nor is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLexicon operation returned by the service.
     * @sample AmazonPollyAsyncHandler.DeleteLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DeleteLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(DeleteLexiconRequest deleteLexiconRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLexiconRequest, DeleteLexiconResult> asyncHandler);

    /**
     * <p>
     * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a
     * specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice
     * name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide the voice ID for the voice you want from
     * the list of voices returned by <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a specific language, but giving a user the
     * option to choose the voice. Using the <code>DescribeVoices</code> operation you can provide the user with a list
     * of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available voices. For example, if you specify
     * <code>en-US</code>, the operation returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @return A Java Future containing the result of the DescribeVoices operation returned by the service.
     * @sample AmazonPollyAsync.DescribeVoices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(DescribeVoicesRequest describeVoicesRequest);

    /**
     * <p>
     * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a
     * specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice
     * name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide the voice ID for the voice you want from
     * the list of voices returned by <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a specific language, but giving a user the
     * option to choose the voice. Using the <code>DescribeVoices</code> operation you can provide the user with a list
     * of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available voices. For example, if you specify
     * <code>en-US</code>, the operation returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVoices operation returned by the service.
     * @sample AmazonPollyAsyncHandler.DescribeVoices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(DescribeVoicesRequest describeVoicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVoicesRequest, DescribeVoicesResult> asyncHandler);

    /**
     * <p>
     * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @return A Java Future containing the result of the GetLexicon operation returned by the service.
     * @sample AmazonPollyAsync.GetLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest getLexiconRequest);

    /**
     * <p>
     * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLexicon operation returned by the service.
     * @sample AmazonPollyAsyncHandler.GetLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest getLexiconRequest,
            com.amazonaws.handlers.AsyncHandler<GetLexiconRequest, GetLexiconResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
     * given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
     * of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @return A Java Future containing the result of the GetSpeechSynthesisTask operation returned by the service.
     * @sample AmazonPollyAsync.GetSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest);

    /**
     * <p>
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
     * given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
     * of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSpeechSynthesisTask operation returned by the service.
     * @sample AmazonPollyAsyncHandler.GetSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetSpeechSynthesisTaskRequest, GetSpeechSynthesisTaskResult> asyncHandler);

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return A Java Future containing the result of the ListLexicons operation returned by the service.
     * @sample AmazonPollyAsync.ListLexicons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListLexicons" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest listLexiconsRequest);

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLexicons operation returned by the service.
     * @sample AmazonPollyAsyncHandler.ListLexicons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListLexicons" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest listLexiconsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLexiconsRequest, ListLexiconsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
     * by their status, for example, allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @return A Java Future containing the result of the ListSpeechSynthesisTasks operation returned by the service.
     * @sample AmazonPollyAsync.ListSpeechSynthesisTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest);

    /**
     * <p>
     * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
     * by their status, for example, allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSpeechSynthesisTasks operation returned by the service.
     * @sample AmazonPollyAsyncHandler.ListSpeechSynthesisTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListSpeechSynthesisTasksRequest, ListSpeechSynthesisTasksResult> asyncHandler);

    /**
     * <p>
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
     * is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
     * time before the lexicon is available to the SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @return A Java Future containing the result of the PutLexicon operation returned by the service.
     * @sample AmazonPollyAsync.PutLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/PutLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest putLexiconRequest);

    /**
     * <p>
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
     * is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
     * time before the lexicon is available to the SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLexicon operation returned by the service.
     * @sample AmazonPollyAsyncHandler.PutLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/PutLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest putLexiconRequest,
            com.amazonaws.handlers.AsyncHandler<PutLexiconRequest, PutLexiconResult> asyncHandler);

    /**
     * <p>
     * Allows the creation of an asynchronous synthesis task, by starting a new <code>SpeechSynthesisTask</code>. This
     * operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
     * for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
     * SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
     * will include an identifier of this task as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @return A Java Future containing the result of the StartSpeechSynthesisTask operation returned by the service.
     * @sample AmazonPollyAsync.StartSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest);

    /**
     * <p>
     * Allows the creation of an asynchronous synthesis task, by starting a new <code>SpeechSynthesisTask</code>. This
     * operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
     * for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
     * SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
     * will include an identifier of this task as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSpeechSynthesisTask operation returned by the service.
     * @sample AmazonPollyAsyncHandler.StartSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartSpeechSynthesisTaskRequest, StartSpeechSynthesisTaskResult> asyncHandler);

    /**
     * <p>
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
     * Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
     * English voices) unless phoneme mapping is used. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return A Java Future containing the result of the SynthesizeSpeech operation returned by the service.
     * @sample AmazonPollyAsync.SynthesizeSpeech
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest synthesizeSpeechRequest);

    /**
     * <p>
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
     * Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
     * English voices) unless phoneme mapping is used. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SynthesizeSpeech operation returned by the service.
     * @sample AmazonPollyAsyncHandler.SynthesizeSpeech
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest synthesizeSpeechRequest,
            com.amazonaws.handlers.AsyncHandler<SynthesizeSpeechRequest, SynthesizeSpeechResult> asyncHandler);

}
