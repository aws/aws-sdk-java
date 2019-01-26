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
package com.amazonaws.services.mediaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS MediaConnect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * API for AWS Elemental MediaConnect
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConnectAsyncClient extends AWSMediaConnectClient implements AWSMediaConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaConnectAsyncClientBuilder asyncBuilder() {
        return AWSMediaConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS MediaConnect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest request) {

        return addFlowOutputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(final AddFlowOutputsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFlowOutputsRequest, AddFlowOutputsResult> asyncHandler) {
        final AddFlowOutputsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFlowOutputsResult>() {
            @Override
            public AddFlowOutputsResult call() throws Exception {
                AddFlowOutputsResult result = null;

                try {
                    result = executeAddFlowOutputs(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest request) {

        return createFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(final CreateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler) {
        final CreateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowResult>() {
            @Override
            public CreateFlowResult call() throws Exception {
                CreateFlowResult result = null;

                try {
                    result = executeCreateFlow(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request) {

        return deleteFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(final DeleteFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler) {
        final DeleteFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowResult>() {
            @Override
            public DeleteFlowResult call() throws Exception {
                DeleteFlowResult result = null;

                try {
                    result = executeDeleteFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest request) {

        return describeFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(final DescribeFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler) {
        final DescribeFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowResult>() {
            @Override
            public DescribeFlowResult call() throws Exception {
                DescribeFlowResult result = null;

                try {
                    result = executeDescribeFlow(finalRequest);
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
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest request) {

        return grantFlowEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(final GrantFlowEntitlementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantFlowEntitlementsRequest, GrantFlowEntitlementsResult> asyncHandler) {
        final GrantFlowEntitlementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GrantFlowEntitlementsResult>() {
            @Override
            public GrantFlowEntitlementsResult call() throws Exception {
                GrantFlowEntitlementsResult result = null;

                try {
                    result = executeGrantFlowEntitlements(finalRequest);
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
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest request) {

        return listEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(final ListEntitlementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResult> asyncHandler) {
        final ListEntitlementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitlementsResult>() {
            @Override
            public ListEntitlementsResult call() throws Exception {
                ListEntitlementsResult result = null;

                try {
                    result = executeListEntitlements(finalRequest);
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
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest request) {

        return listFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(final ListFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler) {
        final ListFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowsResult>() {
            @Override
            public ListFlowsResult call() throws Exception {
                ListFlowsResult result = null;

                try {
                    result = executeListFlows(finalRequest);
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
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest request) {

        return removeFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(final RemoveFlowOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFlowOutputRequest, RemoveFlowOutputResult> asyncHandler) {
        final RemoveFlowOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFlowOutputResult>() {
            @Override
            public RemoveFlowOutputResult call() throws Exception {
                RemoveFlowOutputResult result = null;

                try {
                    result = executeRemoveFlowOutput(finalRequest);
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
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest request) {

        return revokeFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(final RevokeFlowEntitlementRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeFlowEntitlementRequest, RevokeFlowEntitlementResult> asyncHandler) {
        final RevokeFlowEntitlementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeFlowEntitlementResult>() {
            @Override
            public RevokeFlowEntitlementResult call() throws Exception {
                RevokeFlowEntitlementResult result = null;

                try {
                    result = executeRevokeFlowEntitlement(finalRequest);
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
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest request) {

        return startFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(final StartFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler) {
        final StartFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFlowResult>() {
            @Override
            public StartFlowResult call() throws Exception {
                StartFlowResult result = null;

                try {
                    result = executeStartFlow(finalRequest);
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
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest request) {

        return stopFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(final StopFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler) {
        final StopFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFlowResult>() {
            @Override
            public StopFlowResult call() throws Exception {
                StopFlowResult result = null;

                try {
                    result = executeStopFlow(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest request) {

        return updateFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(final UpdateFlowEntitlementRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowEntitlementRequest, UpdateFlowEntitlementResult> asyncHandler) {
        final UpdateFlowEntitlementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowEntitlementResult>() {
            @Override
            public UpdateFlowEntitlementResult call() throws Exception {
                UpdateFlowEntitlementResult result = null;

                try {
                    result = executeUpdateFlowEntitlement(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest request) {

        return updateFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(final UpdateFlowOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowOutputRequest, UpdateFlowOutputResult> asyncHandler) {
        final UpdateFlowOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowOutputResult>() {
            @Override
            public UpdateFlowOutputResult call() throws Exception {
                UpdateFlowOutputResult result = null;

                try {
                    result = executeUpdateFlowOutput(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest request) {

        return updateFlowSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(final UpdateFlowSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowSourceRequest, UpdateFlowSourceResult> asyncHandler) {
        final UpdateFlowSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowSourceResult>() {
            @Override
            public UpdateFlowSourceResult call() throws Exception {
                UpdateFlowSourceResult result = null;

                try {
                    result = executeUpdateFlowSource(finalRequest);
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
