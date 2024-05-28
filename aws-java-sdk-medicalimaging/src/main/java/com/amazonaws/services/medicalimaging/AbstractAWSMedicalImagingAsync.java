/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;

/**
 * Abstract implementation of {@code AWSMedicalImagingAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMedicalImagingAsync extends AbstractAWSMedicalImaging implements AWSMedicalImagingAsync {

    protected AbstractAWSMedicalImagingAsync() {
    }

    @Override
    public java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(CopyImageSetRequest request) {

        return copyImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(CopyImageSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyImageSetRequest, CopyImageSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest request) {

        return createDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatastoreRequest, CreateDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest request) {

        return deleteDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatastoreRequest, DeleteDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(DeleteImageSetRequest request) {

        return deleteImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(DeleteImageSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteImageSetRequest, DeleteImageSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(GetDICOMImportJobRequest request) {

        return getDICOMImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(GetDICOMImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDICOMImportJobRequest, GetDICOMImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(GetDatastoreRequest request) {

        return getDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(GetDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatastoreRequest, GetDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(GetImageFrameRequest request) {

        return getImageFrameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(GetImageFrameRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageFrameRequest, GetImageFrameResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(GetImageSetRequest request) {

        return getImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(GetImageSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageSetRequest, GetImageSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(GetImageSetMetadataRequest request) {

        return getImageSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(GetImageSetMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageSetMetadataRequest, GetImageSetMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(ListDICOMImportJobsRequest request) {

        return listDICOMImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(ListDICOMImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDICOMImportJobsRequest, ListDICOMImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest request) {

        return listDatastoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatastoresRequest, ListDatastoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(ListImageSetVersionsRequest request) {

        return listImageSetVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(ListImageSetVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImageSetVersionsRequest, ListImageSetVersionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(SearchImageSetsRequest request) {

        return searchImageSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(SearchImageSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchImageSetsRequest, SearchImageSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(StartDICOMImportJobRequest request) {

        return startDICOMImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(StartDICOMImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDICOMImportJobRequest, StartDICOMImportJobResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(UpdateImageSetMetadataRequest request) {

        return updateImageSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(UpdateImageSetMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateImageSetMetadataRequest, UpdateImageSetMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
