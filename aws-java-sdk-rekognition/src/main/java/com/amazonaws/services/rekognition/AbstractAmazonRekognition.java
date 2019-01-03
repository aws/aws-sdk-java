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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonRekognition}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRekognition implements AmazonRekognition {

    protected AbstractAmazonRekognition() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CompareFacesResult compareFaces(CompareFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCollectionResult createCollection(CreateCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStreamProcessorResult createStreamProcessor(CreateStreamProcessorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCollectionResult deleteCollection(DeleteCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFacesResult deleteFaces(DeleteFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStreamProcessorResult deleteStreamProcessor(DeleteStreamProcessorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCollectionResult describeCollection(DescribeCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectFacesResult detectFaces(DetectFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectLabelsResult detectLabels(DetectLabelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectModerationLabelsResult detectModerationLabels(DetectModerationLabelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectTextResult detectText(DetectTextRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContentModerationResult getContentModeration(GetContentModerationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetFaceSearchResult getFaceSearch(GetFaceSearchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLabelDetectionResult getLabelDetection(GetLabelDetectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public IndexFacesResult indexFaces(IndexFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCollectionsResult listCollections(ListCollectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFacesResult listFaces(ListFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RecognizeCelebritiesResult recognizeCelebrities(RecognizeCelebritiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SearchFacesResult searchFaces(SearchFacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SearchFacesByImageResult searchFacesByImage(SearchFacesByImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartCelebrityRecognitionResult startCelebrityRecognition(StartCelebrityRecognitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartContentModerationResult startContentModeration(StartContentModerationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFaceDetectionResult startFaceDetection(StartFaceDetectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFaceSearchResult startFaceSearch(StartFaceSearchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartLabelDetectionResult startLabelDetection(StartLabelDetectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartStreamProcessorResult startStreamProcessor(StartStreamProcessorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopStreamProcessorResult stopStreamProcessor(StopStreamProcessorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
