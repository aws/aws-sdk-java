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
package com.amazonaws.services.tnb;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Telco Network Builder asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Telco Network Builder (TNB) is a network automation service that helps you deploy and manage
 * telecom networks. AWS TNB helps you with the lifecycle management of your telecommunication network functions
 * throughout planning, deployment, and post-deployment activities.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTnbAsyncClient extends AWSTnbClient implements AWSTnbAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSTnbAsyncClientBuilder asyncBuilder() {
        return AWSTnbAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Telco Network Builder using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSTnbAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Telco Network Builder using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSTnbAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelSolNetworkOperationResult> cancelSolNetworkOperationAsync(CancelSolNetworkOperationRequest request) {

        return cancelSolNetworkOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSolNetworkOperationResult> cancelSolNetworkOperationAsync(final CancelSolNetworkOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSolNetworkOperationRequest, CancelSolNetworkOperationResult> asyncHandler) {
        final CancelSolNetworkOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSolNetworkOperationResult>() {
            @Override
            public CancelSolNetworkOperationResult call() throws Exception {
                CancelSolNetworkOperationResult result = null;

                try {
                    result = executeCancelSolNetworkOperation(finalRequest);
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
    public java.util.concurrent.Future<CreateSolFunctionPackageResult> createSolFunctionPackageAsync(CreateSolFunctionPackageRequest request) {

        return createSolFunctionPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolFunctionPackageResult> createSolFunctionPackageAsync(final CreateSolFunctionPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSolFunctionPackageRequest, CreateSolFunctionPackageResult> asyncHandler) {
        final CreateSolFunctionPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSolFunctionPackageResult>() {
            @Override
            public CreateSolFunctionPackageResult call() throws Exception {
                CreateSolFunctionPackageResult result = null;

                try {
                    result = executeCreateSolFunctionPackage(finalRequest);
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
    public java.util.concurrent.Future<CreateSolNetworkInstanceResult> createSolNetworkInstanceAsync(CreateSolNetworkInstanceRequest request) {

        return createSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolNetworkInstanceResult> createSolNetworkInstanceAsync(final CreateSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSolNetworkInstanceRequest, CreateSolNetworkInstanceResult> asyncHandler) {
        final CreateSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSolNetworkInstanceResult>() {
            @Override
            public CreateSolNetworkInstanceResult call() throws Exception {
                CreateSolNetworkInstanceResult result = null;

                try {
                    result = executeCreateSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateSolNetworkPackageResult> createSolNetworkPackageAsync(CreateSolNetworkPackageRequest request) {

        return createSolNetworkPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolNetworkPackageResult> createSolNetworkPackageAsync(final CreateSolNetworkPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSolNetworkPackageRequest, CreateSolNetworkPackageResult> asyncHandler) {
        final CreateSolNetworkPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSolNetworkPackageResult>() {
            @Override
            public CreateSolNetworkPackageResult call() throws Exception {
                CreateSolNetworkPackageResult result = null;

                try {
                    result = executeCreateSolNetworkPackage(finalRequest);
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
    public java.util.concurrent.Future<DeleteSolFunctionPackageResult> deleteSolFunctionPackageAsync(DeleteSolFunctionPackageRequest request) {

        return deleteSolFunctionPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSolFunctionPackageResult> deleteSolFunctionPackageAsync(final DeleteSolFunctionPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSolFunctionPackageRequest, DeleteSolFunctionPackageResult> asyncHandler) {
        final DeleteSolFunctionPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSolFunctionPackageResult>() {
            @Override
            public DeleteSolFunctionPackageResult call() throws Exception {
                DeleteSolFunctionPackageResult result = null;

                try {
                    result = executeDeleteSolFunctionPackage(finalRequest);
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
    public java.util.concurrent.Future<DeleteSolNetworkInstanceResult> deleteSolNetworkInstanceAsync(DeleteSolNetworkInstanceRequest request) {

        return deleteSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSolNetworkInstanceResult> deleteSolNetworkInstanceAsync(final DeleteSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSolNetworkInstanceRequest, DeleteSolNetworkInstanceResult> asyncHandler) {
        final DeleteSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSolNetworkInstanceResult>() {
            @Override
            public DeleteSolNetworkInstanceResult call() throws Exception {
                DeleteSolNetworkInstanceResult result = null;

                try {
                    result = executeDeleteSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteSolNetworkPackageResult> deleteSolNetworkPackageAsync(DeleteSolNetworkPackageRequest request) {

        return deleteSolNetworkPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSolNetworkPackageResult> deleteSolNetworkPackageAsync(final DeleteSolNetworkPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSolNetworkPackageRequest, DeleteSolNetworkPackageResult> asyncHandler) {
        final DeleteSolNetworkPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSolNetworkPackageResult>() {
            @Override
            public DeleteSolNetworkPackageResult call() throws Exception {
                DeleteSolNetworkPackageResult result = null;

                try {
                    result = executeDeleteSolNetworkPackage(finalRequest);
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
    public java.util.concurrent.Future<GetSolFunctionInstanceResult> getSolFunctionInstanceAsync(GetSolFunctionInstanceRequest request) {

        return getSolFunctionInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolFunctionInstanceResult> getSolFunctionInstanceAsync(final GetSolFunctionInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolFunctionInstanceRequest, GetSolFunctionInstanceResult> asyncHandler) {
        final GetSolFunctionInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolFunctionInstanceResult>() {
            @Override
            public GetSolFunctionInstanceResult call() throws Exception {
                GetSolFunctionInstanceResult result = null;

                try {
                    result = executeGetSolFunctionInstance(finalRequest);
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
    public java.util.concurrent.Future<GetSolFunctionPackageResult> getSolFunctionPackageAsync(GetSolFunctionPackageRequest request) {

        return getSolFunctionPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolFunctionPackageResult> getSolFunctionPackageAsync(final GetSolFunctionPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageRequest, GetSolFunctionPackageResult> asyncHandler) {
        final GetSolFunctionPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolFunctionPackageResult>() {
            @Override
            public GetSolFunctionPackageResult call() throws Exception {
                GetSolFunctionPackageResult result = null;

                try {
                    result = executeGetSolFunctionPackage(finalRequest);
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
    public java.util.concurrent.Future<GetSolFunctionPackageContentResult> getSolFunctionPackageContentAsync(GetSolFunctionPackageContentRequest request) {

        return getSolFunctionPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolFunctionPackageContentResult> getSolFunctionPackageContentAsync(final GetSolFunctionPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageContentRequest, GetSolFunctionPackageContentResult> asyncHandler) {
        final GetSolFunctionPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolFunctionPackageContentResult>() {
            @Override
            public GetSolFunctionPackageContentResult call() throws Exception {
                GetSolFunctionPackageContentResult result = null;

                try {
                    result = executeGetSolFunctionPackageContent(finalRequest);
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
    public java.util.concurrent.Future<GetSolFunctionPackageDescriptorResult> getSolFunctionPackageDescriptorAsync(
            GetSolFunctionPackageDescriptorRequest request) {

        return getSolFunctionPackageDescriptorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolFunctionPackageDescriptorResult> getSolFunctionPackageDescriptorAsync(
            final GetSolFunctionPackageDescriptorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageDescriptorRequest, GetSolFunctionPackageDescriptorResult> asyncHandler) {
        final GetSolFunctionPackageDescriptorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolFunctionPackageDescriptorResult>() {
            @Override
            public GetSolFunctionPackageDescriptorResult call() throws Exception {
                GetSolFunctionPackageDescriptorResult result = null;

                try {
                    result = executeGetSolFunctionPackageDescriptor(finalRequest);
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
    public java.util.concurrent.Future<GetSolNetworkInstanceResult> getSolNetworkInstanceAsync(GetSolNetworkInstanceRequest request) {

        return getSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolNetworkInstanceResult> getSolNetworkInstanceAsync(final GetSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolNetworkInstanceRequest, GetSolNetworkInstanceResult> asyncHandler) {
        final GetSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolNetworkInstanceResult>() {
            @Override
            public GetSolNetworkInstanceResult call() throws Exception {
                GetSolNetworkInstanceResult result = null;

                try {
                    result = executeGetSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<GetSolNetworkOperationResult> getSolNetworkOperationAsync(GetSolNetworkOperationRequest request) {

        return getSolNetworkOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolNetworkOperationResult> getSolNetworkOperationAsync(final GetSolNetworkOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolNetworkOperationRequest, GetSolNetworkOperationResult> asyncHandler) {
        final GetSolNetworkOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolNetworkOperationResult>() {
            @Override
            public GetSolNetworkOperationResult call() throws Exception {
                GetSolNetworkOperationResult result = null;

                try {
                    result = executeGetSolNetworkOperation(finalRequest);
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
    public java.util.concurrent.Future<GetSolNetworkPackageResult> getSolNetworkPackageAsync(GetSolNetworkPackageRequest request) {

        return getSolNetworkPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolNetworkPackageResult> getSolNetworkPackageAsync(final GetSolNetworkPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageRequest, GetSolNetworkPackageResult> asyncHandler) {
        final GetSolNetworkPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolNetworkPackageResult>() {
            @Override
            public GetSolNetworkPackageResult call() throws Exception {
                GetSolNetworkPackageResult result = null;

                try {
                    result = executeGetSolNetworkPackage(finalRequest);
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
    public java.util.concurrent.Future<GetSolNetworkPackageContentResult> getSolNetworkPackageContentAsync(GetSolNetworkPackageContentRequest request) {

        return getSolNetworkPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolNetworkPackageContentResult> getSolNetworkPackageContentAsync(final GetSolNetworkPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageContentRequest, GetSolNetworkPackageContentResult> asyncHandler) {
        final GetSolNetworkPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolNetworkPackageContentResult>() {
            @Override
            public GetSolNetworkPackageContentResult call() throws Exception {
                GetSolNetworkPackageContentResult result = null;

                try {
                    result = executeGetSolNetworkPackageContent(finalRequest);
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
    public java.util.concurrent.Future<GetSolNetworkPackageDescriptorResult> getSolNetworkPackageDescriptorAsync(GetSolNetworkPackageDescriptorRequest request) {

        return getSolNetworkPackageDescriptorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolNetworkPackageDescriptorResult> getSolNetworkPackageDescriptorAsync(
            final GetSolNetworkPackageDescriptorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageDescriptorRequest, GetSolNetworkPackageDescriptorResult> asyncHandler) {
        final GetSolNetworkPackageDescriptorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolNetworkPackageDescriptorResult>() {
            @Override
            public GetSolNetworkPackageDescriptorResult call() throws Exception {
                GetSolNetworkPackageDescriptorResult result = null;

                try {
                    result = executeGetSolNetworkPackageDescriptor(finalRequest);
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
    public java.util.concurrent.Future<InstantiateSolNetworkInstanceResult> instantiateSolNetworkInstanceAsync(InstantiateSolNetworkInstanceRequest request) {

        return instantiateSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InstantiateSolNetworkInstanceResult> instantiateSolNetworkInstanceAsync(
            final InstantiateSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<InstantiateSolNetworkInstanceRequest, InstantiateSolNetworkInstanceResult> asyncHandler) {
        final InstantiateSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InstantiateSolNetworkInstanceResult>() {
            @Override
            public InstantiateSolNetworkInstanceResult call() throws Exception {
                InstantiateSolNetworkInstanceResult result = null;

                try {
                    result = executeInstantiateSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<ListSolFunctionInstancesResult> listSolFunctionInstancesAsync(ListSolFunctionInstancesRequest request) {

        return listSolFunctionInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolFunctionInstancesResult> listSolFunctionInstancesAsync(final ListSolFunctionInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolFunctionInstancesRequest, ListSolFunctionInstancesResult> asyncHandler) {
        final ListSolFunctionInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolFunctionInstancesResult>() {
            @Override
            public ListSolFunctionInstancesResult call() throws Exception {
                ListSolFunctionInstancesResult result = null;

                try {
                    result = executeListSolFunctionInstances(finalRequest);
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
    public java.util.concurrent.Future<ListSolFunctionPackagesResult> listSolFunctionPackagesAsync(ListSolFunctionPackagesRequest request) {

        return listSolFunctionPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolFunctionPackagesResult> listSolFunctionPackagesAsync(final ListSolFunctionPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolFunctionPackagesRequest, ListSolFunctionPackagesResult> asyncHandler) {
        final ListSolFunctionPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolFunctionPackagesResult>() {
            @Override
            public ListSolFunctionPackagesResult call() throws Exception {
                ListSolFunctionPackagesResult result = null;

                try {
                    result = executeListSolFunctionPackages(finalRequest);
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
    public java.util.concurrent.Future<ListSolNetworkInstancesResult> listSolNetworkInstancesAsync(ListSolNetworkInstancesRequest request) {

        return listSolNetworkInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolNetworkInstancesResult> listSolNetworkInstancesAsync(final ListSolNetworkInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolNetworkInstancesRequest, ListSolNetworkInstancesResult> asyncHandler) {
        final ListSolNetworkInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolNetworkInstancesResult>() {
            @Override
            public ListSolNetworkInstancesResult call() throws Exception {
                ListSolNetworkInstancesResult result = null;

                try {
                    result = executeListSolNetworkInstances(finalRequest);
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
    public java.util.concurrent.Future<ListSolNetworkOperationsResult> listSolNetworkOperationsAsync(ListSolNetworkOperationsRequest request) {

        return listSolNetworkOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolNetworkOperationsResult> listSolNetworkOperationsAsync(final ListSolNetworkOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolNetworkOperationsRequest, ListSolNetworkOperationsResult> asyncHandler) {
        final ListSolNetworkOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolNetworkOperationsResult>() {
            @Override
            public ListSolNetworkOperationsResult call() throws Exception {
                ListSolNetworkOperationsResult result = null;

                try {
                    result = executeListSolNetworkOperations(finalRequest);
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
    public java.util.concurrent.Future<ListSolNetworkPackagesResult> listSolNetworkPackagesAsync(ListSolNetworkPackagesRequest request) {

        return listSolNetworkPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolNetworkPackagesResult> listSolNetworkPackagesAsync(final ListSolNetworkPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolNetworkPackagesRequest, ListSolNetworkPackagesResult> asyncHandler) {
        final ListSolNetworkPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolNetworkPackagesResult>() {
            @Override
            public ListSolNetworkPackagesResult call() throws Exception {
                ListSolNetworkPackagesResult result = null;

                try {
                    result = executeListSolNetworkPackages(finalRequest);
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
    public java.util.concurrent.Future<PutSolFunctionPackageContentResult> putSolFunctionPackageContentAsync(PutSolFunctionPackageContentRequest request) {

        return putSolFunctionPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSolFunctionPackageContentResult> putSolFunctionPackageContentAsync(final PutSolFunctionPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSolFunctionPackageContentRequest, PutSolFunctionPackageContentResult> asyncHandler) {
        final PutSolFunctionPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSolFunctionPackageContentResult>() {
            @Override
            public PutSolFunctionPackageContentResult call() throws Exception {
                PutSolFunctionPackageContentResult result = null;

                try {
                    result = executePutSolFunctionPackageContent(finalRequest);
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
    public java.util.concurrent.Future<PutSolNetworkPackageContentResult> putSolNetworkPackageContentAsync(PutSolNetworkPackageContentRequest request) {

        return putSolNetworkPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSolNetworkPackageContentResult> putSolNetworkPackageContentAsync(final PutSolNetworkPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSolNetworkPackageContentRequest, PutSolNetworkPackageContentResult> asyncHandler) {
        final PutSolNetworkPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSolNetworkPackageContentResult>() {
            @Override
            public PutSolNetworkPackageContentResult call() throws Exception {
                PutSolNetworkPackageContentResult result = null;

                try {
                    result = executePutSolNetworkPackageContent(finalRequest);
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
    public java.util.concurrent.Future<TerminateSolNetworkInstanceResult> terminateSolNetworkInstanceAsync(TerminateSolNetworkInstanceRequest request) {

        return terminateSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateSolNetworkInstanceResult> terminateSolNetworkInstanceAsync(final TerminateSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateSolNetworkInstanceRequest, TerminateSolNetworkInstanceResult> asyncHandler) {
        final TerminateSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateSolNetworkInstanceResult>() {
            @Override
            public TerminateSolNetworkInstanceResult call() throws Exception {
                TerminateSolNetworkInstanceResult result = null;

                try {
                    result = executeTerminateSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateSolFunctionPackageResult> updateSolFunctionPackageAsync(UpdateSolFunctionPackageRequest request) {

        return updateSolFunctionPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSolFunctionPackageResult> updateSolFunctionPackageAsync(final UpdateSolFunctionPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSolFunctionPackageRequest, UpdateSolFunctionPackageResult> asyncHandler) {
        final UpdateSolFunctionPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSolFunctionPackageResult>() {
            @Override
            public UpdateSolFunctionPackageResult call() throws Exception {
                UpdateSolFunctionPackageResult result = null;

                try {
                    result = executeUpdateSolFunctionPackage(finalRequest);
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
    public java.util.concurrent.Future<UpdateSolNetworkInstanceResult> updateSolNetworkInstanceAsync(UpdateSolNetworkInstanceRequest request) {

        return updateSolNetworkInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSolNetworkInstanceResult> updateSolNetworkInstanceAsync(final UpdateSolNetworkInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSolNetworkInstanceRequest, UpdateSolNetworkInstanceResult> asyncHandler) {
        final UpdateSolNetworkInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSolNetworkInstanceResult>() {
            @Override
            public UpdateSolNetworkInstanceResult call() throws Exception {
                UpdateSolNetworkInstanceResult result = null;

                try {
                    result = executeUpdateSolNetworkInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateSolNetworkPackageResult> updateSolNetworkPackageAsync(UpdateSolNetworkPackageRequest request) {

        return updateSolNetworkPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSolNetworkPackageResult> updateSolNetworkPackageAsync(final UpdateSolNetworkPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSolNetworkPackageRequest, UpdateSolNetworkPackageResult> asyncHandler) {
        final UpdateSolNetworkPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSolNetworkPackageResult>() {
            @Override
            public UpdateSolNetworkPackageResult call() throws Exception {
                UpdateSolNetworkPackageResult result = null;

                try {
                    result = executeUpdateSolNetworkPackage(finalRequest);
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
    public java.util.concurrent.Future<ValidateSolFunctionPackageContentResult> validateSolFunctionPackageContentAsync(
            ValidateSolFunctionPackageContentRequest request) {

        return validateSolFunctionPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateSolFunctionPackageContentResult> validateSolFunctionPackageContentAsync(
            final ValidateSolFunctionPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateSolFunctionPackageContentRequest, ValidateSolFunctionPackageContentResult> asyncHandler) {
        final ValidateSolFunctionPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateSolFunctionPackageContentResult>() {
            @Override
            public ValidateSolFunctionPackageContentResult call() throws Exception {
                ValidateSolFunctionPackageContentResult result = null;

                try {
                    result = executeValidateSolFunctionPackageContent(finalRequest);
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
    public java.util.concurrent.Future<ValidateSolNetworkPackageContentResult> validateSolNetworkPackageContentAsync(
            ValidateSolNetworkPackageContentRequest request) {

        return validateSolNetworkPackageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateSolNetworkPackageContentResult> validateSolNetworkPackageContentAsync(
            final ValidateSolNetworkPackageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateSolNetworkPackageContentRequest, ValidateSolNetworkPackageContentResult> asyncHandler) {
        final ValidateSolNetworkPackageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateSolNetworkPackageContentResult>() {
            @Override
            public ValidateSolNetworkPackageContentResult call() throws Exception {
                ValidateSolNetworkPackageContentResult result = null;

                try {
                    result = executeValidateSolNetworkPackageContent(finalRequest);
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
