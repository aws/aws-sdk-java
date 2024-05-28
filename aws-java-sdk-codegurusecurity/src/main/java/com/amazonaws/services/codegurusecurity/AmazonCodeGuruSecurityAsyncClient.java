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
package com.amazonaws.services.codegurusecurity;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CodeGuru Security asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <note>
 * <p>
 * Amazon CodeGuru Security is in preview release and is subject to change.
 * </p>
 * </note>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Security API operations. CodeGuru Security is a service
 * that uses program analysis and machine learning to detect security policy violations and vulnerabilities, and
 * recommends ways to address these security risks.
 * </p>
 * <p>
 * By proactively detecting and providing recommendations for addressing security risks, CodeGuru Security improves the
 * overall security of your application code. For more information about CodeGuru Security, see the <a
 * href="https://docs.aws.amazon.com/codeguru/latest/security-ug/what-is-codeguru-security.html">Amazon CodeGuru
 * Security User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruSecurityAsyncClient extends AmazonCodeGuruSecurityClient implements AmazonCodeGuruSecurityAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCodeGuruSecurityAsyncClientBuilder asyncBuilder() {
        return AmazonCodeGuruSecurityAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CodeGuru Security using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruSecurityAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CodeGuru Security using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCodeGuruSecurityAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(BatchGetFindingsRequest request) {

        return batchGetFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(final BatchGetFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetFindingsRequest, BatchGetFindingsResult> asyncHandler) {
        final BatchGetFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetFindingsResult>() {
            @Override
            public BatchGetFindingsResult call() throws Exception {
                BatchGetFindingsResult result = null;

                try {
                    result = executeBatchGetFindings(finalRequest);
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
    public java.util.concurrent.Future<CreateScanResult> createScanAsync(CreateScanRequest request) {

        return createScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScanResult> createScanAsync(final CreateScanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScanRequest, CreateScanResult> asyncHandler) {
        final CreateScanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScanResult>() {
            @Override
            public CreateScanResult call() throws Exception {
                CreateScanResult result = null;

                try {
                    result = executeCreateScan(finalRequest);
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
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest request) {

        return createUploadUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(final CreateUploadUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUploadUrlRequest, CreateUploadUrlResult> asyncHandler) {
        final CreateUploadUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUploadUrlResult>() {
            @Override
            public CreateUploadUrlResult call() throws Exception {
                CreateUploadUrlResult result = null;

                try {
                    result = executeCreateUploadUrl(finalRequest);
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
    public java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest request) {

        return getAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(final GetAccountConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountConfigurationRequest, GetAccountConfigurationResult> asyncHandler) {
        final GetAccountConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountConfigurationResult>() {
            @Override
            public GetAccountConfigurationResult call() throws Exception {
                GetAccountConfigurationResult result = null;

                try {
                    result = executeGetAccountConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(final GetFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {
        final GetFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsResult>() {
            @Override
            public GetFindingsResult call() throws Exception {
                GetFindingsResult result = null;

                try {
                    result = executeGetFindings(finalRequest);
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
    public java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(GetMetricsSummaryRequest request) {

        return getMetricsSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(final GetMetricsSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricsSummaryRequest, GetMetricsSummaryResult> asyncHandler) {
        final GetMetricsSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricsSummaryResult>() {
            @Override
            public GetMetricsSummaryResult call() throws Exception {
                GetMetricsSummaryResult result = null;

                try {
                    result = executeGetMetricsSummary(finalRequest);
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
    public java.util.concurrent.Future<GetScanResult> getScanAsync(GetScanRequest request) {

        return getScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScanResult> getScanAsync(final GetScanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetScanRequest, GetScanResult> asyncHandler) {
        final GetScanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetScanResult>() {
            @Override
            public GetScanResult call() throws Exception {
                GetScanResult result = null;

                try {
                    result = executeGetScan(finalRequest);
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
    public java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(ListFindingsMetricsRequest request) {

        return listFindingsMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(final ListFindingsMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsMetricsRequest, ListFindingsMetricsResult> asyncHandler) {
        final ListFindingsMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsMetricsResult>() {
            @Override
            public ListFindingsMetricsResult call() throws Exception {
                ListFindingsMetricsResult result = null;

                try {
                    result = executeListFindingsMetrics(finalRequest);
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
    public java.util.concurrent.Future<ListScansResult> listScansAsync(ListScansRequest request) {

        return listScansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScansResult> listScansAsync(final ListScansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScansRequest, ListScansResult> asyncHandler) {
        final ListScansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScansResult>() {
            @Override
            public ListScansResult call() throws Exception {
                ListScansResult result = null;

                try {
                    result = executeListScans(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(UpdateAccountConfigurationRequest request) {

        return updateAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(final UpdateAccountConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountConfigurationRequest, UpdateAccountConfigurationResult> asyncHandler) {
        final UpdateAccountConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountConfigurationResult>() {
            @Override
            public UpdateAccountConfigurationResult call() throws Exception {
                UpdateAccountConfigurationResult result = null;

                try {
                    result = executeUpdateAccountConfiguration(finalRequest);
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
