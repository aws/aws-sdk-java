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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kinesis Video asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoAsyncClient extends AmazonKinesisVideoClient implements AmazonKinesisVideoAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKinesisVideoAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisVideoAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Video using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateSignalingChannelResult> createSignalingChannelAsync(CreateSignalingChannelRequest request) {

        return createSignalingChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSignalingChannelResult> createSignalingChannelAsync(final CreateSignalingChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSignalingChannelRequest, CreateSignalingChannelResult> asyncHandler) {
        final CreateSignalingChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSignalingChannelResult>() {
            @Override
            public CreateSignalingChannelResult call() throws Exception {
                CreateSignalingChannelResult result = null;

                try {
                    result = executeCreateSignalingChannel(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(final CreateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {
        final CreateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamResult>() {
            @Override
            public CreateStreamResult call() throws Exception {
                CreateStreamResult result = null;

                try {
                    result = executeCreateStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteSignalingChannelResult> deleteSignalingChannelAsync(DeleteSignalingChannelRequest request) {

        return deleteSignalingChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSignalingChannelResult> deleteSignalingChannelAsync(final DeleteSignalingChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSignalingChannelRequest, DeleteSignalingChannelResult> asyncHandler) {
        final DeleteSignalingChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSignalingChannelResult>() {
            @Override
            public DeleteSignalingChannelResult call() throws Exception {
                DeleteSignalingChannelResult result = null;

                try {
                    result = executeDeleteSignalingChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(final DeleteStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {
        final DeleteStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamResult>() {
            @Override
            public DeleteStreamResult call() throws Exception {
                DeleteStreamResult result = null;

                try {
                    result = executeDeleteStream(finalRequest);
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
    public java.util.concurrent.Future<DescribeSignalingChannelResult> describeSignalingChannelAsync(DescribeSignalingChannelRequest request) {

        return describeSignalingChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSignalingChannelResult> describeSignalingChannelAsync(final DescribeSignalingChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSignalingChannelRequest, DescribeSignalingChannelResult> asyncHandler) {
        final DescribeSignalingChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSignalingChannelResult>() {
            @Override
            public DescribeSignalingChannelResult call() throws Exception {
                DescribeSignalingChannelResult result = null;

                try {
                    result = executeDescribeSignalingChannel(finalRequest);
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
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(final DescribeStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {
        final DescribeStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamResult>() {
            @Override
            public DescribeStreamResult call() throws Exception {
                DescribeStreamResult result = null;

                try {
                    result = executeDescribeStream(finalRequest);
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
    public java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(GetDataEndpointRequest request) {

        return getDataEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(final GetDataEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataEndpointRequest, GetDataEndpointResult> asyncHandler) {
        final GetDataEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataEndpointResult>() {
            @Override
            public GetDataEndpointResult call() throws Exception {
                GetDataEndpointResult result = null;

                try {
                    result = executeGetDataEndpoint(finalRequest);
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
    public java.util.concurrent.Future<GetSignalingChannelEndpointResult> getSignalingChannelEndpointAsync(GetSignalingChannelEndpointRequest request) {

        return getSignalingChannelEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSignalingChannelEndpointResult> getSignalingChannelEndpointAsync(final GetSignalingChannelEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSignalingChannelEndpointRequest, GetSignalingChannelEndpointResult> asyncHandler) {
        final GetSignalingChannelEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSignalingChannelEndpointResult>() {
            @Override
            public GetSignalingChannelEndpointResult call() throws Exception {
                GetSignalingChannelEndpointResult result = null;

                try {
                    result = executeGetSignalingChannelEndpoint(finalRequest);
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
    public java.util.concurrent.Future<ListSignalingChannelsResult> listSignalingChannelsAsync(ListSignalingChannelsRequest request) {

        return listSignalingChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSignalingChannelsResult> listSignalingChannelsAsync(final ListSignalingChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSignalingChannelsRequest, ListSignalingChannelsResult> asyncHandler) {
        final ListSignalingChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSignalingChannelsResult>() {
            @Override
            public ListSignalingChannelsResult call() throws Exception {
                ListSignalingChannelsResult result = null;

                try {
                    result = executeListSignalingChannels(finalRequest);
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {
        final ListStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamsResult>() {
            @Override
            public ListStreamsResult call() throws Exception {
                ListStreamsResult result = null;

                try {
                    result = executeListStreams(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(final ListTagsForStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {
        final ListTagsForStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForStreamResult>() {
            @Override
            public ListTagsForStreamResult call() throws Exception {
                ListTagsForStreamResult result = null;

                try {
                    result = executeListTagsForStream(finalRequest);
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
    public java.util.concurrent.Future<TagStreamResult> tagStreamAsync(TagStreamRequest request) {

        return tagStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagStreamResult> tagStreamAsync(final TagStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagStreamRequest, TagStreamResult> asyncHandler) {
        final TagStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagStreamResult>() {
            @Override
            public TagStreamResult call() throws Exception {
                TagStreamResult result = null;

                try {
                    result = executeTagStream(finalRequest);
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
    public java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(UntagStreamRequest request) {

        return untagStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(final UntagStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagStreamRequest, UntagStreamResult> asyncHandler) {
        final UntagStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagStreamResult>() {
            @Override
            public UntagStreamResult call() throws Exception {
                UntagStreamResult result = null;

                try {
                    result = executeUntagStream(finalRequest);
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
    public java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(UpdateDataRetentionRequest request) {

        return updateDataRetentionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(final UpdateDataRetentionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataRetentionRequest, UpdateDataRetentionResult> asyncHandler) {
        final UpdateDataRetentionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataRetentionResult>() {
            @Override
            public UpdateDataRetentionResult call() throws Exception {
                UpdateDataRetentionResult result = null;

                try {
                    result = executeUpdateDataRetention(finalRequest);
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
    public java.util.concurrent.Future<UpdateSignalingChannelResult> updateSignalingChannelAsync(UpdateSignalingChannelRequest request) {

        return updateSignalingChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSignalingChannelResult> updateSignalingChannelAsync(final UpdateSignalingChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSignalingChannelRequest, UpdateSignalingChannelResult> asyncHandler) {
        final UpdateSignalingChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSignalingChannelResult>() {
            @Override
            public UpdateSignalingChannelResult call() throws Exception {
                UpdateSignalingChannelResult result = null;

                try {
                    result = executeUpdateSignalingChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest request) {

        return updateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(final UpdateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStreamRequest, UpdateStreamResult> asyncHandler) {
        final UpdateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStreamResult>() {
            @Override
            public UpdateStreamResult call() throws Exception {
                UpdateStreamResult result = null;

                try {
                    result = executeUpdateStream(finalRequest);
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
