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
package com.amazonaws.services.connectparticipant;

import javax.annotation.Generated;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect Participant asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to set up and manage a customer contact
 * center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect enables customer contacts through voice or chat.
 * </p>
 * <p>
 * The APIs described here are used by chat participants, such as agents and customers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectParticipantAsyncClient extends AmazonConnectParticipantClient implements AmazonConnectParticipantAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectParticipantAsyncClientBuilder asyncBuilder() {
        return AmazonConnectParticipantAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect Participant using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectParticipantAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(CreateParticipantConnectionRequest request) {

        return createParticipantConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(final CreateParticipantConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateParticipantConnectionRequest, CreateParticipantConnectionResult> asyncHandler) {
        final CreateParticipantConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateParticipantConnectionResult>() {
            @Override
            public CreateParticipantConnectionResult call() throws Exception {
                CreateParticipantConnectionResult result = null;

                try {
                    result = executeCreateParticipantConnection(finalRequest);
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
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request) {

        return disconnectParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(final DisconnectParticipantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler) {
        final DisconnectParticipantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectParticipantResult>() {
            @Override
            public DisconnectParticipantResult call() throws Exception {
                DisconnectParticipantResult result = null;

                try {
                    result = executeDisconnectParticipant(finalRequest);
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
    public java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest request) {

        return getTranscriptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(final GetTranscriptRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTranscriptRequest, GetTranscriptResult> asyncHandler) {
        final GetTranscriptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTranscriptResult>() {
            @Override
            public GetTranscriptResult call() throws Exception {
                GetTranscriptResult result = null;

                try {
                    result = executeGetTranscript(finalRequest);
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
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request) {

        return sendEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(final SendEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler) {
        final SendEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendEventResult>() {
            @Override
            public SendEventResult call() throws Exception {
                SendEventResult result = null;

                try {
                    result = executeSendEvent(finalRequest);
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
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request) {

        return sendMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(final SendMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {
        final SendMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendMessageResult>() {
            @Override
            public SendMessageResult call() throws Exception {
                SendMessageResult result = null;

                try {
                    result = executeSendMessage(finalRequest);
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
