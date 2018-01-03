/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehend.AbstractAmazonComprehend} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonComprehend {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "comprehend";

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return Result of the BatchDetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectDominantLanguageResult batchDetectDominantLanguage(BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents and returns information about them. For more information about
     * entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return Result of the BatchDetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDetectEntitiesResult batchDetectEntities(BatchDetectEntitiesRequest batchDetectEntitiesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return Result of the BatchDetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectKeyPhrasesResult batchDetectKeyPhrases(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return Result of the BatchDetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectSentimentResult batchDetectSentiment(BatchDetectSentimentRequest batchDetectSentimentRequest);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return Result of the DescribeTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return Result of the DetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    DetectDominantLanguageResult detectDominantLanguage(DetectDominantLanguageRequest detectDominantLanguageRequest);

    /**
     * <p>
     * Inspects text for entities, and returns information about them. For more information, about entities, see
     * <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return Result of the DetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    DetectKeyPhrasesResult detectKeyPhrases(DetectKeyPhrasesRequest detectKeyPhrasesRequest);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return Result of the DetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all APIs except
     *         <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
     *         <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of
     *         languages, see <a>how-languages</a>
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    DetectSentimentResult detectSentiment(DetectSentimentRequest detectSentimentRequest);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return Result of the ListTopicsDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListTopicDetectionJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTopicsDetectionJobsResult listTopicsDetectionJobs(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return Result of the StartTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTopicsDetectionJobResult startTopicsDetectionJob(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest);

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
