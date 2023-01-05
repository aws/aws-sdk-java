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
package com.amazonaws.services.cloudcontrolapi;

import javax.annotation.Generated;

import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CloudControlApi asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * For more information about Amazon Web Services Cloud Control API, see the <a
 * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/what-is-cloudcontrolapi.html">Amazon Web Services
 * Cloud Control API User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudControlApiAsyncClient extends AWSCloudControlApiClient implements AWSCloudControlApiAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCloudControlApiAsyncClientBuilder asyncBuilder() {
        return AWSCloudControlApiAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudControlApi using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloudControlApiAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudControlApi using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCloudControlApiAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(CancelResourceRequestRequest request) {

        return cancelResourceRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(final CancelResourceRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelResourceRequestRequest, CancelResourceRequestResult> asyncHandler) {
        final CancelResourceRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelResourceRequestResult>() {
            @Override
            public CancelResourceRequestResult call() throws Exception {
                CancelResourceRequestResult result = null;

                try {
                    result = executeCancelResourceRequest(finalRequest);
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
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(final CreateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {
        final CreateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceResult>() {
            @Override
            public CreateResourceResult call() throws Exception {
                CreateResourceResult result = null;

                try {
                    result = executeCreateResource(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(final DeleteResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler) {
        final DeleteResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceResult>() {
            @Override
            public DeleteResourceResult call() throws Exception {
                DeleteResourceResult result = null;

                try {
                    result = executeDeleteResource(finalRequest);
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
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest request) {

        return getResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(final GetResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler) {
        final GetResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceResult>() {
            @Override
            public GetResourceResult call() throws Exception {
                GetResourceResult result = null;

                try {
                    result = executeGetResource(finalRequest);
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
    public java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(GetResourceRequestStatusRequest request) {

        return getResourceRequestStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(final GetResourceRequestStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceRequestStatusRequest, GetResourceRequestStatusResult> asyncHandler) {
        final GetResourceRequestStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceRequestStatusResult>() {
            @Override
            public GetResourceRequestStatusResult call() throws Exception {
                GetResourceRequestStatusResult result = null;

                try {
                    result = executeGetResourceRequestStatus(finalRequest);
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
    public java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(ListResourceRequestsRequest request) {

        return listResourceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(final ListResourceRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceRequestsRequest, ListResourceRequestsResult> asyncHandler) {
        final ListResourceRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceRequestsResult>() {
            @Override
            public ListResourceRequestsResult call() throws Exception {
                ListResourceRequestsResult result = null;

                try {
                    result = executeListResourceRequests(finalRequest);
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
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
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
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {
        final UpdateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
            @Override
            public UpdateResourceResult call() throws Exception {
                UpdateResourceResult result = null;

                try {
                    result = executeUpdateResource(finalRequest);
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
