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
package com.amazonaws.services.mediapackagev2;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagev2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing mediapackagev2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <note>
 * <p>
 * This guide is intended for creating AWS Elemental MediaPackage resources in MediaPackage Version 2 (v2) starting from
 * May 2023. To get started with MediaPackage v2, create your MediaPackage resources. There isn't an automated process
 * to migrate your resources from MediaPackage v1 to MediaPackage v2.
 * </p>
 * <p>
 * The names of the entities that you use to access this API, like URLs and ARNs, all have the versioning information
 * added, like "v2", to distinguish from the prior version. If you used MediaPackage prior to this release, you can't
 * use the MediaPackage v2 CLI or the MediaPackage v2 API to access any MediaPackage v1 resources.
 * </p>
 * <p>
 * If you created resources in MediaPackage v1, use video on demand (VOD) workflows, and aren't looking to migrate to
 * MediaPackage v2 yet, see the <a
 * href="https://docs.aws.amazon.com/mediapackage/latest/apireference/what-is.html">MediaPackage v1 Live API
 * Reference</a>.
 * </p>
 * </note>
 * <p>
 * This is the AWS Elemental MediaPackage v2 Live REST API Reference. It describes all the MediaPackage API operations
 * for live content in detail, and provides sample requests, responses, and errors for the supported web services
 * protocols.
 * </p>
 * <p>
 * We assume that you have the IAM permissions that you need to use MediaPackage via the REST API. We also assume that
 * you are familiar with the features and operations of MediaPackage, as described in the AWS Elemental MediaPackage
 * User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageV2AsyncClient extends AWSMediaPackageV2Client implements AWSMediaPackageV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaPackageV2AsyncClientBuilder asyncBuilder() {
        return AWSMediaPackageV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mediapackagev2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mediapackagev2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMediaPackageV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(final CreateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {
        final CreateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelResult>() {
            @Override
            public CreateChannelResult call() throws Exception {
                CreateChannelResult result = null;

                try {
                    result = executeCreateChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateChannelGroupResult> createChannelGroupAsync(CreateChannelGroupRequest request) {

        return createChannelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelGroupResult> createChannelGroupAsync(final CreateChannelGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelGroupRequest, CreateChannelGroupResult> asyncHandler) {
        final CreateChannelGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelGroupResult>() {
            @Override
            public CreateChannelGroupResult call() throws Exception {
                CreateChannelGroupResult result = null;

                try {
                    result = executeCreateChannelGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest request) {

        return createOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(final CreateOriginEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOriginEndpointRequest, CreateOriginEndpointResult> asyncHandler) {
        final CreateOriginEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOriginEndpointResult>() {
            @Override
            public CreateOriginEndpointResult call() throws Exception {
                CreateOriginEndpointResult result = null;

                try {
                    result = executeCreateOriginEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(final DeleteChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {
        final DeleteChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelResult>() {
            @Override
            public DeleteChannelResult call() throws Exception {
                DeleteChannelResult result = null;

                try {
                    result = executeDeleteChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelGroupResult> deleteChannelGroupAsync(DeleteChannelGroupRequest request) {

        return deleteChannelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelGroupResult> deleteChannelGroupAsync(final DeleteChannelGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelGroupRequest, DeleteChannelGroupResult> asyncHandler) {
        final DeleteChannelGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelGroupResult>() {
            @Override
            public DeleteChannelGroupResult call() throws Exception {
                DeleteChannelGroupResult result = null;

                try {
                    result = executeDeleteChannelGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest request) {

        return deleteChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(final DeleteChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelPolicyRequest, DeleteChannelPolicyResult> asyncHandler) {
        final DeleteChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelPolicyResult>() {
            @Override
            public DeleteChannelPolicyResult call() throws Exception {
                DeleteChannelPolicyResult result = null;

                try {
                    result = executeDeleteChannelPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest request) {

        return deleteOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(final DeleteOriginEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointRequest, DeleteOriginEndpointResult> asyncHandler) {
        final DeleteOriginEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOriginEndpointResult>() {
            @Override
            public DeleteOriginEndpointResult call() throws Exception {
                DeleteOriginEndpointResult result = null;

                try {
                    result = executeDeleteOriginEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointPolicyResult> deleteOriginEndpointPolicyAsync(DeleteOriginEndpointPolicyRequest request) {

        return deleteOriginEndpointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointPolicyResult> deleteOriginEndpointPolicyAsync(final DeleteOriginEndpointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointPolicyRequest, DeleteOriginEndpointPolicyResult> asyncHandler) {
        final DeleteOriginEndpointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOriginEndpointPolicyResult>() {
            @Override
            public DeleteOriginEndpointPolicyResult call() throws Exception {
                DeleteOriginEndpointPolicyResult result = null;

                try {
                    result = executeDeleteOriginEndpointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request) {

        return getChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(final GetChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler) {
        final GetChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelResult>() {
            @Override
            public GetChannelResult call() throws Exception {
                GetChannelResult result = null;

                try {
                    result = executeGetChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChannelGroupResult> getChannelGroupAsync(GetChannelGroupRequest request) {

        return getChannelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelGroupResult> getChannelGroupAsync(final GetChannelGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelGroupRequest, GetChannelGroupResult> asyncHandler) {
        final GetChannelGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelGroupResult>() {
            @Override
            public GetChannelGroupResult call() throws Exception {
                GetChannelGroupResult result = null;

                try {
                    result = executeGetChannelGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest request) {

        return getChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(final GetChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelPolicyRequest, GetChannelPolicyResult> asyncHandler) {
        final GetChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelPolicyResult>() {
            @Override
            public GetChannelPolicyResult call() throws Exception {
                GetChannelPolicyResult result = null;

                try {
                    result = executeGetChannelPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOriginEndpointResult> getOriginEndpointAsync(GetOriginEndpointRequest request) {

        return getOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOriginEndpointResult> getOriginEndpointAsync(final GetOriginEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOriginEndpointRequest, GetOriginEndpointResult> asyncHandler) {
        final GetOriginEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOriginEndpointResult>() {
            @Override
            public GetOriginEndpointResult call() throws Exception {
                GetOriginEndpointResult result = null;

                try {
                    result = executeGetOriginEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOriginEndpointPolicyResult> getOriginEndpointPolicyAsync(GetOriginEndpointPolicyRequest request) {

        return getOriginEndpointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOriginEndpointPolicyResult> getOriginEndpointPolicyAsync(final GetOriginEndpointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOriginEndpointPolicyRequest, GetOriginEndpointPolicyResult> asyncHandler) {
        final GetOriginEndpointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOriginEndpointPolicyResult>() {
            @Override
            public GetOriginEndpointPolicyResult call() throws Exception {
                GetOriginEndpointPolicyResult result = null;

                try {
                    result = executeGetOriginEndpointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListChannelGroupsResult> listChannelGroupsAsync(ListChannelGroupsRequest request) {

        return listChannelGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelGroupsResult> listChannelGroupsAsync(final ListChannelGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelGroupsRequest, ListChannelGroupsResult> asyncHandler) {
        final ListChannelGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelGroupsResult>() {
            @Override
            public ListChannelGroupsResult call() throws Exception {
                ListChannelGroupsResult result = null;

                try {
                    result = executeListChannelGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(final ListChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {
        final ListChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsResult>() {
            @Override
            public ListChannelsResult call() throws Exception {
                ListChannelsResult result = null;

                try {
                    result = executeListChannels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest request) {

        return listOriginEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(final ListOriginEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOriginEndpointsRequest, ListOriginEndpointsResult> asyncHandler) {
        final ListOriginEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOriginEndpointsResult>() {
            @Override
            public ListOriginEndpointsResult call() throws Exception {
                ListOriginEndpointsResult result = null;

                try {
                    result = executeListOriginEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest request) {

        return putChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(final PutChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutChannelPolicyRequest, PutChannelPolicyResult> asyncHandler) {
        final PutChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutChannelPolicyResult>() {
            @Override
            public PutChannelPolicyResult call() throws Exception {
                PutChannelPolicyResult result = null;

                try {
                    result = executePutChannelPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutOriginEndpointPolicyResult> putOriginEndpointPolicyAsync(PutOriginEndpointPolicyRequest request) {

        return putOriginEndpointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOriginEndpointPolicyResult> putOriginEndpointPolicyAsync(final PutOriginEndpointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOriginEndpointPolicyRequest, PutOriginEndpointPolicyResult> asyncHandler) {
        final PutOriginEndpointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOriginEndpointPolicyResult>() {
            @Override
            public PutOriginEndpointPolicyResult call() throws Exception {
                PutOriginEndpointPolicyResult result = null;

                try {
                    result = executePutOriginEndpointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(final UpdateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {
        final UpdateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelResult>() {
            @Override
            public UpdateChannelResult call() throws Exception {
                UpdateChannelResult result = null;

                try {
                    result = executeUpdateChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelGroupResult> updateChannelGroupAsync(UpdateChannelGroupRequest request) {

        return updateChannelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelGroupResult> updateChannelGroupAsync(final UpdateChannelGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelGroupRequest, UpdateChannelGroupResult> asyncHandler) {
        final UpdateChannelGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelGroupResult>() {
            @Override
            public UpdateChannelGroupResult call() throws Exception {
                UpdateChannelGroupResult result = null;

                try {
                    result = executeUpdateChannelGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest request) {

        return updateOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(final UpdateOriginEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOriginEndpointRequest, UpdateOriginEndpointResult> asyncHandler) {
        final UpdateOriginEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOriginEndpointResult>() {
            @Override
            public UpdateOriginEndpointResult call() throws Exception {
                UpdateOriginEndpointResult result = null;

                try {
                    result = executeUpdateOriginEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
