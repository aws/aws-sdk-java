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
package com.amazonaws.services.arczonalshift;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS ARC - Zonal Shift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the API Reference Guide for the zonal shift feature of Amazon Route 53 Application Recovery Controller. This
 * guide is for developers who need detailed information about zonal shift API actions, data types, and errors.
 * </p>
 * <p>
 * Zonal shift is in preview release for Amazon Route 53 Application Recovery Controller and is subject to change.
 * </p>
 * <p>
 * Zonal shift in Route 53 ARC enables you to move traffic for a load balancer resource away from an Availability Zone.
 * Starting a zonal shift helps your application recover immediately, for example, from a developer's bad code
 * deployment or from an AWS infrastructure failure in a single Availability Zone, reducing the impact and time lost
 * from an issue in one zone.
 * </p>
 * <p>
 * Supported AWS resources are automatically registered with Route 53 ARC. Resources that are registered for zonal
 * shifts in Route 53 ARC are managed resources in Route 53 ARC. You can start a zonal shift for any managed resource in
 * your account in a Region. At this time, you can only start a zonal shift for Network Load Balancers and Application
 * Load Balancers with cross-zone load balancing turned off.
 * </p>
 * <p>
 * Zonal shifts are temporary. You must specify an expiration when you start a zonal shift, of up to three days
 * initially. If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
 * new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
 * to the Availability Zone.
 * </p>
 * <p>
 * For more information about using zonal shift, see the <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSARCZonalShiftAsyncClient extends AWSARCZonalShiftClient implements AWSARCZonalShiftAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSARCZonalShiftAsyncClientBuilder asyncBuilder() {
        return AWSARCZonalShiftAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS ARC - Zonal Shift using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSARCZonalShiftAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS ARC - Zonal Shift using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSARCZonalShiftAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest request) {

        return cancelZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(final CancelZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelZonalShiftRequest, CancelZonalShiftResult> asyncHandler) {
        final CancelZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelZonalShiftResult>() {
            @Override
            public CancelZonalShiftResult call() throws Exception {
                CancelZonalShiftResult result = null;

                try {
                    result = executeCancelZonalShift(finalRequest);
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
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest request) {

        return getManagedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(final GetManagedResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetManagedResourceRequest, GetManagedResourceResult> asyncHandler) {
        final GetManagedResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetManagedResourceResult>() {
            @Override
            public GetManagedResourceResult call() throws Exception {
                GetManagedResourceResult result = null;

                try {
                    result = executeGetManagedResource(finalRequest);
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
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest request) {

        return listManagedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(final ListManagedResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedResourcesRequest, ListManagedResourcesResult> asyncHandler) {
        final ListManagedResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedResourcesResult>() {
            @Override
            public ListManagedResourcesResult call() throws Exception {
                ListManagedResourcesResult result = null;

                try {
                    result = executeListManagedResources(finalRequest);
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
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest request) {

        return listZonalShiftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(final ListZonalShiftsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListZonalShiftsRequest, ListZonalShiftsResult> asyncHandler) {
        final ListZonalShiftsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListZonalShiftsResult>() {
            @Override
            public ListZonalShiftsResult call() throws Exception {
                ListZonalShiftsResult result = null;

                try {
                    result = executeListZonalShifts(finalRequest);
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
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest request) {

        return startZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(final StartZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartZonalShiftRequest, StartZonalShiftResult> asyncHandler) {
        final StartZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartZonalShiftResult>() {
            @Override
            public StartZonalShiftResult call() throws Exception {
                StartZonalShiftResult result = null;

                try {
                    result = executeStartZonalShift(finalRequest);
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
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest request) {

        return updateZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(final UpdateZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateZonalShiftRequest, UpdateZonalShiftResult> asyncHandler) {
        final UpdateZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateZonalShiftResult>() {
            @Override
            public UpdateZonalShiftResult call() throws Exception {
                UpdateZonalShiftResult result = null;

                try {
                    result = executeUpdateZonalShift(finalRequest);
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
