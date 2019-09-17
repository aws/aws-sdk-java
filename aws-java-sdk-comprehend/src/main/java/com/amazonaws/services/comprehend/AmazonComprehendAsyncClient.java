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
    public java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(BatchDetectSyntaxRequest request) {

        return batchDetectSyntaxAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(final BatchDetectSyntaxRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDetectSyntaxRequest, BatchDetectSyntaxResult> asyncHandler) {
        final BatchDetectSyntaxRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDetectSyntaxResult>() {
            @Override
            public BatchDetectSyntaxResult call() throws Exception {
                BatchDetectSyntaxResult result = null;

                try {
                    result = executeBatchDetectSyntax(finalRequest);
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
    public java.util.concurrent.Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(CreateDocumentClassifierRequest request) {

        return createDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(final CreateDocumentClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentClassifierRequest, CreateDocumentClassifierResult> asyncHandler) {
        final CreateDocumentClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDocumentClassifierResult>() {
            @Override
            public CreateDocumentClassifierResult call() throws Exception {
                CreateDocumentClassifierResult result = null;

                try {
                    result = executeCreateDocumentClassifier(finalRequest);
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
    public java.util.concurrent.Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(CreateEntityRecognizerRequest request) {

        return createEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(final CreateEntityRecognizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEntityRecognizerRequest, CreateEntityRecognizerResult> asyncHandler) {
        final CreateEntityRecognizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEntityRecognizerResult>() {
            @Override
            public CreateEntityRecognizerResult call() throws Exception {
                CreateEntityRecognizerResult result = null;

                try {
                    result = executeCreateEntityRecognizer(finalRequest);
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
    public java.util.concurrent.Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(DeleteDocumentClassifierRequest request) {

        return deleteDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(final DeleteDocumentClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentClassifierRequest, DeleteDocumentClassifierResult> asyncHandler) {
        final DeleteDocumentClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentClassifierResult>() {
            @Override
            public DeleteDocumentClassifierResult call() throws Exception {
                DeleteDocumentClassifierResult result = null;

                try {
                    result = executeDeleteDocumentClassifier(finalRequest);
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
    public java.util.concurrent.Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(DeleteEntityRecognizerRequest request) {

        return deleteEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(final DeleteEntityRecognizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEntityRecognizerRequest, DeleteEntityRecognizerResult> asyncHandler) {
        final DeleteEntityRecognizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEntityRecognizerResult>() {
            @Override
            public DeleteEntityRecognizerResult call() throws Exception {
                DeleteEntityRecognizerResult result = null;

                try {
                    result = executeDeleteEntityRecognizer(finalRequest);
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
    public java.util.concurrent.Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            DescribeDocumentClassificationJobRequest request) {

        return describeDocumentClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            final DescribeDocumentClassificationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentClassificationJobRequest, DescribeDocumentClassificationJobResult> asyncHandler) {
        final DescribeDocumentClassificationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentClassificationJobResult>() {
            @Override
            public DescribeDocumentClassificationJobResult call() throws Exception {
                DescribeDocumentClassificationJobResult result = null;

                try {
                    result = executeDescribeDocumentClassificationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(DescribeDocumentClassifierRequest request) {

        return describeDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(final DescribeDocumentClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentClassifierRequest, DescribeDocumentClassifierResult> asyncHandler) {
        final DescribeDocumentClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentClassifierResult>() {
            @Override
            public DescribeDocumentClassifierResult call() throws Exception {
                DescribeDocumentClassifierResult result = null;

                try {
                    result = executeDescribeDocumentClassifier(finalRequest);
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
    public java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest request) {

        return describeDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            final DescribeDominantLanguageDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDominantLanguageDetectionJobRequest, DescribeDominantLanguageDetectionJobResult> asyncHandler) {
        final DescribeDominantLanguageDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDominantLanguageDetectionJobResult>() {
            @Override
            public DescribeDominantLanguageDetectionJobResult call() throws Exception {
                DescribeDominantLanguageDetectionJobResult result = null;

                try {
                    result = executeDescribeDominantLanguageDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(DescribeEntitiesDetectionJobRequest request) {

        return describeEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(final DescribeEntitiesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionJobRequest, DescribeEntitiesDetectionJobResult> asyncHandler) {
        final DescribeEntitiesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEntitiesDetectionJobResult>() {
            @Override
            public DescribeEntitiesDetectionJobResult call() throws Exception {
                DescribeEntitiesDetectionJobResult result = null;

                try {
                    result = executeDescribeEntitiesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(DescribeEntityRecognizerRequest request) {

        return describeEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(final DescribeEntityRecognizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEntityRecognizerRequest, DescribeEntityRecognizerResult> asyncHandler) {
        final DescribeEntityRecognizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEntityRecognizerResult>() {
            @Override
            public DescribeEntityRecognizerResult call() throws Exception {
                DescribeEntityRecognizerResult result = null;

                try {
                    result = executeDescribeEntityRecognizer(finalRequest);
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
    public java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(DescribeKeyPhrasesDetectionJobRequest request) {

        return describeKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            final DescribeKeyPhrasesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeyPhrasesDetectionJobRequest, DescribeKeyPhrasesDetectionJobResult> asyncHandler) {
        final DescribeKeyPhrasesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeyPhrasesDetectionJobResult>() {
            @Override
            public DescribeKeyPhrasesDetectionJobResult call() throws Exception {
                DescribeKeyPhrasesDetectionJobResult result = null;

                try {
                    result = executeDescribeKeyPhrasesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(DescribeSentimentDetectionJobRequest request) {

        return describeSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            final DescribeSentimentDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSentimentDetectionJobRequest, DescribeSentimentDetectionJobResult> asyncHandler) {
        final DescribeSentimentDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSentimentDetectionJobResult>() {
            @Override
            public DescribeSentimentDetectionJobResult call() throws Exception {
                DescribeSentimentDetectionJobResult result = null;

                try {
                    result = executeDescribeSentimentDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest request) {

        return detectSyntaxAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectSyntaxResult> detectSyntaxAsync(final DetectSyntaxRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectSyntaxRequest, DetectSyntaxResult> asyncHandler) {
        final DetectSyntaxRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectSyntaxResult>() {
            @Override
            public DetectSyntaxResult call() throws Exception {
                DetectSyntaxResult result = null;

                try {
                    result = executeDetectSyntax(finalRequest);
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
    public java.util.concurrent.Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(ListDocumentClassificationJobsRequest request) {

        return listDocumentClassificationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(
            final ListDocumentClassificationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentClassificationJobsRequest, ListDocumentClassificationJobsResult> asyncHandler) {
        final ListDocumentClassificationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentClassificationJobsResult>() {
            @Override
            public ListDocumentClassificationJobsResult call() throws Exception {
                ListDocumentClassificationJobsResult result = null;

                try {
                    result = executeListDocumentClassificationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(ListDocumentClassifiersRequest request) {

        return listDocumentClassifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(final ListDocumentClassifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentClassifiersRequest, ListDocumentClassifiersResult> asyncHandler) {
        final ListDocumentClassifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentClassifiersResult>() {
            @Override
            public ListDocumentClassifiersResult call() throws Exception {
                ListDocumentClassifiersResult result = null;

                try {
                    result = executeListDocumentClassifiers(finalRequest);
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
    public java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest request) {

        return listDominantLanguageDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            final ListDominantLanguageDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDominantLanguageDetectionJobsRequest, ListDominantLanguageDetectionJobsResult> asyncHandler) {
        final ListDominantLanguageDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDominantLanguageDetectionJobsResult>() {
            @Override
            public ListDominantLanguageDetectionJobsResult call() throws Exception {
                ListDominantLanguageDetectionJobsResult result = null;

                try {
                    result = executeListDominantLanguageDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(ListEntitiesDetectionJobsRequest request) {

        return listEntitiesDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(final ListEntitiesDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionJobsRequest, ListEntitiesDetectionJobsResult> asyncHandler) {
        final ListEntitiesDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitiesDetectionJobsResult>() {
            @Override
            public ListEntitiesDetectionJobsResult call() throws Exception {
                ListEntitiesDetectionJobsResult result = null;

                try {
                    result = executeListEntitiesDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListEntityRecognizersResult> listEntityRecognizersAsync(ListEntityRecognizersRequest request) {

        return listEntityRecognizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntityRecognizersResult> listEntityRecognizersAsync(final ListEntityRecognizersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntityRecognizersRequest, ListEntityRecognizersResult> asyncHandler) {
        final ListEntityRecognizersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntityRecognizersResult>() {
            @Override
            public ListEntityRecognizersResult call() throws Exception {
                ListEntityRecognizersResult result = null;

                try {
                    result = executeListEntityRecognizers(finalRequest);
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
    public java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(ListKeyPhrasesDetectionJobsRequest request) {

        return listKeyPhrasesDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(final ListKeyPhrasesDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeyPhrasesDetectionJobsRequest, ListKeyPhrasesDetectionJobsResult> asyncHandler) {
        final ListKeyPhrasesDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeyPhrasesDetectionJobsResult>() {
            @Override
            public ListKeyPhrasesDetectionJobsResult call() throws Exception {
                ListKeyPhrasesDetectionJobsResult result = null;

                try {
                    result = executeListKeyPhrasesDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(ListSentimentDetectionJobsRequest request) {

        return listSentimentDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(final ListSentimentDetectionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSentimentDetectionJobsRequest, ListSentimentDetectionJobsResult> asyncHandler) {
        final ListSentimentDetectionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSentimentDetectionJobsResult>() {
            @Override
            public ListSentimentDetectionJobsResult call() throws Exception {
                ListSentimentDetectionJobsResult result = null;

                try {
                    result = executeListSentimentDetectionJobs(finalRequest);
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
    public java.util.concurrent.Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(StartDocumentClassificationJobRequest request) {

        return startDocumentClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(
            final StartDocumentClassificationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDocumentClassificationJobRequest, StartDocumentClassificationJobResult> asyncHandler) {
        final StartDocumentClassificationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDocumentClassificationJobResult>() {
            @Override
            public StartDocumentClassificationJobResult call() throws Exception {
                StartDocumentClassificationJobResult result = null;

                try {
                    result = executeStartDocumentClassificationJob(finalRequest);
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
    public java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest request) {

        return startDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            final StartDominantLanguageDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDominantLanguageDetectionJobRequest, StartDominantLanguageDetectionJobResult> asyncHandler) {
        final StartDominantLanguageDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDominantLanguageDetectionJobResult>() {
            @Override
            public StartDominantLanguageDetectionJobResult call() throws Exception {
                StartDominantLanguageDetectionJobResult result = null;

                try {
                    result = executeStartDominantLanguageDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(StartEntitiesDetectionJobRequest request) {

        return startEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(final StartEntitiesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionJobRequest, StartEntitiesDetectionJobResult> asyncHandler) {
        final StartEntitiesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartEntitiesDetectionJobResult>() {
            @Override
            public StartEntitiesDetectionJobResult call() throws Exception {
                StartEntitiesDetectionJobResult result = null;

                try {
                    result = executeStartEntitiesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(StartKeyPhrasesDetectionJobRequest request) {

        return startKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(final StartKeyPhrasesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartKeyPhrasesDetectionJobRequest, StartKeyPhrasesDetectionJobResult> asyncHandler) {
        final StartKeyPhrasesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartKeyPhrasesDetectionJobResult>() {
            @Override
            public StartKeyPhrasesDetectionJobResult call() throws Exception {
                StartKeyPhrasesDetectionJobResult result = null;

                try {
                    result = executeStartKeyPhrasesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(StartSentimentDetectionJobRequest request) {

        return startSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(final StartSentimentDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSentimentDetectionJobRequest, StartSentimentDetectionJobResult> asyncHandler) {
        final StartSentimentDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSentimentDetectionJobResult>() {
            @Override
            public StartSentimentDetectionJobResult call() throws Exception {
                StartSentimentDetectionJobResult result = null;

                try {
                    result = executeStartSentimentDetectionJob(finalRequest);
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

    @Override
    public java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest request) {

        return stopDominantLanguageDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            final StopDominantLanguageDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDominantLanguageDetectionJobRequest, StopDominantLanguageDetectionJobResult> asyncHandler) {
        final StopDominantLanguageDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDominantLanguageDetectionJobResult>() {
            @Override
            public StopDominantLanguageDetectionJobResult call() throws Exception {
                StopDominantLanguageDetectionJobResult result = null;

                try {
                    result = executeStopDominantLanguageDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(StopEntitiesDetectionJobRequest request) {

        return stopEntitiesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(final StopEntitiesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionJobRequest, StopEntitiesDetectionJobResult> asyncHandler) {
        final StopEntitiesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEntitiesDetectionJobResult>() {
            @Override
            public StopEntitiesDetectionJobResult call() throws Exception {
                StopEntitiesDetectionJobResult result = null;

                try {
                    result = executeStopEntitiesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(StopKeyPhrasesDetectionJobRequest request) {

        return stopKeyPhrasesDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(final StopKeyPhrasesDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopKeyPhrasesDetectionJobRequest, StopKeyPhrasesDetectionJobResult> asyncHandler) {
        final StopKeyPhrasesDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopKeyPhrasesDetectionJobResult>() {
            @Override
            public StopKeyPhrasesDetectionJobResult call() throws Exception {
                StopKeyPhrasesDetectionJobResult result = null;

                try {
                    result = executeStopKeyPhrasesDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(StopSentimentDetectionJobRequest request) {

        return stopSentimentDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(final StopSentimentDetectionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopSentimentDetectionJobRequest, StopSentimentDetectionJobResult> asyncHandler) {
        final StopSentimentDetectionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopSentimentDetectionJobResult>() {
            @Override
            public StopSentimentDetectionJobResult call() throws Exception {
                StopSentimentDetectionJobResult result = null;

                try {
                    result = executeStopSentimentDetectionJob(finalRequest);
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
    public java.util.concurrent.Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(StopTrainingDocumentClassifierRequest request) {

        return stopTrainingDocumentClassifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(
            final StopTrainingDocumentClassifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTrainingDocumentClassifierRequest, StopTrainingDocumentClassifierResult> asyncHandler) {
        final StopTrainingDocumentClassifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTrainingDocumentClassifierResult>() {
            @Override
            public StopTrainingDocumentClassifierResult call() throws Exception {
                StopTrainingDocumentClassifierResult result = null;

                try {
                    result = executeStopTrainingDocumentClassifier(finalRequest);
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
    public java.util.concurrent.Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(StopTrainingEntityRecognizerRequest request) {

        return stopTrainingEntityRecognizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(final StopTrainingEntityRecognizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTrainingEntityRecognizerRequest, StopTrainingEntityRecognizerResult> asyncHandler) {
        final StopTrainingEntityRecognizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTrainingEntityRecognizerResult>() {
            @Override
            public StopTrainingEntityRecognizerResult call() throws Exception {
                StopTrainingEntityRecognizerResult result = null;

                try {
                    result = executeStopTrainingEntityRecognizer(finalRequest);
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
