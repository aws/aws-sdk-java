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
package com.amazonaws.services.mediapackage;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaPackage asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * AWS Elemental MediaPackage
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageAsyncClient extends AWSMediaPackageClient implements AWSMediaPackageAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaPackageAsyncClientBuilder asyncBuilder() {
        return AWSMediaPackageAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaPackage using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request) {

        return describeChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(final DescribeChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler) {
        final DescribeChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelResult>() {
            @Override
            public DescribeChannelResult call() throws Exception {
                DescribeChannelResult result = null;

                try {
                    result = executeDescribeChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(DescribeOriginEndpointRequest request) {

        return describeOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(final DescribeOriginEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOriginEndpointRequest, DescribeOriginEndpointResult> asyncHandler) {
        final DescribeOriginEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOriginEndpointResult>() {
            @Override
            public DescribeOriginEndpointResult call() throws Exception {
                DescribeOriginEndpointResult result = null;

                try {
                    result = executeDescribeOriginEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    @Deprecated
    public java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(RotateChannelCredentialsRequest request) {

        return rotateChannelCredentialsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(final RotateChannelCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RotateChannelCredentialsRequest, RotateChannelCredentialsResult> asyncHandler) {
        final RotateChannelCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RotateChannelCredentialsResult>() {
            @Override
            public RotateChannelCredentialsResult call() throws Exception {
                RotateChannelCredentialsResult result = null;

                try {
                    result = executeRotateChannelCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            RotateIngestEndpointCredentialsRequest request) {

        return rotateIngestEndpointCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            final RotateIngestEndpointCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RotateIngestEndpointCredentialsRequest, RotateIngestEndpointCredentialsResult> asyncHandler) {
        final RotateIngestEndpointCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RotateIngestEndpointCredentialsResult>() {
            @Override
            public RotateIngestEndpointCredentialsResult call() throws Exception {
                RotateIngestEndpointCredentialsResult result = null;

                try {
                    result = executeRotateIngestEndpointCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
