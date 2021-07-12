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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSkendra}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSkendra implements AWSkendra {

    protected AbstractAWSkendra() {
    }

    @Override
    public BatchDeleteDocumentResult batchDeleteDocument(BatchDeleteDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetDocumentStatusResult batchGetDocumentStatus(BatchGetDocumentStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchPutDocumentResult batchPutDocument(BatchPutDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClearQuerySuggestionsResult clearQuerySuggestions(ClearQuerySuggestionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFaqResult createFaq(CreateFaqRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateIndexResult createIndex(CreateIndexRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateQuerySuggestionsBlockListResult createQuerySuggestionsBlockList(CreateQuerySuggestionsBlockListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateThesaurusResult createThesaurus(CreateThesaurusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFaqResult deleteFaq(DeleteFaqRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIndexResult deleteIndex(DeleteIndexRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePrincipalMappingResult deletePrincipalMapping(DeletePrincipalMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteQuerySuggestionsBlockListResult deleteQuerySuggestionsBlockList(DeleteQuerySuggestionsBlockListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteThesaurusResult deleteThesaurus(DeleteThesaurusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFaqResult describeFaq(DescribeFaqRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIndexResult describeIndex(DescribeIndexRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePrincipalMappingResult describePrincipalMapping(DescribePrincipalMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeQuerySuggestionsBlockListResult describeQuerySuggestionsBlockList(DescribeQuerySuggestionsBlockListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeQuerySuggestionsConfigResult describeQuerySuggestionsConfig(DescribeQuerySuggestionsConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeThesaurusResult describeThesaurus(DescribeThesaurusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQuerySuggestionsResult getQuerySuggestions(GetQuerySuggestionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDataSourceSyncJobsResult listDataSourceSyncJobs(ListDataSourceSyncJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFaqsResult listFaqs(ListFaqsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupsOlderThanOrderingIdResult listGroupsOlderThanOrderingId(ListGroupsOlderThanOrderingIdRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIndicesResult listIndices(ListIndicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListQuerySuggestionsBlockListsResult listQuerySuggestionsBlockLists(ListQuerySuggestionsBlockListsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListThesauriResult listThesauri(ListThesauriRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutPrincipalMappingResult putPrincipalMapping(PutPrincipalMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public QueryResult query(QueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartDataSourceSyncJobResult startDataSourceSyncJob(StartDataSourceSyncJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopDataSourceSyncJobResult stopDataSourceSyncJob(StopDataSourceSyncJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubmitFeedbackResult submitFeedback(SubmitFeedbackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateIndexResult updateIndex(UpdateIndexRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateQuerySuggestionsBlockListResult updateQuerySuggestionsBlockList(UpdateQuerySuggestionsBlockListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateQuerySuggestionsConfigResult updateQuerySuggestionsConfig(UpdateQuerySuggestionsConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateThesaurusResult updateThesaurus(UpdateThesaurusRequest request) {
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
