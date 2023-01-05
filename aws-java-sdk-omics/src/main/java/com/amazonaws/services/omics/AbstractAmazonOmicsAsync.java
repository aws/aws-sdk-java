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
package com.amazonaws.services.omics;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;

/**
 * Abstract implementation of {@code AmazonOmicsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonOmicsAsync extends AbstractAmazonOmics implements AmazonOmicsAsync {

    protected AbstractAmazonOmicsAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(BatchDeleteReadSetRequest request) {

        return batchDeleteReadSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(BatchDeleteReadSetRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteReadSetRequest, BatchDeleteReadSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(CancelAnnotationImportJobRequest request) {

        return cancelAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(CancelAnnotationImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelAnnotationImportJobRequest, CancelAnnotationImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelRunResult> cancelRunAsync(CancelRunRequest request) {

        return cancelRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRunResult> cancelRunAsync(CancelRunRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelRunRequest, CancelRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(CancelVariantImportJobRequest request) {

        return cancelVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(CancelVariantImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelVariantImportJobRequest, CancelVariantImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(CreateAnnotationStoreRequest request) {

        return createAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(CreateAnnotationStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAnnotationStoreRequest, CreateAnnotationStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(CreateReferenceStoreRequest request) {

        return createReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(CreateReferenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReferenceStoreRequest, CreateReferenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(CreateRunGroupRequest request) {

        return createRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(CreateRunGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRunGroupRequest, CreateRunGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(CreateSequenceStoreRequest request) {

        return createSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(CreateSequenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSequenceStoreRequest, CreateSequenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(CreateVariantStoreRequest request) {

        return createVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(CreateVariantStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVariantStoreRequest, CreateVariantStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(DeleteAnnotationStoreRequest request) {

        return deleteAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(DeleteAnnotationStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAnnotationStoreRequest, DeleteAnnotationStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(DeleteReferenceRequest request) {

        return deleteReferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(DeleteReferenceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReferenceRequest, DeleteReferenceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(DeleteReferenceStoreRequest request) {

        return deleteReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(DeleteReferenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReferenceStoreRequest, DeleteReferenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(DeleteRunGroupRequest request) {

        return deleteRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(DeleteRunGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRunGroupRequest, DeleteRunGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(DeleteSequenceStoreRequest request) {

        return deleteSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(DeleteSequenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSequenceStoreRequest, DeleteSequenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(DeleteVariantStoreRequest request) {

        return deleteVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(DeleteVariantStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVariantStoreRequest, DeleteVariantStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(GetAnnotationImportJobRequest request) {

        return getAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(GetAnnotationImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnnotationImportJobRequest, GetAnnotationImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(GetAnnotationStoreRequest request) {

        return getAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(GetAnnotationStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAnnotationStoreRequest, GetAnnotationStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(GetReadSetRequest request) {

        return getReadSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(GetReadSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReadSetRequest, GetReadSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(GetReadSetActivationJobRequest request) {

        return getReadSetActivationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(GetReadSetActivationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReadSetActivationJobRequest, GetReadSetActivationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(GetReadSetExportJobRequest request) {

        return getReadSetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(GetReadSetExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReadSetExportJobRequest, GetReadSetExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(GetReadSetImportJobRequest request) {

        return getReadSetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(GetReadSetImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReadSetImportJobRequest, GetReadSetImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(GetReadSetMetadataRequest request) {

        return getReadSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(GetReadSetMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReadSetMetadataRequest, GetReadSetMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(GetReferenceRequest request) {

        return getReferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(GetReferenceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReferenceRequest, GetReferenceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(GetReferenceImportJobRequest request) {

        return getReferenceImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(GetReferenceImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReferenceImportJobRequest, GetReferenceImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(GetReferenceMetadataRequest request) {

        return getReferenceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(GetReferenceMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReferenceMetadataRequest, GetReferenceMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(GetReferenceStoreRequest request) {

        return getReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(GetReferenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReferenceStoreRequest, GetReferenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request) {

        return getRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(GetRunGroupRequest request) {

        return getRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(GetRunGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRunGroupRequest, GetRunGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(GetRunTaskRequest request) {

        return getRunTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(GetRunTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRunTaskRequest, GetRunTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(GetSequenceStoreRequest request) {

        return getSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(GetSequenceStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSequenceStoreRequest, GetSequenceStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(GetVariantImportJobRequest request) {

        return getVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(GetVariantImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVariantImportJobRequest, GetVariantImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(GetVariantStoreRequest request) {

        return getVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(GetVariantStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVariantStoreRequest, GetVariantStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(ListAnnotationImportJobsRequest request) {

        return listAnnotationImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(ListAnnotationImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnnotationImportJobsRequest, ListAnnotationImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(ListAnnotationStoresRequest request) {

        return listAnnotationStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(ListAnnotationStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnnotationStoresRequest, ListAnnotationStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(ListReadSetActivationJobsRequest request) {

        return listReadSetActivationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(ListReadSetActivationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReadSetActivationJobsRequest, ListReadSetActivationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(ListReadSetExportJobsRequest request) {

        return listReadSetExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(ListReadSetExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReadSetExportJobsRequest, ListReadSetExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(ListReadSetImportJobsRequest request) {

        return listReadSetImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(ListReadSetImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReadSetImportJobsRequest, ListReadSetImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(ListReadSetsRequest request) {

        return listReadSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(ListReadSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReadSetsRequest, ListReadSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(ListReferenceImportJobsRequest request) {

        return listReferenceImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(ListReferenceImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReferenceImportJobsRequest, ListReferenceImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(ListReferenceStoresRequest request) {

        return listReferenceStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(ListReferenceStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReferenceStoresRequest, ListReferenceStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(ListReferencesRequest request) {

        return listReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(ListReferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReferencesRequest, ListReferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(ListRunGroupsRequest request) {

        return listRunGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(ListRunGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRunGroupsRequest, ListRunGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(ListRunTasksRequest request) {

        return listRunTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(ListRunTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRunTasksRequest, ListRunTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(ListSequenceStoresRequest request) {

        return listSequenceStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(ListSequenceStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSequenceStoresRequest, ListSequenceStoresResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(ListVariantImportJobsRequest request) {

        return listVariantImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(ListVariantImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVariantImportJobsRequest, ListVariantImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(ListVariantStoresRequest request) {

        return listVariantStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(ListVariantStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVariantStoresRequest, ListVariantStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(StartAnnotationImportJobRequest request) {

        return startAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(StartAnnotationImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartAnnotationImportJobRequest, StartAnnotationImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(StartReadSetActivationJobRequest request) {

        return startReadSetActivationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(StartReadSetActivationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReadSetActivationJobRequest, StartReadSetActivationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(StartReadSetExportJobRequest request) {

        return startReadSetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(StartReadSetExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReadSetExportJobRequest, StartReadSetExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(StartReadSetImportJobRequest request) {

        return startReadSetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(StartReadSetImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReadSetImportJobRequest, StartReadSetImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(StartReferenceImportJobRequest request) {

        return startReferenceImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(StartReferenceImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReferenceImportJobRequest, StartReferenceImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartRunResult> startRunAsync(StartRunRequest request) {

        return startRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRunResult> startRunAsync(StartRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartRunRequest, StartRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(StartVariantImportJobRequest request) {

        return startVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(StartVariantImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartVariantImportJobRequest, StartVariantImportJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(UpdateAnnotationStoreRequest request) {

        return updateAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(UpdateAnnotationStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAnnotationStoreRequest, UpdateAnnotationStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(UpdateRunGroupRequest request) {

        return updateRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(UpdateRunGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRunGroupRequest, UpdateRunGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(UpdateVariantStoreRequest request) {

        return updateVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(UpdateVariantStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVariantStoreRequest, UpdateVariantStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request) {

        return updateWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
