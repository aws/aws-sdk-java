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
 * Abstract implementation of {@code AmazonComprehendAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonComprehendAsync extends AbstractAmazonComprehend implements AmazonComprehendAsync {

    protected AbstractAmazonComprehendAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(BatchDetectDominantLanguageRequest request) {

        return batchDetectDominantLanguageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(BatchDetectDominantLanguageRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest request) {

        return batchDetectEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest request) {

        return batchDetectKeyPhrasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest request) {

        return batchDetectSentimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(DescribeTopicsDetectionJobRequest request) {

        return describeTopicsDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(DescribeTopicsDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest request) {

        return detectDominantLanguageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request) {

        return detectEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest request) {

        return detectKeyPhrasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest request) {

        return detectSentimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest request) {

        return listTopicsDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest request) {

        return startTopicsDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
