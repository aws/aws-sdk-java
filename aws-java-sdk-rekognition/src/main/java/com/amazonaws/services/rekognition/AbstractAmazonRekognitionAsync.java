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
package com.amazonaws.services.rekognition;

import com.amazonaws.services.rekognition.model.*;

/**
 * Abstract implementation of {@code AmazonRekognitionAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
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

}
