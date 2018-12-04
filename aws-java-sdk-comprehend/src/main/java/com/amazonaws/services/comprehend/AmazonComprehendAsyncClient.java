/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Comprehend asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonComprehendAsyncClient extends AmazonComprehendClient implements AmazonComprehendAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonComprehendAsyncClientBuilder asyncBuilder() {
        return AmazonComprehendAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Comprehend using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonComprehendAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(BatchDetectDominantLanguageRequest request) {

        return batchDetectDominantLanguageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(final BatchDetectDominantLanguageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler) {
        final BatchDetectDominantLanguageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDetectDominantLanguageResult>() {
            @Override
            public BatchDetectDominantLanguageResult call() throws Exception {
                BatchDetectDominantLanguageResult result = null;

                try {
                    result = executeBatchDetectDominantLanguage(finalRequest);
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
    public java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(BatchDetectEntitiesRequest request) {

        return batchDetectEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(final BatchDetectEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler) {
        final BatchDetectEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDetectEntitiesResult>() {
            @Override
            public BatchDetectEntitiesResult call() throws Exception {
                BatchDetectEntitiesResult result = null;

                try {
                    result = executeBatchDetectEntities(finalRequest);
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
    public java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(BatchDetectKeyPhrasesRequest request) {

        return batchDetectKeyPhrasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(final BatchDetectKeyPhrasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler) {
        final BatchDetectKeyPhrasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDetectKeyPhrasesResult>() {
            @Override
            public BatchDetectKeyPhrasesResult call() throws Exception {
                BatchDetectKeyPhrasesResult result = null;

                try {
                    result = executeBatchDetectKeyPhrases(finalRequest);
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
    public java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(BatchDetectSentimentRequest request) {

        return batchDetectSentimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectSentimentResult> batchDetectSentimentAsync(final BatchDetectSentimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler) {
        final BatchDetectSentimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDetectSentimentResult>() {
            @Override
            public BatchDetectSentimentResult call() throws Exception {
                BatchDetectSentimentResult result = null;

                try {
                    result = executeBatchDetectSentiment(finalRequest);
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
    public java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(DescribeTopicsDetectionJobRequest request) {

        return describeTopicsDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(final DescribeTopicsDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler) {
        final DescribeTopicsDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTopicsDetectionJobResult>() {
            @Override
            public DescribeTopicsDetectionJobResult call() throws Exception {
                DescribeTopicsDetectionJobResult result = null;

                try {
                    result = executeDescribeTopicsDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(DetectDominantLanguageRequest request) {

        return detectDominantLanguageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectDominantLanguageResult> detectDominantLanguageAsync(final DetectDominantLanguageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler) {
        final DetectDominantLanguageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectDominantLanguageResult>() {
            @Override
            public DetectDominantLanguageResult call() throws Exception {
                DetectDominantLanguageResult result = null;

                try {
                    result = executeDetectDominantLanguage(finalRequest);
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
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request) {

        return detectEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(final DetectEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler) {
        final DetectEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectEntitiesResult>() {
            @Override
            public DetectEntitiesResult call() throws Exception {
                DetectEntitiesResult result = null;

                try {
                    result = executeDetectEntities(finalRequest);
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
    public java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(DetectKeyPhrasesRequest request) {

        return detectKeyPhrasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(final DetectKeyPhrasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler) {
        final DetectKeyPhrasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectKeyPhrasesResult>() {
            @Override
            public DetectKeyPhrasesResult call() throws Exception {
                DetectKeyPhrasesResult result = null;

                try {
                    result = executeDetectKeyPhrases(finalRequest);
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
    public java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest request) {

        return detectSentimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectSentimentResult> detectSentimentAsync(final DetectSentimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler) {
        final DetectSentimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectSentimentResult>() {
            @Override
            public DetectSentimentResult call() throws Exception {
                DetectSentimentResult result = null;

                try {
                    result = executeDetectSentiment(finalRequest);
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
    public java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(ListTopicsDetectionJobsRequest request) {

        return listTopicsDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(final ListTopicsDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler) {
        final ListTopicsDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTopicsDetectionJobsResult>() {
            @Override
            public ListTopicsDetectionJobsResult call() throws Exception {
                ListTopicsDetectionJobsResult result = null;

                try {
                    result = executeListTopicsDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(StartTopicsDetectionJobRequest request) {

        return startTopicsDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(final StartTopicsDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler) {
        final StartTopicsDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTopicsDetectionJobResult>() {
            @Override
            public StartTopicsDetectionJobResult call() throws Exception {
                StartTopicsDetectionJobResult result = null;

                try {
                    result = executeStartTopicsDetectionJob(finalRequest);
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
