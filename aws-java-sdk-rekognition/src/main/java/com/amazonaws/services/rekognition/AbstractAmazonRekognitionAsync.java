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
package com.amazonaws.services.rekognition;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;

/**
 * Abstract implementation of {@code AmazonRekognitionAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRekognitionAsync extends AbstractAmazonRekognition implements AmazonRekognitionAsync {

    protected AbstractAmazonRekognitionAsync() {
    }

    @Override
    public java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest request) {

        return compareFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<CompareFacesRequest, CompareFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest request) {

        return createCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(CreateStreamProcessorRequest request) {

        return createStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(CreateStreamProcessorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamProcessorRequest, CreateStreamProcessorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest request) {

        return deleteCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest request) {

        return deleteFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFacesRequest, DeleteFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(DeleteStreamProcessorRequest request) {

        return deleteStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(DeleteStreamProcessorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamProcessorRequest, DeleteStreamProcessorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(DescribeCollectionRequest request) {

        return describeCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(DescribeCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCollectionRequest, DescribeCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(DescribeStreamProcessorRequest request) {

        return describeStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(DescribeStreamProcessorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamProcessorRequest, DescribeStreamProcessorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest request) {

        return detectFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectFacesRequest, DetectFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest request) {

        return detectLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectLabelsRequest, DetectLabelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest request) {

        return detectModerationLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectModerationLabelsRequest, DetectModerationLabelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest request) {

        return detectTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectTextRequest, DetectTextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest request) {

        return getCelebrityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCelebrityInfoRequest, GetCelebrityInfoResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(GetCelebrityRecognitionRequest request) {

        return getCelebrityRecognitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(GetCelebrityRecognitionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCelebrityRecognitionRequest, GetCelebrityRecognitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(GetContentModerationRequest request) {

        return getContentModerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(GetContentModerationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContentModerationRequest, GetContentModerationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(GetFaceDetectionRequest request) {

        return getFaceDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(GetFaceDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFaceDetectionRequest, GetFaceDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(GetFaceSearchRequest request) {

        return getFaceSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(GetFaceSearchRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFaceSearchRequest, GetFaceSearchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(GetLabelDetectionRequest request) {

        return getLabelDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(GetLabelDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLabelDetectionRequest, GetLabelDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(GetPersonTrackingRequest request) {

        return getPersonTrackingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(GetPersonTrackingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPersonTrackingRequest, GetPersonTrackingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest request) {

        return indexFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<IndexFacesRequest, IndexFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest request) {

        return listCollectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest request) {

        return listFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFacesRequest, ListFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(ListStreamProcessorsRequest request) {

        return listStreamProcessorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(ListStreamProcessorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamProcessorsRequest, ListStreamProcessorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest request) {

        return recognizeCelebritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest request,
            com.amazonaws.handlers.AsyncHandler<RecognizeCelebritiesRequest, RecognizeCelebritiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest request) {

        return searchFacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchFacesRequest, SearchFacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest request) {

        return searchFacesByImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchFacesByImageRequest, SearchFacesByImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(StartCelebrityRecognitionRequest request) {

        return startCelebrityRecognitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(StartCelebrityRecognitionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCelebrityRecognitionRequest, StartCelebrityRecognitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(StartContentModerationRequest request) {

        return startContentModerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(StartContentModerationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartContentModerationRequest, StartContentModerationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(StartFaceDetectionRequest request) {

        return startFaceDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(StartFaceDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFaceDetectionRequest, StartFaceDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(StartFaceSearchRequest request) {

        return startFaceSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(StartFaceSearchRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFaceSearchRequest, StartFaceSearchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(StartLabelDetectionRequest request) {

        return startLabelDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(StartLabelDetectionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartLabelDetectionRequest, StartLabelDetectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(StartPersonTrackingRequest request) {

        return startPersonTrackingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(StartPersonTrackingRequest request,
            com.amazonaws.handlers.AsyncHandler<StartPersonTrackingRequest, StartPersonTrackingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(StartStreamProcessorRequest request) {

        return startStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(StartStreamProcessorRequest request,
            com.amazonaws.handlers.AsyncHandler<StartStreamProcessorRequest, StartStreamProcessorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(StopStreamProcessorRequest request) {

        return stopStreamProcessorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(StopStreamProcessorRequest request,
            com.amazonaws.handlers.AsyncHandler<StopStreamProcessorRequest, StopStreamProcessorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
