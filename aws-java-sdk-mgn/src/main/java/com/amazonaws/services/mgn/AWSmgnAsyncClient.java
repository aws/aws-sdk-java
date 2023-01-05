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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing mgn asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * The Application Migration Service service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSmgnAsyncClient extends AWSmgnClient implements AWSmgnAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSmgnAsyncClientBuilder asyncBuilder() {
        return AWSmgnAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mgn using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSmgnAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on mgn using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSmgnAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(ArchiveApplicationRequest request) {

        return archiveApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(final ArchiveApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ArchiveApplicationRequest, ArchiveApplicationResult> asyncHandler) {
        final ArchiveApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ArchiveApplicationResult>() {
            @Override
            public ArchiveApplicationResult call() throws Exception {
                ArchiveApplicationResult result = null;

                try {
                    result = executeArchiveApplication(finalRequest);
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
    public java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(ArchiveWaveRequest request) {

        return archiveWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(final ArchiveWaveRequest request,
            final com.amazonaws.handlers.AsyncHandler<ArchiveWaveRequest, ArchiveWaveResult> asyncHandler) {
        final ArchiveWaveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ArchiveWaveResult>() {
            @Override
            public ArchiveWaveResult call() throws Exception {
                ArchiveWaveResult result = null;

                try {
                    result = executeArchiveWave(finalRequest);
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
    public java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(AssociateApplicationsRequest request) {

        return associateApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(final AssociateApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateApplicationsRequest, AssociateApplicationsResult> asyncHandler) {
        final AssociateApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateApplicationsResult>() {
            @Override
            public AssociateApplicationsResult call() throws Exception {
                AssociateApplicationsResult result = null;

                try {
                    result = executeAssociateApplications(finalRequest);
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
    public java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(AssociateSourceServersRequest request) {

        return associateSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(final AssociateSourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSourceServersRequest, AssociateSourceServersResult> asyncHandler) {
        final AssociateSourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSourceServersResult>() {
            @Override
            public AssociateSourceServersResult call() throws Exception {
                AssociateSourceServersResult result = null;

                try {
                    result = executeAssociateSourceServers(finalRequest);
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
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(ChangeServerLifeCycleStateRequest request) {

        return changeServerLifeCycleStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(final ChangeServerLifeCycleStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeServerLifeCycleStateRequest, ChangeServerLifeCycleStateResult> asyncHandler) {
        final ChangeServerLifeCycleStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeServerLifeCycleStateResult>() {
            @Override
            public ChangeServerLifeCycleStateResult call() throws Exception {
                ChangeServerLifeCycleStateResult result = null;

                try {
                    result = executeChangeServerLifeCycleState(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateWaveResult> createWaveAsync(CreateWaveRequest request) {

        return createWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWaveResult> createWaveAsync(final CreateWaveRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWaveRequest, CreateWaveResult> asyncHandler) {
        final CreateWaveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWaveResult>() {
            @Override
            public CreateWaveResult call() throws Exception {
                CreateWaveResult result = null;

                try {
                    result = executeCreateWave(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(DeleteVcenterClientRequest request) {

        return deleteVcenterClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(final DeleteVcenterClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVcenterClientRequest, DeleteVcenterClientResult> asyncHandler) {
        final DeleteVcenterClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVcenterClientResult>() {
            @Override
            public DeleteVcenterClientResult call() throws Exception {
                DeleteVcenterClientResult result = null;

                try {
                    result = executeDeleteVcenterClient(finalRequest);
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
    public java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(DeleteWaveRequest request) {

        return deleteWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(final DeleteWaveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWaveRequest, DeleteWaveResult> asyncHandler) {
        final DeleteWaveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWaveResult>() {
            @Override
            public DeleteWaveResult call() throws Exception {
                DeleteWaveResult result = null;

                try {
                    result = executeDeleteWave(finalRequest);
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
    public java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(DescribeVcenterClientsRequest request) {

        return describeVcenterClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(final DescribeVcenterClientsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVcenterClientsRequest, DescribeVcenterClientsResult> asyncHandler) {
        final DescribeVcenterClientsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVcenterClientsResult>() {
            @Override
            public DescribeVcenterClientsResult call() throws Exception {
                DescribeVcenterClientsResult result = null;

                try {
                    result = executeDescribeVcenterClients(finalRequest);
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
    public java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(DisassociateApplicationsRequest request) {

        return disassociateApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(final DisassociateApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateApplicationsRequest, DisassociateApplicationsResult> asyncHandler) {
        final DisassociateApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateApplicationsResult>() {
            @Override
            public DisassociateApplicationsResult call() throws Exception {
                DisassociateApplicationsResult result = null;

                try {
                    result = executeDisassociateApplications(finalRequest);
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
    public java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(DisassociateSourceServersRequest request) {

        return disassociateSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(final DisassociateSourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSourceServersRequest, DisassociateSourceServersResult> asyncHandler) {
        final DisassociateSourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSourceServersResult>() {
            @Override
            public DisassociateSourceServersResult call() throws Exception {
                DisassociateSourceServersResult result = null;

                try {
                    result = executeDisassociateSourceServers(finalRequest);
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
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest request) {

        return disconnectFromServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(final DisconnectFromServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectFromServiceRequest, DisconnectFromServiceResult> asyncHandler) {
        final DisconnectFromServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectFromServiceResult>() {
            @Override
            public DisconnectFromServiceResult call() throws Exception {
                DisconnectFromServiceResult result = null;

                try {
                    result = executeDisconnectFromService(finalRequest);
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
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest request) {

        return finalizeCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(final FinalizeCutoverRequest request,
            final com.amazonaws.handlers.AsyncHandler<FinalizeCutoverRequest, FinalizeCutoverResult> asyncHandler) {
        final FinalizeCutoverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FinalizeCutoverResult>() {
            @Override
            public FinalizeCutoverResult call() throws Exception {
                FinalizeCutoverResult result = null;

                try {
                    result = executeFinalizeCutover(finalRequest);
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
    public java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(ListSourceServerActionsRequest request) {

        return listSourceServerActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(final ListSourceServerActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSourceServerActionsRequest, ListSourceServerActionsResult> asyncHandler) {
        final ListSourceServerActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSourceServerActionsResult>() {
            @Override
            public ListSourceServerActionsResult call() throws Exception {
                ListSourceServerActionsResult result = null;

                try {
                    result = executeListSourceServerActions(finalRequest);
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
    public java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(ListTemplateActionsRequest request) {

        return listTemplateActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(final ListTemplateActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateActionsRequest, ListTemplateActionsResult> asyncHandler) {
        final ListTemplateActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateActionsResult>() {
            @Override
            public ListTemplateActionsResult call() throws Exception {
                ListTemplateActionsResult result = null;

                try {
                    result = executeListTemplateActions(finalRequest);
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
    public java.util.concurrent.Future<ListWavesResult> listWavesAsync(ListWavesRequest request) {

        return listWavesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWavesResult> listWavesAsync(final ListWavesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWavesRequest, ListWavesResult> asyncHandler) {
        final ListWavesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWavesResult>() {
            @Override
            public ListWavesResult call() throws Exception {
                ListWavesResult result = null;

                try {
                    result = executeListWaves(finalRequest);
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
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest request) {

        return markAsArchivedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(final MarkAsArchivedRequest request,
            final com.amazonaws.handlers.AsyncHandler<MarkAsArchivedRequest, MarkAsArchivedResult> asyncHandler) {
        final MarkAsArchivedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MarkAsArchivedResult>() {
            @Override
            public MarkAsArchivedResult call() throws Exception {
                MarkAsArchivedResult result = null;

                try {
                    result = executeMarkAsArchived(finalRequest);
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
    public java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(PutSourceServerActionRequest request) {

        return putSourceServerActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(final PutSourceServerActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSourceServerActionRequest, PutSourceServerActionResult> asyncHandler) {
        final PutSourceServerActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSourceServerActionResult>() {
            @Override
            public PutSourceServerActionResult call() throws Exception {
                PutSourceServerActionResult result = null;

                try {
                    result = executePutSourceServerAction(finalRequest);
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
    public java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(PutTemplateActionRequest request) {

        return putTemplateActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(final PutTemplateActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTemplateActionRequest, PutTemplateActionResult> asyncHandler) {
        final PutTemplateActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutTemplateActionResult>() {
            @Override
            public PutTemplateActionResult call() throws Exception {
                PutTemplateActionResult result = null;

                try {
                    result = executePutTemplateAction(finalRequest);
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
    public java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(RemoveSourceServerActionRequest request) {

        return removeSourceServerActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(final RemoveSourceServerActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveSourceServerActionRequest, RemoveSourceServerActionResult> asyncHandler) {
        final RemoveSourceServerActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveSourceServerActionResult>() {
            @Override
            public RemoveSourceServerActionResult call() throws Exception {
                RemoveSourceServerActionResult result = null;

                try {
                    result = executeRemoveSourceServerAction(finalRequest);
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
    public java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(RemoveTemplateActionRequest request) {

        return removeTemplateActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(final RemoveTemplateActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTemplateActionRequest, RemoveTemplateActionResult> asyncHandler) {
        final RemoveTemplateActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTemplateActionResult>() {
            @Override
            public RemoveTemplateActionResult call() throws Exception {
                RemoveTemplateActionResult result = null;

                try {
                    result = executeRemoveTemplateAction(finalRequest);
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
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest request) {

        return retryDataReplicationAsync(request, null);
    }

    @Override
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
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest request) {

        return startCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(final StartCutoverRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCutoverRequest, StartCutoverResult> asyncHandler) {
        final StartCutoverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCutoverResult>() {
            @Override
            public StartCutoverResult call() throws Exception {
                StartCutoverResult result = null;

                try {
                    result = executeStartCutover(finalRequest);
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
    public java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest request) {

        return startTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestResult> startTestAsync(final StartTestRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTestRequest, StartTestResult> asyncHandler) {
        final StartTestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTestResult>() {
            @Override
            public StartTestResult call() throws Exception {
                StartTestResult result = null;

                try {
                    result = executeStartTest(finalRequest);
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
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest request) {

        return terminateTargetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(final TerminateTargetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateTargetInstancesRequest, TerminateTargetInstancesResult> asyncHandler) {
        final TerminateTargetInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateTargetInstancesResult>() {
            @Override
            public TerminateTargetInstancesResult call() throws Exception {
                TerminateTargetInstancesResult result = null;

                try {
                    result = executeTerminateTargetInstances(finalRequest);
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
    public java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(UnarchiveApplicationRequest request) {

        return unarchiveApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(final UnarchiveApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnarchiveApplicationRequest, UnarchiveApplicationResult> asyncHandler) {
        final UnarchiveApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnarchiveApplicationResult>() {
            @Override
            public UnarchiveApplicationResult call() throws Exception {
                UnarchiveApplicationResult result = null;

                try {
                    result = executeUnarchiveApplication(finalRequest);
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
    public java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(UnarchiveWaveRequest request) {

        return unarchiveWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(final UnarchiveWaveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnarchiveWaveRequest, UnarchiveWaveResult> asyncHandler) {
        final UnarchiveWaveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnarchiveWaveResult>() {
            @Override
            public UnarchiveWaveResult call() throws Exception {
                UnarchiveWaveResult result = null;

                try {
                    result = executeUnarchiveWave(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            UpdateSourceServerReplicationTypeRequest request) {

        return updateSourceServerReplicationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            final UpdateSourceServerReplicationTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSourceServerReplicationTypeRequest, UpdateSourceServerReplicationTypeResult> asyncHandler) {
        final UpdateSourceServerReplicationTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSourceServerReplicationTypeResult>() {
            @Override
            public UpdateSourceServerReplicationTypeResult call() throws Exception {
                UpdateSourceServerReplicationTypeResult result = null;

                try {
                    result = executeUpdateSourceServerReplicationType(finalRequest);
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
    public java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(UpdateWaveRequest request) {

        return updateWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(final UpdateWaveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWaveRequest, UpdateWaveResult> asyncHandler) {
        final UpdateWaveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWaveResult>() {
            @Override
            public UpdateWaveResult call() throws Exception {
                UpdateWaveResult result = null;

                try {
                    result = executeUpdateWave(finalRequest);
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
