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
package com.amazonaws.services.healthlake;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing HealthLake asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon HealthLake is a HIPAA eligibile service that allows customers to store, transform, query, and analyze their
 * FHIR-formatted data in a consistent fashion in the cloud.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonHealthLakeAsyncClient extends AmazonHealthLakeClient implements AmazonHealthLakeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonHealthLakeAsyncClientBuilder asyncBuilder() {
        return AmazonHealthLakeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on HealthLake using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonHealthLakeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on HealthLake using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonHealthLakeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest request) {

        return createFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(final CreateFHIRDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFHIRDatastoreRequest, CreateFHIRDatastoreResult> asyncHandler) {
        final CreateFHIRDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFHIRDatastoreResult>() {
            @Override
            public CreateFHIRDatastoreResult call() throws Exception {
                CreateFHIRDatastoreResult result = null;

                try {
                    result = executeCreateFHIRDatastore(finalRequest);
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
    public java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest request) {

        return deleteFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(final DeleteFHIRDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFHIRDatastoreRequest, DeleteFHIRDatastoreResult> asyncHandler) {
        final DeleteFHIRDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFHIRDatastoreResult>() {
            @Override
            public DeleteFHIRDatastoreResult call() throws Exception {
                DeleteFHIRDatastoreResult result = null;

                try {
                    result = executeDeleteFHIRDatastore(finalRequest);
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
    public java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest request) {

        return describeFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(final DescribeFHIRDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFHIRDatastoreRequest, DescribeFHIRDatastoreResult> asyncHandler) {
        final DescribeFHIRDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFHIRDatastoreResult>() {
            @Override
            public DescribeFHIRDatastoreResult call() throws Exception {
                DescribeFHIRDatastoreResult result = null;

                try {
                    result = executeDescribeFHIRDatastore(finalRequest);
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
    public java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(DescribeFHIRExportJobRequest request) {

        return describeFHIRExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(final DescribeFHIRExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFHIRExportJobRequest, DescribeFHIRExportJobResult> asyncHandler) {
        final DescribeFHIRExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFHIRExportJobResult>() {
            @Override
            public DescribeFHIRExportJobResult call() throws Exception {
                DescribeFHIRExportJobResult result = null;

                try {
                    result = executeDescribeFHIRExportJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest request) {

        return describeFHIRImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(final DescribeFHIRImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFHIRImportJobRequest, DescribeFHIRImportJobResult> asyncHandler) {
        final DescribeFHIRImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFHIRImportJobResult>() {
            @Override
            public DescribeFHIRImportJobResult call() throws Exception {
                DescribeFHIRImportJobResult result = null;

                try {
                    result = executeDescribeFHIRImportJob(finalRequest);
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
    public java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest request) {

        return listFHIRDatastoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(final ListFHIRDatastoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFHIRDatastoresRequest, ListFHIRDatastoresResult> asyncHandler) {
        final ListFHIRDatastoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFHIRDatastoresResult>() {
            @Override
            public ListFHIRDatastoresResult call() throws Exception {
                ListFHIRDatastoresResult result = null;

                try {
                    result = executeListFHIRDatastores(finalRequest);
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
    public java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(ListFHIRExportJobsRequest request) {

        return listFHIRExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(final ListFHIRExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFHIRExportJobsRequest, ListFHIRExportJobsResult> asyncHandler) {
        final ListFHIRExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFHIRExportJobsResult>() {
            @Override
            public ListFHIRExportJobsResult call() throws Exception {
                ListFHIRExportJobsResult result = null;

                try {
                    result = executeListFHIRExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(ListFHIRImportJobsRequest request) {

        return listFHIRImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(final ListFHIRImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFHIRImportJobsRequest, ListFHIRImportJobsResult> asyncHandler) {
        final ListFHIRImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFHIRImportJobsResult>() {
            @Override
            public ListFHIRImportJobsResult call() throws Exception {
                ListFHIRImportJobsResult result = null;

                try {
                    result = executeListFHIRImportJobs(finalRequest);
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
    public java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(StartFHIRExportJobRequest request) {

        return startFHIRExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(final StartFHIRExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFHIRExportJobRequest, StartFHIRExportJobResult> asyncHandler) {
        final StartFHIRExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFHIRExportJobResult>() {
            @Override
            public StartFHIRExportJobResult call() throws Exception {
                StartFHIRExportJobResult result = null;

                try {
                    result = executeStartFHIRExportJob(finalRequest);
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
    public java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest request) {

        return startFHIRImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(final StartFHIRImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFHIRImportJobRequest, StartFHIRImportJobResult> asyncHandler) {
        final StartFHIRImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFHIRImportJobResult>() {
            @Override
            public StartFHIRImportJobResult call() throws Exception {
                StartFHIRImportJobResult result = null;

                try {
                    result = executeStartFHIRImportJob(finalRequest);
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
