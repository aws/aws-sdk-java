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
package com.amazonaws.services.lexmodelsv2;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Lex Models V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexModelsV2AsyncClient extends AmazonLexModelsV2Client implements AmazonLexModelsV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLexModelsV2AsyncClientBuilder asyncBuilder() {
        return AmazonLexModelsV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Lex Models V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLexModelsV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Lex Models V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLexModelsV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCreateCustomVocabularyItemResult> batchCreateCustomVocabularyItemAsync(
            BatchCreateCustomVocabularyItemRequest request) {

        return batchCreateCustomVocabularyItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateCustomVocabularyItemResult> batchCreateCustomVocabularyItemAsync(
            final BatchCreateCustomVocabularyItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateCustomVocabularyItemRequest, BatchCreateCustomVocabularyItemResult> asyncHandler) {
        final BatchCreateCustomVocabularyItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateCustomVocabularyItemResult>() {
            @Override
            public BatchCreateCustomVocabularyItemResult call() throws Exception {
                BatchCreateCustomVocabularyItemResult result = null;

                try {
                    result = executeBatchCreateCustomVocabularyItem(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteCustomVocabularyItemResult> batchDeleteCustomVocabularyItemAsync(
            BatchDeleteCustomVocabularyItemRequest request) {

        return batchDeleteCustomVocabularyItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteCustomVocabularyItemResult> batchDeleteCustomVocabularyItemAsync(
            final BatchDeleteCustomVocabularyItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteCustomVocabularyItemRequest, BatchDeleteCustomVocabularyItemResult> asyncHandler) {
        final BatchDeleteCustomVocabularyItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteCustomVocabularyItemResult>() {
            @Override
            public BatchDeleteCustomVocabularyItemResult call() throws Exception {
                BatchDeleteCustomVocabularyItemResult result = null;

                try {
                    result = executeBatchDeleteCustomVocabularyItem(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateCustomVocabularyItemResult> batchUpdateCustomVocabularyItemAsync(
            BatchUpdateCustomVocabularyItemRequest request) {

        return batchUpdateCustomVocabularyItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateCustomVocabularyItemResult> batchUpdateCustomVocabularyItemAsync(
            final BatchUpdateCustomVocabularyItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateCustomVocabularyItemRequest, BatchUpdateCustomVocabularyItemResult> asyncHandler) {
        final BatchUpdateCustomVocabularyItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateCustomVocabularyItemResult>() {
            @Override
            public BatchUpdateCustomVocabularyItemResult call() throws Exception {
                BatchUpdateCustomVocabularyItemResult result = null;

                try {
                    result = executeBatchUpdateCustomVocabularyItem(finalRequest);
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
    public java.util.concurrent.Future<BuildBotLocaleResult> buildBotLocaleAsync(BuildBotLocaleRequest request) {

        return buildBotLocaleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BuildBotLocaleResult> buildBotLocaleAsync(final BuildBotLocaleRequest request,
            final com.amazonaws.handlers.AsyncHandler<BuildBotLocaleRequest, BuildBotLocaleResult> asyncHandler) {
        final BuildBotLocaleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BuildBotLocaleResult>() {
            @Override
            public BuildBotLocaleResult call() throws Exception {
                BuildBotLocaleResult result = null;

                try {
                    result = executeBuildBotLocale(finalRequest);
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
    public java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest request) {

        return createBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotResult> createBotAsync(final CreateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotRequest, CreateBotResult> asyncHandler) {
        final CreateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotResult>() {
            @Override
            public CreateBotResult call() throws Exception {
                CreateBotResult result = null;

                try {
                    result = executeCreateBot(finalRequest);
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
    public java.util.concurrent.Future<CreateBotAliasResult> createBotAliasAsync(CreateBotAliasRequest request) {

        return createBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotAliasResult> createBotAliasAsync(final CreateBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotAliasRequest, CreateBotAliasResult> asyncHandler) {
        final CreateBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotAliasResult>() {
            @Override
            public CreateBotAliasResult call() throws Exception {
                CreateBotAliasResult result = null;

                try {
                    result = executeCreateBotAlias(finalRequest);
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
    public java.util.concurrent.Future<CreateBotLocaleResult> createBotLocaleAsync(CreateBotLocaleRequest request) {

        return createBotLocaleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotLocaleResult> createBotLocaleAsync(final CreateBotLocaleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotLocaleRequest, CreateBotLocaleResult> asyncHandler) {
        final CreateBotLocaleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotLocaleResult>() {
            @Override
            public CreateBotLocaleResult call() throws Exception {
                CreateBotLocaleResult result = null;

                try {
                    result = executeCreateBotLocale(finalRequest);
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
    public java.util.concurrent.Future<CreateBotReplicaResult> createBotReplicaAsync(CreateBotReplicaRequest request) {

        return createBotReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotReplicaResult> createBotReplicaAsync(final CreateBotReplicaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotReplicaRequest, CreateBotReplicaResult> asyncHandler) {
        final CreateBotReplicaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotReplicaResult>() {
            @Override
            public CreateBotReplicaResult call() throws Exception {
                CreateBotReplicaResult result = null;

                try {
                    result = executeCreateBotReplica(finalRequest);
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
    public java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(CreateBotVersionRequest request) {

        return createBotVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(final CreateBotVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotVersionRequest, CreateBotVersionResult> asyncHandler) {
        final CreateBotVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotVersionResult>() {
            @Override
            public CreateBotVersionResult call() throws Exception {
                CreateBotVersionResult result = null;

                try {
                    result = executeCreateBotVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest request) {

        return createExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(final CreateExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExportRequest, CreateExportResult> asyncHandler) {
        final CreateExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExportResult>() {
            @Override
            public CreateExportResult call() throws Exception {
                CreateExportResult result = null;

                try {
                    result = executeCreateExport(finalRequest);
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
    public java.util.concurrent.Future<CreateIntentResult> createIntentAsync(CreateIntentRequest request) {

        return createIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntentResult> createIntentAsync(final CreateIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntentRequest, CreateIntentResult> asyncHandler) {
        final CreateIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntentResult>() {
            @Override
            public CreateIntentResult call() throws Exception {
                CreateIntentResult result = null;

                try {
                    result = executeCreateIntent(finalRequest);
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
    public java.util.concurrent.Future<CreateResourcePolicyResult> createResourcePolicyAsync(CreateResourcePolicyRequest request) {

        return createResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourcePolicyResult> createResourcePolicyAsync(final CreateResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourcePolicyRequest, CreateResourcePolicyResult> asyncHandler) {
        final CreateResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourcePolicyResult>() {
            @Override
            public CreateResourcePolicyResult call() throws Exception {
                CreateResourcePolicyResult result = null;

                try {
                    result = executeCreateResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<CreateResourcePolicyStatementResult> createResourcePolicyStatementAsync(CreateResourcePolicyStatementRequest request) {

        return createResourcePolicyStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourcePolicyStatementResult> createResourcePolicyStatementAsync(
            final CreateResourcePolicyStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourcePolicyStatementRequest, CreateResourcePolicyStatementResult> asyncHandler) {
        final CreateResourcePolicyStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourcePolicyStatementResult>() {
            @Override
            public CreateResourcePolicyStatementResult call() throws Exception {
                CreateResourcePolicyStatementResult result = null;

                try {
                    result = executeCreateResourcePolicyStatement(finalRequest);
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
    public java.util.concurrent.Future<CreateSlotResult> createSlotAsync(CreateSlotRequest request) {

        return createSlotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlotResult> createSlotAsync(final CreateSlotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSlotRequest, CreateSlotResult> asyncHandler) {
        final CreateSlotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSlotResult>() {
            @Override
            public CreateSlotResult call() throws Exception {
                CreateSlotResult result = null;

                try {
                    result = executeCreateSlot(finalRequest);
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
    public java.util.concurrent.Future<CreateSlotTypeResult> createSlotTypeAsync(CreateSlotTypeRequest request) {

        return createSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlotTypeResult> createSlotTypeAsync(final CreateSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSlotTypeRequest, CreateSlotTypeResult> asyncHandler) {
        final CreateSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSlotTypeResult>() {
            @Override
            public CreateSlotTypeResult call() throws Exception {
                CreateSlotTypeResult result = null;

                try {
                    result = executeCreateSlotType(finalRequest);
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
    public java.util.concurrent.Future<CreateTestSetDiscrepancyReportResult> createTestSetDiscrepancyReportAsync(CreateTestSetDiscrepancyReportRequest request) {

        return createTestSetDiscrepancyReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTestSetDiscrepancyReportResult> createTestSetDiscrepancyReportAsync(
            final CreateTestSetDiscrepancyReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTestSetDiscrepancyReportRequest, CreateTestSetDiscrepancyReportResult> asyncHandler) {
        final CreateTestSetDiscrepancyReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTestSetDiscrepancyReportResult>() {
            @Override
            public CreateTestSetDiscrepancyReportResult call() throws Exception {
                CreateTestSetDiscrepancyReportResult result = null;

                try {
                    result = executeCreateTestSetDiscrepancyReport(finalRequest);
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
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest request) {

        return createUploadUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(final CreateUploadUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUploadUrlRequest, CreateUploadUrlResult> asyncHandler) {
        final CreateUploadUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUploadUrlResult>() {
            @Override
            public CreateUploadUrlResult call() throws Exception {
                CreateUploadUrlResult result = null;

                try {
                    result = executeCreateUploadUrl(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(DeleteBotRequest request) {

        return deleteBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(final DeleteBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotRequest, DeleteBotResult> asyncHandler) {
        final DeleteBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotResult>() {
            @Override
            public DeleteBotResult call() throws Exception {
                DeleteBotResult result = null;

                try {
                    result = executeDeleteBot(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(DeleteBotAliasRequest request) {

        return deleteBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(final DeleteBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotAliasRequest, DeleteBotAliasResult> asyncHandler) {
        final DeleteBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotAliasResult>() {
            @Override
            public DeleteBotAliasResult call() throws Exception {
                DeleteBotAliasResult result = null;

                try {
                    result = executeDeleteBotAlias(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotLocaleResult> deleteBotLocaleAsync(DeleteBotLocaleRequest request) {

        return deleteBotLocaleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotLocaleResult> deleteBotLocaleAsync(final DeleteBotLocaleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotLocaleRequest, DeleteBotLocaleResult> asyncHandler) {
        final DeleteBotLocaleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotLocaleResult>() {
            @Override
            public DeleteBotLocaleResult call() throws Exception {
                DeleteBotLocaleResult result = null;

                try {
                    result = executeDeleteBotLocale(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotReplicaResult> deleteBotReplicaAsync(DeleteBotReplicaRequest request) {

        return deleteBotReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotReplicaResult> deleteBotReplicaAsync(final DeleteBotReplicaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotReplicaRequest, DeleteBotReplicaResult> asyncHandler) {
        final DeleteBotReplicaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotReplicaResult>() {
            @Override
            public DeleteBotReplicaResult call() throws Exception {
                DeleteBotReplicaResult result = null;

                try {
                    result = executeDeleteBotReplica(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(DeleteBotVersionRequest request) {

        return deleteBotVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(final DeleteBotVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotVersionRequest, DeleteBotVersionResult> asyncHandler) {
        final DeleteBotVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotVersionResult>() {
            @Override
            public DeleteBotVersionResult call() throws Exception {
                DeleteBotVersionResult result = null;

                try {
                    result = executeDeleteBotVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomVocabularyResult> deleteCustomVocabularyAsync(DeleteCustomVocabularyRequest request) {

        return deleteCustomVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomVocabularyResult> deleteCustomVocabularyAsync(final DeleteCustomVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomVocabularyRequest, DeleteCustomVocabularyResult> asyncHandler) {
        final DeleteCustomVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomVocabularyResult>() {
            @Override
            public DeleteCustomVocabularyResult call() throws Exception {
                DeleteCustomVocabularyResult result = null;

                try {
                    result = executeDeleteCustomVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest request) {

        return deleteExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(final DeleteExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExportRequest, DeleteExportResult> asyncHandler) {
        final DeleteExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExportResult>() {
            @Override
            public DeleteExportResult call() throws Exception {
                DeleteExportResult result = null;

                try {
                    result = executeDeleteExport(finalRequest);
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
    public java.util.concurrent.Future<DeleteImportResult> deleteImportAsync(DeleteImportRequest request) {

        return deleteImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImportResult> deleteImportAsync(final DeleteImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImportRequest, DeleteImportResult> asyncHandler) {
        final DeleteImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImportResult>() {
            @Override
            public DeleteImportResult call() throws Exception {
                DeleteImportResult result = null;

                try {
                    result = executeDeleteImport(finalRequest);
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
    public java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(DeleteIntentRequest request) {

        return deleteIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(final DeleteIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntentRequest, DeleteIntentResult> asyncHandler) {
        final DeleteIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntentResult>() {
            @Override
            public DeleteIntentResult call() throws Exception {
                DeleteIntentResult result = null;

                try {
                    result = executeDeleteIntent(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyStatementResult> deleteResourcePolicyStatementAsync(DeleteResourcePolicyStatementRequest request) {

        return deleteResourcePolicyStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyStatementResult> deleteResourcePolicyStatementAsync(
            final DeleteResourcePolicyStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyStatementRequest, DeleteResourcePolicyStatementResult> asyncHandler) {
        final DeleteResourcePolicyStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyStatementResult>() {
            @Override
            public DeleteResourcePolicyStatementResult call() throws Exception {
                DeleteResourcePolicyStatementResult result = null;

                try {
                    result = executeDeleteResourcePolicyStatement(finalRequest);
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
    public java.util.concurrent.Future<DeleteSlotResult> deleteSlotAsync(DeleteSlotRequest request) {

        return deleteSlotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlotResult> deleteSlotAsync(final DeleteSlotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlotRequest, DeleteSlotResult> asyncHandler) {
        final DeleteSlotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlotResult>() {
            @Override
            public DeleteSlotResult call() throws Exception {
                DeleteSlotResult result = null;

                try {
                    result = executeDeleteSlot(finalRequest);
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
    public java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(DeleteSlotTypeRequest request) {

        return deleteSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(final DeleteSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlotTypeRequest, DeleteSlotTypeResult> asyncHandler) {
        final DeleteSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlotTypeResult>() {
            @Override
            public DeleteSlotTypeResult call() throws Exception {
                DeleteSlotTypeResult result = null;

                try {
                    result = executeDeleteSlotType(finalRequest);
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
    public java.util.concurrent.Future<DeleteTestSetResult> deleteTestSetAsync(DeleteTestSetRequest request) {

        return deleteTestSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTestSetResult> deleteTestSetAsync(final DeleteTestSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTestSetRequest, DeleteTestSetResult> asyncHandler) {
        final DeleteTestSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTestSetResult>() {
            @Override
            public DeleteTestSetResult call() throws Exception {
                DeleteTestSetResult result = null;

                try {
                    result = executeDeleteTestSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(DeleteUtterancesRequest request) {

        return deleteUtterancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(final DeleteUtterancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUtterancesRequest, DeleteUtterancesResult> asyncHandler) {
        final DeleteUtterancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUtterancesResult>() {
            @Override
            public DeleteUtterancesResult call() throws Exception {
                DeleteUtterancesResult result = null;

                try {
                    result = executeDeleteUtterances(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotResult> describeBotAsync(DescribeBotRequest request) {

        return describeBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotResult> describeBotAsync(final DescribeBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotRequest, DescribeBotResult> asyncHandler) {
        final DescribeBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotResult>() {
            @Override
            public DescribeBotResult call() throws Exception {
                DescribeBotResult result = null;

                try {
                    result = executeDescribeBot(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotAliasResult> describeBotAliasAsync(DescribeBotAliasRequest request) {

        return describeBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotAliasResult> describeBotAliasAsync(final DescribeBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotAliasRequest, DescribeBotAliasResult> asyncHandler) {
        final DescribeBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotAliasResult>() {
            @Override
            public DescribeBotAliasResult call() throws Exception {
                DescribeBotAliasResult result = null;

                try {
                    result = executeDescribeBotAlias(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotLocaleResult> describeBotLocaleAsync(DescribeBotLocaleRequest request) {

        return describeBotLocaleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotLocaleResult> describeBotLocaleAsync(final DescribeBotLocaleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotLocaleRequest, DescribeBotLocaleResult> asyncHandler) {
        final DescribeBotLocaleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotLocaleResult>() {
            @Override
            public DescribeBotLocaleResult call() throws Exception {
                DescribeBotLocaleResult result = null;

                try {
                    result = executeDescribeBotLocale(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotRecommendationResult> describeBotRecommendationAsync(DescribeBotRecommendationRequest request) {

        return describeBotRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotRecommendationResult> describeBotRecommendationAsync(final DescribeBotRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotRecommendationRequest, DescribeBotRecommendationResult> asyncHandler) {
        final DescribeBotRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotRecommendationResult>() {
            @Override
            public DescribeBotRecommendationResult call() throws Exception {
                DescribeBotRecommendationResult result = null;

                try {
                    result = executeDescribeBotRecommendation(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotReplicaResult> describeBotReplicaAsync(DescribeBotReplicaRequest request) {

        return describeBotReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotReplicaResult> describeBotReplicaAsync(final DescribeBotReplicaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotReplicaRequest, DescribeBotReplicaResult> asyncHandler) {
        final DescribeBotReplicaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotReplicaResult>() {
            @Override
            public DescribeBotReplicaResult call() throws Exception {
                DescribeBotReplicaResult result = null;

                try {
                    result = executeDescribeBotReplica(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotResourceGenerationResult> describeBotResourceGenerationAsync(DescribeBotResourceGenerationRequest request) {

        return describeBotResourceGenerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotResourceGenerationResult> describeBotResourceGenerationAsync(
            final DescribeBotResourceGenerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotResourceGenerationRequest, DescribeBotResourceGenerationResult> asyncHandler) {
        final DescribeBotResourceGenerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotResourceGenerationResult>() {
            @Override
            public DescribeBotResourceGenerationResult call() throws Exception {
                DescribeBotResourceGenerationResult result = null;

                try {
                    result = executeDescribeBotResourceGeneration(finalRequest);
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
    public java.util.concurrent.Future<DescribeBotVersionResult> describeBotVersionAsync(DescribeBotVersionRequest request) {

        return describeBotVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBotVersionResult> describeBotVersionAsync(final DescribeBotVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBotVersionRequest, DescribeBotVersionResult> asyncHandler) {
        final DescribeBotVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBotVersionResult>() {
            @Override
            public DescribeBotVersionResult call() throws Exception {
                DescribeBotVersionResult result = null;

                try {
                    result = executeDescribeBotVersion(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomVocabularyMetadataResult> describeCustomVocabularyMetadataAsync(
            DescribeCustomVocabularyMetadataRequest request) {

        return describeCustomVocabularyMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomVocabularyMetadataResult> describeCustomVocabularyMetadataAsync(
            final DescribeCustomVocabularyMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomVocabularyMetadataRequest, DescribeCustomVocabularyMetadataResult> asyncHandler) {
        final DescribeCustomVocabularyMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomVocabularyMetadataResult>() {
            @Override
            public DescribeCustomVocabularyMetadataResult call() throws Exception {
                DescribeCustomVocabularyMetadataResult result = null;

                try {
                    result = executeDescribeCustomVocabularyMetadata(finalRequest);
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
    public java.util.concurrent.Future<DescribeExportResult> describeExportAsync(DescribeExportRequest request) {

        return describeExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportResult> describeExportAsync(final DescribeExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportRequest, DescribeExportResult> asyncHandler) {
        final DescribeExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportResult>() {
            @Override
            public DescribeExportResult call() throws Exception {
                DescribeExportResult result = null;

                try {
                    result = executeDescribeExport(finalRequest);
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
    public java.util.concurrent.Future<DescribeImportResult> describeImportAsync(DescribeImportRequest request) {

        return describeImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportResult> describeImportAsync(final DescribeImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImportRequest, DescribeImportResult> asyncHandler) {
        final DescribeImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportResult>() {
            @Override
            public DescribeImportResult call() throws Exception {
                DescribeImportResult result = null;

                try {
                    result = executeDescribeImport(finalRequest);
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
    public java.util.concurrent.Future<DescribeIntentResult> describeIntentAsync(DescribeIntentRequest request) {

        return describeIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIntentResult> describeIntentAsync(final DescribeIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIntentRequest, DescribeIntentResult> asyncHandler) {
        final DescribeIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIntentResult>() {
            @Override
            public DescribeIntentResult call() throws Exception {
                DescribeIntentResult result = null;

                try {
                    result = executeDescribeIntent(finalRequest);
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
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest request) {

        return describeResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(final DescribeResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourcePolicyRequest, DescribeResourcePolicyResult> asyncHandler) {
        final DescribeResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourcePolicyResult>() {
            @Override
            public DescribeResourcePolicyResult call() throws Exception {
                DescribeResourcePolicyResult result = null;

                try {
                    result = executeDescribeResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeSlotResult> describeSlotAsync(DescribeSlotRequest request) {

        return describeSlotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlotResult> describeSlotAsync(final DescribeSlotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSlotRequest, DescribeSlotResult> asyncHandler) {
        final DescribeSlotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSlotResult>() {
            @Override
            public DescribeSlotResult call() throws Exception {
                DescribeSlotResult result = null;

                try {
                    result = executeDescribeSlot(finalRequest);
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
    public java.util.concurrent.Future<DescribeSlotTypeResult> describeSlotTypeAsync(DescribeSlotTypeRequest request) {

        return describeSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlotTypeResult> describeSlotTypeAsync(final DescribeSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSlotTypeRequest, DescribeSlotTypeResult> asyncHandler) {
        final DescribeSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSlotTypeResult>() {
            @Override
            public DescribeSlotTypeResult call() throws Exception {
                DescribeSlotTypeResult result = null;

                try {
                    result = executeDescribeSlotType(finalRequest);
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
    public java.util.concurrent.Future<DescribeTestExecutionResult> describeTestExecutionAsync(DescribeTestExecutionRequest request) {

        return describeTestExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestExecutionResult> describeTestExecutionAsync(final DescribeTestExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTestExecutionRequest, DescribeTestExecutionResult> asyncHandler) {
        final DescribeTestExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTestExecutionResult>() {
            @Override
            public DescribeTestExecutionResult call() throws Exception {
                DescribeTestExecutionResult result = null;

                try {
                    result = executeDescribeTestExecution(finalRequest);
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
    public java.util.concurrent.Future<DescribeTestSetResult> describeTestSetAsync(DescribeTestSetRequest request) {

        return describeTestSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestSetResult> describeTestSetAsync(final DescribeTestSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTestSetRequest, DescribeTestSetResult> asyncHandler) {
        final DescribeTestSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTestSetResult>() {
            @Override
            public DescribeTestSetResult call() throws Exception {
                DescribeTestSetResult result = null;

                try {
                    result = executeDescribeTestSet(finalRequest);
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
    public java.util.concurrent.Future<DescribeTestSetDiscrepancyReportResult> describeTestSetDiscrepancyReportAsync(
            DescribeTestSetDiscrepancyReportRequest request) {

        return describeTestSetDiscrepancyReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestSetDiscrepancyReportResult> describeTestSetDiscrepancyReportAsync(
            final DescribeTestSetDiscrepancyReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTestSetDiscrepancyReportRequest, DescribeTestSetDiscrepancyReportResult> asyncHandler) {
        final DescribeTestSetDiscrepancyReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTestSetDiscrepancyReportResult>() {
            @Override
            public DescribeTestSetDiscrepancyReportResult call() throws Exception {
                DescribeTestSetDiscrepancyReportResult result = null;

                try {
                    result = executeDescribeTestSetDiscrepancyReport(finalRequest);
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
    public java.util.concurrent.Future<DescribeTestSetGenerationResult> describeTestSetGenerationAsync(DescribeTestSetGenerationRequest request) {

        return describeTestSetGenerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestSetGenerationResult> describeTestSetGenerationAsync(final DescribeTestSetGenerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTestSetGenerationRequest, DescribeTestSetGenerationResult> asyncHandler) {
        final DescribeTestSetGenerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTestSetGenerationResult>() {
            @Override
            public DescribeTestSetGenerationResult call() throws Exception {
                DescribeTestSetGenerationResult result = null;

                try {
                    result = executeDescribeTestSetGeneration(finalRequest);
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
    public java.util.concurrent.Future<GenerateBotElementResult> generateBotElementAsync(GenerateBotElementRequest request) {

        return generateBotElementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateBotElementResult> generateBotElementAsync(final GenerateBotElementRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateBotElementRequest, GenerateBotElementResult> asyncHandler) {
        final GenerateBotElementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateBotElementResult>() {
            @Override
            public GenerateBotElementResult call() throws Exception {
                GenerateBotElementResult result = null;

                try {
                    result = executeGenerateBotElement(finalRequest);
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
    public java.util.concurrent.Future<GetTestExecutionArtifactsUrlResult> getTestExecutionArtifactsUrlAsync(GetTestExecutionArtifactsUrlRequest request) {

        return getTestExecutionArtifactsUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestExecutionArtifactsUrlResult> getTestExecutionArtifactsUrlAsync(final GetTestExecutionArtifactsUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestExecutionArtifactsUrlRequest, GetTestExecutionArtifactsUrlResult> asyncHandler) {
        final GetTestExecutionArtifactsUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestExecutionArtifactsUrlResult>() {
            @Override
            public GetTestExecutionArtifactsUrlResult call() throws Exception {
                GetTestExecutionArtifactsUrlResult result = null;

                try {
                    result = executeGetTestExecutionArtifactsUrl(finalRequest);
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
    public java.util.concurrent.Future<ListAggregatedUtterancesResult> listAggregatedUtterancesAsync(ListAggregatedUtterancesRequest request) {

        return listAggregatedUtterancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAggregatedUtterancesResult> listAggregatedUtterancesAsync(final ListAggregatedUtterancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAggregatedUtterancesRequest, ListAggregatedUtterancesResult> asyncHandler) {
        final ListAggregatedUtterancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAggregatedUtterancesResult>() {
            @Override
            public ListAggregatedUtterancesResult call() throws Exception {
                ListAggregatedUtterancesResult result = null;

                try {
                    result = executeListAggregatedUtterances(finalRequest);
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
    public java.util.concurrent.Future<ListBotAliasReplicasResult> listBotAliasReplicasAsync(ListBotAliasReplicasRequest request) {

        return listBotAliasReplicasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotAliasReplicasResult> listBotAliasReplicasAsync(final ListBotAliasReplicasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotAliasReplicasRequest, ListBotAliasReplicasResult> asyncHandler) {
        final ListBotAliasReplicasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotAliasReplicasResult>() {
            @Override
            public ListBotAliasReplicasResult call() throws Exception {
                ListBotAliasReplicasResult result = null;

                try {
                    result = executeListBotAliasReplicas(finalRequest);
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
    public java.util.concurrent.Future<ListBotAliasesResult> listBotAliasesAsync(ListBotAliasesRequest request) {

        return listBotAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotAliasesResult> listBotAliasesAsync(final ListBotAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotAliasesRequest, ListBotAliasesResult> asyncHandler) {
        final ListBotAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotAliasesResult>() {
            @Override
            public ListBotAliasesResult call() throws Exception {
                ListBotAliasesResult result = null;

                try {
                    result = executeListBotAliases(finalRequest);
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
    public java.util.concurrent.Future<ListBotLocalesResult> listBotLocalesAsync(ListBotLocalesRequest request) {

        return listBotLocalesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotLocalesResult> listBotLocalesAsync(final ListBotLocalesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotLocalesRequest, ListBotLocalesResult> asyncHandler) {
        final ListBotLocalesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotLocalesResult>() {
            @Override
            public ListBotLocalesResult call() throws Exception {
                ListBotLocalesResult result = null;

                try {
                    result = executeListBotLocales(finalRequest);
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
    public java.util.concurrent.Future<ListBotRecommendationsResult> listBotRecommendationsAsync(ListBotRecommendationsRequest request) {

        return listBotRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotRecommendationsResult> listBotRecommendationsAsync(final ListBotRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotRecommendationsRequest, ListBotRecommendationsResult> asyncHandler) {
        final ListBotRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotRecommendationsResult>() {
            @Override
            public ListBotRecommendationsResult call() throws Exception {
                ListBotRecommendationsResult result = null;

                try {
                    result = executeListBotRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ListBotReplicasResult> listBotReplicasAsync(ListBotReplicasRequest request) {

        return listBotReplicasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotReplicasResult> listBotReplicasAsync(final ListBotReplicasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotReplicasRequest, ListBotReplicasResult> asyncHandler) {
        final ListBotReplicasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotReplicasResult>() {
            @Override
            public ListBotReplicasResult call() throws Exception {
                ListBotReplicasResult result = null;

                try {
                    result = executeListBotReplicas(finalRequest);
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
    public java.util.concurrent.Future<ListBotResourceGenerationsResult> listBotResourceGenerationsAsync(ListBotResourceGenerationsRequest request) {

        return listBotResourceGenerationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotResourceGenerationsResult> listBotResourceGenerationsAsync(final ListBotResourceGenerationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotResourceGenerationsRequest, ListBotResourceGenerationsResult> asyncHandler) {
        final ListBotResourceGenerationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotResourceGenerationsResult>() {
            @Override
            public ListBotResourceGenerationsResult call() throws Exception {
                ListBotResourceGenerationsResult result = null;

                try {
                    result = executeListBotResourceGenerations(finalRequest);
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
    public java.util.concurrent.Future<ListBotVersionReplicasResult> listBotVersionReplicasAsync(ListBotVersionReplicasRequest request) {

        return listBotVersionReplicasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotVersionReplicasResult> listBotVersionReplicasAsync(final ListBotVersionReplicasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotVersionReplicasRequest, ListBotVersionReplicasResult> asyncHandler) {
        final ListBotVersionReplicasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotVersionReplicasResult>() {
            @Override
            public ListBotVersionReplicasResult call() throws Exception {
                ListBotVersionReplicasResult result = null;

                try {
                    result = executeListBotVersionReplicas(finalRequest);
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
    public java.util.concurrent.Future<ListBotVersionsResult> listBotVersionsAsync(ListBotVersionsRequest request) {

        return listBotVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotVersionsResult> listBotVersionsAsync(final ListBotVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotVersionsRequest, ListBotVersionsResult> asyncHandler) {
        final ListBotVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotVersionsResult>() {
            @Override
            public ListBotVersionsResult call() throws Exception {
                ListBotVersionsResult result = null;

                try {
                    result = executeListBotVersions(finalRequest);
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
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest request) {

        return listBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(final ListBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler) {
        final ListBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotsResult>() {
            @Override
            public ListBotsResult call() throws Exception {
                ListBotsResult result = null;

                try {
                    result = executeListBots(finalRequest);
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
    public java.util.concurrent.Future<ListBuiltInIntentsResult> listBuiltInIntentsAsync(ListBuiltInIntentsRequest request) {

        return listBuiltInIntentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuiltInIntentsResult> listBuiltInIntentsAsync(final ListBuiltInIntentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuiltInIntentsRequest, ListBuiltInIntentsResult> asyncHandler) {
        final ListBuiltInIntentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuiltInIntentsResult>() {
            @Override
            public ListBuiltInIntentsResult call() throws Exception {
                ListBuiltInIntentsResult result = null;

                try {
                    result = executeListBuiltInIntents(finalRequest);
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
    public java.util.concurrent.Future<ListBuiltInSlotTypesResult> listBuiltInSlotTypesAsync(ListBuiltInSlotTypesRequest request) {

        return listBuiltInSlotTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuiltInSlotTypesResult> listBuiltInSlotTypesAsync(final ListBuiltInSlotTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuiltInSlotTypesRequest, ListBuiltInSlotTypesResult> asyncHandler) {
        final ListBuiltInSlotTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuiltInSlotTypesResult>() {
            @Override
            public ListBuiltInSlotTypesResult call() throws Exception {
                ListBuiltInSlotTypesResult result = null;

                try {
                    result = executeListBuiltInSlotTypes(finalRequest);
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
    public java.util.concurrent.Future<ListCustomVocabularyItemsResult> listCustomVocabularyItemsAsync(ListCustomVocabularyItemsRequest request) {

        return listCustomVocabularyItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomVocabularyItemsResult> listCustomVocabularyItemsAsync(final ListCustomVocabularyItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomVocabularyItemsRequest, ListCustomVocabularyItemsResult> asyncHandler) {
        final ListCustomVocabularyItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomVocabularyItemsResult>() {
            @Override
            public ListCustomVocabularyItemsResult call() throws Exception {
                ListCustomVocabularyItemsResult result = null;

                try {
                    result = executeListCustomVocabularyItems(finalRequest);
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
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request) {

        return listExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(final ListExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler) {
        final ListExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExportsResult>() {
            @Override
            public ListExportsResult call() throws Exception {
                ListExportsResult result = null;

                try {
                    result = executeListExports(finalRequest);
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
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request) {

        return listImportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(final ListImportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler) {
        final ListImportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImportsResult>() {
            @Override
            public ListImportsResult call() throws Exception {
                ListImportsResult result = null;

                try {
                    result = executeListImports(finalRequest);
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
    public java.util.concurrent.Future<ListIntentMetricsResult> listIntentMetricsAsync(ListIntentMetricsRequest request) {

        return listIntentMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntentMetricsResult> listIntentMetricsAsync(final ListIntentMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntentMetricsRequest, ListIntentMetricsResult> asyncHandler) {
        final ListIntentMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntentMetricsResult>() {
            @Override
            public ListIntentMetricsResult call() throws Exception {
                ListIntentMetricsResult result = null;

                try {
                    result = executeListIntentMetrics(finalRequest);
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
    public java.util.concurrent.Future<ListIntentPathsResult> listIntentPathsAsync(ListIntentPathsRequest request) {

        return listIntentPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntentPathsResult> listIntentPathsAsync(final ListIntentPathsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntentPathsRequest, ListIntentPathsResult> asyncHandler) {
        final ListIntentPathsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntentPathsResult>() {
            @Override
            public ListIntentPathsResult call() throws Exception {
                ListIntentPathsResult result = null;

                try {
                    result = executeListIntentPaths(finalRequest);
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
    public java.util.concurrent.Future<ListIntentStageMetricsResult> listIntentStageMetricsAsync(ListIntentStageMetricsRequest request) {

        return listIntentStageMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntentStageMetricsResult> listIntentStageMetricsAsync(final ListIntentStageMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntentStageMetricsRequest, ListIntentStageMetricsResult> asyncHandler) {
        final ListIntentStageMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntentStageMetricsResult>() {
            @Override
            public ListIntentStageMetricsResult call() throws Exception {
                ListIntentStageMetricsResult result = null;

                try {
                    result = executeListIntentStageMetrics(finalRequest);
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
    public java.util.concurrent.Future<ListIntentsResult> listIntentsAsync(ListIntentsRequest request) {

        return listIntentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntentsResult> listIntentsAsync(final ListIntentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntentsRequest, ListIntentsResult> asyncHandler) {
        final ListIntentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntentsResult>() {
            @Override
            public ListIntentsResult call() throws Exception {
                ListIntentsResult result = null;

                try {
                    result = executeListIntents(finalRequest);
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
    public java.util.concurrent.Future<ListRecommendedIntentsResult> listRecommendedIntentsAsync(ListRecommendedIntentsRequest request) {

        return listRecommendedIntentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendedIntentsResult> listRecommendedIntentsAsync(final ListRecommendedIntentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendedIntentsRequest, ListRecommendedIntentsResult> asyncHandler) {
        final ListRecommendedIntentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendedIntentsResult>() {
            @Override
            public ListRecommendedIntentsResult call() throws Exception {
                ListRecommendedIntentsResult result = null;

                try {
                    result = executeListRecommendedIntents(finalRequest);
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
    public java.util.concurrent.Future<ListSessionAnalyticsDataResult> listSessionAnalyticsDataAsync(ListSessionAnalyticsDataRequest request) {

        return listSessionAnalyticsDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionAnalyticsDataResult> listSessionAnalyticsDataAsync(final ListSessionAnalyticsDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSessionAnalyticsDataRequest, ListSessionAnalyticsDataResult> asyncHandler) {
        final ListSessionAnalyticsDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSessionAnalyticsDataResult>() {
            @Override
            public ListSessionAnalyticsDataResult call() throws Exception {
                ListSessionAnalyticsDataResult result = null;

                try {
                    result = executeListSessionAnalyticsData(finalRequest);
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
    public java.util.concurrent.Future<ListSessionMetricsResult> listSessionMetricsAsync(ListSessionMetricsRequest request) {

        return listSessionMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionMetricsResult> listSessionMetricsAsync(final ListSessionMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSessionMetricsRequest, ListSessionMetricsResult> asyncHandler) {
        final ListSessionMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSessionMetricsResult>() {
            @Override
            public ListSessionMetricsResult call() throws Exception {
                ListSessionMetricsResult result = null;

                try {
                    result = executeListSessionMetrics(finalRequest);
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
    public java.util.concurrent.Future<ListSlotTypesResult> listSlotTypesAsync(ListSlotTypesRequest request) {

        return listSlotTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlotTypesResult> listSlotTypesAsync(final ListSlotTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSlotTypesRequest, ListSlotTypesResult> asyncHandler) {
        final ListSlotTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSlotTypesResult>() {
            @Override
            public ListSlotTypesResult call() throws Exception {
                ListSlotTypesResult result = null;

                try {
                    result = executeListSlotTypes(finalRequest);
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
    public java.util.concurrent.Future<ListSlotsResult> listSlotsAsync(ListSlotsRequest request) {

        return listSlotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlotsResult> listSlotsAsync(final ListSlotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSlotsRequest, ListSlotsResult> asyncHandler) {
        final ListSlotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSlotsResult>() {
            @Override
            public ListSlotsResult call() throws Exception {
                ListSlotsResult result = null;

                try {
                    result = executeListSlots(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<ListTestExecutionResultItemsResult> listTestExecutionResultItemsAsync(ListTestExecutionResultItemsRequest request) {

        return listTestExecutionResultItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestExecutionResultItemsResult> listTestExecutionResultItemsAsync(final ListTestExecutionResultItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestExecutionResultItemsRequest, ListTestExecutionResultItemsResult> asyncHandler) {
        final ListTestExecutionResultItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestExecutionResultItemsResult>() {
            @Override
            public ListTestExecutionResultItemsResult call() throws Exception {
                ListTestExecutionResultItemsResult result = null;

                try {
                    result = executeListTestExecutionResultItems(finalRequest);
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
    public java.util.concurrent.Future<ListTestExecutionsResult> listTestExecutionsAsync(ListTestExecutionsRequest request) {

        return listTestExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestExecutionsResult> listTestExecutionsAsync(final ListTestExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestExecutionsRequest, ListTestExecutionsResult> asyncHandler) {
        final ListTestExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestExecutionsResult>() {
            @Override
            public ListTestExecutionsResult call() throws Exception {
                ListTestExecutionsResult result = null;

                try {
                    result = executeListTestExecutions(finalRequest);
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
    public java.util.concurrent.Future<ListTestSetRecordsResult> listTestSetRecordsAsync(ListTestSetRecordsRequest request) {

        return listTestSetRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestSetRecordsResult> listTestSetRecordsAsync(final ListTestSetRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestSetRecordsRequest, ListTestSetRecordsResult> asyncHandler) {
        final ListTestSetRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestSetRecordsResult>() {
            @Override
            public ListTestSetRecordsResult call() throws Exception {
                ListTestSetRecordsResult result = null;

                try {
                    result = executeListTestSetRecords(finalRequest);
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
    public java.util.concurrent.Future<ListTestSetsResult> listTestSetsAsync(ListTestSetsRequest request) {

        return listTestSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestSetsResult> listTestSetsAsync(final ListTestSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestSetsRequest, ListTestSetsResult> asyncHandler) {
        final ListTestSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestSetsResult>() {
            @Override
            public ListTestSetsResult call() throws Exception {
                ListTestSetsResult result = null;

                try {
                    result = executeListTestSets(finalRequest);
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
    public java.util.concurrent.Future<ListUtteranceAnalyticsDataResult> listUtteranceAnalyticsDataAsync(ListUtteranceAnalyticsDataRequest request) {

        return listUtteranceAnalyticsDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUtteranceAnalyticsDataResult> listUtteranceAnalyticsDataAsync(final ListUtteranceAnalyticsDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUtteranceAnalyticsDataRequest, ListUtteranceAnalyticsDataResult> asyncHandler) {
        final ListUtteranceAnalyticsDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUtteranceAnalyticsDataResult>() {
            @Override
            public ListUtteranceAnalyticsDataResult call() throws Exception {
                ListUtteranceAnalyticsDataResult result = null;

                try {
                    result = executeListUtteranceAnalyticsData(finalRequest);
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
    public java.util.concurrent.Future<ListUtteranceMetricsResult> listUtteranceMetricsAsync(ListUtteranceMetricsRequest request) {

        return listUtteranceMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUtteranceMetricsResult> listUtteranceMetricsAsync(final ListUtteranceMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUtteranceMetricsRequest, ListUtteranceMetricsResult> asyncHandler) {
        final ListUtteranceMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUtteranceMetricsResult>() {
            @Override
            public ListUtteranceMetricsResult call() throws Exception {
                ListUtteranceMetricsResult result = null;

                try {
                    result = executeListUtteranceMetrics(finalRequest);
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
    public java.util.concurrent.Future<SearchAssociatedTranscriptsResult> searchAssociatedTranscriptsAsync(SearchAssociatedTranscriptsRequest request) {

        return searchAssociatedTranscriptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAssociatedTranscriptsResult> searchAssociatedTranscriptsAsync(final SearchAssociatedTranscriptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAssociatedTranscriptsRequest, SearchAssociatedTranscriptsResult> asyncHandler) {
        final SearchAssociatedTranscriptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAssociatedTranscriptsResult>() {
            @Override
            public SearchAssociatedTranscriptsResult call() throws Exception {
                SearchAssociatedTranscriptsResult result = null;

                try {
                    result = executeSearchAssociatedTranscripts(finalRequest);
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
    public java.util.concurrent.Future<StartBotRecommendationResult> startBotRecommendationAsync(StartBotRecommendationRequest request) {

        return startBotRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBotRecommendationResult> startBotRecommendationAsync(final StartBotRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBotRecommendationRequest, StartBotRecommendationResult> asyncHandler) {
        final StartBotRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBotRecommendationResult>() {
            @Override
            public StartBotRecommendationResult call() throws Exception {
                StartBotRecommendationResult result = null;

                try {
                    result = executeStartBotRecommendation(finalRequest);
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
    public java.util.concurrent.Future<StartBotResourceGenerationResult> startBotResourceGenerationAsync(StartBotResourceGenerationRequest request) {

        return startBotResourceGenerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBotResourceGenerationResult> startBotResourceGenerationAsync(final StartBotResourceGenerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBotResourceGenerationRequest, StartBotResourceGenerationResult> asyncHandler) {
        final StartBotResourceGenerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBotResourceGenerationResult>() {
            @Override
            public StartBotResourceGenerationResult call() throws Exception {
                StartBotResourceGenerationResult result = null;

                try {
                    result = executeStartBotResourceGeneration(finalRequest);
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
    public java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest request) {

        return startImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportResult> startImportAsync(final StartImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler) {
        final StartImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImportResult>() {
            @Override
            public StartImportResult call() throws Exception {
                StartImportResult result = null;

                try {
                    result = executeStartImport(finalRequest);
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
    public java.util.concurrent.Future<StartTestExecutionResult> startTestExecutionAsync(StartTestExecutionRequest request) {

        return startTestExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestExecutionResult> startTestExecutionAsync(final StartTestExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTestExecutionRequest, StartTestExecutionResult> asyncHandler) {
        final StartTestExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTestExecutionResult>() {
            @Override
            public StartTestExecutionResult call() throws Exception {
                StartTestExecutionResult result = null;

                try {
                    result = executeStartTestExecution(finalRequest);
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
    public java.util.concurrent.Future<StartTestSetGenerationResult> startTestSetGenerationAsync(StartTestSetGenerationRequest request) {

        return startTestSetGenerationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestSetGenerationResult> startTestSetGenerationAsync(final StartTestSetGenerationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTestSetGenerationRequest, StartTestSetGenerationResult> asyncHandler) {
        final StartTestSetGenerationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTestSetGenerationResult>() {
            @Override
            public StartTestSetGenerationResult call() throws Exception {
                StartTestSetGenerationResult result = null;

                try {
                    result = executeStartTestSetGeneration(finalRequest);
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
    public java.util.concurrent.Future<StopBotRecommendationResult> stopBotRecommendationAsync(StopBotRecommendationRequest request) {

        return stopBotRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBotRecommendationResult> stopBotRecommendationAsync(final StopBotRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopBotRecommendationRequest, StopBotRecommendationResult> asyncHandler) {
        final StopBotRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopBotRecommendationResult>() {
            @Override
            public StopBotRecommendationResult call() throws Exception {
                StopBotRecommendationResult result = null;

                try {
                    result = executeStopBotRecommendation(finalRequest);
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
    public java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest request) {

        return updateBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBotResult> updateBotAsync(final UpdateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBotRequest, UpdateBotResult> asyncHandler) {
        final UpdateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBotResult>() {
            @Override
            public UpdateBotResult call() throws Exception {
                UpdateBotResult result = null;

                try {
                    result = executeUpdateBot(finalRequest);
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
    public java.util.concurrent.Future<UpdateBotAliasResult> updateBotAliasAsync(UpdateBotAliasRequest request) {

        return updateBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBotAliasResult> updateBotAliasAsync(final UpdateBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBotAliasRequest, UpdateBotAliasResult> asyncHandler) {
        final UpdateBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBotAliasResult>() {
            @Override
            public UpdateBotAliasResult call() throws Exception {
                UpdateBotAliasResult result = null;

                try {
                    result = executeUpdateBotAlias(finalRequest);
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
    public java.util.concurrent.Future<UpdateBotLocaleResult> updateBotLocaleAsync(UpdateBotLocaleRequest request) {

        return updateBotLocaleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBotLocaleResult> updateBotLocaleAsync(final UpdateBotLocaleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBotLocaleRequest, UpdateBotLocaleResult> asyncHandler) {
        final UpdateBotLocaleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBotLocaleResult>() {
            @Override
            public UpdateBotLocaleResult call() throws Exception {
                UpdateBotLocaleResult result = null;

                try {
                    result = executeUpdateBotLocale(finalRequest);
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
    public java.util.concurrent.Future<UpdateBotRecommendationResult> updateBotRecommendationAsync(UpdateBotRecommendationRequest request) {

        return updateBotRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBotRecommendationResult> updateBotRecommendationAsync(final UpdateBotRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBotRecommendationRequest, UpdateBotRecommendationResult> asyncHandler) {
        final UpdateBotRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBotRecommendationResult>() {
            @Override
            public UpdateBotRecommendationResult call() throws Exception {
                UpdateBotRecommendationResult result = null;

                try {
                    result = executeUpdateBotRecommendation(finalRequest);
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
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest request) {

        return updateExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(final UpdateExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExportRequest, UpdateExportResult> asyncHandler) {
        final UpdateExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExportResult>() {
            @Override
            public UpdateExportResult call() throws Exception {
                UpdateExportResult result = null;

                try {
                    result = executeUpdateExport(finalRequest);
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
    public java.util.concurrent.Future<UpdateIntentResult> updateIntentAsync(UpdateIntentRequest request) {

        return updateIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntentResult> updateIntentAsync(final UpdateIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntentRequest, UpdateIntentResult> asyncHandler) {
        final UpdateIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIntentResult>() {
            @Override
            public UpdateIntentResult call() throws Exception {
                UpdateIntentResult result = null;

                try {
                    result = executeUpdateIntent(finalRequest);
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
    public java.util.concurrent.Future<UpdateResourcePolicyResult> updateResourcePolicyAsync(UpdateResourcePolicyRequest request) {

        return updateResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourcePolicyResult> updateResourcePolicyAsync(final UpdateResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourcePolicyRequest, UpdateResourcePolicyResult> asyncHandler) {
        final UpdateResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourcePolicyResult>() {
            @Override
            public UpdateResourcePolicyResult call() throws Exception {
                UpdateResourcePolicyResult result = null;

                try {
                    result = executeUpdateResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdateSlotResult> updateSlotAsync(UpdateSlotRequest request) {

        return updateSlotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSlotResult> updateSlotAsync(final UpdateSlotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSlotRequest, UpdateSlotResult> asyncHandler) {
        final UpdateSlotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSlotResult>() {
            @Override
            public UpdateSlotResult call() throws Exception {
                UpdateSlotResult result = null;

                try {
                    result = executeUpdateSlot(finalRequest);
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
    public java.util.concurrent.Future<UpdateSlotTypeResult> updateSlotTypeAsync(UpdateSlotTypeRequest request) {

        return updateSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSlotTypeResult> updateSlotTypeAsync(final UpdateSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSlotTypeRequest, UpdateSlotTypeResult> asyncHandler) {
        final UpdateSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSlotTypeResult>() {
            @Override
            public UpdateSlotTypeResult call() throws Exception {
                UpdateSlotTypeResult result = null;

                try {
                    result = executeUpdateSlotType(finalRequest);
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
    public java.util.concurrent.Future<UpdateTestSetResult> updateTestSetAsync(UpdateTestSetRequest request) {

        return updateTestSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTestSetResult> updateTestSetAsync(final UpdateTestSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTestSetRequest, UpdateTestSetResult> asyncHandler) {
        final UpdateTestSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTestSetResult>() {
            @Override
            public UpdateTestSetResult call() throws Exception {
                UpdateTestSetResult result = null;

                try {
                    result = executeUpdateTestSet(finalRequest);
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
