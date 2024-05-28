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
package com.amazonaws.services.qbusiness;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing QBusiness asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>Amazon Q Business</i> API Reference. Amazon Q Business is a fully managed, generative-AI powered
 * enterprise chat assistant that you can deploy within your organization. Amazon Q Business enhances employee
 * productivity by supporting key tasks such as question-answering, knowledge discovery, writing email messages,
 * summarizing text, drafting document outlines, and brainstorming ideas. Users ask questions of Amazon Q Business and
 * get answers that are presented in a conversational manner. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/what-is.html"> <i>Amazon Q Business User Guide</i>
 * </a>.
 * </p>
 * <p>
 * For an overview of the Amazon Q Business APIs, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/api-ref.html#api-overview">Overview of Amazon Q
 * Business API operations</a>.
 * </p>
 * <p>
 * For information about the IAM access control permissions you need to use this API, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html">IAM roles for Amazon Q Business</a>
 * in the <i>Amazon Q Business User Guide</i>.
 * </p>
 * <p>
 * You can use the following AWS SDKs to access Amazon Q Business APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-cpp">AWS SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-go">AWS SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-java">AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-javascript">AWS SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-net">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pythonsdk">AWS SDK for Python (Boto3)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-ruby">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following resources provide additional information about using the Amazon Q Business API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/setting-up.html">Setting up for Amazon Q
 * Business</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://awscli.amazonaws.com/v2/documentation/api/latest/reference/qbusiness/index.html">Amazon Q
 * Business CLI Reference</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/general/latest/gr/amazonq.html">Amazon Web Services General Reference</a>
 * </i>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSQBusinessAsyncClient extends AWSQBusinessClient implements AWSQBusinessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSQBusinessAsyncClientBuilder asyncBuilder() {
        return AWSQBusinessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on QBusiness using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSQBusinessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on QBusiness using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSQBusinessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest request) {

        return batchDeleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(final BatchDeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteDocumentRequest, BatchDeleteDocumentResult> asyncHandler) {
        final BatchDeleteDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteDocumentResult>() {
            @Override
            public BatchDeleteDocumentResult call() throws Exception {
                BatchDeleteDocumentResult result = null;

                try {
                    result = executeBatchDeleteDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest request) {

        return batchPutDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(final BatchPutDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutDocumentRequest, BatchPutDocumentResult> asyncHandler) {
        final BatchPutDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutDocumentResult>() {
            @Override
            public BatchPutDocumentResult call() throws Exception {
                BatchPutDocumentResult result = null;

                try {
                    result = executeBatchPutDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ChatSyncResult> chatSyncAsync(ChatSyncRequest request) {

        return chatSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChatSyncResult> chatSyncAsync(final ChatSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChatSyncRequest, ChatSyncResult> asyncHandler) {
        final ChatSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChatSyncResult>() {
            @Override
            public ChatSyncResult call() throws Exception {
                ChatSyncResult result = null;

                try {
                    result = executeChatSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request) {

        return createIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(final CreateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler) {
        final CreateIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIndexResult>() {
            @Override
            public CreateIndexResult call() throws Exception {
                CreateIndexResult result = null;

                try {
                    result = executeCreateIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePluginResult> createPluginAsync(CreatePluginRequest request) {

        return createPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePluginResult> createPluginAsync(final CreatePluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePluginRequest, CreatePluginResult> asyncHandler) {
        final CreatePluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePluginResult>() {
            @Override
            public CreatePluginResult call() throws Exception {
                CreatePluginResult result = null;

                try {
                    result = executeCreatePlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRetrieverResult> createRetrieverAsync(CreateRetrieverRequest request) {

        return createRetrieverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRetrieverResult> createRetrieverAsync(final CreateRetrieverRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRetrieverRequest, CreateRetrieverResult> asyncHandler) {
        final CreateRetrieverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRetrieverResult>() {
            @Override
            public CreateRetrieverResult call() throws Exception {
                CreateRetrieverResult result = null;

                try {
                    result = executeCreateRetriever(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWebExperienceResult> createWebExperienceAsync(CreateWebExperienceRequest request) {

        return createWebExperienceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebExperienceResult> createWebExperienceAsync(final CreateWebExperienceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWebExperienceRequest, CreateWebExperienceResult> asyncHandler) {
        final CreateWebExperienceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWebExperienceResult>() {
            @Override
            public CreateWebExperienceResult call() throws Exception {
                CreateWebExperienceResult result = null;

                try {
                    result = executeCreateWebExperience(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteChatControlsConfigurationResult> deleteChatControlsConfigurationAsync(
            DeleteChatControlsConfigurationRequest request) {

        return deleteChatControlsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChatControlsConfigurationResult> deleteChatControlsConfigurationAsync(
            final DeleteChatControlsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChatControlsConfigurationRequest, DeleteChatControlsConfigurationResult> asyncHandler) {
        final DeleteChatControlsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChatControlsConfigurationResult>() {
            @Override
            public DeleteChatControlsConfigurationResult call() throws Exception {
                DeleteChatControlsConfigurationResult result = null;

                try {
                    result = executeDeleteChatControlsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConversationResult> deleteConversationAsync(DeleteConversationRequest request) {

        return deleteConversationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConversationResult> deleteConversationAsync(final DeleteConversationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConversationRequest, DeleteConversationResult> asyncHandler) {
        final DeleteConversationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConversationResult>() {
            @Override
            public DeleteConversationResult call() throws Exception {
                DeleteConversationResult result = null;

                try {
                    result = executeDeleteConversation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest request) {

        return deleteIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(final DeleteIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler) {
        final DeleteIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIndexResult>() {
            @Override
            public DeleteIndexResult call() throws Exception {
                DeleteIndexResult result = null;

                try {
                    result = executeDeleteIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePluginResult> deletePluginAsync(DeletePluginRequest request) {

        return deletePluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePluginResult> deletePluginAsync(final DeletePluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePluginRequest, DeletePluginResult> asyncHandler) {
        final DeletePluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePluginResult>() {
            @Override
            public DeletePluginResult call() throws Exception {
                DeletePluginResult result = null;

                try {
                    result = executeDeletePlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRetrieverResult> deleteRetrieverAsync(DeleteRetrieverRequest request) {

        return deleteRetrieverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetrieverResult> deleteRetrieverAsync(final DeleteRetrieverRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRetrieverRequest, DeleteRetrieverResult> asyncHandler) {
        final DeleteRetrieverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRetrieverResult>() {
            @Override
            public DeleteRetrieverResult call() throws Exception {
                DeleteRetrieverResult result = null;

                try {
                    result = executeDeleteRetriever(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWebExperienceResult> deleteWebExperienceAsync(DeleteWebExperienceRequest request) {

        return deleteWebExperienceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebExperienceResult> deleteWebExperienceAsync(final DeleteWebExperienceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWebExperienceRequest, DeleteWebExperienceResult> asyncHandler) {
        final DeleteWebExperienceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebExperienceResult>() {
            @Override
            public DeleteWebExperienceResult call() throws Exception {
                DeleteWebExperienceResult result = null;

                try {
                    result = executeDeleteWebExperience(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChatControlsConfigurationResult> getChatControlsConfigurationAsync(GetChatControlsConfigurationRequest request) {

        return getChatControlsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChatControlsConfigurationResult> getChatControlsConfigurationAsync(final GetChatControlsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChatControlsConfigurationRequest, GetChatControlsConfigurationResult> asyncHandler) {
        final GetChatControlsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChatControlsConfigurationResult>() {
            @Override
            public GetChatControlsConfigurationResult call() throws Exception {
                GetChatControlsConfigurationResult result = null;

                try {
                    result = executeGetChatControlsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {
        final GetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result = null;

                try {
                    result = executeGetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest request) {

        return getIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIndexResult> getIndexAsync(final GetIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIndexRequest, GetIndexResult> asyncHandler) {
        final GetIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIndexResult>() {
            @Override
            public GetIndexResult call() throws Exception {
                GetIndexResult result = null;

                try {
                    result = executeGetIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPluginResult> getPluginAsync(GetPluginRequest request) {

        return getPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPluginResult> getPluginAsync(final GetPluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPluginRequest, GetPluginResult> asyncHandler) {
        final GetPluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPluginResult>() {
            @Override
            public GetPluginResult call() throws Exception {
                GetPluginResult result = null;

                try {
                    result = executeGetPlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRetrieverResult> getRetrieverAsync(GetRetrieverRequest request) {

        return getRetrieverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRetrieverResult> getRetrieverAsync(final GetRetrieverRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRetrieverRequest, GetRetrieverResult> asyncHandler) {
        final GetRetrieverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRetrieverResult>() {
            @Override
            public GetRetrieverResult call() throws Exception {
                GetRetrieverResult result = null;

                try {
                    result = executeGetRetriever(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(final GetUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {
        final GetUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserResult>() {
            @Override
            public GetUserResult call() throws Exception {
                GetUserResult result = null;

                try {
                    result = executeGetUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWebExperienceResult> getWebExperienceAsync(GetWebExperienceRequest request) {

        return getWebExperienceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebExperienceResult> getWebExperienceAsync(final GetWebExperienceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWebExperienceRequest, GetWebExperienceResult> asyncHandler) {
        final GetWebExperienceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWebExperienceResult>() {
            @Override
            public GetWebExperienceResult call() throws Exception {
                GetWebExperienceResult result = null;

                try {
                    result = executeGetWebExperience(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConversationsResult> listConversationsAsync(ListConversationsRequest request) {

        return listConversationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConversationsResult> listConversationsAsync(final ListConversationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConversationsRequest, ListConversationsResult> asyncHandler) {
        final ListConversationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConversationsResult>() {
            @Override
            public ListConversationsResult call() throws Exception {
                ListConversationsResult result = null;

                try {
                    result = executeListConversations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest request) {

        return listDataSourceSyncJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(final ListDataSourceSyncJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourceSyncJobsRequest, ListDataSourceSyncJobsResult> asyncHandler) {
        final ListDataSourceSyncJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourceSyncJobsResult>() {
            @Override
            public ListDataSourceSyncJobsResult call() throws Exception {
                ListDataSourceSyncJobsResult result = null;

                try {
                    result = executeListDataSourceSyncJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest request) {

        return listDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(final ListDocumentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {
        final ListDocumentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentsResult>() {
            @Override
            public ListDocumentsResult call() throws Exception {
                ListDocumentsResult result = null;

                try {
                    result = executeListDocuments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest request) {

        return listIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(final ListIndicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler) {
        final ListIndicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIndicesResult>() {
            @Override
            public ListIndicesResult call() throws Exception {
                ListIndicesResult result = null;

                try {
                    result = executeListIndices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMessagesResult> listMessagesAsync(ListMessagesRequest request) {

        return listMessagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMessagesResult> listMessagesAsync(final ListMessagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMessagesRequest, ListMessagesResult> asyncHandler) {
        final ListMessagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMessagesResult>() {
            @Override
            public ListMessagesResult call() throws Exception {
                ListMessagesResult result = null;

                try {
                    result = executeListMessages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest request) {

        return listPluginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(final ListPluginsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPluginsRequest, ListPluginsResult> asyncHandler) {
        final ListPluginsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPluginsResult>() {
            @Override
            public ListPluginsResult call() throws Exception {
                ListPluginsResult result = null;

                try {
                    result = executeListPlugins(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRetrieversResult> listRetrieversAsync(ListRetrieversRequest request) {

        return listRetrieversAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRetrieversResult> listRetrieversAsync(final ListRetrieversRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRetrieversRequest, ListRetrieversResult> asyncHandler) {
        final ListRetrieversRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRetrieversResult>() {
            @Override
            public ListRetrieversResult call() throws Exception {
                ListRetrieversResult result = null;

                try {
                    result = executeListRetrievers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListWebExperiencesResult> listWebExperiencesAsync(ListWebExperiencesRequest request) {

        return listWebExperiencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebExperiencesResult> listWebExperiencesAsync(final ListWebExperiencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWebExperiencesRequest, ListWebExperiencesResult> asyncHandler) {
        final ListWebExperiencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWebExperiencesResult>() {
            @Override
            public ListWebExperiencesResult call() throws Exception {
                ListWebExperiencesResult result = null;

                try {
                    result = executeListWebExperiences(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request) {

        return putFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(final PutFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler) {
        final PutFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFeedbackResult>() {
            @Override
            public PutFeedbackResult call() throws Exception {
                PutFeedbackResult result = null;

                try {
                    result = executePutFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutGroupResult> putGroupAsync(PutGroupRequest request) {

        return putGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutGroupResult> putGroupAsync(final PutGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutGroupRequest, PutGroupResult> asyncHandler) {
        final PutGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutGroupResult>() {
            @Override
            public PutGroupResult call() throws Exception {
                PutGroupResult result = null;

                try {
                    result = executePutGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest request) {

        return startDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(final StartDataSourceSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataSourceSyncJobRequest, StartDataSourceSyncJobResult> asyncHandler) {
        final StartDataSourceSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDataSourceSyncJobResult>() {
            @Override
            public StartDataSourceSyncJobResult call() throws Exception {
                StartDataSourceSyncJobResult result = null;

                try {
                    result = executeStartDataSourceSyncJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest request) {

        return stopDataSourceSyncJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(final StopDataSourceSyncJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataSourceSyncJobRequest, StopDataSourceSyncJobResult> asyncHandler) {
        final StopDataSourceSyncJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDataSourceSyncJobResult>() {
            @Override
            public StopDataSourceSyncJobResult call() throws Exception {
                StopDataSourceSyncJobResult result = null;

                try {
                    result = executeStopDataSourceSyncJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateChatControlsConfigurationResult> updateChatControlsConfigurationAsync(
            UpdateChatControlsConfigurationRequest request) {

        return updateChatControlsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChatControlsConfigurationResult> updateChatControlsConfigurationAsync(
            final UpdateChatControlsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChatControlsConfigurationRequest, UpdateChatControlsConfigurationResult> asyncHandler) {
        final UpdateChatControlsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChatControlsConfigurationResult>() {
            @Override
            public UpdateChatControlsConfigurationResult call() throws Exception {
                UpdateChatControlsConfigurationResult result = null;

                try {
                    result = executeUpdateChatControlsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest request) {

        return updateIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(final UpdateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIndexRequest, UpdateIndexResult> asyncHandler) {
        final UpdateIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIndexResult>() {
            @Override
            public UpdateIndexResult call() throws Exception {
                UpdateIndexResult result = null;

                try {
                    result = executeUpdateIndex(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePluginResult> updatePluginAsync(UpdatePluginRequest request) {

        return updatePluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePluginResult> updatePluginAsync(final UpdatePluginRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePluginRequest, UpdatePluginResult> asyncHandler) {
        final UpdatePluginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePluginResult>() {
            @Override
            public UpdatePluginResult call() throws Exception {
                UpdatePluginResult result = null;

                try {
                    result = executeUpdatePlugin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRetrieverResult> updateRetrieverAsync(UpdateRetrieverRequest request) {

        return updateRetrieverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRetrieverResult> updateRetrieverAsync(final UpdateRetrieverRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRetrieverRequest, UpdateRetrieverResult> asyncHandler) {
        final UpdateRetrieverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRetrieverResult>() {
            @Override
            public UpdateRetrieverResult call() throws Exception {
                UpdateRetrieverResult result = null;

                try {
                    result = executeUpdateRetriever(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWebExperienceResult> updateWebExperienceAsync(UpdateWebExperienceRequest request) {

        return updateWebExperienceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebExperienceResult> updateWebExperienceAsync(final UpdateWebExperienceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWebExperienceRequest, UpdateWebExperienceResult> asyncHandler) {
        final UpdateWebExperienceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebExperienceResult>() {
            @Override
            public UpdateWebExperienceResult call() throws Exception {
                UpdateWebExperienceResult result = null;

                try {
                    result = executeUpdateWebExperience(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
