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
package com.amazonaws.services.bedrockagent;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockagent.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Agents for Amazon Bedrock asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Describes the API operations for creating and managing Amazon Bedrock agents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBedrockAgentAsyncClient extends AWSBedrockAgentClient implements AWSBedrockAgentAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBedrockAgentAsyncClientBuilder asyncBuilder() {
        return AWSBedrockAgentAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Agents for Amazon Bedrock using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBedrockAgentAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Agents for Amazon Bedrock using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBedrockAgentAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(AssociateAgentKnowledgeBaseRequest request) {

        return associateAgentKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(final AssociateAgentKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAgentKnowledgeBaseRequest, AssociateAgentKnowledgeBaseResult> asyncHandler) {
        final AssociateAgentKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAgentKnowledgeBaseResult>() {
            @Override
            public AssociateAgentKnowledgeBaseResult call() throws Exception {
                AssociateAgentKnowledgeBaseResult result = null;

                try {
                    result = executeAssociateAgentKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest request) {

        return createAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(final CreateAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler) {
        final CreateAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgentResult>() {
            @Override
            public CreateAgentResult call() throws Exception {
                CreateAgentResult result = null;

                try {
                    result = executeCreateAgent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(CreateAgentActionGroupRequest request) {

        return createAgentActionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(final CreateAgentActionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgentActionGroupRequest, CreateAgentActionGroupResult> asyncHandler) {
        final CreateAgentActionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgentActionGroupResult>() {
            @Override
            public CreateAgentActionGroupResult call() throws Exception {
                CreateAgentActionGroupResult result = null;

                try {
                    result = executeCreateAgentActionGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(CreateAgentAliasRequest request) {

        return createAgentAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(final CreateAgentAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgentAliasRequest, CreateAgentAliasResult> asyncHandler) {
        final CreateAgentAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgentAliasResult>() {
            @Override
            public CreateAgentAliasResult call() throws Exception {
                CreateAgentAliasResult result = null;

                try {
                    result = executeCreateAgentAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request) {

        return createDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(final CreateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler) {
        final CreateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceResult>() {
            @Override
            public CreateDataSourceResult call() throws Exception {
                CreateDataSourceResult result = null;

                try {
                    result = executeCreateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest request) {

        return createKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(final CreateKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKnowledgeBaseRequest, CreateKnowledgeBaseResult> asyncHandler) {
        final CreateKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKnowledgeBaseResult>() {
            @Override
            public CreateKnowledgeBaseResult call() throws Exception {
                CreateKnowledgeBaseResult result = null;

                try {
                    result = executeCreateKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest request) {

        return deleteAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(final DeleteAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler) {
        final DeleteAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgentResult>() {
            @Override
            public DeleteAgentResult call() throws Exception {
                DeleteAgentResult result = null;

                try {
                    result = executeDeleteAgent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(DeleteAgentActionGroupRequest request) {

        return deleteAgentActionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(final DeleteAgentActionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgentActionGroupRequest, DeleteAgentActionGroupResult> asyncHandler) {
        final DeleteAgentActionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgentActionGroupResult>() {
            @Override
            public DeleteAgentActionGroupResult call() throws Exception {
                DeleteAgentActionGroupResult result = null;

                try {
                    result = executeDeleteAgentActionGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(DeleteAgentAliasRequest request) {

        return deleteAgentAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(final DeleteAgentAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgentAliasRequest, DeleteAgentAliasResult> asyncHandler) {
        final DeleteAgentAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgentAliasResult>() {
            @Override
            public DeleteAgentAliasResult call() throws Exception {
                DeleteAgentAliasResult result = null;

                try {
                    result = executeDeleteAgentAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(DeleteAgentVersionRequest request) {

        return deleteAgentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(final DeleteAgentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgentVersionRequest, DeleteAgentVersionResult> asyncHandler) {
        final DeleteAgentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgentVersionResult>() {
            @Override
            public DeleteAgentVersionResult call() throws Exception {
                DeleteAgentVersionResult result = null;

                try {
                    result = executeDeleteAgentVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {
        final DeleteDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSourceResult>() {
            @Override
            public DeleteDataSourceResult call() throws Exception {
                DeleteDataSourceResult result = null;

                try {
                    result = executeDeleteDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest request) {

        return deleteKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(final DeleteKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResult> asyncHandler) {
        final DeleteKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKnowledgeBaseResult>() {
            @Override
            public DeleteKnowledgeBaseResult call() throws Exception {
                DeleteKnowledgeBaseResult result = null;

                try {
                    result = executeDeleteKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(DisassociateAgentKnowledgeBaseRequest request) {

        return disassociateAgentKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(
            final DisassociateAgentKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAgentKnowledgeBaseRequest, DisassociateAgentKnowledgeBaseResult> asyncHandler) {
        final DisassociateAgentKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAgentKnowledgeBaseResult>() {
            @Override
            public DisassociateAgentKnowledgeBaseResult call() throws Exception {
                DisassociateAgentKnowledgeBaseResult result = null;

                try {
                    result = executeDisassociateAgentKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAgentResult> getAgentAsync(GetAgentRequest request) {

        return getAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgentResult> getAgentAsync(final GetAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgentRequest, GetAgentResult> asyncHandler) {
        final GetAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgentResult>() {
            @Override
            public GetAgentResult call() throws Exception {
                GetAgentResult result = null;

                try {
                    result = executeGetAgent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(GetAgentActionGroupRequest request) {

        return getAgentActionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(final GetAgentActionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgentActionGroupRequest, GetAgentActionGroupResult> asyncHandler) {
        final GetAgentActionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgentActionGroupResult>() {
            @Override
            public GetAgentActionGroupResult call() throws Exception {
                GetAgentActionGroupResult result = null;

                try {
                    result = executeGetAgentActionGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(GetAgentAliasRequest request) {

        return getAgentAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(final GetAgentAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgentAliasRequest, GetAgentAliasResult> asyncHandler) {
        final GetAgentAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgentAliasResult>() {
            @Override
            public GetAgentAliasResult call() throws Exception {
                GetAgentAliasResult result = null;

                try {
                    result = executeGetAgentAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(GetAgentKnowledgeBaseRequest request) {

        return getAgentKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(final GetAgentKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgentKnowledgeBaseRequest, GetAgentKnowledgeBaseResult> asyncHandler) {
        final GetAgentKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgentKnowledgeBaseResult>() {
            @Override
            public GetAgentKnowledgeBaseResult call() throws Exception {
                GetAgentKnowledgeBaseResult result = null;

                try {
                    result = executeGetAgentKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(GetAgentVersionRequest request) {

        return getAgentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(final GetAgentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgentVersionRequest, GetAgentVersionResult> asyncHandler) {
        final GetAgentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgentVersionResult>() {
            @Override
            public GetAgentVersionResult call() throws Exception {
                GetAgentVersionResult result = null;

                try {
                    result = executeGetAgentVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request) {

        return getDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(final GetDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler) {
        final GetDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSourceResult>() {
            @Override
            public GetDataSourceResult call() throws Exception {
                GetDataSourceResult result = null;

                try {
                    result = executeGetDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(GetIngestionJobRequest request) {

        return getIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(final GetIngestionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIngestionJobRequest, GetIngestionJobResult> asyncHandler) {
        final GetIngestionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIngestionJobResult>() {
            @Override
            public GetIngestionJobResult call() throws Exception {
                GetIngestionJobResult result = null;

                try {
                    result = executeGetIngestionJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest request) {

        return getKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(final GetKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKnowledgeBaseRequest, GetKnowledgeBaseResult> asyncHandler) {
        final GetKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKnowledgeBaseResult>() {
            @Override
            public GetKnowledgeBaseResult call() throws Exception {
                GetKnowledgeBaseResult result = null;

                try {
                    result = executeGetKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(ListAgentActionGroupsRequest request) {

        return listAgentActionGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(final ListAgentActionGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentActionGroupsRequest, ListAgentActionGroupsResult> asyncHandler) {
        final ListAgentActionGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentActionGroupsResult>() {
            @Override
            public ListAgentActionGroupsResult call() throws Exception {
                ListAgentActionGroupsResult result = null;

                try {
                    result = executeListAgentActionGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(ListAgentAliasesRequest request) {

        return listAgentAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(final ListAgentAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentAliasesRequest, ListAgentAliasesResult> asyncHandler) {
        final ListAgentAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentAliasesResult>() {
            @Override
            public ListAgentAliasesResult call() throws Exception {
                ListAgentAliasesResult result = null;

                try {
                    result = executeListAgentAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(ListAgentKnowledgeBasesRequest request) {

        return listAgentKnowledgeBasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(final ListAgentKnowledgeBasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentKnowledgeBasesRequest, ListAgentKnowledgeBasesResult> asyncHandler) {
        final ListAgentKnowledgeBasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentKnowledgeBasesResult>() {
            @Override
            public ListAgentKnowledgeBasesResult call() throws Exception {
                ListAgentKnowledgeBasesResult result = null;

                try {
                    result = executeListAgentKnowledgeBases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(ListAgentVersionsRequest request) {

        return listAgentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(final ListAgentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentVersionsRequest, ListAgentVersionsResult> asyncHandler) {
        final ListAgentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentVersionsResult>() {
            @Override
            public ListAgentVersionsResult call() throws Exception {
                ListAgentVersionsResult result = null;

                try {
                    result = executeListAgentVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest request) {

        return listAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(final ListAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler) {
        final ListAgentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentsResult>() {
            @Override
            public ListAgentsResult call() throws Exception {
                ListAgentsResult result = null;

                try {
                    result = executeListAgents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request) {

        return listDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(final ListDataSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler) {
        final ListDataSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourcesResult>() {
            @Override
            public ListDataSourcesResult call() throws Exception {
                ListDataSourcesResult result = null;

                try {
                    result = executeListDataSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(ListIngestionJobsRequest request) {

        return listIngestionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(final ListIngestionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIngestionJobsRequest, ListIngestionJobsResult> asyncHandler) {
        final ListIngestionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIngestionJobsResult>() {
            @Override
            public ListIngestionJobsResult call() throws Exception {
                ListIngestionJobsResult result = null;

                try {
                    result = executeListIngestionJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest request) {

        return listKnowledgeBasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(final ListKnowledgeBasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKnowledgeBasesRequest, ListKnowledgeBasesResult> asyncHandler) {
        final ListKnowledgeBasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKnowledgeBasesResult>() {
            @Override
            public ListKnowledgeBasesResult call() throws Exception {
                ListKnowledgeBasesResult result = null;

                try {
                    result = executeListKnowledgeBases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(PrepareAgentRequest request) {

        return prepareAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(final PrepareAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PrepareAgentRequest, PrepareAgentResult> asyncHandler) {
        final PrepareAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PrepareAgentResult>() {
            @Override
            public PrepareAgentResult call() throws Exception {
                PrepareAgentResult result = null;

                try {
                    result = executePrepareAgent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(StartIngestionJobRequest request) {

        return startIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(final StartIngestionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartIngestionJobRequest, StartIngestionJobResult> asyncHandler) {
        final StartIngestionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartIngestionJobResult>() {
            @Override
            public StartIngestionJobResult call() throws Exception {
                StartIngestionJobResult result = null;

                try {
                    result = executeStartIngestionJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest request) {

        return updateAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(final UpdateAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler) {
        final UpdateAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentResult>() {
            @Override
            public UpdateAgentResult call() throws Exception {
                UpdateAgentResult result = null;

                try {
                    result = executeUpdateAgent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(UpdateAgentActionGroupRequest request) {

        return updateAgentActionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(final UpdateAgentActionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentActionGroupRequest, UpdateAgentActionGroupResult> asyncHandler) {
        final UpdateAgentActionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentActionGroupResult>() {
            @Override
            public UpdateAgentActionGroupResult call() throws Exception {
                UpdateAgentActionGroupResult result = null;

                try {
                    result = executeUpdateAgentActionGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(UpdateAgentAliasRequest request) {

        return updateAgentAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(final UpdateAgentAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentAliasRequest, UpdateAgentAliasResult> asyncHandler) {
        final UpdateAgentAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentAliasResult>() {
            @Override
            public UpdateAgentAliasResult call() throws Exception {
                UpdateAgentAliasResult result = null;

                try {
                    result = executeUpdateAgentAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(UpdateAgentKnowledgeBaseRequest request) {

        return updateAgentKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(final UpdateAgentKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentKnowledgeBaseRequest, UpdateAgentKnowledgeBaseResult> asyncHandler) {
        final UpdateAgentKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentKnowledgeBaseResult>() {
            @Override
            public UpdateAgentKnowledgeBaseResult call() throws Exception {
                UpdateAgentKnowledgeBaseResult result = null;

                try {
                    result = executeUpdateAgentKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {
        final UpdateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourceResult>() {
            @Override
            public UpdateDataSourceResult call() throws Exception {
                UpdateDataSourceResult result = null;

                try {
                    result = executeUpdateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(UpdateKnowledgeBaseRequest request) {

        return updateKnowledgeBaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(final UpdateKnowledgeBaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseRequest, UpdateKnowledgeBaseResult> asyncHandler) {
        final UpdateKnowledgeBaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKnowledgeBaseResult>() {
            @Override
            public UpdateKnowledgeBaseResult call() throws Exception {
                UpdateKnowledgeBaseResult result = null;

                try {
                    result = executeUpdateKnowledgeBase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
