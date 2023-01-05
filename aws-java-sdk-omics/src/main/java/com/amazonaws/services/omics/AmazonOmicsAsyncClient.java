/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Omics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>Amazon Omics API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/omics/latest/dev/">What is Amazon Omics?</a> in the <i>Amazon Omics Developer
 * Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOmicsAsyncClient extends AmazonOmicsClient implements AmazonOmicsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonOmicsAsyncClientBuilder asyncBuilder() {
        return AmazonOmicsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Omics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonOmicsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Omics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonOmicsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(BatchDeleteReadSetRequest request) {

        return batchDeleteReadSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(final BatchDeleteReadSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteReadSetRequest, BatchDeleteReadSetResult> asyncHandler) {
        final BatchDeleteReadSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteReadSetResult>() {
            @Override
            public BatchDeleteReadSetResult call() throws Exception {
                BatchDeleteReadSetResult result = null;

                try {
                    result = executeBatchDeleteReadSet(finalRequest);
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
    public java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(CancelAnnotationImportJobRequest request) {

        return cancelAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(final CancelAnnotationImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelAnnotationImportJobRequest, CancelAnnotationImportJobResult> asyncHandler) {
        final CancelAnnotationImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelAnnotationImportJobResult>() {
            @Override
            public CancelAnnotationImportJobResult call() throws Exception {
                CancelAnnotationImportJobResult result = null;

                try {
                    result = executeCancelAnnotationImportJob(finalRequest);
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
    public java.util.concurrent.Future<CancelRunResult> cancelRunAsync(CancelRunRequest request) {

        return cancelRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRunResult> cancelRunAsync(final CancelRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelRunRequest, CancelRunResult> asyncHandler) {
        final CancelRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelRunResult>() {
            @Override
            public CancelRunResult call() throws Exception {
                CancelRunResult result = null;

                try {
                    result = executeCancelRun(finalRequest);
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
    public java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(CancelVariantImportJobRequest request) {

        return cancelVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(final CancelVariantImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelVariantImportJobRequest, CancelVariantImportJobResult> asyncHandler) {
        final CancelVariantImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelVariantImportJobResult>() {
            @Override
            public CancelVariantImportJobResult call() throws Exception {
                CancelVariantImportJobResult result = null;

                try {
                    result = executeCancelVariantImportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(CreateAnnotationStoreRequest request) {

        return createAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(final CreateAnnotationStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnnotationStoreRequest, CreateAnnotationStoreResult> asyncHandler) {
        final CreateAnnotationStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnnotationStoreResult>() {
            @Override
            public CreateAnnotationStoreResult call() throws Exception {
                CreateAnnotationStoreResult result = null;

                try {
                    result = executeCreateAnnotationStore(finalRequest);
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
    public java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(CreateReferenceStoreRequest request) {

        return createReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(final CreateReferenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReferenceStoreRequest, CreateReferenceStoreResult> asyncHandler) {
        final CreateReferenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReferenceStoreResult>() {
            @Override
            public CreateReferenceStoreResult call() throws Exception {
                CreateReferenceStoreResult result = null;

                try {
                    result = executeCreateReferenceStore(finalRequest);
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
    public java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(CreateRunGroupRequest request) {

        return createRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(final CreateRunGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRunGroupRequest, CreateRunGroupResult> asyncHandler) {
        final CreateRunGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRunGroupResult>() {
            @Override
            public CreateRunGroupResult call() throws Exception {
                CreateRunGroupResult result = null;

                try {
                    result = executeCreateRunGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(CreateSequenceStoreRequest request) {

        return createSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(final CreateSequenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSequenceStoreRequest, CreateSequenceStoreResult> asyncHandler) {
        final CreateSequenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSequenceStoreResult>() {
            @Override
            public CreateSequenceStoreResult call() throws Exception {
                CreateSequenceStoreResult result = null;

                try {
                    result = executeCreateSequenceStore(finalRequest);
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
    public java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(CreateVariantStoreRequest request) {

        return createVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(final CreateVariantStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVariantStoreRequest, CreateVariantStoreResult> asyncHandler) {
        final CreateVariantStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVariantStoreResult>() {
            @Override
            public CreateVariantStoreResult call() throws Exception {
                CreateVariantStoreResult result = null;

                try {
                    result = executeCreateVariantStore(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(final CreateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {
        final CreateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowResult>() {
            @Override
            public CreateWorkflowResult call() throws Exception {
                CreateWorkflowResult result = null;

                try {
                    result = executeCreateWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(DeleteAnnotationStoreRequest request) {

        return deleteAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(final DeleteAnnotationStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnnotationStoreRequest, DeleteAnnotationStoreResult> asyncHandler) {
        final DeleteAnnotationStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnnotationStoreResult>() {
            @Override
            public DeleteAnnotationStoreResult call() throws Exception {
                DeleteAnnotationStoreResult result = null;

                try {
                    result = executeDeleteAnnotationStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(DeleteReferenceRequest request) {

        return deleteReferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(final DeleteReferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReferenceRequest, DeleteReferenceResult> asyncHandler) {
        final DeleteReferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReferenceResult>() {
            @Override
            public DeleteReferenceResult call() throws Exception {
                DeleteReferenceResult result = null;

                try {
                    result = executeDeleteReference(finalRequest);
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
    public java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(DeleteReferenceStoreRequest request) {

        return deleteReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(final DeleteReferenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReferenceStoreRequest, DeleteReferenceStoreResult> asyncHandler) {
        final DeleteReferenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReferenceStoreResult>() {
            @Override
            public DeleteReferenceStoreResult call() throws Exception {
                DeleteReferenceStoreResult result = null;

                try {
                    result = executeDeleteReferenceStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(final DeleteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {
        final DeleteRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRunResult>() {
            @Override
            public DeleteRunResult call() throws Exception {
                DeleteRunResult result = null;

                try {
                    result = executeDeleteRun(finalRequest);
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
    public java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(DeleteRunGroupRequest request) {

        return deleteRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(final DeleteRunGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRunGroupRequest, DeleteRunGroupResult> asyncHandler) {
        final DeleteRunGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRunGroupResult>() {
            @Override
            public DeleteRunGroupResult call() throws Exception {
                DeleteRunGroupResult result = null;

                try {
                    result = executeDeleteRunGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(DeleteSequenceStoreRequest request) {

        return deleteSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(final DeleteSequenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSequenceStoreRequest, DeleteSequenceStoreResult> asyncHandler) {
        final DeleteSequenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSequenceStoreResult>() {
            @Override
            public DeleteSequenceStoreResult call() throws Exception {
                DeleteSequenceStoreResult result = null;

                try {
                    result = executeDeleteSequenceStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(DeleteVariantStoreRequest request) {

        return deleteVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(final DeleteVariantStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVariantStoreRequest, DeleteVariantStoreResult> asyncHandler) {
        final DeleteVariantStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVariantStoreResult>() {
            @Override
            public DeleteVariantStoreResult call() throws Exception {
                DeleteVariantStoreResult result = null;

                try {
                    result = executeDeleteVariantStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(final DeleteWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {
        final DeleteWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowResult>() {
            @Override
            public DeleteWorkflowResult call() throws Exception {
                DeleteWorkflowResult result = null;

                try {
                    result = executeDeleteWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(GetAnnotationImportJobRequest request) {

        return getAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(final GetAnnotationImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnnotationImportJobRequest, GetAnnotationImportJobResult> asyncHandler) {
        final GetAnnotationImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnnotationImportJobResult>() {
            @Override
            public GetAnnotationImportJobResult call() throws Exception {
                GetAnnotationImportJobResult result = null;

                try {
                    result = executeGetAnnotationImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(GetAnnotationStoreRequest request) {

        return getAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(final GetAnnotationStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnnotationStoreRequest, GetAnnotationStoreResult> asyncHandler) {
        final GetAnnotationStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnnotationStoreResult>() {
            @Override
            public GetAnnotationStoreResult call() throws Exception {
                GetAnnotationStoreResult result = null;

                try {
                    result = executeGetAnnotationStore(finalRequest);
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
    public java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(GetReadSetRequest request) {

        return getReadSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(final GetReadSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadSetRequest, GetReadSetResult> asyncHandler) {
        final GetReadSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadSetResult>() {
            @Override
            public GetReadSetResult call() throws Exception {
                GetReadSetResult result = null;

                try {
                    result = executeGetReadSet(finalRequest);
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
    public java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(GetReadSetActivationJobRequest request) {

        return getReadSetActivationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(final GetReadSetActivationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadSetActivationJobRequest, GetReadSetActivationJobResult> asyncHandler) {
        final GetReadSetActivationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadSetActivationJobResult>() {
            @Override
            public GetReadSetActivationJobResult call() throws Exception {
                GetReadSetActivationJobResult result = null;

                try {
                    result = executeGetReadSetActivationJob(finalRequest);
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
    public java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(GetReadSetExportJobRequest request) {

        return getReadSetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(final GetReadSetExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadSetExportJobRequest, GetReadSetExportJobResult> asyncHandler) {
        final GetReadSetExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadSetExportJobResult>() {
            @Override
            public GetReadSetExportJobResult call() throws Exception {
                GetReadSetExportJobResult result = null;

                try {
                    result = executeGetReadSetExportJob(finalRequest);
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
    public java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(GetReadSetImportJobRequest request) {

        return getReadSetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(final GetReadSetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadSetImportJobRequest, GetReadSetImportJobResult> asyncHandler) {
        final GetReadSetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadSetImportJobResult>() {
            @Override
            public GetReadSetImportJobResult call() throws Exception {
                GetReadSetImportJobResult result = null;

                try {
                    result = executeGetReadSetImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(GetReadSetMetadataRequest request) {

        return getReadSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(final GetReadSetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReadSetMetadataRequest, GetReadSetMetadataResult> asyncHandler) {
        final GetReadSetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReadSetMetadataResult>() {
            @Override
            public GetReadSetMetadataResult call() throws Exception {
                GetReadSetMetadataResult result = null;

                try {
                    result = executeGetReadSetMetadata(finalRequest);
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
    public java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(GetReferenceRequest request) {

        return getReferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(final GetReferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReferenceRequest, GetReferenceResult> asyncHandler) {
        final GetReferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReferenceResult>() {
            @Override
            public GetReferenceResult call() throws Exception {
                GetReferenceResult result = null;

                try {
                    result = executeGetReference(finalRequest);
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
    public java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(GetReferenceImportJobRequest request) {

        return getReferenceImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(final GetReferenceImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReferenceImportJobRequest, GetReferenceImportJobResult> asyncHandler) {
        final GetReferenceImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReferenceImportJobResult>() {
            @Override
            public GetReferenceImportJobResult call() throws Exception {
                GetReferenceImportJobResult result = null;

                try {
                    result = executeGetReferenceImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(GetReferenceMetadataRequest request) {

        return getReferenceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(final GetReferenceMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReferenceMetadataRequest, GetReferenceMetadataResult> asyncHandler) {
        final GetReferenceMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReferenceMetadataResult>() {
            @Override
            public GetReferenceMetadataResult call() throws Exception {
                GetReferenceMetadataResult result = null;

                try {
                    result = executeGetReferenceMetadata(finalRequest);
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
    public java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(GetReferenceStoreRequest request) {

        return getReferenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(final GetReferenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReferenceStoreRequest, GetReferenceStoreResult> asyncHandler) {
        final GetReferenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReferenceStoreResult>() {
            @Override
            public GetReferenceStoreResult call() throws Exception {
                GetReferenceStoreResult result = null;

                try {
                    result = executeGetReferenceStore(finalRequest);
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
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request) {

        return getRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(final GetRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {
        final GetRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRunResult>() {
            @Override
            public GetRunResult call() throws Exception {
                GetRunResult result = null;

                try {
                    result = executeGetRun(finalRequest);
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
    public java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(GetRunGroupRequest request) {

        return getRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(final GetRunGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRunGroupRequest, GetRunGroupResult> asyncHandler) {
        final GetRunGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRunGroupResult>() {
            @Override
            public GetRunGroupResult call() throws Exception {
                GetRunGroupResult result = null;

                try {
                    result = executeGetRunGroup(finalRequest);
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
    public java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(GetRunTaskRequest request) {

        return getRunTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(final GetRunTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRunTaskRequest, GetRunTaskResult> asyncHandler) {
        final GetRunTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRunTaskResult>() {
            @Override
            public GetRunTaskResult call() throws Exception {
                GetRunTaskResult result = null;

                try {
                    result = executeGetRunTask(finalRequest);
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
    public java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(GetSequenceStoreRequest request) {

        return getSequenceStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(final GetSequenceStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSequenceStoreRequest, GetSequenceStoreResult> asyncHandler) {
        final GetSequenceStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSequenceStoreResult>() {
            @Override
            public GetSequenceStoreResult call() throws Exception {
                GetSequenceStoreResult result = null;

                try {
                    result = executeGetSequenceStore(finalRequest);
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
    public java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(GetVariantImportJobRequest request) {

        return getVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(final GetVariantImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVariantImportJobRequest, GetVariantImportJobResult> asyncHandler) {
        final GetVariantImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVariantImportJobResult>() {
            @Override
            public GetVariantImportJobResult call() throws Exception {
                GetVariantImportJobResult result = null;

                try {
                    result = executeGetVariantImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(GetVariantStoreRequest request) {

        return getVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(final GetVariantStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVariantStoreRequest, GetVariantStoreResult> asyncHandler) {
        final GetVariantStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVariantStoreResult>() {
            @Override
            public GetVariantStoreResult call() throws Exception {
                GetVariantStoreResult result = null;

                try {
                    result = executeGetVariantStore(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(final GetWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {
        final GetWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowResult>() {
            @Override
            public GetWorkflowResult call() throws Exception {
                GetWorkflowResult result = null;

                try {
                    result = executeGetWorkflow(finalRequest);
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
    public java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(ListAnnotationImportJobsRequest request) {

        return listAnnotationImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(final ListAnnotationImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnnotationImportJobsRequest, ListAnnotationImportJobsResult> asyncHandler) {
        final ListAnnotationImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnnotationImportJobsResult>() {
            @Override
            public ListAnnotationImportJobsResult call() throws Exception {
                ListAnnotationImportJobsResult result = null;

                try {
                    result = executeListAnnotationImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(ListAnnotationStoresRequest request) {

        return listAnnotationStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(final ListAnnotationStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnnotationStoresRequest, ListAnnotationStoresResult> asyncHandler) {
        final ListAnnotationStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnnotationStoresResult>() {
            @Override
            public ListAnnotationStoresResult call() throws Exception {
                ListAnnotationStoresResult result = null;

                try {
                    result = executeListAnnotationStores(finalRequest);
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
    public java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(ListReadSetActivationJobsRequest request) {

        return listReadSetActivationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(final ListReadSetActivationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReadSetActivationJobsRequest, ListReadSetActivationJobsResult> asyncHandler) {
        final ListReadSetActivationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReadSetActivationJobsResult>() {
            @Override
            public ListReadSetActivationJobsResult call() throws Exception {
                ListReadSetActivationJobsResult result = null;

                try {
                    result = executeListReadSetActivationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(ListReadSetExportJobsRequest request) {

        return listReadSetExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(final ListReadSetExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReadSetExportJobsRequest, ListReadSetExportJobsResult> asyncHandler) {
        final ListReadSetExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReadSetExportJobsResult>() {
            @Override
            public ListReadSetExportJobsResult call() throws Exception {
                ListReadSetExportJobsResult result = null;

                try {
                    result = executeListReadSetExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(ListReadSetImportJobsRequest request) {

        return listReadSetImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(final ListReadSetImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReadSetImportJobsRequest, ListReadSetImportJobsResult> asyncHandler) {
        final ListReadSetImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReadSetImportJobsResult>() {
            @Override
            public ListReadSetImportJobsResult call() throws Exception {
                ListReadSetImportJobsResult result = null;

                try {
                    result = executeListReadSetImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(ListReadSetsRequest request) {

        return listReadSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(final ListReadSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReadSetsRequest, ListReadSetsResult> asyncHandler) {
        final ListReadSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReadSetsResult>() {
            @Override
            public ListReadSetsResult call() throws Exception {
                ListReadSetsResult result = null;

                try {
                    result = executeListReadSets(finalRequest);
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
    public java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(ListReferenceImportJobsRequest request) {

        return listReferenceImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(final ListReferenceImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReferenceImportJobsRequest, ListReferenceImportJobsResult> asyncHandler) {
        final ListReferenceImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReferenceImportJobsResult>() {
            @Override
            public ListReferenceImportJobsResult call() throws Exception {
                ListReferenceImportJobsResult result = null;

                try {
                    result = executeListReferenceImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(ListReferenceStoresRequest request) {

        return listReferenceStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(final ListReferenceStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReferenceStoresRequest, ListReferenceStoresResult> asyncHandler) {
        final ListReferenceStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReferenceStoresResult>() {
            @Override
            public ListReferenceStoresResult call() throws Exception {
                ListReferenceStoresResult result = null;

                try {
                    result = executeListReferenceStores(finalRequest);
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
    public java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(ListReferencesRequest request) {

        return listReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(final ListReferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReferencesRequest, ListReferencesResult> asyncHandler) {
        final ListReferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReferencesResult>() {
            @Override
            public ListReferencesResult call() throws Exception {
                ListReferencesResult result = null;

                try {
                    result = executeListReferences(finalRequest);
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
    public java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(ListRunGroupsRequest request) {

        return listRunGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(final ListRunGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunGroupsRequest, ListRunGroupsResult> asyncHandler) {
        final ListRunGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRunGroupsResult>() {
            @Override
            public ListRunGroupsResult call() throws Exception {
                ListRunGroupsResult result = null;

                try {
                    result = executeListRunGroups(finalRequest);
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
    public java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(ListRunTasksRequest request) {

        return listRunTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(final ListRunTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunTasksRequest, ListRunTasksResult> asyncHandler) {
        final ListRunTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRunTasksResult>() {
            @Override
            public ListRunTasksResult call() throws Exception {
                ListRunTasksResult result = null;

                try {
                    result = executeListRunTasks(finalRequest);
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
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(final ListRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {
        final ListRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRunsResult>() {
            @Override
            public ListRunsResult call() throws Exception {
                ListRunsResult result = null;

                try {
                    result = executeListRuns(finalRequest);
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
    public java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(ListSequenceStoresRequest request) {

        return listSequenceStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(final ListSequenceStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSequenceStoresRequest, ListSequenceStoresResult> asyncHandler) {
        final ListSequenceStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSequenceStoresResult>() {
            @Override
            public ListSequenceStoresResult call() throws Exception {
                ListSequenceStoresResult result = null;

                try {
                    result = executeListSequenceStores(finalRequest);
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
    public java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(ListVariantImportJobsRequest request) {

        return listVariantImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(final ListVariantImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVariantImportJobsRequest, ListVariantImportJobsResult> asyncHandler) {
        final ListVariantImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVariantImportJobsResult>() {
            @Override
            public ListVariantImportJobsResult call() throws Exception {
                ListVariantImportJobsResult result = null;

                try {
                    result = executeListVariantImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(ListVariantStoresRequest request) {

        return listVariantStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(final ListVariantStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVariantStoresRequest, ListVariantStoresResult> asyncHandler) {
        final ListVariantStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVariantStoresResult>() {
            @Override
            public ListVariantStoresResult call() throws Exception {
                ListVariantStoresResult result = null;

                try {
                    result = executeListVariantStores(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(final ListWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {
        final ListWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowsResult>() {
            @Override
            public ListWorkflowsResult call() throws Exception {
                ListWorkflowsResult result = null;

                try {
                    result = executeListWorkflows(finalRequest);
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
    public java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(StartAnnotationImportJobRequest request) {

        return startAnnotationImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(final StartAnnotationImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAnnotationImportJobRequest, StartAnnotationImportJobResult> asyncHandler) {
        final StartAnnotationImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAnnotationImportJobResult>() {
            @Override
            public StartAnnotationImportJobResult call() throws Exception {
                StartAnnotationImportJobResult result = null;

                try {
                    result = executeStartAnnotationImportJob(finalRequest);
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
    public java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(StartReadSetActivationJobRequest request) {

        return startReadSetActivationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(final StartReadSetActivationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReadSetActivationJobRequest, StartReadSetActivationJobResult> asyncHandler) {
        final StartReadSetActivationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReadSetActivationJobResult>() {
            @Override
            public StartReadSetActivationJobResult call() throws Exception {
                StartReadSetActivationJobResult result = null;

                try {
                    result = executeStartReadSetActivationJob(finalRequest);
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
    public java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(StartReadSetExportJobRequest request) {

        return startReadSetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(final StartReadSetExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReadSetExportJobRequest, StartReadSetExportJobResult> asyncHandler) {
        final StartReadSetExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReadSetExportJobResult>() {
            @Override
            public StartReadSetExportJobResult call() throws Exception {
                StartReadSetExportJobResult result = null;

                try {
                    result = executeStartReadSetExportJob(finalRequest);
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
    public java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(StartReadSetImportJobRequest request) {

        return startReadSetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(final StartReadSetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReadSetImportJobRequest, StartReadSetImportJobResult> asyncHandler) {
        final StartReadSetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReadSetImportJobResult>() {
            @Override
            public StartReadSetImportJobResult call() throws Exception {
                StartReadSetImportJobResult result = null;

                try {
                    result = executeStartReadSetImportJob(finalRequest);
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
    public java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(StartReferenceImportJobRequest request) {

        return startReferenceImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(final StartReferenceImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReferenceImportJobRequest, StartReferenceImportJobResult> asyncHandler) {
        final StartReferenceImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReferenceImportJobResult>() {
            @Override
            public StartReferenceImportJobResult call() throws Exception {
                StartReferenceImportJobResult result = null;

                try {
                    result = executeStartReferenceImportJob(finalRequest);
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
    public java.util.concurrent.Future<StartRunResult> startRunAsync(StartRunRequest request) {

        return startRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRunResult> startRunAsync(final StartRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRunRequest, StartRunResult> asyncHandler) {
        final StartRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRunResult>() {
            @Override
            public StartRunResult call() throws Exception {
                StartRunResult result = null;

                try {
                    result = executeStartRun(finalRequest);
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
    public java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(StartVariantImportJobRequest request) {

        return startVariantImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(final StartVariantImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartVariantImportJobRequest, StartVariantImportJobResult> asyncHandler) {
        final StartVariantImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartVariantImportJobResult>() {
            @Override
            public StartVariantImportJobResult call() throws Exception {
                StartVariantImportJobResult result = null;

                try {
                    result = executeStartVariantImportJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(UpdateAnnotationStoreRequest request) {

        return updateAnnotationStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(final UpdateAnnotationStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnnotationStoreRequest, UpdateAnnotationStoreResult> asyncHandler) {
        final UpdateAnnotationStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnnotationStoreResult>() {
            @Override
            public UpdateAnnotationStoreResult call() throws Exception {
                UpdateAnnotationStoreResult result = null;

                try {
                    result = executeUpdateAnnotationStore(finalRequest);
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
    public java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(UpdateRunGroupRequest request) {

        return updateRunGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(final UpdateRunGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRunGroupRequest, UpdateRunGroupResult> asyncHandler) {
        final UpdateRunGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRunGroupResult>() {
            @Override
            public UpdateRunGroupResult call() throws Exception {
                UpdateRunGroupResult result = null;

                try {
                    result = executeUpdateRunGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(UpdateVariantStoreRequest request) {

        return updateVariantStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(final UpdateVariantStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVariantStoreRequest, UpdateVariantStoreResult> asyncHandler) {
        final UpdateVariantStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVariantStoreResult>() {
            @Override
            public UpdateVariantStoreResult call() throws Exception {
                UpdateVariantStoreResult result = null;

                try {
                    result = executeUpdateVariantStore(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request) {

        return updateWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(final UpdateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler) {
        final UpdateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkflowResult>() {
            @Override
            public UpdateWorkflowResult call() throws Exception {
                UpdateWorkflowResult result = null;

                try {
                    result = executeUpdateWorkflow(finalRequest);
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
