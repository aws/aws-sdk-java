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
package com.amazonaws.services.connectwisdom;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect Wisdom Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect Wisdom delivers agents the information they need to solve customer issues as they're actively speaking
 * with customers. Agents can search across connected repositories from within their agent desktop to find answers
 * quickly. Use the Amazon Connect Wisdom APIs to create an assistant and a knowledge base, for example, or manage
 * content by uploading custom files.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectWisdomAsyncClient extends AmazonConnectWisdomClient implements AmazonConnectWisdomAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectWisdomAsyncClientBuilder asyncBuilder() {
        return AmazonConnectWisdomAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect Wisdom Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectWisdomAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect Wisdom Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectWisdomAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(CreateAssistantRequest request) {

        return createAssistantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssistantResult> createAssistantAsync(final CreateAssistantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssistantRequest, CreateAssistantResult> asyncHandler) {
        final CreateAssistantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssistantResult>() {
            @Override
            public CreateAssistantResult call() throws Exception {
                CreateAssistantResult result = null;

                try {
                    result = executeCreateAssistant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(CreateAssistantAssociationRequest request) {

        return createAssistantAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssistantAssociationResult> createAssistantAssociationAsync(final CreateAssistantAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssistantAssociationRequest, CreateAssistantAssociationResult> asyncHandler) {
        final CreateAssistantAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssistantAssociationResult>() {
            @Override
            public CreateAssistantAssociationResult call() throws Exception {
                CreateAssistantAssociationResult result = null;

                try {
                    result = executeCreateAssistantAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateContentResult> createContentAsync(CreateContentRequest request) {

        return createContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContentResult> createContentAsync(final CreateContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContentRequest, CreateContentResult> asyncHandler) {
        final CreateContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContentResult>() {
            @Override
            public CreateContentResult call() throws Exception {
                CreateContentResult result = null;

                try {
                    result = executeCreateContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateSessionResult> createSessionAsync(CreateSessionRequest request) {

        return createSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSessionResult> createSessionAsync(final CreateSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSessionRequest, CreateSessionResult> asyncHandler) {
        final CreateSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSessionResult>() {
            @Override
            public CreateSessionResult call() throws Exception {
                CreateSessionResult result = null;

                try {
                    result = executeCreateSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssistantResult> deleteAssistantAsync(DeleteAssistantRequest request) {

        return deleteAssistantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssistantResult> deleteAssistantAsync(final DeleteAssistantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssistantRequest, DeleteAssistantResult> asyncHandler) {
        final DeleteAssistantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssistantResult>() {
            @Override
            public DeleteAssistantResult call() throws Exception {
                DeleteAssistantResult result = null;

                try {
                    result = executeDeleteAssistant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssistantAssociationResult> deleteAssistantAssociationAsync(DeleteAssistantAssociationRequest request) {

        return deleteAssistantAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssistantAssociationResult> deleteAssistantAssociationAsync(final DeleteAssistantAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssistantAssociationRequest, DeleteAssistantAssociationResult> asyncHandler) {
        final DeleteAssistantAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssistantAssociationResult>() {
            @Override
            public DeleteAssistantAssociationResult call() throws Exception {
                DeleteAssistantAssociationResult result = null;

                try {
                    result = executeDeleteAssistantAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteContentResult> deleteContentAsync(DeleteContentRequest request) {

        return deleteContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContentResult> deleteContentAsync(final DeleteContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContentRequest, DeleteContentResult> asyncHandler) {
        final DeleteContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContentResult>() {
            @Override
            public DeleteContentResult call() throws Exception {
                DeleteContentResult result = null;

                try {
                    result = executeDeleteContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetAssistantResult> getAssistantAsync(GetAssistantRequest request) {

        return getAssistantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssistantResult> getAssistantAsync(final GetAssistantRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssistantRequest, GetAssistantResult> asyncHandler) {
        final GetAssistantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssistantResult>() {
            @Override
            public GetAssistantResult call() throws Exception {
                GetAssistantResult result = null;

                try {
                    result = executeGetAssistant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssistantAssociationResult> getAssistantAssociationAsync(GetAssistantAssociationRequest request) {

        return getAssistantAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssistantAssociationResult> getAssistantAssociationAsync(final GetAssistantAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssistantAssociationRequest, GetAssistantAssociationResult> asyncHandler) {
        final GetAssistantAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssistantAssociationResult>() {
            @Override
            public GetAssistantAssociationResult call() throws Exception {
                GetAssistantAssociationResult result = null;

                try {
                    result = executeGetAssistantAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetContentResult> getContentAsync(GetContentRequest request) {

        return getContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContentResult> getContentAsync(final GetContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContentRequest, GetContentResult> asyncHandler) {
        final GetContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContentResult>() {
            @Override
            public GetContentResult call() throws Exception {
                GetContentResult result = null;

                try {
                    result = executeGetContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetContentSummaryResult> getContentSummaryAsync(GetContentSummaryRequest request) {

        return getContentSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContentSummaryResult> getContentSummaryAsync(final GetContentSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContentSummaryRequest, GetContentSummaryResult> asyncHandler) {
        final GetContentSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContentSummaryResult>() {
            @Override
            public GetContentSummaryResult call() throws Exception {
                GetContentSummaryResult result = null;

                try {
                    result = executeGetContentSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest request) {

        return getRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(final GetRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler) {
        final GetRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationsResult>() {
            @Override
            public GetRecommendationsResult call() throws Exception {
                GetRecommendationsResult result = null;

                try {
                    result = executeGetRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(final GetSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {
        final GetSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionResult>() {
            @Override
            public GetSessionResult call() throws Exception {
                GetSessionResult result = null;

                try {
                    result = executeGetSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssistantAssociationsResult> listAssistantAssociationsAsync(ListAssistantAssociationsRequest request) {

        return listAssistantAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssistantAssociationsResult> listAssistantAssociationsAsync(final ListAssistantAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssistantAssociationsRequest, ListAssistantAssociationsResult> asyncHandler) {
        final ListAssistantAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssistantAssociationsResult>() {
            @Override
            public ListAssistantAssociationsResult call() throws Exception {
                ListAssistantAssociationsResult result = null;

                try {
                    result = executeListAssistantAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssistantsResult> listAssistantsAsync(ListAssistantsRequest request) {

        return listAssistantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssistantsResult> listAssistantsAsync(final ListAssistantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssistantsRequest, ListAssistantsResult> asyncHandler) {
        final ListAssistantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssistantsResult>() {
            @Override
            public ListAssistantsResult call() throws Exception {
                ListAssistantsResult result = null;

                try {
                    result = executeListAssistants(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListContentsResult> listContentsAsync(ListContentsRequest request) {

        return listContentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContentsResult> listContentsAsync(final ListContentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContentsRequest, ListContentsResult> asyncHandler) {
        final ListContentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContentsResult>() {
            @Override
            public ListContentsResult call() throws Exception {
                ListContentsResult result = null;

                try {
                    result = executeListContents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(NotifyRecommendationsReceivedRequest request) {

        return notifyRecommendationsReceivedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyRecommendationsReceivedResult> notifyRecommendationsReceivedAsync(
            final NotifyRecommendationsReceivedRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyRecommendationsReceivedRequest, NotifyRecommendationsReceivedResult> asyncHandler) {
        final NotifyRecommendationsReceivedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyRecommendationsReceivedResult>() {
            @Override
            public NotifyRecommendationsReceivedResult call() throws Exception {
                NotifyRecommendationsReceivedResult result = null;

                try {
                    result = executeNotifyRecommendationsReceived(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<QueryAssistantResult> queryAssistantAsync(QueryAssistantRequest request) {

        return queryAssistantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryAssistantResult> queryAssistantAsync(final QueryAssistantRequest request,
            final com.amazonaws.handlers.AsyncHandler<QueryAssistantRequest, QueryAssistantResult> asyncHandler) {
        final QueryAssistantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<QueryAssistantResult>() {
            @Override
            public QueryAssistantResult call() throws Exception {
                QueryAssistantResult result = null;

                try {
                    result = executeQueryAssistant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveKnowledgeBaseTemplateUriResult> removeKnowledgeBaseTemplateUriAsync(RemoveKnowledgeBaseTemplateUriRequest request) {

        return removeKnowledgeBaseTemplateUriAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveKnowledgeBaseTemplateUriResult> removeKnowledgeBaseTemplateUriAsync(
            final RemoveKnowledgeBaseTemplateUriRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveKnowledgeBaseTemplateUriRequest, RemoveKnowledgeBaseTemplateUriResult> asyncHandler) {
        final RemoveKnowledgeBaseTemplateUriRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveKnowledgeBaseTemplateUriResult>() {
            @Override
            public RemoveKnowledgeBaseTemplateUriResult call() throws Exception {
                RemoveKnowledgeBaseTemplateUriResult result = null;

                try {
                    result = executeRemoveKnowledgeBaseTemplateUri(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchContentResult> searchContentAsync(SearchContentRequest request) {

        return searchContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchContentResult> searchContentAsync(final SearchContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchContentRequest, SearchContentResult> asyncHandler) {
        final SearchContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchContentResult>() {
            @Override
            public SearchContentResult call() throws Exception {
                SearchContentResult result = null;

                try {
                    result = executeSearchContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchSessionsResult> searchSessionsAsync(SearchSessionsRequest request) {

        return searchSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSessionsResult> searchSessionsAsync(final SearchSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSessionsRequest, SearchSessionsResult> asyncHandler) {
        final SearchSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSessionsResult>() {
            @Override
            public SearchSessionsResult call() throws Exception {
                SearchSessionsResult result = null;

                try {
                    result = executeSearchSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(StartContentUploadRequest request) {

        return startContentUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContentUploadResult> startContentUploadAsync(final StartContentUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContentUploadRequest, StartContentUploadResult> asyncHandler) {
        final StartContentUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContentUploadResult>() {
            @Override
            public StartContentUploadResult call() throws Exception {
                StartContentUploadResult result = null;

                try {
                    result = executeStartContentUpload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateContentResult> updateContentAsync(UpdateContentRequest request) {

        return updateContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContentResult> updateContentAsync(final UpdateContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContentRequest, UpdateContentResult> asyncHandler) {
        final UpdateContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContentResult>() {
            @Override
            public UpdateContentResult call() throws Exception {
                UpdateContentResult result = null;

                try {
                    result = executeUpdateContent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(UpdateKnowledgeBaseTemplateUriRequest request) {

        return updateKnowledgeBaseTemplateUriAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseTemplateUriResult> updateKnowledgeBaseTemplateUriAsync(
            final UpdateKnowledgeBaseTemplateUriRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseTemplateUriRequest, UpdateKnowledgeBaseTemplateUriResult> asyncHandler) {
        final UpdateKnowledgeBaseTemplateUriRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKnowledgeBaseTemplateUriResult>() {
            @Override
            public UpdateKnowledgeBaseTemplateUriResult call() throws Exception {
                UpdateKnowledgeBaseTemplateUriResult result = null;

                try {
                    result = executeUpdateKnowledgeBaseTemplateUri(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
