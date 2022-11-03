/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases;

import javax.annotation.Generated;

import com.amazonaws.services.connectcases.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ConnectCases asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the Amazon Connect Cases API Reference. This guide provides information about the Amazon Connect Cases
 * API, which you can use to create, update, get, and list Cases domains, fields, field options, layouts, templates,
 * cases, related items, and tags.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;For more information about Amazon Connect Cases, see &lt;a href=&quot;https://docs.aws.amazon.com/connect/latest/adminguide/cases.html&quot;&gt;Amazon Connect Cases&lt;/a&gt; in the &lt;i&gt;Amazon Connect Administrator Guide&lt;/i&gt;. &lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectCasesAsyncClient extends AmazonConnectCasesClient implements AmazonConnectCasesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectCasesAsyncClientBuilder asyncBuilder() {
        return AmazonConnectCasesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ConnectCases using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectCasesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ConnectCases using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectCasesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetFieldResult> batchGetFieldAsync(BatchGetFieldRequest request) {

        return batchGetFieldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFieldResult> batchGetFieldAsync(final BatchGetFieldRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetFieldRequest, BatchGetFieldResult> asyncHandler) {
        final BatchGetFieldRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetFieldResult>() {
            @Override
            public BatchGetFieldResult call() throws Exception {
                BatchGetFieldResult result = null;

                try {
                    result = executeBatchGetField(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchPutFieldOptionsResult> batchPutFieldOptionsAsync(BatchPutFieldOptionsRequest request) {

        return batchPutFieldOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutFieldOptionsResult> batchPutFieldOptionsAsync(final BatchPutFieldOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutFieldOptionsRequest, BatchPutFieldOptionsResult> asyncHandler) {
        final BatchPutFieldOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutFieldOptionsResult>() {
            @Override
            public BatchPutFieldOptionsResult call() throws Exception {
                BatchPutFieldOptionsResult result = null;

                try {
                    result = executeBatchPutFieldOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest request) {

        return createCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(final CreateCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler) {
        final CreateCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCaseResult>() {
            @Override
            public CreateCaseResult call() throws Exception {
                CreateCaseResult result = null;

                try {
                    result = executeCreateCase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFieldResult> createFieldAsync(CreateFieldRequest request) {

        return createFieldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFieldResult> createFieldAsync(final CreateFieldRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFieldRequest, CreateFieldResult> asyncHandler) {
        final CreateFieldRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFieldResult>() {
            @Override
            public CreateFieldResult call() throws Exception {
                CreateFieldResult result = null;

                try {
                    result = executeCreateField(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLayoutResult> createLayoutAsync(CreateLayoutRequest request) {

        return createLayoutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLayoutResult> createLayoutAsync(final CreateLayoutRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLayoutRequest, CreateLayoutResult> asyncHandler) {
        final CreateLayoutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLayoutResult>() {
            @Override
            public CreateLayoutResult call() throws Exception {
                CreateLayoutResult result = null;

                try {
                    result = executeCreateLayout(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRelatedItemResult> createRelatedItemAsync(CreateRelatedItemRequest request) {

        return createRelatedItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRelatedItemResult> createRelatedItemAsync(final CreateRelatedItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRelatedItemRequest, CreateRelatedItemResult> asyncHandler) {
        final CreateRelatedItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRelatedItemResult>() {
            @Override
            public CreateRelatedItemResult call() throws Exception {
                CreateRelatedItemResult result = null;

                try {
                    result = executeCreateRelatedItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest request) {

        return createTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(final CreateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler) {
        final CreateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateResult>() {
            @Override
            public CreateTemplateResult call() throws Exception {
                CreateTemplateResult result = null;

                try {
                    result = executeCreateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCaseResult> getCaseAsync(GetCaseRequest request) {

        return getCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCaseResult> getCaseAsync(final GetCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCaseRequest, GetCaseResult> asyncHandler) {
        final GetCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCaseResult>() {
            @Override
            public GetCaseResult call() throws Exception {
                GetCaseResult result = null;

                try {
                    result = executeGetCase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCaseEventConfigurationResult> getCaseEventConfigurationAsync(GetCaseEventConfigurationRequest request) {

        return getCaseEventConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCaseEventConfigurationResult> getCaseEventConfigurationAsync(final GetCaseEventConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCaseEventConfigurationRequest, GetCaseEventConfigurationResult> asyncHandler) {
        final GetCaseEventConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCaseEventConfigurationResult>() {
            @Override
            public GetCaseEventConfigurationResult call() throws Exception {
                GetCaseEventConfigurationResult result = null;

                try {
                    result = executeGetCaseEventConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(final GetDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {
        final GetDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainResult>() {
            @Override
            public GetDomainResult call() throws Exception {
                GetDomainResult result = null;

                try {
                    result = executeGetDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLayoutResult> getLayoutAsync(GetLayoutRequest request) {

        return getLayoutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLayoutResult> getLayoutAsync(final GetLayoutRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLayoutRequest, GetLayoutResult> asyncHandler) {
        final GetLayoutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLayoutResult>() {
            @Override
            public GetLayoutResult call() throws Exception {
                GetLayoutResult result = null;

                try {
                    result = executeGetLayout(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {
        final GetTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateResult>() {
            @Override
            public GetTemplateResult call() throws Exception {
                GetTemplateResult result = null;

                try {
                    result = executeGetTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCasesForContactResult> listCasesForContactAsync(ListCasesForContactRequest request) {

        return listCasesForContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCasesForContactResult> listCasesForContactAsync(final ListCasesForContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCasesForContactRequest, ListCasesForContactResult> asyncHandler) {
        final ListCasesForContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCasesForContactResult>() {
            @Override
            public ListCasesForContactResult call() throws Exception {
                ListCasesForContactResult result = null;

                try {
                    result = executeListCasesForContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFieldOptionsResult> listFieldOptionsAsync(ListFieldOptionsRequest request) {

        return listFieldOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFieldOptionsResult> listFieldOptionsAsync(final ListFieldOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFieldOptionsRequest, ListFieldOptionsResult> asyncHandler) {
        final ListFieldOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFieldOptionsResult>() {
            @Override
            public ListFieldOptionsResult call() throws Exception {
                ListFieldOptionsResult result = null;

                try {
                    result = executeListFieldOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFieldsResult> listFieldsAsync(ListFieldsRequest request) {

        return listFieldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFieldsResult> listFieldsAsync(final ListFieldsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFieldsRequest, ListFieldsResult> asyncHandler) {
        final ListFieldsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFieldsResult>() {
            @Override
            public ListFieldsResult call() throws Exception {
                ListFieldsResult result = null;

                try {
                    result = executeListFields(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLayoutsResult> listLayoutsAsync(ListLayoutsRequest request) {

        return listLayoutsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLayoutsResult> listLayoutsAsync(final ListLayoutsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLayoutsRequest, ListLayoutsResult> asyncHandler) {
        final ListLayoutsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLayoutsResult>() {
            @Override
            public ListLayoutsResult call() throws Exception {
                ListLayoutsResult result = null;

                try {
                    result = executeListLayouts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request) {

        return listTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(final ListTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler) {
        final ListTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplatesResult>() {
            @Override
            public ListTemplatesResult call() throws Exception {
                ListTemplatesResult result = null;

                try {
                    result = executeListTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutCaseEventConfigurationResult> putCaseEventConfigurationAsync(PutCaseEventConfigurationRequest request) {

        return putCaseEventConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCaseEventConfigurationResult> putCaseEventConfigurationAsync(final PutCaseEventConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutCaseEventConfigurationRequest, PutCaseEventConfigurationResult> asyncHandler) {
        final PutCaseEventConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutCaseEventConfigurationResult>() {
            @Override
            public PutCaseEventConfigurationResult call() throws Exception {
                PutCaseEventConfigurationResult result = null;

                try {
                    result = executePutCaseEventConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchCasesResult> searchCasesAsync(SearchCasesRequest request) {

        return searchCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchCasesResult> searchCasesAsync(final SearchCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchCasesRequest, SearchCasesResult> asyncHandler) {
        final SearchCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchCasesResult>() {
            @Override
            public SearchCasesResult call() throws Exception {
                SearchCasesResult result = null;

                try {
                    result = executeSearchCases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchRelatedItemsResult> searchRelatedItemsAsync(SearchRelatedItemsRequest request) {

        return searchRelatedItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchRelatedItemsResult> searchRelatedItemsAsync(final SearchRelatedItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRelatedItemsRequest, SearchRelatedItemsResult> asyncHandler) {
        final SearchRelatedItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchRelatedItemsResult>() {
            @Override
            public SearchRelatedItemsResult call() throws Exception {
                SearchRelatedItemsResult result = null;

                try {
                    result = executeSearchRelatedItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateCaseResult> updateCaseAsync(UpdateCaseRequest request) {

        return updateCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCaseResult> updateCaseAsync(final UpdateCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCaseRequest, UpdateCaseResult> asyncHandler) {
        final UpdateCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCaseResult>() {
            @Override
            public UpdateCaseResult call() throws Exception {
                UpdateCaseResult result = null;

                try {
                    result = executeUpdateCase(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldResult> updateFieldAsync(UpdateFieldRequest request) {

        return updateFieldAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFieldResult> updateFieldAsync(final UpdateFieldRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFieldRequest, UpdateFieldResult> asyncHandler) {
        final UpdateFieldRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFieldResult>() {
            @Override
            public UpdateFieldResult call() throws Exception {
                UpdateFieldResult result = null;

                try {
                    result = executeUpdateField(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLayoutResult> updateLayoutAsync(UpdateLayoutRequest request) {

        return updateLayoutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLayoutResult> updateLayoutAsync(final UpdateLayoutRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLayoutRequest, UpdateLayoutResult> asyncHandler) {
        final UpdateLayoutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLayoutResult>() {
            @Override
            public UpdateLayoutResult call() throws Exception {
                UpdateLayoutResult result = null;

                try {
                    result = executeUpdateLayout(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest request) {

        return updateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(final UpdateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler) {
        final UpdateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplateResult>() {
            @Override
            public UpdateTemplateResult call() throws Exception {
                UpdateTemplateResult result = null;

                try {
                    result = executeUpdateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
