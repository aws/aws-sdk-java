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
package com.amazonaws.services.prometheus;

import javax.annotation.Generated;

import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Prometheus Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Managed Service for Prometheus is a serverless, Prometheus-compatible monitoring service for container metrics
 * that makes it easier to securely monitor container environments at scale. With Amazon Managed Service for Prometheus,
 * you can use the same open-source Prometheus data model and query language that you use today to monitor the
 * performance of your containerized workloads, and also enjoy improved scalability, availability, and security without
 * having to manage the underlying infrastructure.
 * </p>
 * <p>
 * For more information about Amazon Managed Service for Prometheus, see the <a
 * href="https://docs.aws.amazon.com/prometheus/latest/userguide/what-is-Amazon-Managed-Service-Prometheus.html">Amazon
 * Managed Service for Prometheus</a> User Guide.
 * </p>
 * <p>
 * Amazon Managed Service for Prometheus includes two APIs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the Amazon Web Services API described in this guide to manage Amazon Managed Service for Prometheus resources,
 * such as workspaces, rule groups, and alert managers.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <a href=
 * "https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-APIReference.html#AMP-APIReference-Prometheus-Compatible-Apis"
 * >Prometheus-compatible API</a> to work within your Prometheus workspace.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPrometheusAsyncClient extends AmazonPrometheusClient implements AmazonPrometheusAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPrometheusAsyncClientBuilder asyncBuilder() {
        return AmazonPrometheusAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Prometheus Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPrometheusAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Prometheus Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonPrometheusAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(CreateAlertManagerDefinitionRequest request) {

        return createAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(final CreateAlertManagerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAlertManagerDefinitionRequest, CreateAlertManagerDefinitionResult> asyncHandler) {
        final CreateAlertManagerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAlertManagerDefinitionResult>() {
            @Override
            public CreateAlertManagerDefinitionResult call() throws Exception {
                CreateAlertManagerDefinitionResult result = null;

                try {
                    result = executeCreateAlertManagerDefinition(finalRequest);
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
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request) {

        return createLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(final CreateLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler) {
        final CreateLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoggingConfigurationResult>() {
            @Override
            public CreateLoggingConfigurationResult call() throws Exception {
                CreateLoggingConfigurationResult result = null;

                try {
                    result = executeCreateLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(CreateRuleGroupsNamespaceRequest request) {

        return createRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(final CreateRuleGroupsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleGroupsNamespaceRequest, CreateRuleGroupsNamespaceResult> asyncHandler) {
        final CreateRuleGroupsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleGroupsNamespaceResult>() {
            @Override
            public CreateRuleGroupsNamespaceResult call() throws Exception {
                CreateRuleGroupsNamespaceResult result = null;

                try {
                    result = executeCreateRuleGroupsNamespace(finalRequest);
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
    public java.util.concurrent.Future<CreateScraperResult> createScraperAsync(CreateScraperRequest request) {

        return createScraperAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScraperResult> createScraperAsync(final CreateScraperRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScraperRequest, CreateScraperResult> asyncHandler) {
        final CreateScraperRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScraperResult>() {
            @Override
            public CreateScraperResult call() throws Exception {
                CreateScraperResult result = null;

                try {
                    result = executeCreateScraper(finalRequest);
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
    public java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(DeleteAlertManagerDefinitionRequest request) {

        return deleteAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(final DeleteAlertManagerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlertManagerDefinitionRequest, DeleteAlertManagerDefinitionResult> asyncHandler) {
        final DeleteAlertManagerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlertManagerDefinitionResult>() {
            @Override
            public DeleteAlertManagerDefinitionResult call() throws Exception {
                DeleteAlertManagerDefinitionResult result = null;

                try {
                    result = executeDeleteAlertManagerDefinition(finalRequest);
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
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(final DeleteLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {
        final DeleteLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoggingConfigurationResult>() {
            @Override
            public DeleteLoggingConfigurationResult call() throws Exception {
                DeleteLoggingConfigurationResult result = null;

                try {
                    result = executeDeleteLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(DeleteRuleGroupsNamespaceRequest request) {

        return deleteRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(final DeleteRuleGroupsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupsNamespaceRequest, DeleteRuleGroupsNamespaceResult> asyncHandler) {
        final DeleteRuleGroupsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleGroupsNamespaceResult>() {
            @Override
            public DeleteRuleGroupsNamespaceResult call() throws Exception {
                DeleteRuleGroupsNamespaceResult result = null;

                try {
                    result = executeDeleteRuleGroupsNamespace(finalRequest);
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
    public java.util.concurrent.Future<DeleteScraperResult> deleteScraperAsync(DeleteScraperRequest request) {

        return deleteScraperAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScraperResult> deleteScraperAsync(final DeleteScraperRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScraperRequest, DeleteScraperResult> asyncHandler) {
        final DeleteScraperRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScraperResult>() {
            @Override
            public DeleteScraperResult call() throws Exception {
                DeleteScraperResult result = null;

                try {
                    result = executeDeleteScraper(finalRequest);
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
    public java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(DescribeAlertManagerDefinitionRequest request) {

        return describeAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(
            final DescribeAlertManagerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlertManagerDefinitionRequest, DescribeAlertManagerDefinitionResult> asyncHandler) {
        final DescribeAlertManagerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlertManagerDefinitionResult>() {
            @Override
            public DescribeAlertManagerDefinitionResult call() throws Exception {
                DescribeAlertManagerDefinitionResult result = null;

                try {
                    result = executeDescribeAlertManagerDefinition(finalRequest);
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
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request) {

        return describeLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(final DescribeLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoggingConfigurationRequest, DescribeLoggingConfigurationResult> asyncHandler) {
        final DescribeLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingConfigurationResult>() {
            @Override
            public DescribeLoggingConfigurationResult call() throws Exception {
                DescribeLoggingConfigurationResult result = null;

                try {
                    result = executeDescribeLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(DescribeRuleGroupsNamespaceRequest request) {

        return describeRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(final DescribeRuleGroupsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleGroupsNamespaceRequest, DescribeRuleGroupsNamespaceResult> asyncHandler) {
        final DescribeRuleGroupsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleGroupsNamespaceResult>() {
            @Override
            public DescribeRuleGroupsNamespaceResult call() throws Exception {
                DescribeRuleGroupsNamespaceResult result = null;

                try {
                    result = executeDescribeRuleGroupsNamespace(finalRequest);
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
    public java.util.concurrent.Future<DescribeScraperResult> describeScraperAsync(DescribeScraperRequest request) {

        return describeScraperAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScraperResult> describeScraperAsync(final DescribeScraperRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScraperRequest, DescribeScraperResult> asyncHandler) {
        final DescribeScraperRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScraperResult>() {
            @Override
            public DescribeScraperResult call() throws Exception {
                DescribeScraperResult result = null;

                try {
                    result = executeDescribeScraper(finalRequest);
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
    public java.util.concurrent.Future<GetDefaultScraperConfigurationResult> getDefaultScraperConfigurationAsync(GetDefaultScraperConfigurationRequest request) {

        return getDefaultScraperConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDefaultScraperConfigurationResult> getDefaultScraperConfigurationAsync(
            final GetDefaultScraperConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDefaultScraperConfigurationRequest, GetDefaultScraperConfigurationResult> asyncHandler) {
        final GetDefaultScraperConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDefaultScraperConfigurationResult>() {
            @Override
            public GetDefaultScraperConfigurationResult call() throws Exception {
                GetDefaultScraperConfigurationResult result = null;

                try {
                    result = executeGetDefaultScraperConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest request) {

        return listRuleGroupsNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(final ListRuleGroupsNamespacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleGroupsNamespacesRequest, ListRuleGroupsNamespacesResult> asyncHandler) {
        final ListRuleGroupsNamespacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleGroupsNamespacesResult>() {
            @Override
            public ListRuleGroupsNamespacesResult call() throws Exception {
                ListRuleGroupsNamespacesResult result = null;

                try {
                    result = executeListRuleGroupsNamespaces(finalRequest);
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
    public java.util.concurrent.Future<ListScrapersResult> listScrapersAsync(ListScrapersRequest request) {

        return listScrapersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScrapersResult> listScrapersAsync(final ListScrapersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScrapersRequest, ListScrapersResult> asyncHandler) {
        final ListScrapersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScrapersResult>() {
            @Override
            public ListScrapersResult call() throws Exception {
                ListScrapersResult result = null;

                try {
                    result = executeListScrapers(finalRequest);
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
    public java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(PutAlertManagerDefinitionRequest request) {

        return putAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(final PutAlertManagerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAlertManagerDefinitionRequest, PutAlertManagerDefinitionResult> asyncHandler) {
        final PutAlertManagerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAlertManagerDefinitionResult>() {
            @Override
            public PutAlertManagerDefinitionResult call() throws Exception {
                PutAlertManagerDefinitionResult result = null;

                try {
                    result = executePutAlertManagerDefinition(finalRequest);
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
    public java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest request) {

        return putRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(final PutRuleGroupsNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRuleGroupsNamespaceRequest, PutRuleGroupsNamespaceResult> asyncHandler) {
        final PutRuleGroupsNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRuleGroupsNamespaceResult>() {
            @Override
            public PutRuleGroupsNamespaceResult call() throws Exception {
                PutRuleGroupsNamespaceResult result = null;

                try {
                    result = executePutRuleGroupsNamespace(finalRequest);
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
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(final UpdateLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {
        final UpdateLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoggingConfigurationResult>() {
            @Override
            public UpdateLoggingConfigurationResult call() throws Exception {
                UpdateLoggingConfigurationResult result = null;

                try {
                    result = executeUpdateLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest request) {

        return updateWorkspaceAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(final UpdateWorkspaceAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAliasRequest, UpdateWorkspaceAliasResult> asyncHandler) {
        final UpdateWorkspaceAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkspaceAliasResult>() {
            @Override
            public UpdateWorkspaceAliasResult call() throws Exception {
                UpdateWorkspaceAliasResult result = null;

                try {
                    result = executeUpdateWorkspaceAlias(finalRequest);
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
