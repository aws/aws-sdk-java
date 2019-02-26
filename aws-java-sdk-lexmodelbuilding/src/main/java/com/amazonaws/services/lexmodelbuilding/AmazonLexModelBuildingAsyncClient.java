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
package com.amazonaws.services.lexmodelbuilding;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Lex Model Building Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Lex Build-Time Actions</fullname>
 * <p>
 * Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
 * update, and delete conversational bots for new and existing client applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexModelBuildingAsyncClient extends AmazonLexModelBuildingClient implements AmazonLexModelBuildingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLexModelBuildingAsyncClientBuilder asyncBuilder() {
        return AmazonLexModelBuildingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lex Model Building Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLexModelBuildingAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateIntentVersionResult> createIntentVersionAsync(CreateIntentVersionRequest request) {

        return createIntentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntentVersionResult> createIntentVersionAsync(final CreateIntentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntentVersionRequest, CreateIntentVersionResult> asyncHandler) {
        final CreateIntentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntentVersionResult>() {
            @Override
            public CreateIntentVersionResult call() throws Exception {
                CreateIntentVersionResult result = null;

                try {
                    result = executeCreateIntentVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateSlotTypeVersionResult> createSlotTypeVersionAsync(CreateSlotTypeVersionRequest request) {

        return createSlotTypeVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlotTypeVersionResult> createSlotTypeVersionAsync(final CreateSlotTypeVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSlotTypeVersionRequest, CreateSlotTypeVersionResult> asyncHandler) {
        final CreateSlotTypeVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSlotTypeVersionResult>() {
            @Override
            public CreateSlotTypeVersionResult call() throws Exception {
                CreateSlotTypeVersionResult result = null;

                try {
                    result = executeCreateSlotTypeVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteBotChannelAssociationResult> deleteBotChannelAssociationAsync(DeleteBotChannelAssociationRequest request) {

        return deleteBotChannelAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBotChannelAssociationResult> deleteBotChannelAssociationAsync(final DeleteBotChannelAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBotChannelAssociationRequest, DeleteBotChannelAssociationResult> asyncHandler) {
        final DeleteBotChannelAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBotChannelAssociationResult>() {
            @Override
            public DeleteBotChannelAssociationResult call() throws Exception {
                DeleteBotChannelAssociationResult result = null;

                try {
                    result = executeDeleteBotChannelAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeleteIntentVersionResult> deleteIntentVersionAsync(DeleteIntentVersionRequest request) {

        return deleteIntentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntentVersionResult> deleteIntentVersionAsync(final DeleteIntentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntentVersionRequest, DeleteIntentVersionResult> asyncHandler) {
        final DeleteIntentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntentVersionResult>() {
            @Override
            public DeleteIntentVersionResult call() throws Exception {
                DeleteIntentVersionResult result = null;

                try {
                    result = executeDeleteIntentVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteSlotTypeVersionResult> deleteSlotTypeVersionAsync(DeleteSlotTypeVersionRequest request) {

        return deleteSlotTypeVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlotTypeVersionResult> deleteSlotTypeVersionAsync(final DeleteSlotTypeVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlotTypeVersionRequest, DeleteSlotTypeVersionResult> asyncHandler) {
        final DeleteSlotTypeVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlotTypeVersionResult>() {
            @Override
            public DeleteSlotTypeVersionResult call() throws Exception {
                DeleteSlotTypeVersionResult result = null;

                try {
                    result = executeDeleteSlotTypeVersion(finalRequest);
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
    public java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest request) {

        return getBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotResult> getBotAsync(final GetBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotRequest, GetBotResult> asyncHandler) {
        final GetBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotResult>() {
            @Override
            public GetBotResult call() throws Exception {
                GetBotResult result = null;

                try {
                    result = executeGetBot(finalRequest);
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
    public java.util.concurrent.Future<GetBotAliasResult> getBotAliasAsync(GetBotAliasRequest request) {

        return getBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotAliasResult> getBotAliasAsync(final GetBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotAliasRequest, GetBotAliasResult> asyncHandler) {
        final GetBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotAliasResult>() {
            @Override
            public GetBotAliasResult call() throws Exception {
                GetBotAliasResult result = null;

                try {
                    result = executeGetBotAlias(finalRequest);
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
    public java.util.concurrent.Future<GetBotAliasesResult> getBotAliasesAsync(GetBotAliasesRequest request) {

        return getBotAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotAliasesResult> getBotAliasesAsync(final GetBotAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotAliasesRequest, GetBotAliasesResult> asyncHandler) {
        final GetBotAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotAliasesResult>() {
            @Override
            public GetBotAliasesResult call() throws Exception {
                GetBotAliasesResult result = null;

                try {
                    result = executeGetBotAliases(finalRequest);
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
    public java.util.concurrent.Future<GetBotChannelAssociationResult> getBotChannelAssociationAsync(GetBotChannelAssociationRequest request) {

        return getBotChannelAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotChannelAssociationResult> getBotChannelAssociationAsync(final GetBotChannelAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotChannelAssociationRequest, GetBotChannelAssociationResult> asyncHandler) {
        final GetBotChannelAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotChannelAssociationResult>() {
            @Override
            public GetBotChannelAssociationResult call() throws Exception {
                GetBotChannelAssociationResult result = null;

                try {
                    result = executeGetBotChannelAssociation(finalRequest);
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
    public java.util.concurrent.Future<GetBotChannelAssociationsResult> getBotChannelAssociationsAsync(GetBotChannelAssociationsRequest request) {

        return getBotChannelAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotChannelAssociationsResult> getBotChannelAssociationsAsync(final GetBotChannelAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotChannelAssociationsRequest, GetBotChannelAssociationsResult> asyncHandler) {
        final GetBotChannelAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotChannelAssociationsResult>() {
            @Override
            public GetBotChannelAssociationsResult call() throws Exception {
                GetBotChannelAssociationsResult result = null;

                try {
                    result = executeGetBotChannelAssociations(finalRequest);
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
    public java.util.concurrent.Future<GetBotVersionsResult> getBotVersionsAsync(GetBotVersionsRequest request) {

        return getBotVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotVersionsResult> getBotVersionsAsync(final GetBotVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotVersionsRequest, GetBotVersionsResult> asyncHandler) {
        final GetBotVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotVersionsResult>() {
            @Override
            public GetBotVersionsResult call() throws Exception {
                GetBotVersionsResult result = null;

                try {
                    result = executeGetBotVersions(finalRequest);
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
    public java.util.concurrent.Future<GetBotsResult> getBotsAsync(GetBotsRequest request) {

        return getBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotsResult> getBotsAsync(final GetBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotsRequest, GetBotsResult> asyncHandler) {
        final GetBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotsResult>() {
            @Override
            public GetBotsResult call() throws Exception {
                GetBotsResult result = null;

                try {
                    result = executeGetBots(finalRequest);
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
    public java.util.concurrent.Future<GetBuiltinIntentResult> getBuiltinIntentAsync(GetBuiltinIntentRequest request) {

        return getBuiltinIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBuiltinIntentResult> getBuiltinIntentAsync(final GetBuiltinIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBuiltinIntentRequest, GetBuiltinIntentResult> asyncHandler) {
        final GetBuiltinIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBuiltinIntentResult>() {
            @Override
            public GetBuiltinIntentResult call() throws Exception {
                GetBuiltinIntentResult result = null;

                try {
                    result = executeGetBuiltinIntent(finalRequest);
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
    public java.util.concurrent.Future<GetBuiltinIntentsResult> getBuiltinIntentsAsync(GetBuiltinIntentsRequest request) {

        return getBuiltinIntentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBuiltinIntentsResult> getBuiltinIntentsAsync(final GetBuiltinIntentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBuiltinIntentsRequest, GetBuiltinIntentsResult> asyncHandler) {
        final GetBuiltinIntentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBuiltinIntentsResult>() {
            @Override
            public GetBuiltinIntentsResult call() throws Exception {
                GetBuiltinIntentsResult result = null;

                try {
                    result = executeGetBuiltinIntents(finalRequest);
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
    public java.util.concurrent.Future<GetBuiltinSlotTypesResult> getBuiltinSlotTypesAsync(GetBuiltinSlotTypesRequest request) {

        return getBuiltinSlotTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBuiltinSlotTypesResult> getBuiltinSlotTypesAsync(final GetBuiltinSlotTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBuiltinSlotTypesRequest, GetBuiltinSlotTypesResult> asyncHandler) {
        final GetBuiltinSlotTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBuiltinSlotTypesResult>() {
            @Override
            public GetBuiltinSlotTypesResult call() throws Exception {
                GetBuiltinSlotTypesResult result = null;

                try {
                    result = executeGetBuiltinSlotTypes(finalRequest);
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
    public java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest request) {

        return getExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(final GetExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler) {
        final GetExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportResult>() {
            @Override
            public GetExportResult call() throws Exception {
                GetExportResult result = null;

                try {
                    result = executeGetExport(finalRequest);
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
    public java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest request) {

        return getImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportResult> getImportAsync(final GetImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportRequest, GetImportResult> asyncHandler) {
        final GetImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportResult>() {
            @Override
            public GetImportResult call() throws Exception {
                GetImportResult result = null;

                try {
                    result = executeGetImport(finalRequest);
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
    public java.util.concurrent.Future<GetIntentResult> getIntentAsync(GetIntentRequest request) {

        return getIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntentResult> getIntentAsync(final GetIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntentRequest, GetIntentResult> asyncHandler) {
        final GetIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntentResult>() {
            @Override
            public GetIntentResult call() throws Exception {
                GetIntentResult result = null;

                try {
                    result = executeGetIntent(finalRequest);
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
    public java.util.concurrent.Future<GetIntentVersionsResult> getIntentVersionsAsync(GetIntentVersionsRequest request) {

        return getIntentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntentVersionsResult> getIntentVersionsAsync(final GetIntentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntentVersionsRequest, GetIntentVersionsResult> asyncHandler) {
        final GetIntentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntentVersionsResult>() {
            @Override
            public GetIntentVersionsResult call() throws Exception {
                GetIntentVersionsResult result = null;

                try {
                    result = executeGetIntentVersions(finalRequest);
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
    public java.util.concurrent.Future<GetIntentsResult> getIntentsAsync(GetIntentsRequest request) {

        return getIntentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntentsResult> getIntentsAsync(final GetIntentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntentsRequest, GetIntentsResult> asyncHandler) {
        final GetIntentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntentsResult>() {
            @Override
            public GetIntentsResult call() throws Exception {
                GetIntentsResult result = null;

                try {
                    result = executeGetIntents(finalRequest);
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
    public java.util.concurrent.Future<GetSlotTypeResult> getSlotTypeAsync(GetSlotTypeRequest request) {

        return getSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSlotTypeResult> getSlotTypeAsync(final GetSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSlotTypeRequest, GetSlotTypeResult> asyncHandler) {
        final GetSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSlotTypeResult>() {
            @Override
            public GetSlotTypeResult call() throws Exception {
                GetSlotTypeResult result = null;

                try {
                    result = executeGetSlotType(finalRequest);
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
    public java.util.concurrent.Future<GetSlotTypeVersionsResult> getSlotTypeVersionsAsync(GetSlotTypeVersionsRequest request) {

        return getSlotTypeVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSlotTypeVersionsResult> getSlotTypeVersionsAsync(final GetSlotTypeVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSlotTypeVersionsRequest, GetSlotTypeVersionsResult> asyncHandler) {
        final GetSlotTypeVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSlotTypeVersionsResult>() {
            @Override
            public GetSlotTypeVersionsResult call() throws Exception {
                GetSlotTypeVersionsResult result = null;

                try {
                    result = executeGetSlotTypeVersions(finalRequest);
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
    public java.util.concurrent.Future<GetSlotTypesResult> getSlotTypesAsync(GetSlotTypesRequest request) {

        return getSlotTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSlotTypesResult> getSlotTypesAsync(final GetSlotTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSlotTypesRequest, GetSlotTypesResult> asyncHandler) {
        final GetSlotTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSlotTypesResult>() {
            @Override
            public GetSlotTypesResult call() throws Exception {
                GetSlotTypesResult result = null;

                try {
                    result = executeGetSlotTypes(finalRequest);
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
    public java.util.concurrent.Future<GetUtterancesViewResult> getUtterancesViewAsync(GetUtterancesViewRequest request) {

        return getUtterancesViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUtterancesViewResult> getUtterancesViewAsync(final GetUtterancesViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUtterancesViewRequest, GetUtterancesViewResult> asyncHandler) {
        final GetUtterancesViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUtterancesViewResult>() {
            @Override
            public GetUtterancesViewResult call() throws Exception {
                GetUtterancesViewResult result = null;

                try {
                    result = executeGetUtterancesView(finalRequest);
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
    public java.util.concurrent.Future<PutBotResult> putBotAsync(PutBotRequest request) {

        return putBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBotResult> putBotAsync(final PutBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBotRequest, PutBotResult> asyncHandler) {
        final PutBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBotResult>() {
            @Override
            public PutBotResult call() throws Exception {
                PutBotResult result = null;

                try {
                    result = executePutBot(finalRequest);
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
    public java.util.concurrent.Future<PutBotAliasResult> putBotAliasAsync(PutBotAliasRequest request) {

        return putBotAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBotAliasResult> putBotAliasAsync(final PutBotAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBotAliasRequest, PutBotAliasResult> asyncHandler) {
        final PutBotAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBotAliasResult>() {
            @Override
            public PutBotAliasResult call() throws Exception {
                PutBotAliasResult result = null;

                try {
                    result = executePutBotAlias(finalRequest);
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
    public java.util.concurrent.Future<PutIntentResult> putIntentAsync(PutIntentRequest request) {

        return putIntentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntentResult> putIntentAsync(final PutIntentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntentRequest, PutIntentResult> asyncHandler) {
        final PutIntentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutIntentResult>() {
            @Override
            public PutIntentResult call() throws Exception {
                PutIntentResult result = null;

                try {
                    result = executePutIntent(finalRequest);
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
    public java.util.concurrent.Future<PutSlotTypeResult> putSlotTypeAsync(PutSlotTypeRequest request) {

        return putSlotTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSlotTypeResult> putSlotTypeAsync(final PutSlotTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSlotTypeRequest, PutSlotTypeResult> asyncHandler) {
        final PutSlotTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSlotTypeResult>() {
            @Override
            public PutSlotTypeResult call() throws Exception {
                PutSlotTypeResult result = null;

                try {
                    result = executePutSlotType(finalRequest);
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
