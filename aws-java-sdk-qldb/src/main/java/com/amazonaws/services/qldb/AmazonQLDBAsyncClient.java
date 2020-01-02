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
package com.amazonaws.services.qldb;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing QLDB asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonQLDBAsyncClient extends AmazonQLDBClient implements AmazonQLDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonQLDBAsyncClientBuilder asyncBuilder() {
        return AmazonQLDBAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on QLDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonQLDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(CreateLedgerRequest request) {

        return createLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(final CreateLedgerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLedgerRequest, CreateLedgerResult> asyncHandler) {
        final CreateLedgerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLedgerResult>() {
            @Override
            public CreateLedgerResult call() throws Exception {
                CreateLedgerResult result = null;

                try {
                    result = executeCreateLedger(finalRequest);
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
    public java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(DeleteLedgerRequest request) {

        return deleteLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(final DeleteLedgerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLedgerRequest, DeleteLedgerResult> asyncHandler) {
        final DeleteLedgerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLedgerResult>() {
            @Override
            public DeleteLedgerResult call() throws Exception {
                DeleteLedgerResult result = null;

                try {
                    result = executeDeleteLedger(finalRequest);
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
    public java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(DescribeJournalS3ExportRequest request) {

        return describeJournalS3ExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(final DescribeJournalS3ExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJournalS3ExportRequest, DescribeJournalS3ExportResult> asyncHandler) {
        final DescribeJournalS3ExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJournalS3ExportResult>() {
            @Override
            public DescribeJournalS3ExportResult call() throws Exception {
                DescribeJournalS3ExportResult result = null;

                try {
                    result = executeDescribeJournalS3Export(finalRequest);
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
    public java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(DescribeLedgerRequest request) {

        return describeLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(final DescribeLedgerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLedgerRequest, DescribeLedgerResult> asyncHandler) {
        final DescribeLedgerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLedgerResult>() {
            @Override
            public DescribeLedgerResult call() throws Exception {
                DescribeLedgerResult result = null;

                try {
                    result = executeDescribeLedger(finalRequest);
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
    public java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(ExportJournalToS3Request request) {

        return exportJournalToS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(final ExportJournalToS3Request request,
            final com.amazonaws.handlers.AsyncHandler<ExportJournalToS3Request, ExportJournalToS3Result> asyncHandler) {
        final ExportJournalToS3Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportJournalToS3Result>() {
            @Override
            public ExportJournalToS3Result call() throws Exception {
                ExportJournalToS3Result result = null;

                try {
                    result = executeExportJournalToS3(finalRequest);
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
    public java.util.concurrent.Future<GetBlockResult> getBlockAsync(GetBlockRequest request) {

        return getBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlockResult> getBlockAsync(final GetBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlockRequest, GetBlockResult> asyncHandler) {
        final GetBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlockResult>() {
            @Override
            public GetBlockResult call() throws Exception {
                GetBlockResult result = null;

                try {
                    result = executeGetBlock(finalRequest);
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
    public java.util.concurrent.Future<GetDigestResult> getDigestAsync(GetDigestRequest request) {

        return getDigestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDigestResult> getDigestAsync(final GetDigestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDigestRequest, GetDigestResult> asyncHandler) {
        final GetDigestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDigestResult>() {
            @Override
            public GetDigestResult call() throws Exception {
                GetDigestResult result = null;

                try {
                    result = executeGetDigest(finalRequest);
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
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest request) {

        return getRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(final GetRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler) {
        final GetRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRevisionResult>() {
            @Override
            public GetRevisionResult call() throws Exception {
                GetRevisionResult result = null;

                try {
                    result = executeGetRevision(finalRequest);
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
    public java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(ListJournalS3ExportsRequest request) {

        return listJournalS3ExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(final ListJournalS3ExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsRequest, ListJournalS3ExportsResult> asyncHandler) {
        final ListJournalS3ExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJournalS3ExportsResult>() {
            @Override
            public ListJournalS3ExportsResult call() throws Exception {
                ListJournalS3ExportsResult result = null;

                try {
                    result = executeListJournalS3Exports(finalRequest);
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
    public java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(ListJournalS3ExportsForLedgerRequest request) {

        return listJournalS3ExportsForLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(
            final ListJournalS3ExportsForLedgerRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsForLedgerRequest, ListJournalS3ExportsForLedgerResult> asyncHandler) {
        final ListJournalS3ExportsForLedgerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJournalS3ExportsForLedgerResult>() {
            @Override
            public ListJournalS3ExportsForLedgerResult call() throws Exception {
                ListJournalS3ExportsForLedgerResult result = null;

                try {
                    result = executeListJournalS3ExportsForLedger(finalRequest);
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
    public java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(ListLedgersRequest request) {

        return listLedgersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(final ListLedgersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLedgersRequest, ListLedgersResult> asyncHandler) {
        final ListLedgersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLedgersResult>() {
            @Override
            public ListLedgersResult call() throws Exception {
                ListLedgersResult result = null;

                try {
                    result = executeListLedgers(finalRequest);
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
    public java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(UpdateLedgerRequest request) {

        return updateLedgerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(final UpdateLedgerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLedgerRequest, UpdateLedgerResult> asyncHandler) {
        final UpdateLedgerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLedgerResult>() {
            @Override
            public UpdateLedgerResult call() throws Exception {
                UpdateLedgerResult result = null;

                try {
                    result = executeUpdateLedger(finalRequest);
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
