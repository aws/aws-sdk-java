/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;

/**
 * Abstract implementation of {@code AWSDataExchangeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSDataExchangeAsync extends AbstractAWSDataExchange implements AWSDataExchangeAsync {

    protected AbstractAWSDataExchangeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest request) {

        return createDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSetRequest, CreateDataSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(CreateRevisionRequest request) {

        return createRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(CreateRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRevisionRequest, CreateRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request) {

        return deleteAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest request) {

        return deleteDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSetRequest, DeleteDataSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(DeleteRevisionRequest request) {

        return deleteRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(DeleteRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRevisionRequest, DeleteRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest request) {

        return getAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssetRequest, GetAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(GetDataSetRequest request) {

        return getDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(GetDataSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataSetRequest, GetDataSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request) {

        return getRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(ListDataSetRevisionsRequest request) {

        return listDataSetRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(ListDataSetRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataSetRevisionsRequest, ListDataSetRevisionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest request) {

        return listDataSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(ListRevisionAssetsRequest request) {

        return listRevisionAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(ListRevisionAssetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRevisionAssetsRequest, ListRevisionAssetsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest request) {

        return startJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartJobRequest, StartJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest request) {

        return updateAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssetRequest, UpdateAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest request) {

        return updateDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSetRequest, UpdateDataSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(UpdateRevisionRequest request) {

        return updateRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(UpdateRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRevisionRequest, UpdateRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
