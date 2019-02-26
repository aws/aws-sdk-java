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
package com.amazonaws.services.pinpointsmsvoice;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoice.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Pinpoint SMS Voice asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * Pinpoint SMS and Voice Messaging public facing APIs
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointSMSVoiceAsyncClient extends AmazonPinpointSMSVoiceClient implements AmazonPinpointSMSVoiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPinpointSMSVoiceAsyncClientBuilder asyncBuilder() {
        return AmazonPinpointSMSVoiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Pinpoint SMS Voice using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
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
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest request) {

        return createConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler) {
        final CreateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetEventDestinationResult>() {
            @Override
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeCreateConfigurationSetEventDestination(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest request) {

        return deleteConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler) {
        final DeleteConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetEventDestinationResult>() {
            @Override
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeDeleteConfigurationSetEventDestination(finalRequest);
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
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest request) {

        return getConfigurationSetEventDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            final GetConfigurationSetEventDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationSetEventDestinationsRequest, GetConfigurationSetEventDestinationsResult> asyncHandler) {
        final GetConfigurationSetEventDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationSetEventDestinationsResult>() {
            @Override
            public GetConfigurationSetEventDestinationsResult call() throws Exception {
                GetConfigurationSetEventDestinationsResult result = null;

                try {
                    result = executeGetConfigurationSetEventDestinations(finalRequest);
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
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest request) {

        return listConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(final ListConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler) {
        final ListConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationSetsResult>() {
            @Override
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result = null;

                try {
                    result = executeListConfigurationSets(finalRequest);
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
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(SendVoiceMessageRequest request) {

        return sendVoiceMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(final SendVoiceMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendVoiceMessageRequest, SendVoiceMessageResult> asyncHandler) {
        final SendVoiceMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendVoiceMessageResult>() {
            @Override
            public SendVoiceMessageResult call() throws Exception {
                SendVoiceMessageResult result = null;

                try {
                    result = executeSendVoiceMessage(finalRequest);
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
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest request) {

        return updateConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler) {
        final UpdateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetEventDestinationResult>() {
            @Override
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeUpdateConfigurationSetEventDestination(finalRequest);
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
