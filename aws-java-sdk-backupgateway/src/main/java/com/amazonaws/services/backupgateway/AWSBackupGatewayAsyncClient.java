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
package com.amazonaws.services.backupgateway;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Backup Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Backup gateway</fullname>
 * <p>
 * Backup gateway connects Backup to your hypervisor, so you can create, store, and restore backups of your virtual
 * machines (VMs) anywhere, whether on-premises or in the VMware Cloud (VMC) on Amazon Web Services.
 * </p>
 * <p>
 * Add on-premises resources by connecting to a hypervisor through a gateway. Backup will automatically discover the
 * resources in your hypervisor.
 * </p>
 * <p>
 * Use Backup to assign virtual or on-premises resources to a backup plan, or run on-demand backups. Once you have
 * backed up your resources, you can view them and restore them like any resource supported by Backup.
 * </p>
 * <p>
 * To download the Amazon Web Services software to get started, navigate to the Backup console, choose <b>Gateways</b>,
 * then choose <b>Create gateway</b>.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupGatewayAsyncClient extends AWSBackupGatewayClient implements AWSBackupGatewayAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBackupGatewayAsyncClientBuilder asyncBuilder() {
        return AWSBackupGatewayAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Backup Gateway using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBackupGatewayAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Backup Gateway using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBackupGatewayAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(AssociateGatewayToServerRequest request) {

        return associateGatewayToServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(final AssociateGatewayToServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateGatewayToServerRequest, AssociateGatewayToServerResult> asyncHandler) {
        final AssociateGatewayToServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateGatewayToServerResult>() {
            @Override
            public AssociateGatewayToServerResult call() throws Exception {
                AssociateGatewayToServerResult result = null;

                try {
                    result = executeAssociateGatewayToServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest request) {

        return createGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(final CreateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler) {
        final CreateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGatewayResult>() {
            @Override
            public CreateGatewayResult call() throws Exception {
                CreateGatewayResult result = null;

                try {
                    result = executeCreateGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {
        final DeleteGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResult>() {
            @Override
            public DeleteGatewayResult call() throws Exception {
                DeleteGatewayResult result = null;

                try {
                    result = executeDeleteGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(DeleteHypervisorRequest request) {

        return deleteHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(final DeleteHypervisorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHypervisorRequest, DeleteHypervisorResult> asyncHandler) {
        final DeleteHypervisorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHypervisorResult>() {
            @Override
            public DeleteHypervisorResult call() throws Exception {
                DeleteHypervisorResult result = null;

                try {
                    result = executeDeleteHypervisor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(DisassociateGatewayFromServerRequest request) {

        return disassociateGatewayFromServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(
            final DisassociateGatewayFromServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateGatewayFromServerRequest, DisassociateGatewayFromServerResult> asyncHandler) {
        final DisassociateGatewayFromServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateGatewayFromServerResult>() {
            @Override
            public DisassociateGatewayFromServerResult call() throws Exception {
                DisassociateGatewayFromServerResult result = null;

                try {
                    result = executeDisassociateGatewayFromServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(GetBandwidthRateLimitScheduleRequest request) {

        return getBandwidthRateLimitScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(
            final GetBandwidthRateLimitScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBandwidthRateLimitScheduleRequest, GetBandwidthRateLimitScheduleResult> asyncHandler) {
        final GetBandwidthRateLimitScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBandwidthRateLimitScheduleResult>() {
            @Override
            public GetBandwidthRateLimitScheduleResult call() throws Exception {
                GetBandwidthRateLimitScheduleResult result = null;

                try {
                    result = executeGetBandwidthRateLimitSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest request) {

        return getGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(final GetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGatewayRequest, GetGatewayResult> asyncHandler) {
        final GetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGatewayResult>() {
            @Override
            public GetGatewayResult call() throws Exception {
                GetGatewayResult result = null;

                try {
                    result = executeGetGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(GetHypervisorRequest request) {

        return getHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(final GetHypervisorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHypervisorRequest, GetHypervisorResult> asyncHandler) {
        final GetHypervisorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHypervisorResult>() {
            @Override
            public GetHypervisorResult call() throws Exception {
                GetHypervisorResult result = null;

                try {
                    result = executeGetHypervisor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(GetHypervisorPropertyMappingsRequest request) {

        return getHypervisorPropertyMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(
            final GetHypervisorPropertyMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHypervisorPropertyMappingsRequest, GetHypervisorPropertyMappingsResult> asyncHandler) {
        final GetHypervisorPropertyMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHypervisorPropertyMappingsResult>() {
            @Override
            public GetHypervisorPropertyMappingsResult call() throws Exception {
                GetHypervisorPropertyMappingsResult result = null;

                try {
                    result = executeGetHypervisorPropertyMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(GetVirtualMachineRequest request) {

        return getVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(final GetVirtualMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVirtualMachineRequest, GetVirtualMachineResult> asyncHandler) {
        final GetVirtualMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVirtualMachineResult>() {
            @Override
            public GetVirtualMachineResult call() throws Exception {
                GetVirtualMachineResult result = null;

                try {
                    result = executeGetVirtualMachine(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(ImportHypervisorConfigurationRequest request) {

        return importHypervisorConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(
            final ImportHypervisorConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportHypervisorConfigurationRequest, ImportHypervisorConfigurationResult> asyncHandler) {
        final ImportHypervisorConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportHypervisorConfigurationResult>() {
            @Override
            public ImportHypervisorConfigurationResult call() throws Exception {
                ImportHypervisorConfigurationResult result = null;

                try {
                    result = executeImportHypervisorConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {
        final ListGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result = null;

                try {
                    result = executeListGateways(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(ListHypervisorsRequest request) {

        return listHypervisorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(final ListHypervisorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHypervisorsRequest, ListHypervisorsResult> asyncHandler) {
        final ListHypervisorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHypervisorsResult>() {
            @Override
            public ListHypervisorsResult call() throws Exception {
                ListHypervisorsResult result = null;

                try {
                    result = executeListHypervisors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(ListVirtualMachinesRequest request) {

        return listVirtualMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(final ListVirtualMachinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualMachinesRequest, ListVirtualMachinesResult> asyncHandler) {
        final ListVirtualMachinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualMachinesResult>() {
            @Override
            public ListVirtualMachinesResult call() throws Exception {
                ListVirtualMachinesResult result = null;

                try {
                    result = executeListVirtualMachines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(PutBandwidthRateLimitScheduleRequest request) {

        return putBandwidthRateLimitScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(
            final PutBandwidthRateLimitScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBandwidthRateLimitScheduleRequest, PutBandwidthRateLimitScheduleResult> asyncHandler) {
        final PutBandwidthRateLimitScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBandwidthRateLimitScheduleResult>() {
            @Override
            public PutBandwidthRateLimitScheduleResult call() throws Exception {
                PutBandwidthRateLimitScheduleResult result = null;

                try {
                    result = executePutBandwidthRateLimitSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(PutHypervisorPropertyMappingsRequest request) {

        return putHypervisorPropertyMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(
            final PutHypervisorPropertyMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutHypervisorPropertyMappingsRequest, PutHypervisorPropertyMappingsResult> asyncHandler) {
        final PutHypervisorPropertyMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutHypervisorPropertyMappingsResult>() {
            @Override
            public PutHypervisorPropertyMappingsResult call() throws Exception {
                PutHypervisorPropertyMappingsResult result = null;

                try {
                    result = executePutHypervisorPropertyMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(PutMaintenanceStartTimeRequest request) {

        return putMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(final PutMaintenanceStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMaintenanceStartTimeRequest, PutMaintenanceStartTimeResult> asyncHandler) {
        final PutMaintenanceStartTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMaintenanceStartTimeResult>() {
            @Override
            public PutMaintenanceStartTimeResult call() throws Exception {
                PutMaintenanceStartTimeResult result = null;

                try {
                    result = executePutMaintenanceStartTime(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            StartVirtualMachinesMetadataSyncRequest request) {

        return startVirtualMachinesMetadataSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            final StartVirtualMachinesMetadataSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartVirtualMachinesMetadataSyncRequest, StartVirtualMachinesMetadataSyncResult> asyncHandler) {
        final StartVirtualMachinesMetadataSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartVirtualMachinesMetadataSyncResult>() {
            @Override
            public StartVirtualMachinesMetadataSyncResult call() throws Exception {
                StartVirtualMachinesMetadataSyncResult result = null;

                try {
                    result = executeStartVirtualMachinesMetadataSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(TestHypervisorConfigurationRequest request) {

        return testHypervisorConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(final TestHypervisorConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestHypervisorConfigurationRequest, TestHypervisorConfigurationResult> asyncHandler) {
        final TestHypervisorConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestHypervisorConfigurationResult>() {
            @Override
            public TestHypervisorConfigurationResult call() throws Exception {
                TestHypervisorConfigurationResult result = null;

                try {
                    result = executeTestHypervisorConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest request) {

        return updateGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(final UpdateGatewayInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler) {
        final UpdateGatewayInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayInformationResult>() {
            @Override
            public UpdateGatewayInformationResult call() throws Exception {
                UpdateGatewayInformationResult result = null;

                try {
                    result = executeUpdateGatewayInformation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest request) {

        return updateGatewaySoftwareNowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(final UpdateGatewaySoftwareNowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler) {
        final UpdateGatewaySoftwareNowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewaySoftwareNowResult>() {
            @Override
            public UpdateGatewaySoftwareNowResult call() throws Exception {
                UpdateGatewaySoftwareNowResult result = null;

                try {
                    result = executeUpdateGatewaySoftwareNow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(UpdateHypervisorRequest request) {

        return updateHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(final UpdateHypervisorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHypervisorRequest, UpdateHypervisorResult> asyncHandler) {
        final UpdateHypervisorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHypervisorResult>() {
            @Override
            public UpdateHypervisorResult call() throws Exception {
                UpdateHypervisorResult result = null;

                try {
                    result = executeUpdateHypervisor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
