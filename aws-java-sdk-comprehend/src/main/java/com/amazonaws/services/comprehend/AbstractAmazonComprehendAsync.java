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
    public java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(BatchDetectSyntaxRequest request) {

        return batchDetectSyntaxAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(BatchDetectSyntaxRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDetectSyntaxRequest, BatchDetectSyntaxResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(CreateDocumentClassifierRequest request) {

        return createDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(CreateDocumentClassifierRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentClassifierRequest, CreateDocumentClassifierResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(CreateEntityRecognizerRequest request) {

        return createEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(CreateEntityRecognizerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEntityRecognizerRequest, CreateEntityRecognizerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(DeleteDocumentClassifierRequest request) {

        return deleteDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(DeleteDocumentClassifierRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentClassifierRequest, DeleteDocumentClassifierResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(DeleteEntityRecognizerRequest request) {

        return deleteEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(DeleteEntityRecognizerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEntityRecognizerRequest, DeleteEntityRecognizerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            DescribeDocumentClassificationJobRequest request) {

        return describeDocumentClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            DescribeDocumentClassificationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentClassificationJobRequest, DescribeDocumentClassificationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(DescribeDocumentClassifierRequest request) {

        return describeDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(DescribeDocumentClassifierRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentClassifierRequest, DescribeDocumentClassifierResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest request) {

        return describeDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDominantLanguageDetectionJobRequest, DescribeDominantLanguageDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(DescribeEntitiesDetectionJobRequest request) {

        return describeEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(DescribeEntitiesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionJobRequest, DescribeEntitiesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(DescribeEntityRecognizerRequest request) {

        return describeEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(DescribeEntityRecognizerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEntityRecognizerRequest, DescribeEntityRecognizerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(DescribeKeyPhrasesDetectionJobRequest request) {

        return describeKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(DescribeKeyPhrasesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPhrasesDetectionJobRequest, DescribeKeyPhrasesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(DescribeSentimentDetectionJobRequest request) {

        return describeSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(DescribeSentimentDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSentimentDetectionJobRequest, DescribeSentimentDetectionJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest request) {

        return detectSyntaxAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectSyntaxRequest, DetectSyntaxResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(ListDocumentClassificationJobsRequest request) {

        return listDocumentClassificationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(ListDocumentClassificationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDocumentClassificationJobsRequest, ListDocumentClassificationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(ListDocumentClassifiersRequest request) {

        return listDocumentClassifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(ListDocumentClassifiersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDocumentClassifiersRequest, ListDocumentClassifiersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest request) {

        return listDominantLanguageDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDominantLanguageDetectionJobsRequest, ListDominantLanguageDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(ListEntitiesDetectionJobsRequest request) {

        return listEntitiesDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(ListEntitiesDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionJobsRequest, ListEntitiesDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntityRecognizersResult> listEntityRecognizersAsync(ListEntityRecognizersRequest request) {

        return listEntityRecognizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntityRecognizersResult> listEntityRecognizersAsync(ListEntityRecognizersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntityRecognizersRequest, ListEntityRecognizersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(ListKeyPhrasesDetectionJobsRequest request) {

        return listKeyPhrasesDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(ListKeyPhrasesDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeyPhrasesDetectionJobsRequest, ListKeyPhrasesDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(ListSentimentDetectionJobsRequest request) {

        return listSentimentDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(ListSentimentDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSentimentDetectionJobsRequest, ListSentimentDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(StartDocumentClassificationJobRequest request) {

        return startDocumentClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(StartDocumentClassificationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDocumentClassificationJobRequest, StartDocumentClassificationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest request) {

        return startDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDominantLanguageDetectionJobRequest, StartDominantLanguageDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(StartEntitiesDetectionJobRequest request) {

        return startEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(StartEntitiesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionJobRequest, StartEntitiesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(StartKeyPhrasesDetectionJobRequest request) {

        return startKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(StartKeyPhrasesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartKeyPhrasesDetectionJobRequest, StartKeyPhrasesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(StartSentimentDetectionJobRequest request) {

        return startSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(StartSentimentDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSentimentDetectionJobRequest, StartSentimentDetectionJobResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest request) {

        return stopDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDominantLanguageDetectionJobRequest, StopDominantLanguageDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(StopEntitiesDetectionJobRequest request) {

        return stopEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(StopEntitiesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionJobRequest, StopEntitiesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(StopKeyPhrasesDetectionJobRequest request) {

        return stopKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(StopKeyPhrasesDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopKeyPhrasesDetectionJobRequest, StopKeyPhrasesDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(StopSentimentDetectionJobRequest request) {

        return stopSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(StopSentimentDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopSentimentDetectionJobRequest, StopSentimentDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(StopTrainingDocumentClassifierRequest request) {

        return stopTrainingDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(StopTrainingDocumentClassifierRequest request,
            com.amazonaws.handlers.AsyncHandler<StopTrainingDocumentClassifierRequest, StopTrainingDocumentClassifierResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(StopTrainingEntityRecognizerRequest request) {

        return stopTrainingEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(StopTrainingEntityRecognizerRequest request,
            com.amazonaws.handlers.AsyncHandler<StopTrainingEntityRecognizerRequest, StopTrainingEntityRecognizerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
