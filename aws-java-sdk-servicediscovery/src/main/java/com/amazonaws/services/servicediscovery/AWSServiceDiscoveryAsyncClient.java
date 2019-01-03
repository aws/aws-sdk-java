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
package com.amazonaws.services.servicediscovery;

import javax.annotation.Generated;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ServiceDiscovery asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
 * in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
 * with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
 * optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
 * an answer that contains up to eight healthy records.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceDiscoveryAsyncClient extends AWSServiceDiscoveryClient implements AWSServiceDiscoveryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSServiceDiscoveryAsyncClientBuilder asyncBuilder() {
        return AWSServiceDiscoveryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ServiceDiscovery using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServiceDiscoveryAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(CreateHttpNamespaceRequest request) {

        return createHttpNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(final CreateHttpNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHttpNamespaceRequest, CreateHttpNamespaceResult> asyncHandler) {
        final CreateHttpNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHttpNamespaceResult>() {
            @Override
            public CreateHttpNamespaceResult call() throws Exception {
                CreateHttpNamespaceResult result = null;

                try {
                    result = executeCreateHttpNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(CreatePrivateDnsNamespaceRequest request) {

        return createPrivateDnsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(final CreatePrivateDnsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePrivateDnsNamespaceRequest, CreatePrivateDnsNamespaceResult> asyncHandler) {
        final CreatePrivateDnsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePrivateDnsNamespaceResult>() {
            @Override
            public CreatePrivateDnsNamespaceResult call() throws Exception {
                CreatePrivateDnsNamespaceResult result = null;

                try {
                    result = executeCreatePrivateDnsNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(CreatePublicDnsNamespaceRequest request) {

        return createPublicDnsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(final CreatePublicDnsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePublicDnsNamespaceRequest, CreatePublicDnsNamespaceResult> asyncHandler) {
        final CreatePublicDnsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePublicDnsNamespaceResult>() {
            @Override
            public CreatePublicDnsNamespaceResult call() throws Exception {
                CreatePublicDnsNamespaceResult result = null;

                try {
                    result = executeCreatePublicDnsNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request) {

        return createServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(final CreateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler) {
        final CreateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceResult>() {
            @Override
            public CreateServiceResult call() throws Exception {
                CreateServiceResult result = null;

                try {
                    result = executeCreateService(finalRequest);
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
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest request) {

        return deleteNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(final DeleteNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler) {
        final DeleteNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNamespaceResult>() {
            @Override
            public DeleteNamespaceResult call() throws Exception {
                DeleteNamespaceResult result = null;

                try {
                    result = executeDeleteNamespace(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request) {

        return deleteServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(final DeleteServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler) {
        final DeleteServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceResult>() {
            @Override
            public DeleteServiceResult call() throws Exception {
                DeleteServiceResult result = null;

                try {
                    result = executeDeleteService(finalRequest);
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
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest request) {

        return deregisterInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(final DeregisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, DeregisterInstanceResult> asyncHandler) {
        final DeregisterInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterInstanceResult>() {
            @Override
            public DeregisterInstanceResult call() throws Exception {
                DeregisterInstanceResult result = null;

                try {
                    result = executeDeregisterInstance(finalRequest);
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
    public java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(DiscoverInstancesRequest request) {

        return discoverInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(final DiscoverInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DiscoverInstancesRequest, DiscoverInstancesResult> asyncHandler) {
        final DiscoverInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DiscoverInstancesResult>() {
            @Override
            public DiscoverInstancesResult call() throws Exception {
                DiscoverInstancesResult result = null;

                try {
                    result = executeDiscoverInstances(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request) {

        return getInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(final GetInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler) {
        final GetInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceResult>() {
            @Override
            public GetInstanceResult call() throws Exception {
                GetInstanceResult result = null;

                try {
                    result = executeGetInstance(finalRequest);
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
    public java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(GetInstancesHealthStatusRequest request) {

        return getInstancesHealthStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(final GetInstancesHealthStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstancesHealthStatusRequest, GetInstancesHealthStatusResult> asyncHandler) {
        final GetInstancesHealthStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstancesHealthStatusResult>() {
            @Override
            public GetInstancesHealthStatusResult call() throws Exception {
                GetInstancesHealthStatusResult result = null;

                try {
                    result = executeGetInstancesHealthStatus(finalRequest);
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
    public java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest request) {

        return getNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(final GetNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNamespaceRequest, GetNamespaceResult> asyncHandler) {
        final GetNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNamespaceResult>() {
            @Override
            public GetNamespaceResult call() throws Exception {
                GetNamespaceResult result = null;

                try {
                    result = executeGetNamespace(finalRequest);
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
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(final GetOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {
        final GetOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOperationResult>() {
            @Override
            public GetOperationResult call() throws Exception {
                GetOperationResult result = null;

                try {
                    result = executeGetOperation(finalRequest);
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
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(final GetServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {
        final GetServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceResult>() {
            @Override
            public GetServiceResult call() throws Exception {
                GetServiceResult result = null;

                try {
                    result = executeGetService(finalRequest);
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
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
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
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest request) {

        return listNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(final ListNamespacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler) {
        final ListNamespacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNamespacesResult>() {
            @Override
            public ListNamespacesResult call() throws Exception {
                ListNamespacesResult result = null;

                try {
                    result = executeListNamespaces(finalRequest);
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
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest request) {

        return listOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(final ListOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler) {
        final ListOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOperationsResult>() {
            @Override
            public ListOperationsResult call() throws Exception {
                ListOperationsResult result = null;

                try {
                    result = executeListOperations(finalRequest);
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
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
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
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest request) {

        return registerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(final RegisterInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler) {
        final RegisterInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterInstanceResult>() {
            @Override
            public RegisterInstanceResult call() throws Exception {
                RegisterInstanceResult result = null;

                try {
                    result = executeRegisterInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            UpdateInstanceCustomHealthStatusRequest request) {

        return updateInstanceCustomHealthStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            final UpdateInstanceCustomHealthStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceCustomHealthStatusRequest, UpdateInstanceCustomHealthStatusResult> asyncHandler) {
        final UpdateInstanceCustomHealthStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceCustomHealthStatusResult>() {
            @Override
            public UpdateInstanceCustomHealthStatusResult call() throws Exception {
                UpdateInstanceCustomHealthStatusResult result = null;

                try {
                    result = executeUpdateInstanceCustomHealthStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request) {

        return updateServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(final UpdateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler) {
        final UpdateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceResult>() {
            @Override
            public UpdateServiceResult call() throws Exception {
                UpdateServiceResult result = null;

                try {
                    result = executeUpdateService(finalRequest);
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
