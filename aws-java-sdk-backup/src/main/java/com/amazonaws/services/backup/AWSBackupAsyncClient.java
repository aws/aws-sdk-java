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
package com.amazonaws.services.backup;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Backup asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Backup</fullname>
 * <p>
 * AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup
 * simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and
 * auditing.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupAsyncClient extends AWSBackupClient implements AWSBackupAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBackupAsyncClientBuilder asyncBuilder() {
        return AWSBackupAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Backup using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBackupAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(CreateBackupPlanRequest request) {

        return createBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(final CreateBackupPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackupPlanRequest, CreateBackupPlanResult> asyncHandler) {
        final CreateBackupPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackupPlanResult>() {
            @Override
            public CreateBackupPlanResult call() throws Exception {
                CreateBackupPlanResult result = null;

                try {
                    result = executeCreateBackupPlan(finalRequest);
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
    public java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(CreateBackupSelectionRequest request) {

        return createBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(final CreateBackupSelectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackupSelectionRequest, CreateBackupSelectionResult> asyncHandler) {
        final CreateBackupSelectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackupSelectionResult>() {
            @Override
            public CreateBackupSelectionResult call() throws Exception {
                CreateBackupSelectionResult result = null;

                try {
                    result = executeCreateBackupSelection(finalRequest);
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
    public java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(CreateBackupVaultRequest request) {

        return createBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(final CreateBackupVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackupVaultRequest, CreateBackupVaultResult> asyncHandler) {
        final CreateBackupVaultRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackupVaultResult>() {
            @Override
            public CreateBackupVaultResult call() throws Exception {
                CreateBackupVaultResult result = null;

                try {
                    result = executeCreateBackupVault(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(DeleteBackupPlanRequest request) {

        return deleteBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(final DeleteBackupPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupPlanRequest, DeleteBackupPlanResult> asyncHandler) {
        final DeleteBackupPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupPlanResult>() {
            @Override
            public DeleteBackupPlanResult call() throws Exception {
                DeleteBackupPlanResult result = null;

                try {
                    result = executeDeleteBackupPlan(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(DeleteBackupSelectionRequest request) {

        return deleteBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(final DeleteBackupSelectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupSelectionRequest, DeleteBackupSelectionResult> asyncHandler) {
        final DeleteBackupSelectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupSelectionResult>() {
            @Override
            public DeleteBackupSelectionResult call() throws Exception {
                DeleteBackupSelectionResult result = null;

                try {
                    result = executeDeleteBackupSelection(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(DeleteBackupVaultRequest request) {

        return deleteBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(final DeleteBackupVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultRequest, DeleteBackupVaultResult> asyncHandler) {
        final DeleteBackupVaultRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupVaultResult>() {
            @Override
            public DeleteBackupVaultResult call() throws Exception {
                DeleteBackupVaultResult result = null;

                try {
                    result = executeDeleteBackupVault(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(DeleteBackupVaultAccessPolicyRequest request) {

        return deleteBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(
            final DeleteBackupVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultAccessPolicyRequest, DeleteBackupVaultAccessPolicyResult> asyncHandler) {
        final DeleteBackupVaultAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupVaultAccessPolicyResult>() {
            @Override
            public DeleteBackupVaultAccessPolicyResult call() throws Exception {
                DeleteBackupVaultAccessPolicyResult result = null;

                try {
                    result = executeDeleteBackupVaultAccessPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(DeleteBackupVaultNotificationsRequest request) {

        return deleteBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(
            final DeleteBackupVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultNotificationsRequest, DeleteBackupVaultNotificationsResult> asyncHandler) {
        final DeleteBackupVaultNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupVaultNotificationsResult>() {
            @Override
            public DeleteBackupVaultNotificationsResult call() throws Exception {
                DeleteBackupVaultNotificationsResult result = null;

                try {
                    result = executeDeleteBackupVaultNotifications(finalRequest);
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
    public java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(DeleteRecoveryPointRequest request) {

        return deleteRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(final DeleteRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecoveryPointRequest, DeleteRecoveryPointResult> asyncHandler) {
        final DeleteRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecoveryPointResult>() {
            @Override
            public DeleteRecoveryPointResult call() throws Exception {
                DeleteRecoveryPointResult result = null;

                try {
                    result = executeDeleteRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(DescribeBackupJobRequest request) {

        return describeBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(final DescribeBackupJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBackupJobRequest, DescribeBackupJobResult> asyncHandler) {
        final DescribeBackupJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBackupJobResult>() {
            @Override
            public DescribeBackupJobResult call() throws Exception {
                DescribeBackupJobResult result = null;

                try {
                    result = executeDescribeBackupJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(DescribeBackupVaultRequest request) {

        return describeBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(final DescribeBackupVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBackupVaultRequest, DescribeBackupVaultResult> asyncHandler) {
        final DescribeBackupVaultRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBackupVaultResult>() {
            @Override
            public DescribeBackupVaultResult call() throws Exception {
                DescribeBackupVaultResult result = null;

                try {
                    result = executeDescribeBackupVault(finalRequest);
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
    public java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(DescribeProtectedResourceRequest request) {

        return describeProtectedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(final DescribeProtectedResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProtectedResourceRequest, DescribeProtectedResourceResult> asyncHandler) {
        final DescribeProtectedResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProtectedResourceResult>() {
            @Override
            public DescribeProtectedResourceResult call() throws Exception {
                DescribeProtectedResourceResult result = null;

                try {
                    result = executeDescribeProtectedResource(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(DescribeRecoveryPointRequest request) {

        return describeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(final DescribeRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecoveryPointRequest, DescribeRecoveryPointResult> asyncHandler) {
        final DescribeRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecoveryPointResult>() {
            @Override
            public DescribeRecoveryPointResult call() throws Exception {
                DescribeRecoveryPointResult result = null;

                try {
                    result = executeDescribeRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(DescribeRestoreJobRequest request) {

        return describeRestoreJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(final DescribeRestoreJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRestoreJobRequest, DescribeRestoreJobResult> asyncHandler) {
        final DescribeRestoreJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRestoreJobResult>() {
            @Override
            public DescribeRestoreJobResult call() throws Exception {
                DescribeRestoreJobResult result = null;

                try {
                    result = executeDescribeRestoreJob(finalRequest);
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
    public java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(ExportBackupPlanTemplateRequest request) {

        return exportBackupPlanTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(final ExportBackupPlanTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportBackupPlanTemplateRequest, ExportBackupPlanTemplateResult> asyncHandler) {
        final ExportBackupPlanTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportBackupPlanTemplateResult>() {
            @Override
            public ExportBackupPlanTemplateResult call() throws Exception {
                ExportBackupPlanTemplateResult result = null;

                try {
                    result = executeExportBackupPlanTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(GetBackupPlanRequest request) {

        return getBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(final GetBackupPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupPlanRequest, GetBackupPlanResult> asyncHandler) {
        final GetBackupPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupPlanResult>() {
            @Override
            public GetBackupPlanResult call() throws Exception {
                GetBackupPlanResult result = null;

                try {
                    result = executeGetBackupPlan(finalRequest);
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
    public java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(GetBackupPlanFromJSONRequest request) {

        return getBackupPlanFromJSONAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(final GetBackupPlanFromJSONRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromJSONRequest, GetBackupPlanFromJSONResult> asyncHandler) {
        final GetBackupPlanFromJSONRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupPlanFromJSONResult>() {
            @Override
            public GetBackupPlanFromJSONResult call() throws Exception {
                GetBackupPlanFromJSONResult result = null;

                try {
                    result = executeGetBackupPlanFromJSON(finalRequest);
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
    public java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(GetBackupPlanFromTemplateRequest request) {

        return getBackupPlanFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(final GetBackupPlanFromTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromTemplateRequest, GetBackupPlanFromTemplateResult> asyncHandler) {
        final GetBackupPlanFromTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupPlanFromTemplateResult>() {
            @Override
            public GetBackupPlanFromTemplateResult call() throws Exception {
                GetBackupPlanFromTemplateResult result = null;

                try {
                    result = executeGetBackupPlanFromTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(GetBackupSelectionRequest request) {

        return getBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(final GetBackupSelectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupSelectionRequest, GetBackupSelectionResult> asyncHandler) {
        final GetBackupSelectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupSelectionResult>() {
            @Override
            public GetBackupSelectionResult call() throws Exception {
                GetBackupSelectionResult result = null;

                try {
                    result = executeGetBackupSelection(finalRequest);
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
    public java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(GetBackupVaultAccessPolicyRequest request) {

        return getBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(final GetBackupVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupVaultAccessPolicyRequest, GetBackupVaultAccessPolicyResult> asyncHandler) {
        final GetBackupVaultAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupVaultAccessPolicyResult>() {
            @Override
            public GetBackupVaultAccessPolicyResult call() throws Exception {
                GetBackupVaultAccessPolicyResult result = null;

                try {
                    result = executeGetBackupVaultAccessPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(GetBackupVaultNotificationsRequest request) {

        return getBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(final GetBackupVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackupVaultNotificationsRequest, GetBackupVaultNotificationsResult> asyncHandler) {
        final GetBackupVaultNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackupVaultNotificationsResult>() {
            @Override
            public GetBackupVaultNotificationsResult call() throws Exception {
                GetBackupVaultNotificationsResult result = null;

                try {
                    result = executeGetBackupVaultNotifications(finalRequest);
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
    public java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            GetRecoveryPointRestoreMetadataRequest request) {

        return getRecoveryPointRestoreMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            final GetRecoveryPointRestoreMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecoveryPointRestoreMetadataRequest, GetRecoveryPointRestoreMetadataResult> asyncHandler) {
        final GetRecoveryPointRestoreMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecoveryPointRestoreMetadataResult>() {
            @Override
            public GetRecoveryPointRestoreMetadataResult call() throws Exception {
                GetRecoveryPointRestoreMetadataResult result = null;

                try {
                    result = executeGetRecoveryPointRestoreMetadata(finalRequest);
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
    public java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(GetSupportedResourceTypesRequest request) {

        return getSupportedResourceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(final GetSupportedResourceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSupportedResourceTypesRequest, GetSupportedResourceTypesResult> asyncHandler) {
        final GetSupportedResourceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSupportedResourceTypesResult>() {
            @Override
            public GetSupportedResourceTypesResult call() throws Exception {
                GetSupportedResourceTypesResult result = null;

                try {
                    result = executeGetSupportedResourceTypes(finalRequest);
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
    public java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(ListBackupJobsRequest request) {

        return listBackupJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(final ListBackupJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupJobsRequest, ListBackupJobsResult> asyncHandler) {
        final ListBackupJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupJobsResult>() {
            @Override
            public ListBackupJobsResult call() throws Exception {
                ListBackupJobsResult result = null;

                try {
                    result = executeListBackupJobs(finalRequest);
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
    public java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(ListBackupPlanTemplatesRequest request) {

        return listBackupPlanTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(final ListBackupPlanTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupPlanTemplatesRequest, ListBackupPlanTemplatesResult> asyncHandler) {
        final ListBackupPlanTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupPlanTemplatesResult>() {
            @Override
            public ListBackupPlanTemplatesResult call() throws Exception {
                ListBackupPlanTemplatesResult result = null;

                try {
                    result = executeListBackupPlanTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(ListBackupPlanVersionsRequest request) {

        return listBackupPlanVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(final ListBackupPlanVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupPlanVersionsRequest, ListBackupPlanVersionsResult> asyncHandler) {
        final ListBackupPlanVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupPlanVersionsResult>() {
            @Override
            public ListBackupPlanVersionsResult call() throws Exception {
                ListBackupPlanVersionsResult result = null;

                try {
                    result = executeListBackupPlanVersions(finalRequest);
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
    public java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(ListBackupPlansRequest request) {

        return listBackupPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(final ListBackupPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupPlansRequest, ListBackupPlansResult> asyncHandler) {
        final ListBackupPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupPlansResult>() {
            @Override
            public ListBackupPlansResult call() throws Exception {
                ListBackupPlansResult result = null;

                try {
                    result = executeListBackupPlans(finalRequest);
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
    public java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(ListBackupSelectionsRequest request) {

        return listBackupSelectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(final ListBackupSelectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupSelectionsRequest, ListBackupSelectionsResult> asyncHandler) {
        final ListBackupSelectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupSelectionsResult>() {
            @Override
            public ListBackupSelectionsResult call() throws Exception {
                ListBackupSelectionsResult result = null;

                try {
                    result = executeListBackupSelections(finalRequest);
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
    public java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(ListBackupVaultsRequest request) {

        return listBackupVaultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(final ListBackupVaultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackupVaultsRequest, ListBackupVaultsResult> asyncHandler) {
        final ListBackupVaultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackupVaultsResult>() {
            @Override
            public ListBackupVaultsResult call() throws Exception {
                ListBackupVaultsResult result = null;

                try {
                    result = executeListBackupVaults(finalRequest);
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
    public java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(ListProtectedResourcesRequest request) {

        return listProtectedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(final ListProtectedResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProtectedResourcesRequest, ListProtectedResourcesResult> asyncHandler) {
        final ListProtectedResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProtectedResourcesResult>() {
            @Override
            public ListProtectedResourcesResult call() throws Exception {
                ListProtectedResourcesResult result = null;

                try {
                    result = executeListProtectedResources(finalRequest);
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
    public java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            ListRecoveryPointsByBackupVaultRequest request) {

        return listRecoveryPointsByBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            final ListRecoveryPointsByBackupVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByBackupVaultRequest, ListRecoveryPointsByBackupVaultResult> asyncHandler) {
        final ListRecoveryPointsByBackupVaultRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecoveryPointsByBackupVaultResult>() {
            @Override
            public ListRecoveryPointsByBackupVaultResult call() throws Exception {
                ListRecoveryPointsByBackupVaultResult result = null;

                try {
                    result = executeListRecoveryPointsByBackupVault(finalRequest);
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
    public java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(ListRecoveryPointsByResourceRequest request) {

        return listRecoveryPointsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(final ListRecoveryPointsByResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByResourceRequest, ListRecoveryPointsByResourceResult> asyncHandler) {
        final ListRecoveryPointsByResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecoveryPointsByResourceResult>() {
            @Override
            public ListRecoveryPointsByResourceResult call() throws Exception {
                ListRecoveryPointsByResourceResult result = null;

                try {
                    result = executeListRecoveryPointsByResource(finalRequest);
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
    public java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(ListRestoreJobsRequest request) {

        return listRestoreJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(final ListRestoreJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRestoreJobsRequest, ListRestoreJobsResult> asyncHandler) {
        final ListRestoreJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRestoreJobsResult>() {
            @Override
            public ListRestoreJobsResult call() throws Exception {
                ListRestoreJobsResult result = null;

                try {
                    result = executeListRestoreJobs(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(PutBackupVaultAccessPolicyRequest request) {

        return putBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(final PutBackupVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBackupVaultAccessPolicyRequest, PutBackupVaultAccessPolicyResult> asyncHandler) {
        final PutBackupVaultAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBackupVaultAccessPolicyResult>() {
            @Override
            public PutBackupVaultAccessPolicyResult call() throws Exception {
                PutBackupVaultAccessPolicyResult result = null;

                try {
                    result = executePutBackupVaultAccessPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(PutBackupVaultNotificationsRequest request) {

        return putBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(final PutBackupVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBackupVaultNotificationsRequest, PutBackupVaultNotificationsResult> asyncHandler) {
        final PutBackupVaultNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBackupVaultNotificationsResult>() {
            @Override
            public PutBackupVaultNotificationsResult call() throws Exception {
                PutBackupVaultNotificationsResult result = null;

                try {
                    result = executePutBackupVaultNotifications(finalRequest);
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
    public java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(StartBackupJobRequest request) {

        return startBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(final StartBackupJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBackupJobRequest, StartBackupJobResult> asyncHandler) {
        final StartBackupJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBackupJobResult>() {
            @Override
            public StartBackupJobResult call() throws Exception {
                StartBackupJobResult result = null;

                try {
                    result = executeStartBackupJob(finalRequest);
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
    public java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(StartRestoreJobRequest request) {

        return startRestoreJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(final StartRestoreJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRestoreJobRequest, StartRestoreJobResult> asyncHandler) {
        final StartRestoreJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRestoreJobResult>() {
            @Override
            public StartRestoreJobResult call() throws Exception {
                StartRestoreJobResult result = null;

                try {
                    result = executeStartRestoreJob(finalRequest);
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
    public java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(StopBackupJobRequest request) {

        return stopBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(final StopBackupJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopBackupJobRequest, StopBackupJobResult> asyncHandler) {
        final StopBackupJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopBackupJobResult>() {
            @Override
            public StopBackupJobResult call() throws Exception {
                StopBackupJobResult result = null;

                try {
                    result = executeStopBackupJob(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(UpdateBackupPlanRequest request) {

        return updateBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(final UpdateBackupPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBackupPlanRequest, UpdateBackupPlanResult> asyncHandler) {
        final UpdateBackupPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBackupPlanResult>() {
            @Override
            public UpdateBackupPlanResult call() throws Exception {
                UpdateBackupPlanResult result = null;

                try {
                    result = executeUpdateBackupPlan(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(UpdateRecoveryPointLifecycleRequest request) {

        return updateRecoveryPointLifecycleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(final UpdateRecoveryPointLifecycleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecoveryPointLifecycleRequest, UpdateRecoveryPointLifecycleResult> asyncHandler) {
        final UpdateRecoveryPointLifecycleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecoveryPointLifecycleResult>() {
            @Override
            public UpdateRecoveryPointLifecycleResult call() throws Exception {
                UpdateRecoveryPointLifecycleResult result = null;

                try {
                    result = executeUpdateRecoveryPointLifecycle(finalRequest);
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
