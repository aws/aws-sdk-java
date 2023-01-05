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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Lake Formation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the Lake Formation service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLakeFormationAsyncClient extends AWSLakeFormationClient implements AWSLakeFormationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLakeFormationAsyncClientBuilder asyncBuilder() {
        return AWSLakeFormationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lake Formation using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLakeFormationAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Lake Formation using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLakeFormationAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest request) {

        return addLFTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(final AddLFTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddLFTagsToResourceRequest, AddLFTagsToResourceResult> asyncHandler) {
        final AddLFTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddLFTagsToResourceResult>() {
            @Override
            public AddLFTagsToResourceResult call() throws Exception {
                AddLFTagsToResourceResult result = null;

                try {
                    result = executeAddLFTagsToResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(AssumeDecoratedRoleWithSAMLRequest request) {

        return assumeDecoratedRoleWithSAMLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(final AssumeDecoratedRoleWithSAMLRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeDecoratedRoleWithSAMLRequest, AssumeDecoratedRoleWithSAMLResult> asyncHandler) {
        final AssumeDecoratedRoleWithSAMLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeDecoratedRoleWithSAMLResult>() {
            @Override
            public AssumeDecoratedRoleWithSAMLResult call() throws Exception {
                AssumeDecoratedRoleWithSAMLResult result = null;

                try {
                    result = executeAssumeDecoratedRoleWithSAML(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest request) {

        return batchGrantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(final BatchGrantPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGrantPermissionsRequest, BatchGrantPermissionsResult> asyncHandler) {
        final BatchGrantPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGrantPermissionsResult>() {
            @Override
            public BatchGrantPermissionsResult call() throws Exception {
                BatchGrantPermissionsResult result = null;

                try {
                    result = executeBatchGrantPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest request) {

        return batchRevokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(final BatchRevokePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchRevokePermissionsRequest, BatchRevokePermissionsResult> asyncHandler) {
        final BatchRevokePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchRevokePermissionsResult>() {
            @Override
            public BatchRevokePermissionsResult call() throws Exception {
                BatchRevokePermissionsResult result = null;

                try {
                    result = executeBatchRevokePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(CancelTransactionRequest request) {

        return cancelTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(final CancelTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelTransactionRequest, CancelTransactionResult> asyncHandler) {
        final CancelTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelTransactionResult>() {
            @Override
            public CancelTransactionResult call() throws Exception {
                CancelTransactionResult result = null;

                try {
                    result = executeCancelTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request) {

        return commitTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(final CommitTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler) {
        final CommitTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CommitTransactionResult>() {
            @Override
            public CommitTransactionResult call() throws Exception {
                CommitTransactionResult result = null;

                try {
                    result = executeCommitTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(CreateDataCellsFilterRequest request) {

        return createDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(final CreateDataCellsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataCellsFilterRequest, CreateDataCellsFilterResult> asyncHandler) {
        final CreateDataCellsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataCellsFilterResult>() {
            @Override
            public CreateDataCellsFilterResult call() throws Exception {
                CreateDataCellsFilterResult result = null;

                try {
                    result = executeCreateDataCellsFilter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest request) {

        return createLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(final CreateLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLFTagRequest, CreateLFTagResult> asyncHandler) {
        final CreateLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLFTagResult>() {
            @Override
            public CreateLFTagResult call() throws Exception {
                CreateLFTagResult result = null;

                try {
                    result = executeCreateLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(DeleteDataCellsFilterRequest request) {

        return deleteDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(final DeleteDataCellsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataCellsFilterRequest, DeleteDataCellsFilterResult> asyncHandler) {
        final DeleteDataCellsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataCellsFilterResult>() {
            @Override
            public DeleteDataCellsFilterResult call() throws Exception {
                DeleteDataCellsFilterResult result = null;

                try {
                    result = executeDeleteDataCellsFilter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest request) {

        return deleteLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(final DeleteLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLFTagRequest, DeleteLFTagResult> asyncHandler) {
        final DeleteLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLFTagResult>() {
            @Override
            public DeleteLFTagResult call() throws Exception {
                DeleteLFTagResult result = null;

                try {
                    result = executeDeleteLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(DeleteObjectsOnCancelRequest request) {

        return deleteObjectsOnCancelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(final DeleteObjectsOnCancelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteObjectsOnCancelRequest, DeleteObjectsOnCancelResult> asyncHandler) {
        final DeleteObjectsOnCancelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteObjectsOnCancelResult>() {
            @Override
            public DeleteObjectsOnCancelResult call() throws Exception {
                DeleteObjectsOnCancelResult result = null;

                try {
                    result = executeDeleteObjectsOnCancel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest request) {

        return deregisterResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(final DeregisterResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterResourceRequest, DeregisterResourceResult> asyncHandler) {
        final DeregisterResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterResourceResult>() {
            @Override
            public DeregisterResourceResult call() throws Exception {
                DeregisterResourceResult result = null;

                try {
                    result = executeDeregisterResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest request) {

        return describeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(final DescribeResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler) {
        final DescribeResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceResult>() {
            @Override
            public DescribeResourceResult call() throws Exception {
                DescribeResourceResult result = null;

                try {
                    result = executeDescribeResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(DescribeTransactionRequest request) {

        return describeTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(final DescribeTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransactionRequest, DescribeTransactionResult> asyncHandler) {
        final DescribeTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransactionResult>() {
            @Override
            public DescribeTransactionResult call() throws Exception {
                DescribeTransactionResult result = null;

                try {
                    result = executeDescribeTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(ExtendTransactionRequest request) {

        return extendTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(final ExtendTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExtendTransactionRequest, ExtendTransactionResult> asyncHandler) {
        final ExtendTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExtendTransactionResult>() {
            @Override
            public ExtendTransactionResult call() throws Exception {
                ExtendTransactionResult result = null;

                try {
                    result = executeExtendTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest request) {

        return getDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(final GetDataLakeSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataLakeSettingsRequest, GetDataLakeSettingsResult> asyncHandler) {
        final GetDataLakeSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataLakeSettingsResult>() {
            @Override
            public GetDataLakeSettingsResult call() throws Exception {
                GetDataLakeSettingsResult result = null;

                try {
                    result = executeGetDataLakeSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(GetEffectivePermissionsForPathRequest request) {

        return getEffectivePermissionsForPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            final GetEffectivePermissionsForPathRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEffectivePermissionsForPathRequest, GetEffectivePermissionsForPathResult> asyncHandler) {
        final GetEffectivePermissionsForPathRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEffectivePermissionsForPathResult>() {
            @Override
            public GetEffectivePermissionsForPathResult call() throws Exception {
                GetEffectivePermissionsForPathResult result = null;

                try {
                    result = executeGetEffectivePermissionsForPath(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest request) {

        return getLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(final GetLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLFTagRequest, GetLFTagResult> asyncHandler) {
        final GetLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLFTagResult>() {
            @Override
            public GetLFTagResult call() throws Exception {
                GetLFTagResult result = null;

                try {
                    result = executeGetLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(GetQueryStateRequest request) {

        return getQueryStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(final GetQueryStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryStateRequest, GetQueryStateResult> asyncHandler) {
        final GetQueryStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryStateResult>() {
            @Override
            public GetQueryStateResult call() throws Exception {
                GetQueryStateResult result = null;

                try {
                    result = executeGetQueryState(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(GetQueryStatisticsRequest request) {

        return getQueryStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(final GetQueryStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryStatisticsRequest, GetQueryStatisticsResult> asyncHandler) {
        final GetQueryStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryStatisticsResult>() {
            @Override
            public GetQueryStatisticsResult call() throws Exception {
                GetQueryStatisticsResult result = null;

                try {
                    result = executeGetQueryStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest request) {

        return getResourceLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(final GetResourceLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceLFTagsRequest, GetResourceLFTagsResult> asyncHandler) {
        final GetResourceLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceLFTagsResult>() {
            @Override
            public GetResourceLFTagsResult call() throws Exception {
                GetResourceLFTagsResult result = null;

                try {
                    result = executeGetResourceLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(GetTableObjectsRequest request) {

        return getTableObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(final GetTableObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableObjectsRequest, GetTableObjectsResult> asyncHandler) {
        final GetTableObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableObjectsResult>() {
            @Override
            public GetTableObjectsResult call() throws Exception {
                GetTableObjectsResult result = null;

                try {
                    result = executeGetTableObjects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            GetTemporaryGluePartitionCredentialsRequest request) {

        return getTemporaryGluePartitionCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            final GetTemporaryGluePartitionCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemporaryGluePartitionCredentialsRequest, GetTemporaryGluePartitionCredentialsResult> asyncHandler) {
        final GetTemporaryGluePartitionCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemporaryGluePartitionCredentialsResult>() {
            @Override
            public GetTemporaryGluePartitionCredentialsResult call() throws Exception {
                GetTemporaryGluePartitionCredentialsResult result = null;

                try {
                    result = executeGetTemporaryGluePartitionCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            GetTemporaryGlueTableCredentialsRequest request) {

        return getTemporaryGlueTableCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            final GetTemporaryGlueTableCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemporaryGlueTableCredentialsRequest, GetTemporaryGlueTableCredentialsResult> asyncHandler) {
        final GetTemporaryGlueTableCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemporaryGlueTableCredentialsResult>() {
            @Override
            public GetTemporaryGlueTableCredentialsResult call() throws Exception {
                GetTemporaryGlueTableCredentialsResult result = null;

                try {
                    result = executeGetTemporaryGlueTableCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(GetWorkUnitResultsRequest request) {

        return getWorkUnitResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(final GetWorkUnitResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkUnitResultsRequest, GetWorkUnitResultsResult> asyncHandler) {
        final GetWorkUnitResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkUnitResultsResult>() {
            @Override
            public GetWorkUnitResultsResult call() throws Exception {
                GetWorkUnitResultsResult result = null;

                try {
                    result = executeGetWorkUnitResults(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(GetWorkUnitsRequest request) {

        return getWorkUnitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(final GetWorkUnitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkUnitsRequest, GetWorkUnitsResult> asyncHandler) {
        final GetWorkUnitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkUnitsResult>() {
            @Override
            public GetWorkUnitsResult call() throws Exception {
                GetWorkUnitsResult result = null;

                try {
                    result = executeGetWorkUnits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest request) {

        return grantPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(final GrantPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantPermissionsRequest, GrantPermissionsResult> asyncHandler) {
        final GrantPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GrantPermissionsResult>() {
            @Override
            public GrantPermissionsResult call() throws Exception {
                GrantPermissionsResult result = null;

                try {
                    result = executeGrantPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(ListDataCellsFilterRequest request) {

        return listDataCellsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(final ListDataCellsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataCellsFilterRequest, ListDataCellsFilterResult> asyncHandler) {
        final ListDataCellsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataCellsFilterResult>() {
            @Override
            public ListDataCellsFilterResult call() throws Exception {
                ListDataCellsFilterResult result = null;

                try {
                    result = executeListDataCellsFilter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest request) {

        return listLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(final ListLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLFTagsRequest, ListLFTagsResult> asyncHandler) {
        final ListLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLFTagsResult>() {
            @Override
            public ListLFTagsResult call() throws Exception {
                ListLFTagsResult result = null;

                try {
                    result = executeListLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(final ListPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {
        final ListPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionsResult>() {
            @Override
            public ListPermissionsResult call() throws Exception {
                ListPermissionsResult result = null;

                try {
                    result = executeListPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(ListTableStorageOptimizersRequest request) {

        return listTableStorageOptimizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(final ListTableStorageOptimizersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTableStorageOptimizersRequest, ListTableStorageOptimizersResult> asyncHandler) {
        final ListTableStorageOptimizersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTableStorageOptimizersResult>() {
            @Override
            public ListTableStorageOptimizersResult call() throws Exception {
                ListTableStorageOptimizersResult result = null;

                try {
                    result = executeListTableStorageOptimizers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request) {

        return listTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(final ListTransactionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler) {
        final ListTransactionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransactionsResult>() {
            @Override
            public ListTransactionsResult call() throws Exception {
                ListTransactionsResult result = null;

                try {
                    result = executeListTransactions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest request) {

        return putDataLakeSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(final PutDataLakeSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDataLakeSettingsRequest, PutDataLakeSettingsResult> asyncHandler) {
        final PutDataLakeSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDataLakeSettingsResult>() {
            @Override
            public PutDataLakeSettingsResult call() throws Exception {
                PutDataLakeSettingsResult result = null;

                try {
                    result = executePutDataLakeSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest request) {

        return registerResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(final RegisterResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterResourceRequest, RegisterResourceResult> asyncHandler) {
        final RegisterResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterResourceResult>() {
            @Override
            public RegisterResourceResult call() throws Exception {
                RegisterResourceResult result = null;

                try {
                    result = executeRegisterResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest request) {

        return removeLFTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(final RemoveLFTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveLFTagsFromResourceRequest, RemoveLFTagsFromResourceResult> asyncHandler) {
        final RemoveLFTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveLFTagsFromResourceResult>() {
            @Override
            public RemoveLFTagsFromResourceResult call() throws Exception {
                RemoveLFTagsFromResourceResult result = null;

                try {
                    result = executeRemoveLFTagsFromResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest request) {

        return revokePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(final RevokePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokePermissionsRequest, RevokePermissionsResult> asyncHandler) {
        final RevokePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokePermissionsResult>() {
            @Override
            public RevokePermissionsResult call() throws Exception {
                RevokePermissionsResult result = null;

                try {
                    result = executeRevokePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest request) {

        return searchDatabasesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(final SearchDatabasesByLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchDatabasesByLFTagsRequest, SearchDatabasesByLFTagsResult> asyncHandler) {
        final SearchDatabasesByLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchDatabasesByLFTagsResult>() {
            @Override
            public SearchDatabasesByLFTagsResult call() throws Exception {
                SearchDatabasesByLFTagsResult result = null;

                try {
                    result = executeSearchDatabasesByLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest request) {

        return searchTablesByLFTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(final SearchTablesByLFTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTablesByLFTagsRequest, SearchTablesByLFTagsResult> asyncHandler) {
        final SearchTablesByLFTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTablesByLFTagsResult>() {
            @Override
            public SearchTablesByLFTagsResult call() throws Exception {
                SearchTablesByLFTagsResult result = null;

                try {
                    result = executeSearchTablesByLFTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(StartQueryPlanningRequest request) {

        return startQueryPlanningAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(final StartQueryPlanningRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartQueryPlanningRequest, StartQueryPlanningResult> asyncHandler) {
        final StartQueryPlanningRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartQueryPlanningResult>() {
            @Override
            public StartQueryPlanningResult call() throws Exception {
                StartQueryPlanningResult result = null;

                try {
                    result = executeStartQueryPlanning(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(StartTransactionRequest request) {

        return startTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(final StartTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTransactionRequest, StartTransactionResult> asyncHandler) {
        final StartTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTransactionResult>() {
            @Override
            public StartTransactionResult call() throws Exception {
                StartTransactionResult result = null;

                try {
                    result = executeStartTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest request) {

        return updateLFTagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(final UpdateLFTagRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLFTagRequest, UpdateLFTagResult> asyncHandler) {
        final UpdateLFTagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLFTagResult>() {
            @Override
            public UpdateLFTagResult call() throws Exception {
                UpdateLFTagResult result = null;

                try {
                    result = executeUpdateLFTag(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {
        final UpdateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
            @Override
            public UpdateResourceResult call() throws Exception {
                UpdateResourceResult result = null;

                try {
                    result = executeUpdateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(UpdateTableObjectsRequest request) {

        return updateTableObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(final UpdateTableObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTableObjectsRequest, UpdateTableObjectsResult> asyncHandler) {
        final UpdateTableObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTableObjectsResult>() {
            @Override
            public UpdateTableObjectsResult call() throws Exception {
                UpdateTableObjectsResult result = null;

                try {
                    result = executeUpdateTableObjects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(UpdateTableStorageOptimizerRequest request) {

        return updateTableStorageOptimizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(final UpdateTableStorageOptimizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTableStorageOptimizerRequest, UpdateTableStorageOptimizerResult> asyncHandler) {
        final UpdateTableStorageOptimizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTableStorageOptimizerResult>() {
            @Override
            public UpdateTableStorageOptimizerResult call() throws Exception {
                UpdateTableStorageOptimizerResult result = null;

                try {
                    result = executeUpdateTableStorageOptimizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
