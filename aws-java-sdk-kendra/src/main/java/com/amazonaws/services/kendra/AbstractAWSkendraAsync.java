/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;

/**
 * Abstract implementation of {@code AWSkendraAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSkendraAsync extends AbstractAWSkendra implements AWSkendraAsync {

    protected AbstractAWSkendraAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest request) {

        return batchDeleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDocumentRequest, BatchDeleteDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(BatchGetDocumentStatusRequest request) {

        return batchGetDocumentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(BatchGetDocumentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetDocumentStatusRequest, BatchGetDocumentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest request) {

        return batchPutDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchPutDocumentRequest, BatchPutDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(ClearQuerySuggestionsRequest request) {

        return clearQuerySuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(ClearQuerySuggestionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ClearQuerySuggestionsRequest, ClearQuerySuggestionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request) {

        return createDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFaqResult> createFaqAsync(CreateFaqRequest request) {

        return createFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFaqResult> createFaqAsync(CreateFaqRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFaqRequest, CreateFaqResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request) {

        return createIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            CreateQuerySuggestionsBlockListRequest request) {

        return createQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            CreateQuerySuggestionsBlockListRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateQuerySuggestionsBlockListRequest, CreateQuerySuggestionsBlockListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(CreateThesaurusRequest request) {

        return createThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(CreateThesaurusRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateThesaurusRequest, CreateThesaurusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(DeleteFaqRequest request) {

        return deleteFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(DeleteFaqRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFaqRequest, DeleteFaqResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest request) {

        return deleteIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(DeletePrincipalMappingRequest request) {

        return deletePrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(DeletePrincipalMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePrincipalMappingRequest, DeletePrincipalMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            DeleteQuerySuggestionsBlockListRequest request) {

        return deleteQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            DeleteQuerySuggestionsBlockListRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteQuerySuggestionsBlockListRequest, DeleteQuerySuggestionsBlockListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(DeleteThesaurusRequest request) {

        return deleteThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(DeleteThesaurusRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteThesaurusRequest, DeleteThesaurusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest request) {

        return describeDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourceRequest, DescribeDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(DescribeFaqRequest request) {

        return describeFaqAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(DescribeFaqRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFaqRequest, DescribeFaqResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest request) {

        return describeIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIndexRequest, DescribeIndexResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(DescribePrincipalMappingRequest request) {

        return describePrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(DescribePrincipalMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePrincipalMappingRequest, DescribePrincipalMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            DescribeQuerySuggestionsBlockListRequest request) {

        return describeQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            DescribeQuerySuggestionsBlockListRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsBlockListRequest, DescribeQuerySuggestionsBlockListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(DescribeQuerySuggestionsConfigRequest request) {

        return describeQuerySuggestionsConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(DescribeQuerySuggestionsConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsConfigRequest, DescribeQuerySuggestionsConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(DescribeThesaurusRequest request) {

        return describeThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(DescribeThesaurusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeThesaurusRequest, DescribeThesaurusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(GetQuerySuggestionsRequest request) {

        return getQuerySuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(GetQuerySuggestionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQuerySuggestionsRequest, GetQuerySuggestionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest request) {

        return listDataSourceSyncJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataSourceSyncJobsRequest, ListDataSourceSyncJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request) {

        return listDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(ListFaqsRequest request) {

        return listFaqsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(ListFaqsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFaqsRequest, ListFaqsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(ListGroupsOlderThanOrderingIdRequest request) {

        return listGroupsOlderThanOrderingIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(ListGroupsOlderThanOrderingIdRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsOlderThanOrderingIdRequest, ListGroupsOlderThanOrderingIdResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest request) {

        return listIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(ListQuerySuggestionsBlockListsRequest request) {

        return listQuerySuggestionsBlockListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(ListQuerySuggestionsBlockListsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQuerySuggestionsBlockListsRequest, ListQuerySuggestionsBlockListsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(ListThesauriRequest request) {

        return listThesauriAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(ListThesauriRequest request,
            com.amazonaws.handlers.AsyncHandler<ListThesauriRequest, ListThesauriResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(PutPrincipalMappingRequest request) {

        return putPrincipalMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(PutPrincipalMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPrincipalMappingRequest, PutPrincipalMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest request) {

        return startDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDataSourceSyncJobRequest, StartDataSourceSyncJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest request) {

        return stopDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDataSourceSyncJobRequest, StopDataSourceSyncJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest request) {

        return submitFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest request,
            com.amazonaws.handlers.AsyncHandler<SubmitFeedbackRequest, SubmitFeedbackResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest request) {

        return updateIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIndexRequest, UpdateIndexResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            UpdateQuerySuggestionsBlockListRequest request) {

        return updateQuerySuggestionsBlockListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            UpdateQuerySuggestionsBlockListRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsBlockListRequest, UpdateQuerySuggestionsBlockListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(UpdateQuerySuggestionsConfigRequest request) {

        return updateQuerySuggestionsConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(UpdateQuerySuggestionsConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsConfigRequest, UpdateQuerySuggestionsConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(UpdateThesaurusRequest request) {

        return updateThesaurusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(UpdateThesaurusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateThesaurusRequest, UpdateThesaurusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
