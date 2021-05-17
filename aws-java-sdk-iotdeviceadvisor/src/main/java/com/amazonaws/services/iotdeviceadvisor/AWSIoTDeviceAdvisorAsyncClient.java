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
package com.amazonaws.services.iotdeviceadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSIoTDeviceAdvisor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Core Device Advisor is a cloud-based, fully managed test capability for validating IoT devices during device
 * software development. Device Advisor provides pre-built tests that you can use to validate IoT devices for reliable
 * and secure connectivity with AWS IoT Core before deploying devices to production. By using Device Advisor, you can
 * confirm that your devices can connect to AWS IoT Core, follow security best practices and, if applicable, receive
 * software updates from IoT Device Management. You can also download signed qualification reports to submit to the AWS
 * Partner Network to get your device qualified for the AWS Partner Device Catalog without the need to send your device
 * in and wait for it to be tested.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTDeviceAdvisorAsyncClient extends AWSIoTDeviceAdvisorClient implements AWSIoTDeviceAdvisorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTDeviceAdvisorAsyncClientBuilder asyncBuilder() {
        return AWSIoTDeviceAdvisorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSIoTDeviceAdvisor using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTDeviceAdvisorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSIoTDeviceAdvisor using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTDeviceAdvisorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(CreateSuiteDefinitionRequest request) {

        return createSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(final CreateSuiteDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSuiteDefinitionRequest, CreateSuiteDefinitionResult> asyncHandler) {
        final CreateSuiteDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSuiteDefinitionResult>() {
            @Override
            public CreateSuiteDefinitionResult call() throws Exception {
                CreateSuiteDefinitionResult result = null;

                try {
                    result = executeCreateSuiteDefinition(finalRequest);
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
    public java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(DeleteSuiteDefinitionRequest request) {

        return deleteSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(final DeleteSuiteDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSuiteDefinitionRequest, DeleteSuiteDefinitionResult> asyncHandler) {
        final DeleteSuiteDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSuiteDefinitionResult>() {
            @Override
            public DeleteSuiteDefinitionResult call() throws Exception {
                DeleteSuiteDefinitionResult result = null;

                try {
                    result = executeDeleteSuiteDefinition(finalRequest);
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
    public java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(GetSuiteDefinitionRequest request) {

        return getSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(final GetSuiteDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteDefinitionRequest, GetSuiteDefinitionResult> asyncHandler) {
        final GetSuiteDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSuiteDefinitionResult>() {
            @Override
            public GetSuiteDefinitionResult call() throws Exception {
                GetSuiteDefinitionResult result = null;

                try {
                    result = executeGetSuiteDefinition(finalRequest);
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
    public java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(GetSuiteRunRequest request) {

        return getSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(final GetSuiteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteRunRequest, GetSuiteRunResult> asyncHandler) {
        final GetSuiteRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSuiteRunResult>() {
            @Override
            public GetSuiteRunResult call() throws Exception {
                GetSuiteRunResult result = null;

                try {
                    result = executeGetSuiteRun(finalRequest);
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
    public java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(GetSuiteRunReportRequest request) {

        return getSuiteRunReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(final GetSuiteRunReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteRunReportRequest, GetSuiteRunReportResult> asyncHandler) {
        final GetSuiteRunReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSuiteRunReportResult>() {
            @Override
            public GetSuiteRunReportResult call() throws Exception {
                GetSuiteRunReportResult result = null;

                try {
                    result = executeGetSuiteRunReport(finalRequest);
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
    public java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(ListSuiteDefinitionsRequest request) {

        return listSuiteDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(final ListSuiteDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuiteDefinitionsRequest, ListSuiteDefinitionsResult> asyncHandler) {
        final ListSuiteDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSuiteDefinitionsResult>() {
            @Override
            public ListSuiteDefinitionsResult call() throws Exception {
                ListSuiteDefinitionsResult result = null;

                try {
                    result = executeListSuiteDefinitions(finalRequest);
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
    public java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(ListSuiteRunsRequest request) {

        return listSuiteRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(final ListSuiteRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuiteRunsRequest, ListSuiteRunsResult> asyncHandler) {
        final ListSuiteRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSuiteRunsResult>() {
            @Override
            public ListSuiteRunsResult call() throws Exception {
                ListSuiteRunsResult result = null;

                try {
                    result = executeListSuiteRuns(finalRequest);
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
    public java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(StartSuiteRunRequest request) {

        return startSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(final StartSuiteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSuiteRunRequest, StartSuiteRunResult> asyncHandler) {
        final StartSuiteRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSuiteRunResult>() {
            @Override
            public StartSuiteRunResult call() throws Exception {
                StartSuiteRunResult result = null;

                try {
                    result = executeStartSuiteRun(finalRequest);
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
    public java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(StopSuiteRunRequest request) {

        return stopSuiteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(final StopSuiteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopSuiteRunRequest, StopSuiteRunResult> asyncHandler) {
        final StopSuiteRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopSuiteRunResult>() {
            @Override
            public StopSuiteRunResult call() throws Exception {
                StopSuiteRunResult result = null;

                try {
                    result = executeStopSuiteRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(UpdateSuiteDefinitionRequest request) {

        return updateSuiteDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(final UpdateSuiteDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSuiteDefinitionRequest, UpdateSuiteDefinitionResult> asyncHandler) {
        final UpdateSuiteDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSuiteDefinitionResult>() {
            @Override
            public UpdateSuiteDefinitionResult call() throws Exception {
                UpdateSuiteDefinitionResult result = null;

                try {
                    result = executeUpdateSuiteDefinition(finalRequest);
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
