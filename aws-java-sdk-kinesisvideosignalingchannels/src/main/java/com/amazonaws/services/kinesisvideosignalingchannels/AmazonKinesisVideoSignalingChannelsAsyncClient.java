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
package com.amazonaws.services.kinesisvideosignalingchannels;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideosignalingchannels.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Kinesis Video Signaling Channels asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Kinesis Video Streams Signaling Service is a intermediate service that establishes a communication channel for
 * discovering peers, transmitting offers and answers in order to establish peer-to-peer connection in webRTC
 * technology.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoSignalingChannelsAsyncClient extends AmazonKinesisVideoSignalingChannelsClient implements
        AmazonKinesisVideoSignalingChannelsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKinesisVideoSignalingChannelsAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisVideoSignalingChannelsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Kinesis Video Signaling Channels using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoSignalingChannelsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(GetIceServerConfigRequest request) {

        return getIceServerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(final GetIceServerConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIceServerConfigRequest, GetIceServerConfigResult> asyncHandler) {
        final GetIceServerConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIceServerConfigResult>() {
            @Override
            public GetIceServerConfigResult call() throws Exception {
                GetIceServerConfigResult result = null;

                try {
                    result = executeGetIceServerConfig(finalRequest);
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
    public java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(SendAlexaOfferToMasterRequest request) {

        return sendAlexaOfferToMasterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(final SendAlexaOfferToMasterRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendAlexaOfferToMasterRequest, SendAlexaOfferToMasterResult> asyncHandler) {
        final SendAlexaOfferToMasterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendAlexaOfferToMasterResult>() {
            @Override
            public SendAlexaOfferToMasterResult call() throws Exception {
                SendAlexaOfferToMasterResult result = null;

                try {
                    result = executeSendAlexaOfferToMaster(finalRequest);
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
