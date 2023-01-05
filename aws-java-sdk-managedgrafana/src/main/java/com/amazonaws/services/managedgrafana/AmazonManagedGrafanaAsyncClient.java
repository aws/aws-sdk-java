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
package com.amazonaws.services.managedgrafana;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Managed Grafana asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Managed Grafana is a fully managed and secure data visualization service that you can use to instantly query,
 * correlate, and visualize operational metrics, logs, and traces from multiple sources. Amazon Managed Grafana makes it
 * easy to deploy, operate, and scale Grafana, a widely deployed data visualization tool that is popular for its
 * extensible data support.
 * </p>
 * <p>
 * With Amazon Managed Grafana, you create logically isolated Grafana servers called <i>workspaces</i>. In a workspace,
 * you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces without having to
 * build, package, or deploy any hardware to run Grafana servers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedGrafanaAsyncClient extends AmazonManagedGrafanaClient implements AmazonManagedGrafanaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonManagedGrafanaAsyncClientBuilder asyncBuilder() {
        return AmazonManagedGrafanaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Managed Grafana using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonManagedGrafanaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Managed Grafana using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonManagedGrafanaAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest request) {

        return associateLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(final AssociateLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLicenseRequest, AssociateLicenseResult> asyncHandler) {
        final AssociateLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLicenseResult>() {
            @Override
            public AssociateLicenseResult call() throws Exception {
                AssociateLicenseResult result = null;

                try {
                    result = executeAssociateLicense(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request) {

        return createWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(final CreateWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler) {
        final CreateWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkspaceResult>() {
            @Override
            public CreateWorkspaceResult call() throws Exception {
                CreateWorkspaceResult result = null;

                try {
                    result = executeCreateWorkspace(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(CreateWorkspaceApiKeyRequest request) {

        return createWorkspaceApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(final CreateWorkspaceApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkspaceApiKeyRequest, CreateWorkspaceApiKeyResult> asyncHandler) {
        final CreateWorkspaceApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkspaceApiKeyResult>() {
            @Override
            public CreateWorkspaceApiKeyResult call() throws Exception {
                CreateWorkspaceApiKeyResult result = null;

                try {
                    result = executeCreateWorkspaceApiKey(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {

        return deleteWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(final DeleteWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler) {
        final DeleteWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkspaceResult>() {
            @Override
            public DeleteWorkspaceResult call() throws Exception {
                DeleteWorkspaceResult result = null;

                try {
                    result = executeDeleteWorkspace(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(DeleteWorkspaceApiKeyRequest request) {

        return deleteWorkspaceApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(final DeleteWorkspaceApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceApiKeyRequest, DeleteWorkspaceApiKeyResult> asyncHandler) {
        final DeleteWorkspaceApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkspaceApiKeyResult>() {
            @Override
            public DeleteWorkspaceApiKeyResult call() throws Exception {
                DeleteWorkspaceApiKeyResult result = null;

                try {
                    result = executeDeleteWorkspaceApiKey(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest request) {

        return describeWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(final DescribeWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler) {
        final DescribeWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceResult>() {
            @Override
            public DescribeWorkspaceResult call() throws Exception {
                DescribeWorkspaceResult result = null;

                try {
                    result = executeDescribeWorkspace(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest request) {

        return describeWorkspaceAuthenticationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            final DescribeWorkspaceAuthenticationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceAuthenticationRequest, DescribeWorkspaceAuthenticationResult> asyncHandler) {
        final DescribeWorkspaceAuthenticationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceAuthenticationResult>() {
            @Override
            public DescribeWorkspaceAuthenticationResult call() throws Exception {
                DescribeWorkspaceAuthenticationResult result = null;

                try {
                    result = executeDescribeWorkspaceAuthentication(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(DescribeWorkspaceConfigurationRequest request) {

        return describeWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(
            final DescribeWorkspaceConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceConfigurationRequest, DescribeWorkspaceConfigurationResult> asyncHandler) {
        final DescribeWorkspaceConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceConfigurationResult>() {
            @Override
            public DescribeWorkspaceConfigurationResult call() throws Exception {
                DescribeWorkspaceConfigurationResult result = null;

                try {
                    result = executeDescribeWorkspaceConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest request) {

        return disassociateLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(final DisassociateLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLicenseRequest, DisassociateLicenseResult> asyncHandler) {
        final DisassociateLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLicenseResult>() {
            @Override
            public DisassociateLicenseResult call() throws Exception {
                DisassociateLicenseResult result = null;

                try {
                    result = executeDisassociateLicense(finalRequest);
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
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest request) {

        return listPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(final ListPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler) {
        final ListPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPermissionsResult>() {
            @Override
            public ListPermissionsResult call() throws Exception {
                ListPermissionsResult result = null;

                try {
                    result = executeListPermissions(finalRequest);
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
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request) {

        return listWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(final ListWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler) {
        final ListWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkspacesResult>() {
            @Override
            public ListWorkspacesResult call() throws Exception {
                ListWorkspacesResult result = null;

                try {
                    result = executeListWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest request) {

        return updatePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(final UpdatePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePermissionsRequest, UpdatePermissionsResult> asyncHandler) {
        final UpdatePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePermissionsResult>() {
            @Override
            public UpdatePermissionsResult call() throws Exception {
                UpdatePermissionsResult result = null;

                try {
                    result = executeUpdatePermissions(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest request) {

        return updateWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(final UpdateWorkspaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler) {
        final UpdateWorkspaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkspaceResult>() {
            @Override
            public UpdateWorkspaceResult call() throws Exception {
                UpdateWorkspaceResult result = null;

                try {
                    result = executeUpdateWorkspace(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(UpdateWorkspaceAuthenticationRequest request) {

        return updateWorkspaceAuthenticationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(
            final UpdateWorkspaceAuthenticationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAuthenticationRequest, UpdateWorkspaceAuthenticationResult> asyncHandler) {
        final UpdateWorkspaceAuthenticationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkspaceAuthenticationResult>() {
            @Override
            public UpdateWorkspaceAuthenticationResult call() throws Exception {
                UpdateWorkspaceAuthenticationResult result = null;

                try {
                    result = executeUpdateWorkspaceAuthentication(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(UpdateWorkspaceConfigurationRequest request) {

        return updateWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(final UpdateWorkspaceConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceConfigurationRequest, UpdateWorkspaceConfigurationResult> asyncHandler) {
        final UpdateWorkspaceConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkspaceConfigurationResult>() {
            @Override
            public UpdateWorkspaceConfigurationResult call() throws Exception {
                UpdateWorkspaceConfigurationResult result = null;

                try {
                    result = executeUpdateWorkspaceConfiguration(finalRequest);
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
