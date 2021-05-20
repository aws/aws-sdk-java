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
