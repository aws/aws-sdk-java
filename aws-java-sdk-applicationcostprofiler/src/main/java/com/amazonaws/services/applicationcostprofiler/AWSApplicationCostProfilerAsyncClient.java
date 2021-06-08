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
package com.amazonaws.services.applicationcostprofiler;

import javax.annotation.Generated;

import com.amazonaws.services.applicationcostprofiler.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Application Cost Profiler asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This reference provides descriptions of the AWS Application Cost Profiler API.
 * </p>
 * <p>
 * The AWS Application Cost Profiler API provides programmatic access to view, create, update, and delete application
 * cost report definitions, as well as to import your usage data into the Application Cost Profiler service.
 * </p>
 * <p>
 * For more information about using this service, see the <a
 * href="https://docs.aws.amazon.com/application-cost-profiler/latest/userguide/introduction.html">AWS Application Cost
 * Profiler User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSApplicationCostProfilerAsyncClient extends AWSApplicationCostProfilerClient implements AWSApplicationCostProfilerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSApplicationCostProfilerAsyncClientBuilder asyncBuilder() {
        return AWSApplicationCostProfilerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Cost Profiler using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSApplicationCostProfilerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Cost Profiler using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSApplicationCostProfilerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest request) {

        return deleteReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(final DeleteReportDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReportDefinitionRequest, DeleteReportDefinitionResult> asyncHandler) {
        final DeleteReportDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReportDefinitionResult>() {
            @Override
            public DeleteReportDefinitionResult call() throws Exception {
                DeleteReportDefinitionResult result = null;

                try {
                    result = executeDeleteReportDefinition(finalRequest);
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
    public java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(GetReportDefinitionRequest request) {

        return getReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(final GetReportDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReportDefinitionRequest, GetReportDefinitionResult> asyncHandler) {
        final GetReportDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReportDefinitionResult>() {
            @Override
            public GetReportDefinitionResult call() throws Exception {
                GetReportDefinitionResult result = null;

                try {
                    result = executeGetReportDefinition(finalRequest);
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
    public java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(ImportApplicationUsageRequest request) {

        return importApplicationUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(final ImportApplicationUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportApplicationUsageRequest, ImportApplicationUsageResult> asyncHandler) {
        final ImportApplicationUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportApplicationUsageResult>() {
            @Override
            public ImportApplicationUsageResult call() throws Exception {
                ImportApplicationUsageResult result = null;

                try {
                    result = executeImportApplicationUsage(finalRequest);
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
    public java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(ListReportDefinitionsRequest request) {

        return listReportDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(final ListReportDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReportDefinitionsRequest, ListReportDefinitionsResult> asyncHandler) {
        final ListReportDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReportDefinitionsResult>() {
            @Override
            public ListReportDefinitionsResult call() throws Exception {
                ListReportDefinitionsResult result = null;

                try {
                    result = executeListReportDefinitions(finalRequest);
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
    public java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest request) {

        return putReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(final PutReportDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutReportDefinitionRequest, PutReportDefinitionResult> asyncHandler) {
        final PutReportDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutReportDefinitionResult>() {
            @Override
            public PutReportDefinitionResult call() throws Exception {
                PutReportDefinitionResult result = null;

                try {
                    result = executePutReportDefinition(finalRequest);
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
    public java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(UpdateReportDefinitionRequest request) {

        return updateReportDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(final UpdateReportDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReportDefinitionRequest, UpdateReportDefinitionResult> asyncHandler) {
        final UpdateReportDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReportDefinitionResult>() {
            @Override
            public UpdateReportDefinitionResult call() throws Exception {
                UpdateReportDefinitionResult result = null;

                try {
                    result = executeUpdateReportDefinition(finalRequest);
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
