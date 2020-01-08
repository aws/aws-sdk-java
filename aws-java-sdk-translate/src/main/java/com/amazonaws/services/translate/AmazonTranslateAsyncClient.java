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
package com.amazonaws.services.translate;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Translate asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Provides translation between one source language and another of the same set of languages.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranslateAsyncClient extends AmazonTranslateClient implements AmazonTranslateAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonTranslateAsyncClientBuilder asyncBuilder() {
        return AmazonTranslateAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Translate using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonTranslateAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest request) {

        return deleteTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(final DeleteTerminologyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTerminologyRequest, DeleteTerminologyResult> asyncHandler) {
        final DeleteTerminologyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTerminologyResult>() {
            @Override
            public DeleteTerminologyResult call() throws Exception {
                DeleteTerminologyResult result = null;

                try {
                    result = executeDeleteTerminology(finalRequest);
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
    public java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(DescribeTextTranslationJobRequest request) {

        return describeTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(final DescribeTextTranslationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTextTranslationJobRequest, DescribeTextTranslationJobResult> asyncHandler) {
        final DescribeTextTranslationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTextTranslationJobResult>() {
            @Override
            public DescribeTextTranslationJobResult call() throws Exception {
                DescribeTextTranslationJobResult result = null;

                try {
                    result = executeDescribeTextTranslationJob(finalRequest);
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
    public java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest request) {

        return getTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(final GetTerminologyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler) {
        final GetTerminologyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTerminologyResult>() {
            @Override
            public GetTerminologyResult call() throws Exception {
                GetTerminologyResult result = null;

                try {
                    result = executeGetTerminology(finalRequest);
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
    public java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest request) {

        return importTerminologyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(final ImportTerminologyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler) {
        final ImportTerminologyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportTerminologyResult>() {
            @Override
            public ImportTerminologyResult call() throws Exception {
                ImportTerminologyResult result = null;

                try {
                    result = executeImportTerminology(finalRequest);
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
    public java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest request) {

        return listTerminologiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(final ListTerminologiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler) {
        final ListTerminologiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTerminologiesResult>() {
            @Override
            public ListTerminologiesResult call() throws Exception {
                ListTerminologiesResult result = null;

                try {
                    result = executeListTerminologies(finalRequest);
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
    public java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(ListTextTranslationJobsRequest request) {

        return listTextTranslationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(final ListTextTranslationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTextTranslationJobsRequest, ListTextTranslationJobsResult> asyncHandler) {
        final ListTextTranslationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTextTranslationJobsResult>() {
            @Override
            public ListTextTranslationJobsResult call() throws Exception {
                ListTextTranslationJobsResult result = null;

                try {
                    result = executeListTextTranslationJobs(finalRequest);
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
    public java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(StartTextTranslationJobRequest request) {

        return startTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTextTranslationJobResult> startTextTranslationJobAsync(final StartTextTranslationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTextTranslationJobRequest, StartTextTranslationJobResult> asyncHandler) {
        final StartTextTranslationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTextTranslationJobResult>() {
            @Override
            public StartTextTranslationJobResult call() throws Exception {
                StartTextTranslationJobResult result = null;

                try {
                    result = executeStartTextTranslationJob(finalRequest);
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
    public java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(StopTextTranslationJobRequest request) {

        return stopTextTranslationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(final StopTextTranslationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTextTranslationJobRequest, StopTextTranslationJobResult> asyncHandler) {
        final StopTextTranslationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTextTranslationJobResult>() {
            @Override
            public StopTextTranslationJobResult call() throws Exception {
                StopTextTranslationJobResult result = null;

                try {
                    result = executeStopTextTranslationJob(finalRequest);
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
    public java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest request) {

        return translateTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TranslateTextResult> translateTextAsync(final TranslateTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler) {
        final TranslateTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TranslateTextResult>() {
            @Override
            public TranslateTextResult call() throws Exception {
                TranslateTextResult result = null;

                try {
                    result = executeTranslateText(finalRequest);
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
