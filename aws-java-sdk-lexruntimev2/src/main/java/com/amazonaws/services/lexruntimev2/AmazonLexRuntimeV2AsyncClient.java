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
package com.amazonaws.services.lexruntimev2;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntimev2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Lex Runtime V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexRuntimeV2AsyncClient extends AmazonLexRuntimeV2Client implements AmazonLexRuntimeV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLexRuntimeV2AsyncClientBuilder asyncBuilder() {
        return AmazonLexRuntimeV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Lex Runtime V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLexRuntimeV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Lex Runtime V2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLexRuntimeV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest request) {

        return deleteSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(final DeleteSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSessionRequest, DeleteSessionResult> asyncHandler) {
        final DeleteSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSessionResult>() {
            @Override
            public DeleteSessionResult call() throws Exception {
                DeleteSessionResult result = null;

                try {
                    result = executeDeleteSession(finalRequest);
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
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(final GetSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {
        final GetSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionResult>() {
            @Override
            public GetSessionResult call() throws Exception {
                GetSessionResult result = null;

                try {
                    result = executeGetSession(finalRequest);
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
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest request) {

        return putSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(final PutSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSessionRequest, PutSessionResult> asyncHandler) {
        final PutSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSessionResult>() {
            @Override
            public PutSessionResult call() throws Exception {
                PutSessionResult result = null;

                try {
                    result = executePutSession(finalRequest);
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
    public java.util.concurrent.Future<RecognizeTextResult> recognizeTextAsync(RecognizeTextRequest request) {

        return recognizeTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecognizeTextResult> recognizeTextAsync(final RecognizeTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<RecognizeTextRequest, RecognizeTextResult> asyncHandler) {
        final RecognizeTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RecognizeTextResult>() {
            @Override
            public RecognizeTextResult call() throws Exception {
                RecognizeTextResult result = null;

                try {
                    result = executeRecognizeText(finalRequest);
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
    public java.util.concurrent.Future<RecognizeUtteranceResult> recognizeUtteranceAsync(RecognizeUtteranceRequest request) {

        return recognizeUtteranceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecognizeUtteranceResult> recognizeUtteranceAsync(final RecognizeUtteranceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RecognizeUtteranceRequest, RecognizeUtteranceResult> asyncHandler) {
        final RecognizeUtteranceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RecognizeUtteranceResult>() {
            @Override
            public RecognizeUtteranceResult call() throws Exception {
                RecognizeUtteranceResult result = null;

                try {
                    result = executeRecognizeUtterance(finalRequest);
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
