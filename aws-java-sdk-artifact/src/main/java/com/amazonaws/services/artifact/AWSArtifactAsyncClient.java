/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.artifact;

import javax.annotation.Generated;

import com.amazonaws.services.artifact.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Artifact asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This reference provides descriptions of the low-level AWS Artifact Service API.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSArtifactAsyncClient extends AWSArtifactClient implements AWSArtifactAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSArtifactAsyncClientBuilder asyncBuilder() {
        return AWSArtifactAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Artifact using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSArtifactAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Artifact using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSArtifactAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
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
    public java.util.concurrent.Future<GetReportResult> getReportAsync(GetReportRequest request) {

        return getReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportResult> getReportAsync(final GetReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReportRequest, GetReportResult> asyncHandler) {
        final GetReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReportResult>() {
            @Override
            public GetReportResult call() throws Exception {
                GetReportResult result = null;

                try {
                    result = executeGetReport(finalRequest);
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
    public java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(GetReportMetadataRequest request) {

        return getReportMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(final GetReportMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReportMetadataRequest, GetReportMetadataResult> asyncHandler) {
        final GetReportMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReportMetadataResult>() {
            @Override
            public GetReportMetadataResult call() throws Exception {
                GetReportMetadataResult result = null;

                try {
                    result = executeGetReportMetadata(finalRequest);
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
    public java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(GetTermForReportRequest request) {

        return getTermForReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(final GetTermForReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTermForReportRequest, GetTermForReportResult> asyncHandler) {
        final GetTermForReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTermForReportResult>() {
            @Override
            public GetTermForReportResult call() throws Exception {
                GetTermForReportResult result = null;

                try {
                    result = executeGetTermForReport(finalRequest);
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
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request) {

        return listReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(final ListReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler) {
        final ListReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReportsResult>() {
            @Override
            public ListReportsResult call() throws Exception {
                ListReportsResult result = null;

                try {
                    result = executeListReports(finalRequest);
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
    public java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(PutAccountSettingsRequest request) {

        return putAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(final PutAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSettingsRequest, PutAccountSettingsResult> asyncHandler) {
        final PutAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSettingsResult>() {
            @Override
            public PutAccountSettingsResult call() throws Exception {
                PutAccountSettingsResult result = null;

                try {
                    result = executePutAccountSettings(finalRequest);
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
