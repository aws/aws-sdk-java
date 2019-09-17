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
package com.amazonaws.services.iot1clickdevices;

import javax.annotation.Generated;

import com.amazonaws.services.iot1clickdevices.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT 1-Click Devices Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
 * responses, and errors for the supported web services protocols.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoT1ClickDevicesAsyncClient extends AWSIoT1ClickDevicesClient implements AWSIoT1ClickDevicesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoT1ClickDevicesAsyncClientBuilder asyncBuilder() {
        return AWSIoT1ClickDevicesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT 1-Click Devices Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickDevicesAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(ClaimDevicesByClaimCodeRequest request) {

        return claimDevicesByClaimCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClaimDevicesByClaimCodeResult> claimDevicesByClaimCodeAsync(final ClaimDevicesByClaimCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ClaimDevicesByClaimCodeRequest, ClaimDevicesByClaimCodeResult> asyncHandler) {
        final ClaimDevicesByClaimCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClaimDevicesByClaimCodeResult>() {
            @Override
            public ClaimDevicesByClaimCodeResult call() throws Exception {
                ClaimDevicesByClaimCodeResult result = null;

                try {
                    result = executeClaimDevicesByClaimCode(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(final DescribeDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {
        final DescribeDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceResult>() {
            @Override
            public DescribeDeviceResult call() throws Exception {
                DescribeDeviceResult result = null;

                try {
                    result = executeDescribeDevice(finalRequest);
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
    public java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(FinalizeDeviceClaimRequest request) {

        return finalizeDeviceClaimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FinalizeDeviceClaimResult> finalizeDeviceClaimAsync(final FinalizeDeviceClaimRequest request,
            final com.amazonaws.handlers.AsyncHandler<FinalizeDeviceClaimRequest, FinalizeDeviceClaimResult> asyncHandler) {
        final FinalizeDeviceClaimRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FinalizeDeviceClaimResult>() {
            @Override
            public FinalizeDeviceClaimResult call() throws Exception {
                FinalizeDeviceClaimResult result = null;

                try {
                    result = executeFinalizeDeviceClaim(finalRequest);
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
    public java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(GetDeviceMethodsRequest request) {

        return getDeviceMethodsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceMethodsResult> getDeviceMethodsAsync(final GetDeviceMethodsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceMethodsRequest, GetDeviceMethodsResult> asyncHandler) {
        final GetDeviceMethodsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceMethodsResult>() {
            @Override
            public GetDeviceMethodsResult call() throws Exception {
                GetDeviceMethodsResult result = null;

                try {
                    result = executeGetDeviceMethods(finalRequest);
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
    public java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(InitiateDeviceClaimRequest request) {

        return initiateDeviceClaimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateDeviceClaimResult> initiateDeviceClaimAsync(final InitiateDeviceClaimRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateDeviceClaimRequest, InitiateDeviceClaimResult> asyncHandler) {
        final InitiateDeviceClaimRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitiateDeviceClaimResult>() {
            @Override
            public InitiateDeviceClaimResult call() throws Exception {
                InitiateDeviceClaimResult result = null;

                try {
                    result = executeInitiateDeviceClaim(finalRequest);
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
    public java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(InvokeDeviceMethodRequest request) {

        return invokeDeviceMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeDeviceMethodResult> invokeDeviceMethodAsync(final InvokeDeviceMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvokeDeviceMethodRequest, InvokeDeviceMethodResult> asyncHandler) {
        final InvokeDeviceMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InvokeDeviceMethodResult>() {
            @Override
            public InvokeDeviceMethodResult call() throws Exception {
                InvokeDeviceMethodResult result = null;

                try {
                    result = executeInvokeDeviceMethod(finalRequest);
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
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest request) {

        return listDeviceEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(final ListDeviceEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceEventsRequest, ListDeviceEventsResult> asyncHandler) {
        final ListDeviceEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceEventsResult>() {
            @Override
            public ListDeviceEventsResult call() throws Exception {
                ListDeviceEventsResult result = null;

                try {
                    result = executeListDeviceEvents(finalRequest);
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
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
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
    public java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(UnclaimDeviceRequest request) {

        return unclaimDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnclaimDeviceResult> unclaimDeviceAsync(final UnclaimDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnclaimDeviceRequest, UnclaimDeviceResult> asyncHandler) {
        final UnclaimDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnclaimDeviceResult>() {
            @Override
            public UnclaimDeviceResult call() throws Exception {
                UnclaimDeviceResult result = null;

                try {
                    result = executeUnclaimDevice(finalRequest);
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
    public java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(UpdateDeviceStateRequest request) {

        return updateDeviceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceStateResult> updateDeviceStateAsync(final UpdateDeviceStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceStateRequest, UpdateDeviceStateResult> asyncHandler) {
        final UpdateDeviceStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceStateResult>() {
            @Override
            public UpdateDeviceStateResult call() throws Exception {
                UpdateDeviceStateResult result = null;

                try {
                    result = executeUpdateDeviceState(finalRequest);
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
