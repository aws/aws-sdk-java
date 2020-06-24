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
package com.amazonaws.services.honeycode;

import javax.annotation.Generated;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Honeycode asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonHoneycodeAsyncClient extends AmazonHoneycodeClient implements AmazonHoneycodeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonHoneycodeAsyncClientBuilder asyncBuilder() {
        return AmazonHoneycodeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Honeycode using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonHoneycodeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Honeycode using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonHoneycodeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest request) {

        return getScreenDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(final GetScreenDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetScreenDataRequest, GetScreenDataResult> asyncHandler) {
        final GetScreenDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetScreenDataResult>() {
            @Override
            public GetScreenDataResult call() throws Exception {
                GetScreenDataResult result = null;

                try {
                    result = executeGetScreenData(finalRequest);
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
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest request) {

        return invokeScreenAutomationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(final InvokeScreenAutomationRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeScreenAutomationRequest, InvokeScreenAutomationResult> asyncHandler) {
        final InvokeScreenAutomationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InvokeScreenAutomationResult>() {
            @Override
            public InvokeScreenAutomationResult call() throws Exception {
                InvokeScreenAutomationResult result = null;

                try {
                    result = executeInvokeScreenAutomation(finalRequest);
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
