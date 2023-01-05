/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;

/**
 * Abstract implementation of {@code AmazonAthenaAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAthenaAsync extends AbstractAmazonAthena implements AmazonAthenaAsync {

    protected AbstractAmazonAthenaAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(BatchGetNamedQueryRequest request) {

        return batchGetNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(BatchGetNamedQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetNamedQueryRequest, BatchGetNamedQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetPreparedStatementResult> batchGetPreparedStatementAsync(BatchGetPreparedStatementRequest request) {

        return batchGetPreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetPreparedStatementResult> batchGetPreparedStatementAsync(BatchGetPreparedStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetPreparedStatementRequest, BatchGetPreparedStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(BatchGetQueryExecutionRequest request) {

        return batchGetQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(BatchGetQueryExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetQueryExecutionRequest, BatchGetQueryExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(CreateDataCatalogRequest request) {

        return createDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(CreateDataCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataCatalogRequest, CreateDataCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(CreateNamedQueryRequest request) {

        return createNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(CreateNamedQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNamedQueryRequest, CreateNamedQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookResult> createNotebookAsync(CreateNotebookRequest request) {

        return createNotebookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookResult> createNotebookAsync(CreateNotebookRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookRequest, CreateNotebookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(CreatePreparedStatementRequest request) {

        return createPreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(CreatePreparedStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePreparedStatementRequest, CreatePreparedStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookUrlResult> createPresignedNotebookUrlAsync(CreatePresignedNotebookUrlRequest request) {

        return createPresignedNotebookUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookUrlResult> createPresignedNotebookUrlAsync(CreatePresignedNotebookUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookUrlRequest, CreatePresignedNotebookUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(CreateWorkGroupRequest request) {

        return createWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(CreateWorkGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkGroupRequest, CreateWorkGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(DeleteDataCatalogRequest request) {

        return deleteDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(DeleteDataCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataCatalogRequest, DeleteDataCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(DeleteNamedQueryRequest request) {

        return deleteNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(DeleteNamedQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNamedQueryRequest, DeleteNamedQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookResult> deleteNotebookAsync(DeleteNotebookRequest request) {

        return deleteNotebookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookResult> deleteNotebookAsync(DeleteNotebookRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookRequest, DeleteNotebookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(DeletePreparedStatementRequest request) {

        return deletePreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(DeletePreparedStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePreparedStatementRequest, DeletePreparedStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(DeleteWorkGroupRequest request) {

        return deleteWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(DeleteWorkGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkGroupRequest, DeleteWorkGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportNotebookResult> exportNotebookAsync(ExportNotebookRequest request) {

        return exportNotebookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportNotebookResult> exportNotebookAsync(ExportNotebookRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportNotebookRequest, ExportNotebookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionResult> getCalculationExecutionAsync(GetCalculationExecutionRequest request) {

        return getCalculationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionResult> getCalculationExecutionAsync(GetCalculationExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionRequest, GetCalculationExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionCodeResult> getCalculationExecutionCodeAsync(GetCalculationExecutionCodeRequest request) {

        return getCalculationExecutionCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionCodeResult> getCalculationExecutionCodeAsync(GetCalculationExecutionCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionCodeRequest, GetCalculationExecutionCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionStatusResult> getCalculationExecutionStatusAsync(GetCalculationExecutionStatusRequest request) {

        return getCalculationExecutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCalculationExecutionStatusResult> getCalculationExecutionStatusAsync(GetCalculationExecutionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionStatusRequest, GetCalculationExecutionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(GetDataCatalogRequest request) {

        return getDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(GetDataCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataCatalogRequest, GetDataCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request) {

        return getDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(GetNamedQueryRequest request) {

        return getNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(GetNamedQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNamedQueryRequest, GetNamedQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNotebookMetadataResult> getNotebookMetadataAsync(GetNotebookMetadataRequest request) {

        return getNotebookMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNotebookMetadataResult> getNotebookMetadataAsync(GetNotebookMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNotebookMetadataRequest, GetNotebookMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(GetPreparedStatementRequest request) {

        return getPreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(GetPreparedStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPreparedStatementRequest, GetPreparedStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(GetQueryExecutionRequest request) {

        return getQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(GetQueryExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryExecutionRequest, GetQueryExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryRuntimeStatisticsResult> getQueryRuntimeStatisticsAsync(GetQueryRuntimeStatisticsRequest request) {

        return getQueryRuntimeStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryRuntimeStatisticsResult> getQueryRuntimeStatisticsAsync(GetQueryRuntimeStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryRuntimeStatisticsRequest, GetQueryRuntimeStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSessionStatusResult> getSessionStatusAsync(GetSessionStatusRequest request) {

        return getSessionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionStatusResult> getSessionStatusAsync(GetSessionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSessionStatusRequest, GetSessionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(GetTableMetadataRequest request) {

        return getTableMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(GetTableMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTableMetadataRequest, GetTableMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(GetWorkGroupRequest request) {

        return getWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(GetWorkGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkGroupRequest, GetWorkGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportNotebookResult> importNotebookAsync(ImportNotebookRequest request) {

        return importNotebookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportNotebookResult> importNotebookAsync(ImportNotebookRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportNotebookRequest, ImportNotebookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationDPUSizesResult> listApplicationDPUSizesAsync(ListApplicationDPUSizesRequest request) {

        return listApplicationDPUSizesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationDPUSizesResult> listApplicationDPUSizesAsync(ListApplicationDPUSizesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationDPUSizesRequest, ListApplicationDPUSizesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCalculationExecutionsResult> listCalculationExecutionsAsync(ListCalculationExecutionsRequest request) {

        return listCalculationExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCalculationExecutionsResult> listCalculationExecutionsAsync(ListCalculationExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCalculationExecutionsRequest, ListCalculationExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(ListDataCatalogsRequest request) {

        return listDataCatalogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(ListDataCatalogsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataCatalogsRequest, ListDataCatalogsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest request) {

        return listEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEngineVersionsRequest, ListEngineVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExecutorsResult> listExecutorsAsync(ListExecutorsRequest request) {

        return listExecutorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutorsResult> listExecutorsAsync(ListExecutorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExecutorsRequest, ListExecutorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(ListNamedQueriesRequest request) {

        return listNamedQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(ListNamedQueriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNamedQueriesRequest, ListNamedQueriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNotebookMetadataResult> listNotebookMetadataAsync(ListNotebookMetadataRequest request) {

        return listNotebookMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookMetadataResult> listNotebookMetadataAsync(ListNotebookMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotebookMetadataRequest, ListNotebookMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionsResult> listNotebookSessionsAsync(ListNotebookSessionsRequest request) {

        return listNotebookSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionsResult> listNotebookSessionsAsync(ListNotebookSessionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotebookSessionsRequest, ListNotebookSessionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(ListPreparedStatementsRequest request) {

        return listPreparedStatementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(ListPreparedStatementsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPreparedStatementsRequest, ListPreparedStatementsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(ListQueryExecutionsRequest request) {

        return listQueryExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(ListQueryExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQueryExecutionsRequest, ListQueryExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest request) {

        return listSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSessionsRequest, ListSessionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(ListTableMetadataRequest request) {

        return listTableMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(ListTableMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTableMetadataRequest, ListTableMetadataResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(ListWorkGroupsRequest request) {

        return listWorkGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(ListWorkGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkGroupsRequest, ListWorkGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartCalculationExecutionResult> startCalculationExecutionAsync(StartCalculationExecutionRequest request) {

        return startCalculationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCalculationExecutionResult> startCalculationExecutionAsync(StartCalculationExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCalculationExecutionRequest, StartCalculationExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(StartQueryExecutionRequest request) {

        return startQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(StartQueryExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartQueryExecutionRequest, StartQueryExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest request) {

        return startSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopCalculationExecutionResult> stopCalculationExecutionAsync(StopCalculationExecutionRequest request) {

        return stopCalculationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCalculationExecutionResult> stopCalculationExecutionAsync(StopCalculationExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopCalculationExecutionRequest, StopCalculationExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(StopQueryExecutionRequest request) {

        return stopQueryExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(StopQueryExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopQueryExecutionRequest, StopQueryExecutionResult> asyncHandler) {

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
    public java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest request) {

        return terminateSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(UpdateDataCatalogRequest request) {

        return updateDataCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(UpdateDataCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataCatalogRequest, UpdateDataCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNamedQueryResult> updateNamedQueryAsync(UpdateNamedQueryRequest request) {

        return updateNamedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNamedQueryResult> updateNamedQueryAsync(UpdateNamedQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNamedQueryRequest, UpdateNamedQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookResult> updateNotebookAsync(UpdateNotebookRequest request) {

        return updateNotebookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookResult> updateNotebookAsync(UpdateNotebookRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookRequest, UpdateNotebookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookMetadataResult> updateNotebookMetadataAsync(UpdateNotebookMetadataRequest request) {

        return updateNotebookMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookMetadataResult> updateNotebookMetadataAsync(UpdateNotebookMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookMetadataRequest, UpdateNotebookMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(UpdatePreparedStatementRequest request) {

        return updatePreparedStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(UpdatePreparedStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePreparedStatementRequest, UpdatePreparedStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(UpdateWorkGroupRequest request) {

        return updateWorkGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(UpdateWorkGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkGroupRequest, UpdateWorkGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
