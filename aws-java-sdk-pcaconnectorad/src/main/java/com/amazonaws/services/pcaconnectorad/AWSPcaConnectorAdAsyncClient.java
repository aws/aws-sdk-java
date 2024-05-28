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
package com.amazonaws.services.pcaconnectorad;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing PcaConnectorAd asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Private CA Connector for Active Directory creates a connector between Amazon Web Services Private
 * CA and Active Directory (AD) that enables you to provision security certificates for AD signed by a private CA that
 * you own. For more information, see <a
 * href="https://docs.aws.amazon.com/privateca/latest/userguide/ad-connector.html">Amazon Web Services Private CA
 * Connector for Active Directory</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPcaConnectorAdAsyncClient extends AWSPcaConnectorAdClient implements AWSPcaConnectorAdAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPcaConnectorAdAsyncClientBuilder asyncBuilder() {
        return AWSPcaConnectorAdAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on PcaConnectorAd using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPcaConnectorAdAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on PcaConnectorAd using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSPcaConnectorAdAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest request) {

        return createConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(final CreateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler) {
        final CreateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorResult>() {
            @Override
            public CreateConnectorResult call() throws Exception {
                CreateConnectorResult result = null;

                try {
                    result = executeCreateConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryRegistrationResult> createDirectoryRegistrationAsync(CreateDirectoryRegistrationRequest request) {

        return createDirectoryRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryRegistrationResult> createDirectoryRegistrationAsync(final CreateDirectoryRegistrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryRegistrationRequest, CreateDirectoryRegistrationResult> asyncHandler) {
        final CreateDirectoryRegistrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectoryRegistrationResult>() {
            @Override
            public CreateDirectoryRegistrationResult call() throws Exception {
                CreateDirectoryRegistrationResult result = null;

                try {
                    result = executeCreateDirectoryRegistration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateServicePrincipalNameResult> createServicePrincipalNameAsync(CreateServicePrincipalNameRequest request) {

        return createServicePrincipalNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServicePrincipalNameResult> createServicePrincipalNameAsync(final CreateServicePrincipalNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServicePrincipalNameRequest, CreateServicePrincipalNameResult> asyncHandler) {
        final CreateServicePrincipalNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServicePrincipalNameResult>() {
            @Override
            public CreateServicePrincipalNameResult call() throws Exception {
                CreateServicePrincipalNameResult result = null;

                try {
                    result = executeCreateServicePrincipalName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateTemplateGroupAccessControlEntryResult> createTemplateGroupAccessControlEntryAsync(
            CreateTemplateGroupAccessControlEntryRequest request) {

        return createTemplateGroupAccessControlEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateGroupAccessControlEntryResult> createTemplateGroupAccessControlEntryAsync(
            final CreateTemplateGroupAccessControlEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateGroupAccessControlEntryRequest, CreateTemplateGroupAccessControlEntryResult> asyncHandler) {
        final CreateTemplateGroupAccessControlEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateGroupAccessControlEntryResult>() {
            @Override
            public CreateTemplateGroupAccessControlEntryResult call() throws Exception {
                CreateTemplateGroupAccessControlEntryResult result = null;

                try {
                    result = executeCreateTemplateGroupAccessControlEntry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest request) {

        return deleteConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(final DeleteConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler) {
        final DeleteConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectorResult>() {
            @Override
            public DeleteConnectorResult call() throws Exception {
                DeleteConnectorResult result = null;

                try {
                    result = executeDeleteConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryRegistrationResult> deleteDirectoryRegistrationAsync(DeleteDirectoryRegistrationRequest request) {

        return deleteDirectoryRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryRegistrationResult> deleteDirectoryRegistrationAsync(final DeleteDirectoryRegistrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRegistrationRequest, DeleteDirectoryRegistrationResult> asyncHandler) {
        final DeleteDirectoryRegistrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectoryRegistrationResult>() {
            @Override
            public DeleteDirectoryRegistrationResult call() throws Exception {
                DeleteDirectoryRegistrationResult result = null;

                try {
                    result = executeDeleteDirectoryRegistration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteServicePrincipalNameResult> deleteServicePrincipalNameAsync(DeleteServicePrincipalNameRequest request) {

        return deleteServicePrincipalNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServicePrincipalNameResult> deleteServicePrincipalNameAsync(final DeleteServicePrincipalNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServicePrincipalNameRequest, DeleteServicePrincipalNameResult> asyncHandler) {
        final DeleteServicePrincipalNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServicePrincipalNameResult>() {
            @Override
            public DeleteServicePrincipalNameResult call() throws Exception {
                DeleteServicePrincipalNameResult result = null;

                try {
                    result = executeDeleteServicePrincipalName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest request) {

        return deleteTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(final DeleteTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler) {
        final DeleteTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateResult>() {
            @Override
            public DeleteTemplateResult call() throws Exception {
                DeleteTemplateResult result = null;

                try {
                    result = executeDeleteTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateGroupAccessControlEntryResult> deleteTemplateGroupAccessControlEntryAsync(
            DeleteTemplateGroupAccessControlEntryRequest request) {

        return deleteTemplateGroupAccessControlEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateGroupAccessControlEntryResult> deleteTemplateGroupAccessControlEntryAsync(
            final DeleteTemplateGroupAccessControlEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateGroupAccessControlEntryRequest, DeleteTemplateGroupAccessControlEntryResult> asyncHandler) {
        final DeleteTemplateGroupAccessControlEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateGroupAccessControlEntryResult>() {
            @Override
            public DeleteTemplateGroupAccessControlEntryResult call() throws Exception {
                DeleteTemplateGroupAccessControlEntryResult result = null;

                try {
                    result = executeDeleteTemplateGroupAccessControlEntry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectorResult> getConnectorAsync(GetConnectorRequest request) {

        return getConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorResult> getConnectorAsync(final GetConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectorRequest, GetConnectorResult> asyncHandler) {
        final GetConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectorResult>() {
            @Override
            public GetConnectorResult call() throws Exception {
                GetConnectorResult result = null;

                try {
                    result = executeGetConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryRegistrationResult> getDirectoryRegistrationAsync(GetDirectoryRegistrationRequest request) {

        return getDirectoryRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryRegistrationResult> getDirectoryRegistrationAsync(final GetDirectoryRegistrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDirectoryRegistrationRequest, GetDirectoryRegistrationResult> asyncHandler) {
        final GetDirectoryRegistrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDirectoryRegistrationResult>() {
            @Override
            public GetDirectoryRegistrationResult call() throws Exception {
                GetDirectoryRegistrationResult result = null;

                try {
                    result = executeGetDirectoryRegistration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServicePrincipalNameResult> getServicePrincipalNameAsync(GetServicePrincipalNameRequest request) {

        return getServicePrincipalNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServicePrincipalNameResult> getServicePrincipalNameAsync(final GetServicePrincipalNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServicePrincipalNameRequest, GetServicePrincipalNameResult> asyncHandler) {
        final GetServicePrincipalNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServicePrincipalNameResult>() {
            @Override
            public GetServicePrincipalNameResult call() throws Exception {
                GetServicePrincipalNameResult result = null;

                try {
                    result = executeGetServicePrincipalName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetTemplateGroupAccessControlEntryResult> getTemplateGroupAccessControlEntryAsync(
            GetTemplateGroupAccessControlEntryRequest request) {

        return getTemplateGroupAccessControlEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateGroupAccessControlEntryResult> getTemplateGroupAccessControlEntryAsync(
            final GetTemplateGroupAccessControlEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateGroupAccessControlEntryRequest, GetTemplateGroupAccessControlEntryResult> asyncHandler) {
        final GetTemplateGroupAccessControlEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateGroupAccessControlEntryResult>() {
            @Override
            public GetTemplateGroupAccessControlEntryResult call() throws Exception {
                GetTemplateGroupAccessControlEntryResult result = null;

                try {
                    result = executeGetTemplateGroupAccessControlEntry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest request) {

        return listConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(final ListConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler) {
        final ListConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorsResult>() {
            @Override
            public ListConnectorsResult call() throws Exception {
                ListConnectorsResult result = null;

                try {
                    result = executeListConnectors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDirectoryRegistrationsResult> listDirectoryRegistrationsAsync(ListDirectoryRegistrationsRequest request) {

        return listDirectoryRegistrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDirectoryRegistrationsResult> listDirectoryRegistrationsAsync(final ListDirectoryRegistrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDirectoryRegistrationsRequest, ListDirectoryRegistrationsResult> asyncHandler) {
        final ListDirectoryRegistrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDirectoryRegistrationsResult>() {
            @Override
            public ListDirectoryRegistrationsResult call() throws Exception {
                ListDirectoryRegistrationsResult result = null;

                try {
                    result = executeListDirectoryRegistrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServicePrincipalNamesResult> listServicePrincipalNamesAsync(ListServicePrincipalNamesRequest request) {

        return listServicePrincipalNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicePrincipalNamesResult> listServicePrincipalNamesAsync(final ListServicePrincipalNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicePrincipalNamesRequest, ListServicePrincipalNamesResult> asyncHandler) {
        final ListServicePrincipalNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicePrincipalNamesResult>() {
            @Override
            public ListServicePrincipalNamesResult call() throws Exception {
                ListServicePrincipalNamesResult result = null;

                try {
                    result = executeListServicePrincipalNames(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTemplateGroupAccessControlEntriesResult> listTemplateGroupAccessControlEntriesAsync(
            ListTemplateGroupAccessControlEntriesRequest request) {

        return listTemplateGroupAccessControlEntriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateGroupAccessControlEntriesResult> listTemplateGroupAccessControlEntriesAsync(
            final ListTemplateGroupAccessControlEntriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateGroupAccessControlEntriesRequest, ListTemplateGroupAccessControlEntriesResult> asyncHandler) {
        final ListTemplateGroupAccessControlEntriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateGroupAccessControlEntriesResult>() {
            @Override
            public ListTemplateGroupAccessControlEntriesResult call() throws Exception {
                ListTemplateGroupAccessControlEntriesResult result = null;

                try {
                    result = executeListTemplateGroupAccessControlEntries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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

    @Override
    public java.util.concurrent.Future<UpdateTemplateGroupAccessControlEntryResult> updateTemplateGroupAccessControlEntryAsync(
            UpdateTemplateGroupAccessControlEntryRequest request) {

        return updateTemplateGroupAccessControlEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateGroupAccessControlEntryResult> updateTemplateGroupAccessControlEntryAsync(
            final UpdateTemplateGroupAccessControlEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplateGroupAccessControlEntryRequest, UpdateTemplateGroupAccessControlEntryResult> asyncHandler) {
        final UpdateTemplateGroupAccessControlEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplateGroupAccessControlEntryResult>() {
            @Override
            public UpdateTemplateGroupAccessControlEntryResult call() throws Exception {
                UpdateTemplateGroupAccessControlEntryResult result = null;

                try {
                    result = executeUpdateTemplateGroupAccessControlEntry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
