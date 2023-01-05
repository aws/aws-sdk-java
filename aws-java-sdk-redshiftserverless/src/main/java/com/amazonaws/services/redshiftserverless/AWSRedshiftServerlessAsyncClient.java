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
package com.amazonaws.services.redshiftserverless;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Redshift Serverless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is an interface reference for Amazon Redshift Serverless. It contains documentation for one of the programming
 * or command line interfaces you can use to manage Amazon Redshift Serverless.
 * </p>
 * <p>
 * Amazon Redshift Serverless automatically provisions data warehouse capacity and intelligently scales the underlying
 * resources based on workload demands. Amazon Redshift Serverless adjusts capacity in seconds to deliver consistently
 * high performance and simplified operations for even the most demanding and volatile workloads. Amazon Redshift
 * Serverless lets you focus on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * To learn more about Amazon Redshift Serverless, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-whatis.html">What is Amazon Redshift
 * Serverless</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRedshiftServerlessAsyncClient extends AWSRedshiftServerlessClient implements AWSRedshiftServerlessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRedshiftServerlessAsyncClientBuilder asyncBuilder() {
        return AWSRedshiftServerlessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Redshift Serverless using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRedshiftServerlessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Redshift Serverless using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRedshiftServerlessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ConvertRecoveryPointToSnapshotResult> convertRecoveryPointToSnapshotAsync(ConvertRecoveryPointToSnapshotRequest request) {

        return convertRecoveryPointToSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConvertRecoveryPointToSnapshotResult> convertRecoveryPointToSnapshotAsync(
            final ConvertRecoveryPointToSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConvertRecoveryPointToSnapshotRequest, ConvertRecoveryPointToSnapshotResult> asyncHandler) {
        final ConvertRecoveryPointToSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConvertRecoveryPointToSnapshotResult>() {
            @Override
            public ConvertRecoveryPointToSnapshotResult call() throws Exception {
                ConvertRecoveryPointToSnapshotResult result = null;

                try {
                    result = executeConvertRecoveryPointToSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateEndpointAccessResult> createEndpointAccessAsync(CreateEndpointAccessRequest request) {

        return createEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointAccessResult> createEndpointAccessAsync(final CreateEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointAccessRequest, CreateEndpointAccessResult> asyncHandler) {
        final CreateEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointAccessResult>() {
            @Override
            public CreateEndpointAccessResult call() throws Exception {
                CreateEndpointAccessResult result = null;

                try {
                    result = executeCreateEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest request) {

        return createNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(final CreateNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResult> asyncHandler) {
        final CreateNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNamespaceResult>() {
            @Override
            public CreateNamespaceResult call() throws Exception {
                CreateNamespaceResult result = null;

                try {
                    result = executeCreateNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateUsageLimitResult> createUsageLimitAsync(CreateUsageLimitRequest request) {

        return createUsageLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUsageLimitResult> createUsageLimitAsync(final CreateUsageLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUsageLimitRequest, CreateUsageLimitResult> asyncHandler) {
        final CreateUsageLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUsageLimitResult>() {
            @Override
            public CreateUsageLimitResult call() throws Exception {
                CreateUsageLimitResult result = null;

                try {
                    result = executeCreateUsageLimit(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkgroupResult> createWorkgroupAsync(CreateWorkgroupRequest request) {

        return createWorkgroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkgroupResult> createWorkgroupAsync(final CreateWorkgroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkgroupRequest, CreateWorkgroupResult> asyncHandler) {
        final CreateWorkgroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkgroupResult>() {
            @Override
            public CreateWorkgroupResult call() throws Exception {
                CreateWorkgroupResult result = null;

                try {
                    result = executeCreateWorkgroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointAccessResult> deleteEndpointAccessAsync(DeleteEndpointAccessRequest request) {

        return deleteEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointAccessResult> deleteEndpointAccessAsync(final DeleteEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointAccessRequest, DeleteEndpointAccessResult> asyncHandler) {
        final DeleteEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointAccessResult>() {
            @Override
            public DeleteEndpointAccessResult call() throws Exception {
                DeleteEndpointAccessResult result = null;

                try {
                    result = executeDeleteEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {
        final DeleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result = null;

                try {
                    result = executeDeleteSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteUsageLimitResult> deleteUsageLimitAsync(DeleteUsageLimitRequest request) {

        return deleteUsageLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUsageLimitResult> deleteUsageLimitAsync(final DeleteUsageLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUsageLimitRequest, DeleteUsageLimitResult> asyncHandler) {
        final DeleteUsageLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUsageLimitResult>() {
            @Override
            public DeleteUsageLimitResult call() throws Exception {
                DeleteUsageLimitResult result = null;

                try {
                    result = executeDeleteUsageLimit(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkgroupResult> deleteWorkgroupAsync(DeleteWorkgroupRequest request) {

        return deleteWorkgroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkgroupResult> deleteWorkgroupAsync(final DeleteWorkgroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkgroupRequest, DeleteWorkgroupResult> asyncHandler) {
        final DeleteWorkgroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkgroupResult>() {
            @Override
            public DeleteWorkgroupResult call() throws Exception {
                DeleteWorkgroupResult result = null;

                try {
                    result = executeDeleteWorkgroup(finalRequest);
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
    public java.util.concurrent.Future<GetCredentialsResult> getCredentialsAsync(GetCredentialsRequest request) {

        return getCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialsResult> getCredentialsAsync(final GetCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCredentialsRequest, GetCredentialsResult> asyncHandler) {
        final GetCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCredentialsResult>() {
            @Override
            public GetCredentialsResult call() throws Exception {
                GetCredentialsResult result = null;

                try {
                    result = executeGetCredentials(finalRequest);
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
    public java.util.concurrent.Future<GetEndpointAccessResult> getEndpointAccessAsync(GetEndpointAccessRequest request) {

        return getEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAccessResult> getEndpointAccessAsync(final GetEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEndpointAccessRequest, GetEndpointAccessResult> asyncHandler) {
        final GetEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEndpointAccessResult>() {
            @Override
            public GetEndpointAccessResult call() throws Exception {
                GetEndpointAccessResult result = null;

                try {
                    result = executeGetEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<GetRecoveryPointResult> getRecoveryPointAsync(GetRecoveryPointRequest request) {

        return getRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryPointResult> getRecoveryPointAsync(final GetRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecoveryPointRequest, GetRecoveryPointResult> asyncHandler) {
        final GetRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecoveryPointResult>() {
            @Override
            public GetRecoveryPointResult call() throws Exception {
                GetRecoveryPointResult result = null;

                try {
                    result = executeGetRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(final GetResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {
        final GetResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePolicyResult>() {
            @Override
            public GetResourcePolicyResult call() throws Exception {
                GetResourcePolicyResult result = null;

                try {
                    result = executeGetResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest request) {

        return getSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(final GetSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSnapshotRequest, GetSnapshotResult> asyncHandler) {
        final GetSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSnapshotResult>() {
            @Override
            public GetSnapshotResult call() throws Exception {
                GetSnapshotResult result = null;

                try {
                    result = executeGetSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetTableRestoreStatusResult> getTableRestoreStatusAsync(GetTableRestoreStatusRequest request) {

        return getTableRestoreStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableRestoreStatusResult> getTableRestoreStatusAsync(final GetTableRestoreStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTableRestoreStatusRequest, GetTableRestoreStatusResult> asyncHandler) {
        final GetTableRestoreStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTableRestoreStatusResult>() {
            @Override
            public GetTableRestoreStatusResult call() throws Exception {
                GetTableRestoreStatusResult result = null;

                try {
                    result = executeGetTableRestoreStatus(finalRequest);
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
    public java.util.concurrent.Future<GetUsageLimitResult> getUsageLimitAsync(GetUsageLimitRequest request) {

        return getUsageLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageLimitResult> getUsageLimitAsync(final GetUsageLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsageLimitRequest, GetUsageLimitResult> asyncHandler) {
        final GetUsageLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsageLimitResult>() {
            @Override
            public GetUsageLimitResult call() throws Exception {
                GetUsageLimitResult result = null;

                try {
                    result = executeGetUsageLimit(finalRequest);
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
    public java.util.concurrent.Future<GetWorkgroupResult> getWorkgroupAsync(GetWorkgroupRequest request) {

        return getWorkgroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkgroupResult> getWorkgroupAsync(final GetWorkgroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkgroupRequest, GetWorkgroupResult> asyncHandler) {
        final GetWorkgroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkgroupResult>() {
            @Override
            public GetWorkgroupResult call() throws Exception {
                GetWorkgroupResult result = null;

                try {
                    result = executeGetWorkgroup(finalRequest);
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
    public java.util.concurrent.Future<ListEndpointAccessResult> listEndpointAccessAsync(ListEndpointAccessRequest request) {

        return listEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointAccessResult> listEndpointAccessAsync(final ListEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointAccessRequest, ListEndpointAccessResult> asyncHandler) {
        final ListEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointAccessResult>() {
            @Override
            public ListEndpointAccessResult call() throws Exception {
                ListEndpointAccessResult result = null;

                try {
                    result = executeListEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<ListRecoveryPointsResult> listRecoveryPointsAsync(ListRecoveryPointsRequest request) {

        return listRecoveryPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsResult> listRecoveryPointsAsync(final ListRecoveryPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsRequest, ListRecoveryPointsResult> asyncHandler) {
        final ListRecoveryPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecoveryPointsResult>() {
            @Override
            public ListRecoveryPointsResult call() throws Exception {
                ListRecoveryPointsResult result = null;

                try {
                    result = executeListRecoveryPoints(finalRequest);
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
    public java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest request) {

        return listSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(final ListSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResult> asyncHandler) {
        final ListSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSnapshotsResult>() {
            @Override
            public ListSnapshotsResult call() throws Exception {
                ListSnapshotsResult result = null;

                try {
                    result = executeListSnapshots(finalRequest);
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
    public java.util.concurrent.Future<ListTableRestoreStatusResult> listTableRestoreStatusAsync(ListTableRestoreStatusRequest request) {

        return listTableRestoreStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableRestoreStatusResult> listTableRestoreStatusAsync(final ListTableRestoreStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTableRestoreStatusRequest, ListTableRestoreStatusResult> asyncHandler) {
        final ListTableRestoreStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTableRestoreStatusResult>() {
            @Override
            public ListTableRestoreStatusResult call() throws Exception {
                ListTableRestoreStatusResult result = null;

                try {
                    result = executeListTableRestoreStatus(finalRequest);
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
    public java.util.concurrent.Future<ListUsageLimitsResult> listUsageLimitsAsync(ListUsageLimitsRequest request) {

        return listUsageLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsageLimitsResult> listUsageLimitsAsync(final ListUsageLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsageLimitsRequest, ListUsageLimitsResult> asyncHandler) {
        final ListUsageLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsageLimitsResult>() {
            @Override
            public ListUsageLimitsResult call() throws Exception {
                ListUsageLimitsResult result = null;

                try {
                    result = executeListUsageLimits(finalRequest);
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
    public java.util.concurrent.Future<ListWorkgroupsResult> listWorkgroupsAsync(ListWorkgroupsRequest request) {

        return listWorkgroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkgroupsResult> listWorkgroupsAsync(final ListWorkgroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkgroupsRequest, ListWorkgroupsResult> asyncHandler) {
        final ListWorkgroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkgroupsResult>() {
            @Override
            public ListWorkgroupsResult call() throws Exception {
                ListWorkgroupsResult result = null;

                try {
                    result = executeListWorkgroups(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<RestoreFromRecoveryPointResult> restoreFromRecoveryPointAsync(RestoreFromRecoveryPointRequest request) {

        return restoreFromRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreFromRecoveryPointResult> restoreFromRecoveryPointAsync(final RestoreFromRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromRecoveryPointRequest, RestoreFromRecoveryPointResult> asyncHandler) {
        final RestoreFromRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreFromRecoveryPointResult>() {
            @Override
            public RestoreFromRecoveryPointResult call() throws Exception {
                RestoreFromRecoveryPointResult result = null;

                try {
                    result = executeRestoreFromRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest request) {

        return restoreFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(final RestoreFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler) {
        final RestoreFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreFromSnapshotResult>() {
            @Override
            public RestoreFromSnapshotResult call() throws Exception {
                RestoreFromSnapshotResult result = null;

                try {
                    result = executeRestoreFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<RestoreTableFromSnapshotResult> restoreTableFromSnapshotAsync(RestoreTableFromSnapshotRequest request) {

        return restoreTableFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreTableFromSnapshotResult> restoreTableFromSnapshotAsync(final RestoreTableFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreTableFromSnapshotRequest, RestoreTableFromSnapshotResult> asyncHandler) {
        final RestoreTableFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreTableFromSnapshotResult>() {
            @Override
            public RestoreTableFromSnapshotResult call() throws Exception {
                RestoreTableFromSnapshotResult result = null;

                try {
                    result = executeRestoreTableFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointAccessResult> updateEndpointAccessAsync(UpdateEndpointAccessRequest request) {

        return updateEndpointAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointAccessResult> updateEndpointAccessAsync(final UpdateEndpointAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointAccessRequest, UpdateEndpointAccessResult> asyncHandler) {
        final UpdateEndpointAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointAccessResult>() {
            @Override
            public UpdateEndpointAccessResult call() throws Exception {
                UpdateEndpointAccessResult result = null;

                try {
                    result = executeUpdateEndpointAccess(finalRequest);
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
    public java.util.concurrent.Future<UpdateNamespaceResult> updateNamespaceAsync(UpdateNamespaceRequest request) {

        return updateNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceResult> updateNamespaceAsync(final UpdateNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNamespaceRequest, UpdateNamespaceResult> asyncHandler) {
        final UpdateNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNamespaceResult>() {
            @Override
            public UpdateNamespaceResult call() throws Exception {
                UpdateNamespaceResult result = null;

                try {
                    result = executeUpdateNamespace(finalRequest);
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
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest request) {

        return updateSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(final UpdateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler) {
        final UpdateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSnapshotResult>() {
            @Override
            public UpdateSnapshotResult call() throws Exception {
                UpdateSnapshotResult result = null;

                try {
                    result = executeUpdateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<UpdateUsageLimitResult> updateUsageLimitAsync(UpdateUsageLimitRequest request) {

        return updateUsageLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUsageLimitResult> updateUsageLimitAsync(final UpdateUsageLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUsageLimitRequest, UpdateUsageLimitResult> asyncHandler) {
        final UpdateUsageLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUsageLimitResult>() {
            @Override
            public UpdateUsageLimitResult call() throws Exception {
                UpdateUsageLimitResult result = null;

                try {
                    result = executeUpdateUsageLimit(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkgroupResult> updateWorkgroupAsync(UpdateWorkgroupRequest request) {

        return updateWorkgroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkgroupResult> updateWorkgroupAsync(final UpdateWorkgroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkgroupRequest, UpdateWorkgroupResult> asyncHandler) {
        final UpdateWorkgroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkgroupResult>() {
            @Override
            public UpdateWorkgroupResult call() throws Exception {
                UpdateWorkgroupResult result = null;

                try {
                    result = executeUpdateWorkgroup(finalRequest);
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
