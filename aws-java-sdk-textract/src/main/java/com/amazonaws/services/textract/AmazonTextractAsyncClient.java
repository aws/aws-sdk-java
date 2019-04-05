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
