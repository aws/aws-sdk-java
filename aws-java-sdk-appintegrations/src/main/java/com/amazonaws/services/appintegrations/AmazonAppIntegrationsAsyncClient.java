/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon AppIntegrations APIs are in preview release and are subject to change.
 * </p>
 * <p>
 * The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.
 * </p>
 * <p>
 * For information about how you can use external applications with Amazon Connect, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/crm.html">Set up pre-built integrations</a> in the
 * <i>Amazon Connect Administrator Guide</i>.
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
