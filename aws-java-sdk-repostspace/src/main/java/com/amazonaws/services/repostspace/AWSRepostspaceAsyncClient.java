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
package com.amazonaws.services.repostspace;

import javax.annotation.Generated;

import com.amazonaws.services.repostspace.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS re:Post Private asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS re:Post Private is a private version of AWS re:Post for enterprises with Enterprise Support or Enterprise On-Ramp
 * Support plans. It provides access to knowledge and experts to accelerate cloud adoption and increase developer
 * productivity. With your organization-specific private re:Post, you can build an organization-specific developer
 * community that drives efficiencies at scale and provides access to valuable knowledge resources. Additionally,
 * re:Post Private centralizes trusted AWS technical content and offers private discussion forums to improve how your
 * teams collaborate internally and with AWS to remove technical obstacles, accelerate innovation, and scale more
 * efficiently in the cloud.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRepostspaceAsyncClient extends AWSRepostspaceClient implements AWSRepostspaceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRepostspaceAsyncClientBuilder asyncBuilder() {
        return AWSRepostspaceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS re:Post Private using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRepostspaceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS re:Post Private using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRepostspaceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(CreateSpaceRequest request) {

        return createSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(final CreateSpaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSpaceRequest, CreateSpaceResult> asyncHandler) {
        final CreateSpaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSpaceResult>() {
            @Override
            public CreateSpaceResult call() throws Exception {
                CreateSpaceResult result = null;

                try {
                    result = executeCreateSpace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(DeleteSpaceRequest request) {

        return deleteSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(final DeleteSpaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSpaceRequest, DeleteSpaceResult> asyncHandler) {
        final DeleteSpaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSpaceResult>() {
            @Override
            public DeleteSpaceResult call() throws Exception {
                DeleteSpaceResult result = null;

                try {
                    result = executeDeleteSpace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(DeregisterAdminRequest request) {

        return deregisterAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(final DeregisterAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterAdminRequest, DeregisterAdminResult> asyncHandler) {
        final DeregisterAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterAdminResult>() {
            @Override
            public DeregisterAdminResult call() throws Exception {
                DeregisterAdminResult result = null;

                try {
                    result = executeDeregisterAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(GetSpaceRequest request) {

        return getSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(final GetSpaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSpaceRequest, GetSpaceResult> asyncHandler) {
        final GetSpaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSpaceResult>() {
            @Override
            public GetSpaceResult call() throws Exception {
                GetSpaceResult result = null;

                try {
                    result = executeGetSpace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(ListSpacesRequest request) {

        return listSpacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(final ListSpacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSpacesRequest, ListSpacesResult> asyncHandler) {
        final ListSpacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSpacesResult>() {
            @Override
            public ListSpacesResult call() throws Exception {
                ListSpacesResult result = null;

                try {
                    result = executeListSpaces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(RegisterAdminRequest request) {

        return registerAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(final RegisterAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterAdminRequest, RegisterAdminResult> asyncHandler) {
        final RegisterAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterAdminResult>() {
            @Override
            public RegisterAdminResult call() throws Exception {
                RegisterAdminResult result = null;

                try {
                    result = executeRegisterAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(SendInvitesRequest request) {

        return sendInvitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(final SendInvitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendInvitesRequest, SendInvitesResult> asyncHandler) {
        final SendInvitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendInvitesResult>() {
            @Override
            public SendInvitesResult call() throws Exception {
                SendInvitesResult result = null;

                try {
                    result = executeSendInvites(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(UpdateSpaceRequest request) {

        return updateSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(final UpdateSpaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSpaceRequest, UpdateSpaceResult> asyncHandler) {
        final UpdateSpaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSpaceResult>() {
            @Override
            public UpdateSpaceResult call() throws Exception {
                UpdateSpaceResult result = null;

                try {
                    result = executeUpdateSpace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
