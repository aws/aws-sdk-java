/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     */
    java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest getLexiconRequest,
            com.amazonaws.handlers.AsyncHandler<GetLexiconRequest, GetLexiconResult> asyncHandler);

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return A Java Future containing the result of the ListLexicons operation returned by the service.
     * @sample AmazonPollyAsync.ListLexicons
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
     */
    java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest listLexiconsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLexiconsRequest, ListLexiconsResult> asyncHandler);

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
     */
    java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest putLexiconRequest,
            com.amazonaws.handlers.AsyncHandler<PutLexiconRequest, PutLexiconResult> asyncHandler);

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
     */
    java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest synthesizeSpeechRequest,
            com.amazonaws.handlers.AsyncHandler<SynthesizeSpeechRequest, SynthesizeSpeechResult> asyncHandler);

}
