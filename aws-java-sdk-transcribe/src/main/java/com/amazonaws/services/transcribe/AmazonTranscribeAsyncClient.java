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
package com.amazonaws.services.transcribe;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Transcribe Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeAsyncClient extends AmazonTranscribeClient implements AmazonTranscribeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonTranscribeAsyncClientBuilder asyncBuilder() {
        return AmazonTranscribeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Transcribe Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonTranscribeAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest request) {

        return createVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(final CreateVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler) {
        final CreateVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVocabularyResult>() {
            @Override
            public CreateVocabularyResult call() throws Exception {
                CreateVocabularyResult result = null;

                try {
                    result = executeCreateVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(DeleteTranscriptionJobRequest request) {

        return deleteTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(final DeleteTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTranscriptionJobRequest, DeleteTranscriptionJobResult> asyncHandler) {
        final DeleteTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTranscriptionJobResult>() {
            @Override
            public DeleteTranscriptionJobResult call() throws Exception {
                DeleteTranscriptionJobResult result = null;

                try {
                    result = executeDeleteTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest request) {

        return deleteVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(final DeleteVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler) {
        final DeleteVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVocabularyResult>() {
            @Override
            public DeleteVocabularyResult call() throws Exception {
                DeleteVocabularyResult result = null;

                try {
                    result = executeDeleteVocabulary(finalRequest);
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
    public java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(GetTranscriptionJobRequest request) {

        return getTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(final GetTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTranscriptionJobRequest, GetTranscriptionJobResult> asyncHandler) {
        final GetTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTranscriptionJobResult>() {
            @Override
            public GetTranscriptionJobResult call() throws Exception {
                GetTranscriptionJobResult result = null;

                try {
                    result = executeGetTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest request) {

        return getVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(final GetVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVocabularyRequest, GetVocabularyResult> asyncHandler) {
        final GetVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVocabularyResult>() {
            @Override
            public GetVocabularyResult call() throws Exception {
                GetVocabularyResult result = null;

                try {
                    result = executeGetVocabulary(finalRequest);
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
    public java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(ListTranscriptionJobsRequest request) {

        return listTranscriptionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(final ListTranscriptionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTranscriptionJobsRequest, ListTranscriptionJobsResult> asyncHandler) {
        final ListTranscriptionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTranscriptionJobsResult>() {
            @Override
            public ListTranscriptionJobsResult call() throws Exception {
                ListTranscriptionJobsResult result = null;

                try {
                    result = executeListTranscriptionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(ListVocabulariesRequest request) {

        return listVocabulariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(final ListVocabulariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVocabulariesRequest, ListVocabulariesResult> asyncHandler) {
        final ListVocabulariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVocabulariesResult>() {
            @Override
            public ListVocabulariesResult call() throws Exception {
                ListVocabulariesResult result = null;

                try {
                    result = executeListVocabularies(finalRequest);
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
    public java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(StartTranscriptionJobRequest request) {

        return startTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(final StartTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTranscriptionJobRequest, StartTranscriptionJobResult> asyncHandler) {
        final StartTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTranscriptionJobResult>() {
            @Override
            public StartTranscriptionJobResult call() throws Exception {
                StartTranscriptionJobResult result = null;

                try {
                    result = executeStartTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(UpdateVocabularyRequest request) {

        return updateVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(final UpdateVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVocabularyRequest, UpdateVocabularyResult> asyncHandler) {
        final UpdateVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVocabularyResult>() {
            @Override
            public UpdateVocabularyResult call() throws Exception {
                UpdateVocabularyResult result = null;

                try {
                    result = executeUpdateVocabulary(finalRequest);
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
