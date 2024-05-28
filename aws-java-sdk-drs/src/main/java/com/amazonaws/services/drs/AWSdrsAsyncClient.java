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
package com.amazonaws.services.drs;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing drs asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * AWS Elastic Disaster Recovery Service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSdrsAsyncClient extends AWSdrsClient implements AWSdrsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSdrsAsyncClientBuilder asyncBuilder() {
        return AWSdrsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on drs using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSdrsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on drs using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSdrsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateSourceNetworkStackResult> associateSourceNetworkStackAsync(AssociateSourceNetworkStackRequest request) {

        return associateSourceNetworkStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSourceNetworkStackResult> associateSourceNetworkStackAsync(final AssociateSourceNetworkStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSourceNetworkStackRequest, AssociateSourceNetworkStackResult> asyncHandler) {
        final AssociateSourceNetworkStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSourceNetworkStackResult>() {
            @Override
            public AssociateSourceNetworkStackResult call() throws Exception {
                AssociateSourceNetworkStackResult result = null;

                try {
                    result = executeAssociateSourceNetworkStack(finalRequest);
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
    public java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(CreateExtendedSourceServerRequest request) {

        return createExtendedSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(final CreateExtendedSourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExtendedSourceServerRequest, CreateExtendedSourceServerResult> asyncHandler) {
        final CreateExtendedSourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExtendedSourceServerResult>() {
            @Override
            public CreateExtendedSourceServerResult call() throws Exception {
                CreateExtendedSourceServerResult result = null;

                try {
                    result = executeCreateExtendedSourceServer(finalRequest);
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
    public java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            CreateLaunchConfigurationTemplateRequest request) {

        return createLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            final CreateLaunchConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationTemplateRequest, CreateLaunchConfigurationTemplateResult> asyncHandler) {
        final CreateLaunchConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLaunchConfigurationTemplateResult>() {
            @Override
            public CreateLaunchConfigurationTemplateResult call() throws Exception {
                CreateLaunchConfigurationTemplateResult result = null;

                try {
                    result = executeCreateLaunchConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest request) {

        return createReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            final CreateReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationTemplateRequest, CreateReplicationConfigurationTemplateResult> asyncHandler) {
        final CreateReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationConfigurationTemplateResult>() {
            @Override
            public CreateReplicationConfigurationTemplateResult call() throws Exception {
                CreateReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeCreateReplicationConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateSourceNetworkResult> createSourceNetworkAsync(CreateSourceNetworkRequest request) {

        return createSourceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSourceNetworkResult> createSourceNetworkAsync(final CreateSourceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSourceNetworkRequest, CreateSourceNetworkResult> asyncHandler) {
        final CreateSourceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSourceNetworkResult>() {
            @Override
            public CreateSourceNetworkResult call() throws Exception {
                CreateSourceNetworkResult result = null;

                try {
                    result = executeCreateSourceNetwork(finalRequest);
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
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request) {

        return deleteJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(final DeleteJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler) {
        final DeleteJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobResult>() {
            @Override
            public DeleteJobResult call() throws Exception {
                DeleteJobResult result = null;

                try {
                    result = executeDeleteJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchActionResult> deleteLaunchActionAsync(DeleteLaunchActionRequest request) {

        return deleteLaunchActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchActionResult> deleteLaunchActionAsync(final DeleteLaunchActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchActionRequest, DeleteLaunchActionResult> asyncHandler) {
        final DeleteLaunchActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchActionResult>() {
            @Override
            public DeleteLaunchActionResult call() throws Exception {
                DeleteLaunchActionResult result = null;

                try {
                    result = executeDeleteLaunchAction(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            DeleteLaunchConfigurationTemplateRequest request) {

        return deleteLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            final DeleteLaunchConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationTemplateRequest, DeleteLaunchConfigurationTemplateResult> asyncHandler) {
        final DeleteLaunchConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchConfigurationTemplateResult>() {
            @Override
            public DeleteLaunchConfigurationTemplateResult call() throws Exception {
                DeleteLaunchConfigurationTemplateResult result = null;

                try {
                    result = executeDeleteLaunchConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(DeleteRecoveryInstanceRequest request) {

        return deleteRecoveryInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(final DeleteRecoveryInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecoveryInstanceRequest, DeleteRecoveryInstanceResult> asyncHandler) {
        final DeleteRecoveryInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecoveryInstanceResult>() {
            @Override
            public DeleteRecoveryInstanceResult call() throws Exception {
                DeleteRecoveryInstanceResult result = null;

                try {
                    result = executeDeleteRecoveryInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest request) {

        return deleteReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            final DeleteReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationTemplateRequest, DeleteReplicationConfigurationTemplateResult> asyncHandler) {
        final DeleteReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationConfigurationTemplateResult>() {
            @Override
            public DeleteReplicationConfigurationTemplateResult call() throws Exception {
                DeleteReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeDeleteReplicationConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteSourceNetworkResult> deleteSourceNetworkAsync(DeleteSourceNetworkRequest request) {

        return deleteSourceNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceNetworkResult> deleteSourceNetworkAsync(final DeleteSourceNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSourceNetworkRequest, DeleteSourceNetworkResult> asyncHandler) {
        final DeleteSourceNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSourceNetworkResult>() {
            @Override
            public DeleteSourceNetworkResult call() throws Exception {
                DeleteSourceNetworkResult result = null;

                try {
                    result = executeDeleteSourceNetwork(finalRequest);
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
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest request) {

        return deleteSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(final DeleteSourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSourceServerRequest, DeleteSourceServerResult> asyncHandler) {
        final DeleteSourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSourceServerResult>() {
            @Override
            public DeleteSourceServerResult call() throws Exception {
                DeleteSourceServerResult result = null;

                try {
                    result = executeDeleteSourceServer(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest request) {

        return describeJobLogItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(final DescribeJobLogItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobLogItemsRequest, DescribeJobLogItemsResult> asyncHandler) {
        final DescribeJobLogItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobLogItemsResult>() {
            @Override
            public DescribeJobLogItemsResult call() throws Exception {
                DescribeJobLogItemsResult result = null;

                try {
                    result = executeDescribeJobLogItems(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request) {

        return describeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(final DescribeJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler) {
        final DescribeJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobsResult>() {
            @Override
            public DescribeJobsResult call() throws Exception {
                DescribeJobsResult result = null;

                try {
                    result = executeDescribeJobs(finalRequest);
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
    public java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            DescribeLaunchConfigurationTemplatesRequest request) {

        return describeLaunchConfigurationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            final DescribeLaunchConfigurationTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationTemplatesRequest, DescribeLaunchConfigurationTemplatesResult> asyncHandler) {
        final DescribeLaunchConfigurationTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLaunchConfigurationTemplatesResult>() {
            @Override
            public DescribeLaunchConfigurationTemplatesResult call() throws Exception {
                DescribeLaunchConfigurationTemplatesResult result = null;

                try {
                    result = executeDescribeLaunchConfigurationTemplates(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(DescribeRecoveryInstancesRequest request) {

        return describeRecoveryInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(final DescribeRecoveryInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecoveryInstancesRequest, DescribeRecoveryInstancesResult> asyncHandler) {
        final DescribeRecoveryInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecoveryInstancesResult>() {
            @Override
            public DescribeRecoveryInstancesResult call() throws Exception {
                DescribeRecoveryInstancesResult result = null;

                try {
                    result = executeDescribeRecoveryInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(DescribeRecoverySnapshotsRequest request) {

        return describeRecoverySnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(final DescribeRecoverySnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecoverySnapshotsRequest, DescribeRecoverySnapshotsResult> asyncHandler) {
        final DescribeRecoverySnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecoverySnapshotsResult>() {
            @Override
            public DescribeRecoverySnapshotsResult call() throws Exception {
                DescribeRecoverySnapshotsResult result = null;

                try {
                    result = executeDescribeRecoverySnapshots(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest request) {

        return describeReplicationConfigurationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            final DescribeReplicationConfigurationTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationTemplatesRequest, DescribeReplicationConfigurationTemplatesResult> asyncHandler) {
        final DescribeReplicationConfigurationTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationConfigurationTemplatesResult>() {
            @Override
            public DescribeReplicationConfigurationTemplatesResult call() throws Exception {
                DescribeReplicationConfigurationTemplatesResult result = null;

                try {
                    result = executeDescribeReplicationConfigurationTemplates(finalRequest);
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
    public java.util.concurrent.Future<DescribeSourceNetworksResult> describeSourceNetworksAsync(DescribeSourceNetworksRequest request) {

        return describeSourceNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceNetworksResult> describeSourceNetworksAsync(final DescribeSourceNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSourceNetworksRequest, DescribeSourceNetworksResult> asyncHandler) {
        final DescribeSourceNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSourceNetworksResult>() {
            @Override
            public DescribeSourceNetworksResult call() throws Exception {
                DescribeSourceNetworksResult result = null;

                try {
                    result = executeDescribeSourceNetworks(finalRequest);
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
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest request) {

        return describeSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(final DescribeSourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSourceServersRequest, DescribeSourceServersResult> asyncHandler) {
        final DescribeSourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSourceServersResult>() {
            @Override
            public DescribeSourceServersResult call() throws Exception {
                DescribeSourceServersResult result = null;

                try {
                    result = executeDescribeSourceServers(finalRequest);
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
    public java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(DisconnectRecoveryInstanceRequest request) {

        return disconnectRecoveryInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(final DisconnectRecoveryInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectRecoveryInstanceRequest, DisconnectRecoveryInstanceResult> asyncHandler) {
        final DisconnectRecoveryInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectRecoveryInstanceResult>() {
            @Override
            public DisconnectRecoveryInstanceResult call() throws Exception {
                DisconnectRecoveryInstanceResult result = null;

                try {
                    result = executeDisconnectRecoveryInstance(finalRequest);
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
    public java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(DisconnectSourceServerRequest request) {

        return disconnectSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(final DisconnectSourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectSourceServerRequest, DisconnectSourceServerResult> asyncHandler) {
        final DisconnectSourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectSourceServerResult>() {
            @Override
            public DisconnectSourceServerResult call() throws Exception {
                DisconnectSourceServerResult result = null;

                try {
                    result = executeDisconnectSourceServer(finalRequest);
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
    public java.util.concurrent.Future<ExportSourceNetworkCfnTemplateResult> exportSourceNetworkCfnTemplateAsync(ExportSourceNetworkCfnTemplateRequest request) {

        return exportSourceNetworkCfnTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportSourceNetworkCfnTemplateResult> exportSourceNetworkCfnTemplateAsync(
            final ExportSourceNetworkCfnTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportSourceNetworkCfnTemplateRequest, ExportSourceNetworkCfnTemplateResult> asyncHandler) {
        final ExportSourceNetworkCfnTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportSourceNetworkCfnTemplateResult>() {
            @Override
            public ExportSourceNetworkCfnTemplateResult call() throws Exception {
                ExportSourceNetworkCfnTemplateResult result = null;

                try {
                    result = executeExportSourceNetworkCfnTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            GetFailbackReplicationConfigurationRequest request) {

        return getFailbackReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            final GetFailbackReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFailbackReplicationConfigurationRequest, GetFailbackReplicationConfigurationResult> asyncHandler) {
        final GetFailbackReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFailbackReplicationConfigurationResult>() {
            @Override
            public GetFailbackReplicationConfigurationResult call() throws Exception {
                GetFailbackReplicationConfigurationResult result = null;

                try {
                    result = executeGetFailbackReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest request) {

        return getLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(final GetLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchConfigurationRequest, GetLaunchConfigurationResult> asyncHandler) {
        final GetLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchConfigurationResult>() {
            @Override
            public GetLaunchConfigurationResult call() throws Exception {
                GetLaunchConfigurationResult result = null;

                try {
                    result = executeGetLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(GetReplicationConfigurationRequest request) {

        return getReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(final GetReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationConfigurationRequest, GetReplicationConfigurationResult> asyncHandler) {
        final GetReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationConfigurationResult>() {
            @Override
            public GetReplicationConfigurationResult call() throws Exception {
                GetReplicationConfigurationResult result = null;

                try {
                    result = executeGetReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest request) {

        return initializeServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(final InitializeServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitializeServiceRequest, InitializeServiceResult> asyncHandler) {
        final InitializeServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitializeServiceResult>() {
            @Override
            public InitializeServiceResult call() throws Exception {
                InitializeServiceResult result = null;

                try {
                    result = executeInitializeService(finalRequest);
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
    public java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(ListExtensibleSourceServersRequest request) {

        return listExtensibleSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(final ListExtensibleSourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExtensibleSourceServersRequest, ListExtensibleSourceServersResult> asyncHandler) {
        final ListExtensibleSourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExtensibleSourceServersResult>() {
            @Override
            public ListExtensibleSourceServersResult call() throws Exception {
                ListExtensibleSourceServersResult result = null;

                try {
                    result = executeListExtensibleSourceServers(finalRequest);
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
    public java.util.concurrent.Future<ListLaunchActionsResult> listLaunchActionsAsync(ListLaunchActionsRequest request) {

        return listLaunchActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchActionsResult> listLaunchActionsAsync(final ListLaunchActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchActionsRequest, ListLaunchActionsResult> asyncHandler) {
        final ListLaunchActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchActionsResult>() {
            @Override
            public ListLaunchActionsResult call() throws Exception {
                ListLaunchActionsResult result = null;

                try {
                    result = executeListLaunchActions(finalRequest);
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
    public java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(ListStagingAccountsRequest request) {

        return listStagingAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(final ListStagingAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStagingAccountsRequest, ListStagingAccountsResult> asyncHandler) {
        final ListStagingAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStagingAccountsResult>() {
            @Override
            public ListStagingAccountsResult call() throws Exception {
                ListStagingAccountsResult result = null;

                try {
                    result = executeListStagingAccounts(finalRequest);
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
    public java.util.concurrent.Future<PutLaunchActionResult> putLaunchActionAsync(PutLaunchActionRequest request) {

        return putLaunchActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLaunchActionResult> putLaunchActionAsync(final PutLaunchActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLaunchActionRequest, PutLaunchActionResult> asyncHandler) {
        final PutLaunchActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLaunchActionResult>() {
            @Override
            public PutLaunchActionResult call() throws Exception {
                PutLaunchActionResult result = null;

                try {
                    result = executePutLaunchAction(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest request) {

        return retryDataReplicationAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(final RetryDataReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryDataReplicationRequest, RetryDataReplicationResult> asyncHandler) {
        final RetryDataReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetryDataReplicationResult>() {
            @Override
            public RetryDataReplicationResult call() throws Exception {
                RetryDataReplicationResult result = null;

                try {
                    result = executeRetryDataReplication(finalRequest);
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
    public java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(ReverseReplicationRequest request) {

        return reverseReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(final ReverseReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReverseReplicationRequest, ReverseReplicationResult> asyncHandler) {
        final ReverseReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReverseReplicationResult>() {
            @Override
            public ReverseReplicationResult call() throws Exception {
                ReverseReplicationResult result = null;

                try {
                    result = executeReverseReplication(finalRequest);
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
    public java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(StartFailbackLaunchRequest request) {

        return startFailbackLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(final StartFailbackLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFailbackLaunchRequest, StartFailbackLaunchResult> asyncHandler) {
        final StartFailbackLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFailbackLaunchResult>() {
            @Override
            public StartFailbackLaunchResult call() throws Exception {
                StartFailbackLaunchResult result = null;

                try {
                    result = executeStartFailbackLaunch(finalRequest);
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
    public java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(StartRecoveryRequest request) {

        return startRecoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(final StartRecoveryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRecoveryRequest, StartRecoveryResult> asyncHandler) {
        final StartRecoveryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRecoveryResult>() {
            @Override
            public StartRecoveryResult call() throws Exception {
                StartRecoveryResult result = null;

                try {
                    result = executeStartRecovery(finalRequest);
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
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest request) {

        return startReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(final StartReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationRequest, StartReplicationResult> asyncHandler) {
        final StartReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationResult>() {
            @Override
            public StartReplicationResult call() throws Exception {
                StartReplicationResult result = null;

                try {
                    result = executeStartReplication(finalRequest);
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
    public java.util.concurrent.Future<StartSourceNetworkRecoveryResult> startSourceNetworkRecoveryAsync(StartSourceNetworkRecoveryRequest request) {

        return startSourceNetworkRecoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSourceNetworkRecoveryResult> startSourceNetworkRecoveryAsync(final StartSourceNetworkRecoveryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSourceNetworkRecoveryRequest, StartSourceNetworkRecoveryResult> asyncHandler) {
        final StartSourceNetworkRecoveryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSourceNetworkRecoveryResult>() {
            @Override
            public StartSourceNetworkRecoveryResult call() throws Exception {
                StartSourceNetworkRecoveryResult result = null;

                try {
                    result = executeStartSourceNetworkRecovery(finalRequest);
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
    public java.util.concurrent.Future<StartSourceNetworkReplicationResult> startSourceNetworkReplicationAsync(StartSourceNetworkReplicationRequest request) {

        return startSourceNetworkReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSourceNetworkReplicationResult> startSourceNetworkReplicationAsync(
            final StartSourceNetworkReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSourceNetworkReplicationRequest, StartSourceNetworkReplicationResult> asyncHandler) {
        final StartSourceNetworkReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSourceNetworkReplicationResult>() {
            @Override
            public StartSourceNetworkReplicationResult call() throws Exception {
                StartSourceNetworkReplicationResult result = null;

                try {
                    result = executeStartSourceNetworkReplication(finalRequest);
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
    public java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(StopFailbackRequest request) {

        return stopFailbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(final StopFailbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFailbackRequest, StopFailbackResult> asyncHandler) {
        final StopFailbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFailbackResult>() {
            @Override
            public StopFailbackResult call() throws Exception {
                StopFailbackResult result = null;

                try {
                    result = executeStopFailback(finalRequest);
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
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest request) {

        return stopReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(final StopReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopReplicationRequest, StopReplicationResult> asyncHandler) {
        final StopReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopReplicationResult>() {
            @Override
            public StopReplicationResult call() throws Exception {
                StopReplicationResult result = null;

                try {
                    result = executeStopReplication(finalRequest);
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
    public java.util.concurrent.Future<StopSourceNetworkReplicationResult> stopSourceNetworkReplicationAsync(StopSourceNetworkReplicationRequest request) {

        return stopSourceNetworkReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSourceNetworkReplicationResult> stopSourceNetworkReplicationAsync(final StopSourceNetworkReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopSourceNetworkReplicationRequest, StopSourceNetworkReplicationResult> asyncHandler) {
        final StopSourceNetworkReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopSourceNetworkReplicationResult>() {
            @Override
            public StopSourceNetworkReplicationResult call() throws Exception {
                StopSourceNetworkReplicationResult result = null;

                try {
                    result = executeStopSourceNetworkReplication(finalRequest);
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
    public java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(TerminateRecoveryInstancesRequest request) {

        return terminateRecoveryInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(final TerminateRecoveryInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateRecoveryInstancesRequest, TerminateRecoveryInstancesResult> asyncHandler) {
        final TerminateRecoveryInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateRecoveryInstancesResult>() {
            @Override
            public TerminateRecoveryInstancesResult call() throws Exception {
                TerminateRecoveryInstancesResult result = null;

                try {
                    result = executeTerminateRecoveryInstances(finalRequest);
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
    public java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            UpdateFailbackReplicationConfigurationRequest request) {

        return updateFailbackReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            final UpdateFailbackReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFailbackReplicationConfigurationRequest, UpdateFailbackReplicationConfigurationResult> asyncHandler) {
        final UpdateFailbackReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFailbackReplicationConfigurationResult>() {
            @Override
            public UpdateFailbackReplicationConfigurationResult call() throws Exception {
                UpdateFailbackReplicationConfigurationResult result = null;

                try {
                    result = executeUpdateFailbackReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(UpdateLaunchConfigurationRequest request) {

        return updateLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(final UpdateLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationRequest, UpdateLaunchConfigurationResult> asyncHandler) {
        final UpdateLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchConfigurationResult>() {
            @Override
            public UpdateLaunchConfigurationResult call() throws Exception {
                UpdateLaunchConfigurationResult result = null;

                try {
                    result = executeUpdateLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            UpdateLaunchConfigurationTemplateRequest request) {

        return updateLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            final UpdateLaunchConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationTemplateRequest, UpdateLaunchConfigurationTemplateResult> asyncHandler) {
        final UpdateLaunchConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchConfigurationTemplateResult>() {
            @Override
            public UpdateLaunchConfigurationTemplateResult call() throws Exception {
                UpdateLaunchConfigurationTemplateResult result = null;

                try {
                    result = executeUpdateLaunchConfigurationTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(UpdateReplicationConfigurationRequest request) {

        return updateReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            final UpdateReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationRequest, UpdateReplicationConfigurationResult> asyncHandler) {
        final UpdateReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationConfigurationResult>() {
            @Override
            public UpdateReplicationConfigurationResult call() throws Exception {
                UpdateReplicationConfigurationResult result = null;

                try {
                    result = executeUpdateReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest request) {

        return updateReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            final UpdateReplicationConfigurationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationTemplateRequest, UpdateReplicationConfigurationTemplateResult> asyncHandler) {
        final UpdateReplicationConfigurationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationConfigurationTemplateResult>() {
            @Override
            public UpdateReplicationConfigurationTemplateResult call() throws Exception {
                UpdateReplicationConfigurationTemplateResult result = null;

                try {
                    result = executeUpdateReplicationConfigurationTemplate(finalRequest);
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
