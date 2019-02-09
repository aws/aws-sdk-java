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
package com.amazonaws.services.dlm;

import javax.annotation.Generated;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon DLM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Data Lifecycle Manager</fullname>
 * <p>
 * With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
 * policies, which are used to automate operations on the specified resources.
 * </p>
 * <p>
 * Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html">Automating the Amazon EBS Snapshot
 * Lifecycle</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDLMAsyncClient extends AmazonDLMClient implements AmazonDLMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDLMAsyncClientBuilder asyncBuilder() {
        return AmazonDLMAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DLM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDLMAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(CreateLifecyclePolicyRequest request) {

        return createLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(final CreateLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLifecyclePolicyRequest, CreateLifecyclePolicyResult> asyncHandler) {
        final CreateLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLifecyclePolicyResult>() {
            @Override
            public CreateLifecyclePolicyResult call() throws Exception {
                CreateLifecyclePolicyResult result = null;

                try {
                    result = executeCreateLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest request) {

        return deleteLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(final DeleteLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler) {
        final DeleteLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLifecyclePolicyResult>() {
            @Override
            public DeleteLifecyclePolicyResult call() throws Exception {
                DeleteLifecyclePolicyResult result = null;

                try {
                    result = executeDeleteLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(GetLifecyclePoliciesRequest request) {

        return getLifecyclePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(final GetLifecyclePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLifecyclePoliciesRequest, GetLifecyclePoliciesResult> asyncHandler) {
        final GetLifecyclePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLifecyclePoliciesResult>() {
            @Override
            public GetLifecyclePoliciesResult call() throws Exception {
                GetLifecyclePoliciesResult result = null;

                try {
                    result = executeGetLifecyclePolicies(finalRequest);
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
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest request) {

        return getLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(final GetLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler) {
        final GetLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLifecyclePolicyResult>() {
            @Override
            public GetLifecyclePolicyResult call() throws Exception {
                GetLifecyclePolicyResult result = null;

                try {
                    result = executeGetLifecyclePolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(UpdateLifecyclePolicyRequest request) {

        return updateLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(final UpdateLifecyclePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLifecyclePolicyRequest, UpdateLifecyclePolicyResult> asyncHandler) {
        final UpdateLifecyclePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLifecyclePolicyResult>() {
            @Override
            public UpdateLifecyclePolicyResult call() throws Exception {
                UpdateLifecyclePolicyResult result = null;

                try {
                    result = executeUpdateLifecyclePolicy(finalRequest);
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
