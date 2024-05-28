/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.launchwizard;

import javax.annotation.Generated;

import com.amazonaws.services.launchwizard.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Launch Wizard asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Launch Wizard offers a guided way of sizing, configuring, and deploying Amazon Web Services resources for third party
 * applications, such as Microsoft SQL Server Always On and HANA based SAP systems, without the need to manually
 * identify and provision individual Amazon Web Services resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLaunchWizardAsyncClient extends AWSLaunchWizardClient implements AWSLaunchWizardAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLaunchWizardAsyncClientBuilder asyncBuilder() {
        return AWSLaunchWizardAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Launch Wizard using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLaunchWizardAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Launch Wizard using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLaunchWizardAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
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
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(final DeleteDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler) {
        final DeleteDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentResult>() {
            @Override
            public DeleteDeploymentResult call() throws Exception {
                DeleteDeploymentResult result = null;

                try {
                    result = executeDeleteDeployment(finalRequest);
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
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
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
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest request) {

        return getWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(final GetWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler) {
        final GetWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkloadResult>() {
            @Override
            public GetWorkloadResult call() throws Exception {
                GetWorkloadResult result = null;

                try {
                    result = executeGetWorkload(finalRequest);
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
    public java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(ListDeploymentEventsRequest request) {

        return listDeploymentEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(final ListDeploymentEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentEventsRequest, ListDeploymentEventsResult> asyncHandler) {
        final ListDeploymentEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentEventsResult>() {
            @Override
            public ListDeploymentEventsResult call() throws Exception {
                ListDeploymentEventsResult result = null;

                try {
                    result = executeListDeploymentEvents(finalRequest);
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
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
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
    public java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(ListWorkloadDeploymentPatternsRequest request) {

        return listWorkloadDeploymentPatternsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(
            final ListWorkloadDeploymentPatternsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadDeploymentPatternsRequest, ListWorkloadDeploymentPatternsResult> asyncHandler) {
        final ListWorkloadDeploymentPatternsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadDeploymentPatternsResult>() {
            @Override
            public ListWorkloadDeploymentPatternsResult call() throws Exception {
                ListWorkloadDeploymentPatternsResult result = null;

                try {
                    result = executeListWorkloadDeploymentPatterns(finalRequest);
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
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest request) {

        return listWorkloadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(final ListWorkloadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler) {
        final ListWorkloadsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadsResult>() {
            @Override
            public ListWorkloadsResult call() throws Exception {
                ListWorkloadsResult result = null;

                try {
                    result = executeListWorkloads(finalRequest);
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
