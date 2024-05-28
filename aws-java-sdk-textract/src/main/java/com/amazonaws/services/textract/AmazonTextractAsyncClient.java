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
package com.amazonaws.services.textract;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Textract asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API
 * reference documentation for Amazon Textract.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTextractAsyncClient extends AmazonTextractClient implements AmazonTextractAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonTextractAsyncClientBuilder asyncBuilder() {
        return AmazonTextractAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Textract using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonTextractAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Textract using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonTextractAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(AnalyzeDocumentRequest request) {

        return analyzeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(final AnalyzeDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<AnalyzeDocumentRequest, AnalyzeDocumentResult> asyncHandler) {
        final AnalyzeDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AnalyzeDocumentResult>() {
            @Override
            public AnalyzeDocumentResult call() throws Exception {
                AnalyzeDocumentResult result = null;

                try {
                    result = executeAnalyzeDocument(finalRequest);
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
    public java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(AnalyzeExpenseRequest request) {

        return analyzeExpenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(final AnalyzeExpenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<AnalyzeExpenseRequest, AnalyzeExpenseResult> asyncHandler) {
        final AnalyzeExpenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AnalyzeExpenseResult>() {
            @Override
            public AnalyzeExpenseResult call() throws Exception {
                AnalyzeExpenseResult result = null;

                try {
                    result = executeAnalyzeExpense(finalRequest);
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
    public java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(AnalyzeIDRequest request) {

        return analyzeIDAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(final AnalyzeIDRequest request,
            final com.amazonaws.handlers.AsyncHandler<AnalyzeIDRequest, AnalyzeIDResult> asyncHandler) {
        final AnalyzeIDRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AnalyzeIDResult>() {
            @Override
            public AnalyzeIDResult call() throws Exception {
                AnalyzeIDResult result = null;

                try {
                    result = executeAnalyzeID(finalRequest);
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
    public java.util.concurrent.Future<CreateAdapterResult> createAdapterAsync(CreateAdapterRequest request) {

        return createAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterResult> createAdapterAsync(final CreateAdapterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAdapterRequest, CreateAdapterResult> asyncHandler) {
        final CreateAdapterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAdapterResult>() {
            @Override
            public CreateAdapterResult call() throws Exception {
                CreateAdapterResult result = null;

                try {
                    result = executeCreateAdapter(finalRequest);
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
    public java.util.concurrent.Future<CreateAdapterVersionResult> createAdapterVersionAsync(CreateAdapterVersionRequest request) {

        return createAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdapterVersionResult> createAdapterVersionAsync(final CreateAdapterVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAdapterVersionRequest, CreateAdapterVersionResult> asyncHandler) {
        final CreateAdapterVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAdapterVersionResult>() {
            @Override
            public CreateAdapterVersionResult call() throws Exception {
                CreateAdapterVersionResult result = null;

                try {
                    result = executeCreateAdapterVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteAdapterResult> deleteAdapterAsync(DeleteAdapterRequest request) {

        return deleteAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterResult> deleteAdapterAsync(final DeleteAdapterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAdapterRequest, DeleteAdapterResult> asyncHandler) {
        final DeleteAdapterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAdapterResult>() {
            @Override
            public DeleteAdapterResult call() throws Exception {
                DeleteAdapterResult result = null;

                try {
                    result = executeDeleteAdapter(finalRequest);
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
    public java.util.concurrent.Future<DeleteAdapterVersionResult> deleteAdapterVersionAsync(DeleteAdapterVersionRequest request) {

        return deleteAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdapterVersionResult> deleteAdapterVersionAsync(final DeleteAdapterVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAdapterVersionRequest, DeleteAdapterVersionResult> asyncHandler) {
        final DeleteAdapterVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAdapterVersionResult>() {
            @Override
            public DeleteAdapterVersionResult call() throws Exception {
                DeleteAdapterVersionResult result = null;

                try {
                    result = executeDeleteAdapterVersion(finalRequest);
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
    public java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(DetectDocumentTextRequest request) {

        return detectDocumentTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(final DetectDocumentTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectDocumentTextRequest, DetectDocumentTextResult> asyncHandler) {
        final DetectDocumentTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectDocumentTextResult>() {
            @Override
            public DetectDocumentTextResult call() throws Exception {
                DetectDocumentTextResult result = null;

                try {
                    result = executeDetectDocumentText(finalRequest);
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
    public java.util.concurrent.Future<GetAdapterResult> getAdapterAsync(GetAdapterRequest request) {

        return getAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdapterResult> getAdapterAsync(final GetAdapterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdapterRequest, GetAdapterResult> asyncHandler) {
        final GetAdapterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdapterResult>() {
            @Override
            public GetAdapterResult call() throws Exception {
                GetAdapterResult result = null;

                try {
                    result = executeGetAdapter(finalRequest);
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
    public java.util.concurrent.Future<GetAdapterVersionResult> getAdapterVersionAsync(GetAdapterVersionRequest request) {

        return getAdapterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdapterVersionResult> getAdapterVersionAsync(final GetAdapterVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdapterVersionRequest, GetAdapterVersionResult> asyncHandler) {
        final GetAdapterVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdapterVersionResult>() {
            @Override
            public GetAdapterVersionResult call() throws Exception {
                GetAdapterVersionResult result = null;

                try {
                    result = executeGetAdapterVersion(finalRequest);
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
    public java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(GetDocumentAnalysisRequest request) {

        return getDocumentAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(final GetDocumentAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentAnalysisRequest, GetDocumentAnalysisResult> asyncHandler) {
        final GetDocumentAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentAnalysisResult>() {
            @Override
            public GetDocumentAnalysisResult call() throws Exception {
                GetDocumentAnalysisResult result = null;

                try {
                    result = executeGetDocumentAnalysis(finalRequest);
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
    public java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(GetDocumentTextDetectionRequest request) {

        return getDocumentTextDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(final GetDocumentTextDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentTextDetectionRequest, GetDocumentTextDetectionResult> asyncHandler) {
        final GetDocumentTextDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentTextDetectionResult>() {
            @Override
            public GetDocumentTextDetectionResult call() throws Exception {
                GetDocumentTextDetectionResult result = null;

                try {
                    result = executeGetDocumentTextDetection(finalRequest);
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
    public java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(GetExpenseAnalysisRequest request) {

        return getExpenseAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(final GetExpenseAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExpenseAnalysisRequest, GetExpenseAnalysisResult> asyncHandler) {
        final GetExpenseAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExpenseAnalysisResult>() {
            @Override
            public GetExpenseAnalysisResult call() throws Exception {
                GetExpenseAnalysisResult result = null;

                try {
                    result = executeGetExpenseAnalysis(finalRequest);
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
    public java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(GetLendingAnalysisRequest request) {

        return getLendingAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(final GetLendingAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisRequest, GetLendingAnalysisResult> asyncHandler) {
        final GetLendingAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLendingAnalysisResult>() {
            @Override
            public GetLendingAnalysisResult call() throws Exception {
                GetLendingAnalysisResult result = null;

                try {
                    result = executeGetLendingAnalysis(finalRequest);
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
    public java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(GetLendingAnalysisSummaryRequest request) {

        return getLendingAnalysisSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(final GetLendingAnalysisSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisSummaryRequest, GetLendingAnalysisSummaryResult> asyncHandler) {
        final GetLendingAnalysisSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLendingAnalysisSummaryResult>() {
            @Override
            public GetLendingAnalysisSummaryResult call() throws Exception {
                GetLendingAnalysisSummaryResult result = null;

                try {
                    result = executeGetLendingAnalysisSummary(finalRequest);
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
    public java.util.concurrent.Future<ListAdapterVersionsResult> listAdapterVersionsAsync(ListAdapterVersionsRequest request) {

        return listAdapterVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAdapterVersionsResult> listAdapterVersionsAsync(final ListAdapterVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAdapterVersionsRequest, ListAdapterVersionsResult> asyncHandler) {
        final ListAdapterVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAdapterVersionsResult>() {
            @Override
            public ListAdapterVersionsResult call() throws Exception {
                ListAdapterVersionsResult result = null;

                try {
                    result = executeListAdapterVersions(finalRequest);
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
    public java.util.concurrent.Future<ListAdaptersResult> listAdaptersAsync(ListAdaptersRequest request) {

        return listAdaptersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAdaptersResult> listAdaptersAsync(final ListAdaptersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAdaptersRequest, ListAdaptersResult> asyncHandler) {
        final ListAdaptersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAdaptersResult>() {
            @Override
            public ListAdaptersResult call() throws Exception {
                ListAdaptersResult result = null;

                try {
                    result = executeListAdapters(finalRequest);
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
    public java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(StartDocumentAnalysisRequest request) {

        return startDocumentAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(final StartDocumentAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDocumentAnalysisRequest, StartDocumentAnalysisResult> asyncHandler) {
        final StartDocumentAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDocumentAnalysisResult>() {
            @Override
            public StartDocumentAnalysisResult call() throws Exception {
                StartDocumentAnalysisResult result = null;

                try {
                    result = executeStartDocumentAnalysis(finalRequest);
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
    public java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(StartDocumentTextDetectionRequest request) {

        return startDocumentTextDetectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(final StartDocumentTextDetectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDocumentTextDetectionRequest, StartDocumentTextDetectionResult> asyncHandler) {
        final StartDocumentTextDetectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDocumentTextDetectionResult>() {
            @Override
            public StartDocumentTextDetectionResult call() throws Exception {
                StartDocumentTextDetectionResult result = null;

                try {
                    result = executeStartDocumentTextDetection(finalRequest);
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
    public java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(StartExpenseAnalysisRequest request) {

        return startExpenseAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(final StartExpenseAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExpenseAnalysisRequest, StartExpenseAnalysisResult> asyncHandler) {
        final StartExpenseAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExpenseAnalysisResult>() {
            @Override
            public StartExpenseAnalysisResult call() throws Exception {
                StartExpenseAnalysisResult result = null;

                try {
                    result = executeStartExpenseAnalysis(finalRequest);
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
    public java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(StartLendingAnalysisRequest request) {

        return startLendingAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(final StartLendingAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartLendingAnalysisRequest, StartLendingAnalysisResult> asyncHandler) {
        final StartLendingAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartLendingAnalysisResult>() {
            @Override
            public StartLendingAnalysisResult call() throws Exception {
                StartLendingAnalysisResult result = null;

                try {
                    result = executeStartLendingAnalysis(finalRequest);
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
    public java.util.concurrent.Future<UpdateAdapterResult> updateAdapterAsync(UpdateAdapterRequest request) {

        return updateAdapterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAdapterResult> updateAdapterAsync(final UpdateAdapterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAdapterRequest, UpdateAdapterResult> asyncHandler) {
        final UpdateAdapterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAdapterResult>() {
            @Override
            public UpdateAdapterResult call() throws Exception {
                UpdateAdapterResult result = null;

                try {
                    result = executeUpdateAdapter(finalRequest);
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
