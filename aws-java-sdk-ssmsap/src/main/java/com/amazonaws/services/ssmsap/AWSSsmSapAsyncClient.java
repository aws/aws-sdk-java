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
package com.amazonaws.services.ssmsap;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SsmSap asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Systems Manager for SAP. The topic for each action shows the API request parameters and responses.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSsmSapAsyncClient extends AWSSsmSapClient implements AWSSsmSapAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSsmSapAsyncClientBuilder asyncBuilder() {
        return AWSSsmSapAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SsmSap using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSsmSapAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SsmSap using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSsmSapAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(DeleteResourcePermissionRequest request) {

        return deleteResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(final DeleteResourcePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePermissionRequest, DeleteResourcePermissionResult> asyncHandler) {
        final DeleteResourcePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePermissionResult>() {
            @Override
            public DeleteResourcePermissionResult call() throws Exception {
                DeleteResourcePermissionResult result = null;

                try {
                    result = executeDeleteResourcePermission(finalRequest);
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
    public java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(DeregisterApplicationRequest request) {

        return deregisterApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(final DeregisterApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterApplicationRequest, DeregisterApplicationResult> asyncHandler) {
        final DeregisterApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterApplicationResult>() {
            @Override
            public DeregisterApplicationResult call() throws Exception {
                DeregisterApplicationResult result = null;

                try {
                    result = executeDeregisterApplication(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
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
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(final GetComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {
        final GetComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentResult>() {
            @Override
            public GetComponentResult call() throws Exception {
                GetComponentResult result = null;

                try {
                    result = executeGetComponent(finalRequest);
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
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest request) {

        return getDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(final GetDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler) {
        final GetDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatabaseResult>() {
            @Override
            public GetDatabaseResult call() throws Exception {
                GetDatabaseResult result = null;

                try {
                    result = executeGetDatabase(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(GetResourcePermissionRequest request) {

        return getResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(final GetResourcePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePermissionRequest, GetResourcePermissionResult> asyncHandler) {
        final GetResourcePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePermissionResult>() {
            @Override
            public GetResourcePermissionResult call() throws Exception {
                GetResourcePermissionResult result = null;

                try {
                    result = executeGetResourcePermission(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(final ListComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {
        final ListComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentsResult>() {
            @Override
            public ListComponentsResult call() throws Exception {
                ListComponentsResult result = null;

                try {
                    result = executeListComponents(finalRequest);
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
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(final ListDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {
        final ListDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatabasesResult>() {
            @Override
            public ListDatabasesResult call() throws Exception {
                ListDatabasesResult result = null;

                try {
                    result = executeListDatabases(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(PutResourcePermissionRequest request) {

        return putResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(final PutResourcePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePermissionRequest, PutResourcePermissionResult> asyncHandler) {
        final PutResourcePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePermissionResult>() {
            @Override
            public PutResourcePermissionResult call() throws Exception {
                PutResourcePermissionResult result = null;

                try {
                    result = executePutResourcePermission(finalRequest);
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
    public java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(RegisterApplicationRequest request) {

        return registerApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(final RegisterApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterApplicationRequest, RegisterApplicationResult> asyncHandler) {
        final RegisterApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterApplicationResult>() {
            @Override
            public RegisterApplicationResult call() throws Exception {
                RegisterApplicationResult result = null;

                try {
                    result = executeRegisterApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(UpdateApplicationSettingsRequest request) {

        return updateApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(final UpdateApplicationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler) {
        final UpdateApplicationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationSettingsResult>() {
            @Override
            public UpdateApplicationSettingsResult call() throws Exception {
                UpdateApplicationSettingsResult result = null;

                try {
                    result = executeUpdateApplicationSettings(finalRequest);
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
