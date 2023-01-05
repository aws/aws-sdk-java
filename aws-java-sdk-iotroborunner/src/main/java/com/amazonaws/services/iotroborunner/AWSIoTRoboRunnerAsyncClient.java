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
package com.amazonaws.services.iotroborunner;

import javax.annotation.Generated;

import com.amazonaws.services.iotroborunner.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT RoboRunner asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTRoboRunnerAsyncClient extends AWSIoTRoboRunnerClient implements AWSIoTRoboRunnerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTRoboRunnerAsyncClientBuilder asyncBuilder() {
        return AWSIoTRoboRunnerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT RoboRunner using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTRoboRunnerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT RoboRunner using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTRoboRunnerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest request) {

        return createDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(final CreateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDestinationRequest, CreateDestinationResult> asyncHandler) {
        final CreateDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDestinationResult>() {
            @Override
            public CreateDestinationResult call() throws Exception {
                CreateDestinationResult result = null;

                try {
                    result = executeCreateDestination(finalRequest);
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
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest request) {

        return createSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(final CreateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler) {
        final CreateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSiteResult>() {
            @Override
            public CreateSiteResult call() throws Exception {
                CreateSiteResult result = null;

                try {
                    result = executeCreateSite(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest request) {

        return createWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(final CreateWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerRequest, CreateWorkerResult> asyncHandler) {
        final CreateWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerResult>() {
            @Override
            public CreateWorkerResult call() throws Exception {
                CreateWorkerResult result = null;

                try {
                    result = executeCreateWorker(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkerFleetResult> createWorkerFleetAsync(CreateWorkerFleetRequest request) {

        return createWorkerFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerFleetResult> createWorkerFleetAsync(final CreateWorkerFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerFleetRequest, CreateWorkerFleetResult> asyncHandler) {
        final CreateWorkerFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerFleetResult>() {
            @Override
            public CreateWorkerFleetResult call() throws Exception {
                CreateWorkerFleetResult result = null;

                try {
                    result = executeCreateWorkerFleet(finalRequest);
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
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest request) {

        return deleteDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(final DeleteDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler) {
        final DeleteDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDestinationResult>() {
            @Override
            public DeleteDestinationResult call() throws Exception {
                DeleteDestinationResult result = null;

                try {
                    result = executeDeleteDestination(finalRequest);
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
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request) {

        return deleteSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(final DeleteSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler) {
        final DeleteSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSiteResult>() {
            @Override
            public DeleteSiteResult call() throws Exception {
                DeleteSiteResult result = null;

                try {
                    result = executeDeleteSite(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest request) {

        return deleteWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(final DeleteWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkerRequest, DeleteWorkerResult> asyncHandler) {
        final DeleteWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkerResult>() {
            @Override
            public DeleteWorkerResult call() throws Exception {
                DeleteWorkerResult result = null;

                try {
                    result = executeDeleteWorker(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkerFleetResult> deleteWorkerFleetAsync(DeleteWorkerFleetRequest request) {

        return deleteWorkerFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerFleetResult> deleteWorkerFleetAsync(final DeleteWorkerFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkerFleetRequest, DeleteWorkerFleetResult> asyncHandler) {
        final DeleteWorkerFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkerFleetResult>() {
            @Override
            public DeleteWorkerFleetResult call() throws Exception {
                DeleteWorkerFleetResult result = null;

                try {
                    result = executeDeleteWorkerFleet(finalRequest);
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
    public java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest request) {

        return getDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(final GetDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDestinationRequest, GetDestinationResult> asyncHandler) {
        final GetDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDestinationResult>() {
            @Override
            public GetDestinationResult call() throws Exception {
                GetDestinationResult result = null;

                try {
                    result = executeGetDestination(finalRequest);
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
    public java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest request) {

        return getSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSiteResult> getSiteAsync(final GetSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSiteRequest, GetSiteResult> asyncHandler) {
        final GetSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSiteResult>() {
            @Override
            public GetSiteResult call() throws Exception {
                GetSiteResult result = null;

                try {
                    result = executeGetSite(finalRequest);
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
    public java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest request) {

        return getWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(final GetWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkerRequest, GetWorkerResult> asyncHandler) {
        final GetWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkerResult>() {
            @Override
            public GetWorkerResult call() throws Exception {
                GetWorkerResult result = null;

                try {
                    result = executeGetWorker(finalRequest);
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
    public java.util.concurrent.Future<GetWorkerFleetResult> getWorkerFleetAsync(GetWorkerFleetRequest request) {

        return getWorkerFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkerFleetResult> getWorkerFleetAsync(final GetWorkerFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkerFleetRequest, GetWorkerFleetResult> asyncHandler) {
        final GetWorkerFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkerFleetResult>() {
            @Override
            public GetWorkerFleetResult call() throws Exception {
                GetWorkerFleetResult result = null;

                try {
                    result = executeGetWorkerFleet(finalRequest);
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
    public java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest request) {

        return listDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(final ListDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDestinationsRequest, ListDestinationsResult> asyncHandler) {
        final ListDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDestinationsResult>() {
            @Override
            public ListDestinationsResult call() throws Exception {
                ListDestinationsResult result = null;

                try {
                    result = executeListDestinations(finalRequest);
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
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest request) {

        return listSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(final ListSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler) {
        final ListSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSitesResult>() {
            @Override
            public ListSitesResult call() throws Exception {
                ListSitesResult result = null;

                try {
                    result = executeListSites(finalRequest);
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
    public java.util.concurrent.Future<ListWorkerFleetsResult> listWorkerFleetsAsync(ListWorkerFleetsRequest request) {

        return listWorkerFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerFleetsResult> listWorkerFleetsAsync(final ListWorkerFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkerFleetsRequest, ListWorkerFleetsResult> asyncHandler) {
        final ListWorkerFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkerFleetsResult>() {
            @Override
            public ListWorkerFleetsResult call() throws Exception {
                ListWorkerFleetsResult result = null;

                try {
                    result = executeListWorkerFleets(finalRequest);
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
    public java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest request) {

        return listWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(final ListWorkersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkersRequest, ListWorkersResult> asyncHandler) {
        final ListWorkersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkersResult>() {
            @Override
            public ListWorkersResult call() throws Exception {
                ListWorkersResult result = null;

                try {
                    result = executeListWorkers(finalRequest);
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
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest request) {

        return updateDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(final UpdateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler) {
        final UpdateDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDestinationResult>() {
            @Override
            public UpdateDestinationResult call() throws Exception {
                UpdateDestinationResult result = null;

                try {
                    result = executeUpdateDestination(finalRequest);
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
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest request) {

        return updateSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(final UpdateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler) {
        final UpdateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSiteResult>() {
            @Override
            public UpdateSiteResult call() throws Exception {
                UpdateSiteResult result = null;

                try {
                    result = executeUpdateSite(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest request) {

        return updateWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(final UpdateWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkerRequest, UpdateWorkerResult> asyncHandler) {
        final UpdateWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkerResult>() {
            @Override
            public UpdateWorkerResult call() throws Exception {
                UpdateWorkerResult result = null;

                try {
                    result = executeUpdateWorker(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkerFleetResult> updateWorkerFleetAsync(UpdateWorkerFleetRequest request) {

        return updateWorkerFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerFleetResult> updateWorkerFleetAsync(final UpdateWorkerFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkerFleetRequest, UpdateWorkerFleetResult> asyncHandler) {
        final UpdateWorkerFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkerFleetResult>() {
            @Override
            public UpdateWorkerFleetResult call() throws Exception {
                UpdateWorkerFleetResult result = null;

                try {
                    result = executeUpdateWorkerFleet(finalRequest);
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
