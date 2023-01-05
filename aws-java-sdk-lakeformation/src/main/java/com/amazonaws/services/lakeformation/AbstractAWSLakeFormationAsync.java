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
package com.amazonaws.services.lakeformation;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;

/**
 * Abstract implementation of {@code AWSLakeFormationAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLakeFormationAsync extends AbstractAWSLakeFormation implements AWSLakeFormationAsync {

    protected AbstractAWSLakeFormationAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest request) {

        return addLFTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<AddLFTagsToResourceRequest, AddLFTagsToResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(AssumeDecoratedRoleWithSAMLRequest request) {

        return assumeDecoratedRoleWithSAMLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(AssumeDecoratedRoleWithSAMLRequest request,
            com.amazonaws.handlers.AsyncHandler<AssumeDecoratedRoleWithSAMLRequest, AssumeDecoratedRoleWithSAMLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest request) {

        return batchGrantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGrantPermissionsRequest, BatchGrantPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest request) {

        return batchRevokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchRevokePermissionsRequest, BatchRevokePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(CancelTransactionRequest request) {

        return cancelTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(CancelTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelTransactionRequest, CancelTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request) {

        return commitTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(CreateDataCellsFilterRequest request) {

        return createDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(CreateDataCellsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataCellsFilterRequest, CreateDataCellsFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest request) {

        return createLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLFTagRequest, CreateLFTagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(DeleteDataCellsFilterRequest request) {

        return deleteDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(DeleteDataCellsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataCellsFilterRequest, DeleteDataCellsFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest request) {

        return deleteLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLFTagRequest, DeleteLFTagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(DeleteObjectsOnCancelRequest request) {

        return deleteObjectsOnCancelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(DeleteObjectsOnCancelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectsOnCancelRequest, DeleteObjectsOnCancelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest request) {

        return deregisterResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterResourceRequest, DeregisterResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest request) {

        return describeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(DescribeTransactionRequest request) {

        return describeTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(DescribeTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTransactionRequest, DescribeTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(ExtendTransactionRequest request) {

        return extendTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(ExtendTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<ExtendTransactionRequest, ExtendTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest request) {

        return getDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeSettingsRequest, GetDataLakeSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(GetEffectivePermissionsForPathRequest request) {

        return getEffectivePermissionsForPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(GetEffectivePermissionsForPathRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEffectivePermissionsForPathRequest, GetEffectivePermissionsForPathResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest request) {

        return getLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLFTagRequest, GetLFTagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(GetQueryStateRequest request) {

        return getQueryStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(GetQueryStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryStateRequest, GetQueryStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(GetQueryStatisticsRequest request) {

        return getQueryStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(GetQueryStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryStatisticsRequest, GetQueryStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest request) {

        return getResourceLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceLFTagsRequest, GetResourceLFTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(GetTableObjectsRequest request) {

        return getTableObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(GetTableObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTableObjectsRequest, GetTableObjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            GetTemporaryGluePartitionCredentialsRequest request) {

        return getTemporaryGluePartitionCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            GetTemporaryGluePartitionCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemporaryGluePartitionCredentialsRequest, GetTemporaryGluePartitionCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            GetTemporaryGlueTableCredentialsRequest request) {

        return getTemporaryGlueTableCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            GetTemporaryGlueTableCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemporaryGlueTableCredentialsRequest, GetTemporaryGlueTableCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(GetWorkUnitResultsRequest request) {

        return getWorkUnitResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(GetWorkUnitResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkUnitResultsRequest, GetWorkUnitResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(GetWorkUnitsRequest request) {

        return getWorkUnitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(GetWorkUnitsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkUnitsRequest, GetWorkUnitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest request) {

        return grantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GrantPermissionsRequest, GrantPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(ListDataCellsFilterRequest request) {

        return listDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(ListDataCellsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataCellsFilterRequest, ListDataCellsFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest request) {

        return listLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLFTagsRequest, ListLFTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(ListTableStorageOptimizersRequest request) {

        return listTableStorageOptimizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(ListTableStorageOptimizersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTableStorageOptimizersRequest, ListTableStorageOptimizersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request) {

        return listTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest request) {

        return putDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDataLakeSettingsRequest, PutDataLakeSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest request) {

        return registerResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterResourceRequest, RegisterResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest request) {

        return removeLFTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveLFTagsFromResourceRequest, RemoveLFTagsFromResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest request) {

        return revokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokePermissionsRequest, RevokePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest request) {

        return searchDatabasesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchDatabasesByLFTagsRequest, SearchDatabasesByLFTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest request) {

        return searchTablesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchTablesByLFTagsRequest, SearchTablesByLFTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(StartQueryPlanningRequest request) {

        return startQueryPlanningAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(StartQueryPlanningRequest request,
            com.amazonaws.handlers.AsyncHandler<StartQueryPlanningRequest, StartQueryPlanningResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(StartTransactionRequest request) {

        return startTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(StartTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTransactionRequest, StartTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest request) {

        return updateLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLFTagRequest, UpdateLFTagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(UpdateTableObjectsRequest request) {

        return updateTableObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(UpdateTableObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTableObjectsRequest, UpdateTableObjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(UpdateTableStorageOptimizerRequest request) {

        return updateTableStorageOptimizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(UpdateTableStorageOptimizerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTableStorageOptimizerRequest, UpdateTableStorageOptimizerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
