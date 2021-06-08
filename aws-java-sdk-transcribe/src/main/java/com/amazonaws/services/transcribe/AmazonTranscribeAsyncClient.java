/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Transcribe Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonTranscribeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateLanguageModelResult> createLanguageModelAsync(CreateLanguageModelRequest request) {

        return createLanguageModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLanguageModelResult> createLanguageModelAsync(final CreateLanguageModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLanguageModelRequest, CreateLanguageModelResult> asyncHandler) {
        final CreateLanguageModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLanguageModelResult>() {
            @Override
            public CreateLanguageModelResult call() throws Exception {
                CreateLanguageModelResult result = null;

                try {
                    result = executeCreateLanguageModel(finalRequest);
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
    public java.util.concurrent.Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(CreateMedicalVocabularyRequest request) {

        return createMedicalVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(final CreateMedicalVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMedicalVocabularyRequest, CreateMedicalVocabularyResult> asyncHandler) {
        final CreateMedicalVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMedicalVocabularyResult>() {
            @Override
            public CreateMedicalVocabularyResult call() throws Exception {
                CreateMedicalVocabularyResult result = null;

                try {
                    result = executeCreateMedicalVocabulary(finalRequest);
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
    public java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(CreateVocabularyFilterRequest request) {

        return createVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(final CreateVocabularyFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVocabularyFilterRequest, CreateVocabularyFilterResult> asyncHandler) {
        final CreateVocabularyFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVocabularyFilterResult>() {
            @Override
            public CreateVocabularyFilterResult call() throws Exception {
                CreateVocabularyFilterResult result = null;

                try {
                    result = executeCreateVocabularyFilter(finalRequest);
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
    public java.util.concurrent.Future<DeleteLanguageModelResult> deleteLanguageModelAsync(DeleteLanguageModelRequest request) {

        return deleteLanguageModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLanguageModelResult> deleteLanguageModelAsync(final DeleteLanguageModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLanguageModelRequest, DeleteLanguageModelResult> asyncHandler) {
        final DeleteLanguageModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLanguageModelResult>() {
            @Override
            public DeleteLanguageModelResult call() throws Exception {
                DeleteLanguageModelResult result = null;

                try {
                    result = executeDeleteLanguageModel(finalRequest);
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
    public java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(DeleteMedicalTranscriptionJobRequest request) {

        return deleteMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(
            final DeleteMedicalTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMedicalTranscriptionJobRequest, DeleteMedicalTranscriptionJobResult> asyncHandler) {
        final DeleteMedicalTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMedicalTranscriptionJobResult>() {
            @Override
            public DeleteMedicalTranscriptionJobResult call() throws Exception {
                DeleteMedicalTranscriptionJobResult result = null;

                try {
                    result = executeDeleteMedicalTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteMedicalVocabularyResult> deleteMedicalVocabularyAsync(DeleteMedicalVocabularyRequest request) {

        return deleteMedicalVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMedicalVocabularyResult> deleteMedicalVocabularyAsync(final DeleteMedicalVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMedicalVocabularyRequest, DeleteMedicalVocabularyResult> asyncHandler) {
        final DeleteMedicalVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMedicalVocabularyResult>() {
            @Override
            public DeleteMedicalVocabularyResult call() throws Exception {
                DeleteMedicalVocabularyResult result = null;

                try {
                    result = executeDeleteMedicalVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(DeleteVocabularyFilterRequest request) {

        return deleteVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(final DeleteVocabularyFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVocabularyFilterRequest, DeleteVocabularyFilterResult> asyncHandler) {
        final DeleteVocabularyFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVocabularyFilterResult>() {
            @Override
            public DeleteVocabularyFilterResult call() throws Exception {
                DeleteVocabularyFilterResult result = null;

                try {
                    result = executeDeleteVocabularyFilter(finalRequest);
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
    public java.util.concurrent.Future<DescribeLanguageModelResult> describeLanguageModelAsync(DescribeLanguageModelRequest request) {

        return describeLanguageModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLanguageModelResult> describeLanguageModelAsync(final DescribeLanguageModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLanguageModelRequest, DescribeLanguageModelResult> asyncHandler) {
        final DescribeLanguageModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLanguageModelResult>() {
            @Override
            public DescribeLanguageModelResult call() throws Exception {
                DescribeLanguageModelResult result = null;

                try {
                    result = executeDescribeLanguageModel(finalRequest);
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
    public java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(GetMedicalTranscriptionJobRequest request) {

        return getMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(final GetMedicalTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMedicalTranscriptionJobRequest, GetMedicalTranscriptionJobResult> asyncHandler) {
        final GetMedicalTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMedicalTranscriptionJobResult>() {
            @Override
            public GetMedicalTranscriptionJobResult call() throws Exception {
                GetMedicalTranscriptionJobResult result = null;

                try {
                    result = executeGetMedicalTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(GetMedicalVocabularyRequest request) {

        return getMedicalVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(final GetMedicalVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMedicalVocabularyRequest, GetMedicalVocabularyResult> asyncHandler) {
        final GetMedicalVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMedicalVocabularyResult>() {
            @Override
            public GetMedicalVocabularyResult call() throws Exception {
                GetMedicalVocabularyResult result = null;

                try {
                    result = executeGetMedicalVocabulary(finalRequest);
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
    public java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(GetVocabularyFilterRequest request) {

        return getVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(final GetVocabularyFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVocabularyFilterRequest, GetVocabularyFilterResult> asyncHandler) {
        final GetVocabularyFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVocabularyFilterResult>() {
            @Override
            public GetVocabularyFilterResult call() throws Exception {
                GetVocabularyFilterResult result = null;

                try {
                    result = executeGetVocabularyFilter(finalRequest);
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
    public java.util.concurrent.Future<ListLanguageModelsResult> listLanguageModelsAsync(ListLanguageModelsRequest request) {

        return listLanguageModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLanguageModelsResult> listLanguageModelsAsync(final ListLanguageModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLanguageModelsRequest, ListLanguageModelsResult> asyncHandler) {
        final ListLanguageModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLanguageModelsResult>() {
            @Override
            public ListLanguageModelsResult call() throws Exception {
                ListLanguageModelsResult result = null;

                try {
                    result = executeListLanguageModels(finalRequest);
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
    public java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(ListMedicalTranscriptionJobsRequest request) {

        return listMedicalTranscriptionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(final ListMedicalTranscriptionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMedicalTranscriptionJobsRequest, ListMedicalTranscriptionJobsResult> asyncHandler) {
        final ListMedicalTranscriptionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMedicalTranscriptionJobsResult>() {
            @Override
            public ListMedicalTranscriptionJobsResult call() throws Exception {
                ListMedicalTranscriptionJobsResult result = null;

                try {
                    result = executeListMedicalTranscriptionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(ListMedicalVocabulariesRequest request) {

        return listMedicalVocabulariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(final ListMedicalVocabulariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMedicalVocabulariesRequest, ListMedicalVocabulariesResult> asyncHandler) {
        final ListMedicalVocabulariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMedicalVocabulariesResult>() {
            @Override
            public ListMedicalVocabulariesResult call() throws Exception {
                ListMedicalVocabulariesResult result = null;

                try {
                    result = executeListMedicalVocabularies(finalRequest);
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
    public java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(ListVocabularyFiltersRequest request) {

        return listVocabularyFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(final ListVocabularyFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVocabularyFiltersRequest, ListVocabularyFiltersResult> asyncHandler) {
        final ListVocabularyFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVocabularyFiltersResult>() {
            @Override
            public ListVocabularyFiltersResult call() throws Exception {
                ListVocabularyFiltersResult result = null;

                try {
                    result = executeListVocabularyFilters(finalRequest);
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
    public java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(StartMedicalTranscriptionJobRequest request) {

        return startMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(final StartMedicalTranscriptionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMedicalTranscriptionJobRequest, StartMedicalTranscriptionJobResult> asyncHandler) {
        final StartMedicalTranscriptionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMedicalTranscriptionJobResult>() {
            @Override
            public StartMedicalTranscriptionJobResult call() throws Exception {
                StartMedicalTranscriptionJobResult result = null;

                try {
                    result = executeStartMedicalTranscriptionJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(UpdateMedicalVocabularyRequest request) {

        return updateMedicalVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(final UpdateMedicalVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMedicalVocabularyRequest, UpdateMedicalVocabularyResult> asyncHandler) {
        final UpdateMedicalVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMedicalVocabularyResult>() {
            @Override
            public UpdateMedicalVocabularyResult call() throws Exception {
                UpdateMedicalVocabularyResult result = null;

                try {
                    result = executeUpdateMedicalVocabulary(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(UpdateVocabularyFilterRequest request) {

        return updateVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(final UpdateVocabularyFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVocabularyFilterRequest, UpdateVocabularyFilterResult> asyncHandler) {
        final UpdateVocabularyFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVocabularyFilterResult>() {
            @Override
            public UpdateVocabularyFilterResult call() throws Exception {
                UpdateVocabularyFilterResult result = null;

                try {
                    result = executeUpdateVocabularyFilter(finalRequest);
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
