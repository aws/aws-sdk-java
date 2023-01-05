/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.account;

import javax.annotation.Generated;

import com.amazonaws.services.account.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Account asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Operations for Amazon Web Services Account Management
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAccountAsyncClient extends AWSAccountClient implements AWSAccountAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAccountAsyncClientBuilder asyncBuilder() {
        return AWSAccountAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Account using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAccountAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Account using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAccountAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(DeleteAlternateContactRequest request) {

        return deleteAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(final DeleteAlternateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlternateContactRequest, DeleteAlternateContactResult> asyncHandler) {
        final DeleteAlternateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlternateContactResult>() {
            @Override
            public DeleteAlternateContactResult call() throws Exception {
                DeleteAlternateContactResult result = null;

                try {
                    result = executeDeleteAlternateContact(finalRequest);
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
    public java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(GetAlternateContactRequest request) {

        return getAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(final GetAlternateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAlternateContactRequest, GetAlternateContactResult> asyncHandler) {
        final GetAlternateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAlternateContactResult>() {
            @Override
            public GetAlternateContactResult call() throws Exception {
                GetAlternateContactResult result = null;

                try {
                    result = executeGetAlternateContact(finalRequest);
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
    public java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(GetContactInformationRequest request) {

        return getContactInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(final GetContactInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactInformationRequest, GetContactInformationResult> asyncHandler) {
        final GetContactInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactInformationResult>() {
            @Override
            public GetContactInformationResult call() throws Exception {
                GetContactInformationResult result = null;

                try {
                    result = executeGetContactInformation(finalRequest);
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
    public java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(PutAlternateContactRequest request) {

        return putAlternateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(final PutAlternateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAlternateContactRequest, PutAlternateContactResult> asyncHandler) {
        final PutAlternateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAlternateContactResult>() {
            @Override
            public PutAlternateContactResult call() throws Exception {
                PutAlternateContactResult result = null;

                try {
                    result = executePutAlternateContact(finalRequest);
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
    public java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(PutContactInformationRequest request) {

        return putContactInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(final PutContactInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutContactInformationRequest, PutContactInformationResult> asyncHandler) {
        final PutContactInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutContactInformationResult>() {
            @Override
            public PutContactInformationResult call() throws Exception {
                PutContactInformationResult result = null;

                try {
                    result = executePutContactInformation(finalRequest);
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
