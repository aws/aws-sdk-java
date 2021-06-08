/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens;

import javax.annotation.Generated;

import com.amazonaws.services.connectcontactlens.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect Contact Lens asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Contact Lens for Amazon Connect enables you to analyze conversations between customer and agents, by using speech
 * transcription, natural language processing, and intelligent search capabilities. It performs sentiment analysis,
 * detects issues, and enables you to automatically categorize contacts.
 * </p>
 * <p>
 * Contact Lens for Amazon Connect provides both real-time and post-call analytics of customer-agent conversations. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/analyze-conversations.html">Analyze conversations using
 * Contact Lens</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectContactLensAsyncClient extends AmazonConnectContactLensClient implements AmazonConnectContactLensAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectContactLensAsyncClientBuilder asyncBuilder() {
        return AmazonConnectContactLensAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect Contact Lens using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectContactLensAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect Contact Lens using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectContactLensAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            ListRealtimeContactAnalysisSegmentsRequest request) {

        return listRealtimeContactAnalysisSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            final ListRealtimeContactAnalysisSegmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRealtimeContactAnalysisSegmentsRequest, ListRealtimeContactAnalysisSegmentsResult> asyncHandler) {
        final ListRealtimeContactAnalysisSegmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRealtimeContactAnalysisSegmentsResult>() {
            @Override
            public ListRealtimeContactAnalysisSegmentsResult call() throws Exception {
                ListRealtimeContactAnalysisSegmentsResult result = null;

                try {
                    result = executeListRealtimeContactAnalysisSegments(finalRequest);
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
