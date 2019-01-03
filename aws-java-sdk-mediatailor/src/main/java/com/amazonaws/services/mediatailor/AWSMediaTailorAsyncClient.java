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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
 * Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
 * (OTT) video applications. For information about using the service, including detailed information about the settings
 * covered in this guide, see the AWS Elemental MediaTailor User Guide.
 * <p>
 * Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
 * example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
 * (ADS).
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaTailorAsyncClient extends AWSMediaTailorClient implements AWSMediaTailorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaTailorAsyncClientBuilder asyncBuilder() {
        return AWSMediaTailorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaTailor using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaTailorAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(DeletePlaybackConfigurationRequest request) {

        return deletePlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(final DeletePlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlaybackConfigurationRequest, DeletePlaybackConfigurationResult> asyncHandler) {
        final DeletePlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlaybackConfigurationResult>() {
            @Override
            public DeletePlaybackConfigurationResult call() throws Exception {
                DeletePlaybackConfigurationResult result = null;

                try {
                    result = executeDeletePlaybackConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest request) {

        return getPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(final GetPlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlaybackConfigurationRequest, GetPlaybackConfigurationResult> asyncHandler) {
        final GetPlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlaybackConfigurationResult>() {
            @Override
            public GetPlaybackConfigurationResult call() throws Exception {
                GetPlaybackConfigurationResult result = null;

                try {
                    result = executeGetPlaybackConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(ListPlaybackConfigurationsRequest request) {

        return listPlaybackConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(final ListPlaybackConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlaybackConfigurationsRequest, ListPlaybackConfigurationsResult> asyncHandler) {
        final ListPlaybackConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlaybackConfigurationsResult>() {
            @Override
            public ListPlaybackConfigurationsResult call() throws Exception {
                ListPlaybackConfigurationsResult result = null;

                try {
                    result = executeListPlaybackConfigurations(finalRequest);
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
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest request) {

        return putPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(final PutPlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPlaybackConfigurationRequest, PutPlaybackConfigurationResult> asyncHandler) {
        final PutPlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPlaybackConfigurationResult>() {
            @Override
            public PutPlaybackConfigurationResult call() throws Exception {
                PutPlaybackConfigurationResult result = null;

                try {
                    result = executePutPlaybackConfiguration(finalRequest);
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
