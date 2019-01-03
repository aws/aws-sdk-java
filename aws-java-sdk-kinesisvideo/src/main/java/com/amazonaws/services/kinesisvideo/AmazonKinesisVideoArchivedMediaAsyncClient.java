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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kinesis Video Archived Media asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoArchivedMediaAsyncClient extends AmazonKinesisVideoArchivedMediaClient implements AmazonKinesisVideoArchivedMediaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKinesisVideoArchivedMediaAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisVideoArchivedMediaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Video Archived Media using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoArchivedMediaAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<GetHLSStreamingSessionURLResult> getHLSStreamingSessionURLAsync(GetHLSStreamingSessionURLRequest request) {

        return getHLSStreamingSessionURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHLSStreamingSessionURLResult> getHLSStreamingSessionURLAsync(final GetHLSStreamingSessionURLRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHLSStreamingSessionURLRequest, GetHLSStreamingSessionURLResult> asyncHandler) {
        final GetHLSStreamingSessionURLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHLSStreamingSessionURLResult>() {
            @Override
            public GetHLSStreamingSessionURLResult call() throws Exception {
                GetHLSStreamingSessionURLResult result = null;

                try {
                    result = executeGetHLSStreamingSessionURL(finalRequest);
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
    public java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(GetMediaForFragmentListRequest request) {

        return getMediaForFragmentListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(final GetMediaForFragmentListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMediaForFragmentListRequest, GetMediaForFragmentListResult> asyncHandler) {
        final GetMediaForFragmentListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMediaForFragmentListResult>() {
            @Override
            public GetMediaForFragmentListResult call() throws Exception {
                GetMediaForFragmentListResult result = null;

                try {
                    result = executeGetMediaForFragmentList(finalRequest);
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
    public java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(ListFragmentsRequest request) {

        return listFragmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(final ListFragmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFragmentsRequest, ListFragmentsResult> asyncHandler) {
        final ListFragmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFragmentsResult>() {
            @Override
            public ListFragmentsResult call() throws Exception {
                ListFragmentsResult result = null;

                try {
                    result = executeListFragments(finalRequest);
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
