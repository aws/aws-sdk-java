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
package com.amazonaws.services.appintegrations;

import javax.annotation.Generated;

import com.amazonaws.services.appintegrations.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon AppIntegrations Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.
 * </p>
 * <p>
 * For information about how you can use external applications with Amazon Connect, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/crm.html">Set up pre-built integrations</a> and <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-wisdom.html">Deliver information to agents
 * using Amazon Connect Wisdom</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppIntegrationsAsyncClient extends AmazonAppIntegrationsClient implements AmazonAppIntegrationsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAppIntegrationsAsyncClientBuilder asyncBuilder() {
        return AmazonAppIntegrationsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppIntegrations Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAppIntegrationsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppIntegrations Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonAppIntegrationsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(CreateDataIntegrationRequest request) {

        return createDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(final CreateDataIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataIntegrationRequest, CreateDataIntegrationResult> asyncHandler) {
        final CreateDataIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataIntegrationResult>() {
            @Override
            public CreateDataIntegrationResult call() throws Exception {
                CreateDataIntegrationResult result = null;

                try {
                    result = executeCreateDataIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(CreateEventIntegrationRequest request) {

        return createEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(final CreateEventIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventIntegrationRequest, CreateEventIntegrationResult> asyncHandler) {
        final CreateEventIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventIntegrationResult>() {
            @Override
            public CreateEventIntegrationResult call() throws Exception {
                CreateEventIntegrationResult result = null;

                try {
                    result = executeCreateEventIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(DeleteDataIntegrationRequest request) {

        return deleteDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(final DeleteDataIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataIntegrationRequest, DeleteDataIntegrationResult> asyncHandler) {
        final DeleteDataIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataIntegrationResult>() {
            @Override
            public DeleteDataIntegrationResult call() throws Exception {
                DeleteDataIntegrationResult result = null;

                try {
                    result = executeDeleteDataIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(DeleteEventIntegrationRequest request) {

        return deleteEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(final DeleteEventIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventIntegrationRequest, DeleteEventIntegrationResult> asyncHandler) {
        final DeleteEventIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventIntegrationResult>() {
            @Override
            public DeleteEventIntegrationResult call() throws Exception {
                DeleteEventIntegrationResult result = null;

                try {
                    result = executeDeleteEventIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(GetDataIntegrationRequest request) {

        return getDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(final GetDataIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataIntegrationRequest, GetDataIntegrationResult> asyncHandler) {
        final GetDataIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataIntegrationResult>() {
            @Override
            public GetDataIntegrationResult call() throws Exception {
                GetDataIntegrationResult result = null;

                try {
                    result = executeGetDataIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(GetEventIntegrationRequest request) {

        return getEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(final GetEventIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventIntegrationRequest, GetEventIntegrationResult> asyncHandler) {
        final GetEventIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventIntegrationResult>() {
            @Override
            public GetEventIntegrationResult call() throws Exception {
                GetEventIntegrationResult result = null;

                try {
                    result = executeGetEventIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            ListDataIntegrationAssociationsRequest request) {

        return listDataIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            final ListDataIntegrationAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataIntegrationAssociationsRequest, ListDataIntegrationAssociationsResult> asyncHandler) {
        final ListDataIntegrationAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataIntegrationAssociationsResult>() {
            @Override
            public ListDataIntegrationAssociationsResult call() throws Exception {
                ListDataIntegrationAssociationsResult result = null;

                try {
                    result = executeListDataIntegrationAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(ListDataIntegrationsRequest request) {

        return listDataIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(final ListDataIntegrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataIntegrationsRequest, ListDataIntegrationsResult> asyncHandler) {
        final ListDataIntegrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataIntegrationsResult>() {
            @Override
            public ListDataIntegrationsResult call() throws Exception {
                ListDataIntegrationsResult result = null;

                try {
                    result = executeListDataIntegrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            ListEventIntegrationAssociationsRequest request) {

        return listEventIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            final ListEventIntegrationAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventIntegrationAssociationsRequest, ListEventIntegrationAssociationsResult> asyncHandler) {
        final ListEventIntegrationAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventIntegrationAssociationsResult>() {
            @Override
            public ListEventIntegrationAssociationsResult call() throws Exception {
                ListEventIntegrationAssociationsResult result = null;

                try {
                    result = executeListEventIntegrationAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(ListEventIntegrationsRequest request) {

        return listEventIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(final ListEventIntegrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventIntegrationsRequest, ListEventIntegrationsResult> asyncHandler) {
        final ListEventIntegrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventIntegrationsResult>() {
            @Override
            public ListEventIntegrationsResult call() throws Exception {
                ListEventIntegrationsResult result = null;

                try {
                    result = executeListEventIntegrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(UpdateDataIntegrationRequest request) {

        return updateDataIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(final UpdateDataIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataIntegrationRequest, UpdateDataIntegrationResult> asyncHandler) {
        final UpdateDataIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataIntegrationResult>() {
            @Override
            public UpdateDataIntegrationResult call() throws Exception {
                UpdateDataIntegrationResult result = null;

                try {
                    result = executeUpdateDataIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(UpdateEventIntegrationRequest request) {

        return updateEventIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(final UpdateEventIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventIntegrationRequest, UpdateEventIntegrationResult> asyncHandler) {
        final UpdateEventIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventIntegrationResult>() {
            @Override
            public UpdateEventIntegrationResult call() throws Exception {
                UpdateEventIntegrationResult result = null;

                try {
                    result = executeUpdateEventIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
