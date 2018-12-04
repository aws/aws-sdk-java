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
package com.amazonaws.services.comprehend;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehend.AbstractAmazonComprehendAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonComprehendAsync extends AmazonComprehend {

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest);

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler);

    /**
     * <p>
     * Inspects the text of a batch of documents and returns information about them. For more information about
     * entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return A Java Future containing the result of the BatchDetectEntities operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest batchDetectEntitiesRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents and returns information about them. For more information about
     * entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectEntities operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest batchDetectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return A Java Future containing the result of the BatchDetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsync.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest batchDetectSentimentRequest);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest batchDetectSentimentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return A Java Future containing the result of the DetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsync.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest detectDominantLanguageRequest);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectDominantLanguage operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest detectDominantLanguageRequest,
            com.amazonaws.handlers.AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler);

    /**
     * <p>
     * Inspects text for entities, and returns information about them. For more information, about entities, see
     * <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AmazonComprehendAsync.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Inspects text for entities, and returns information about them. For more information, about entities, see
     * <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return A Java Future containing the result of the DetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsync.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest detectKeyPhrasesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectKeyPhrases operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest detectKeyPhrasesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return A Java Future containing the result of the DetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsync.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest detectSentimentRequest);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectSentiment operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest detectSentimentRequest,
            com.amazonaws.handlers.AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsync.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsync.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service.
     * @sample AmazonComprehendAsyncHandler.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler);

}
