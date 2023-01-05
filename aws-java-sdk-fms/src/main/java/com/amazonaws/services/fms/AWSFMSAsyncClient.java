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
package com.amazonaws.services.fms;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing FMS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>Firewall Manager API Reference</i>. This guide is for developers who need detailed information about
 * the Firewall Manager API actions, data types, and errors. For detailed information about Firewall Manager features,
 * see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">Firewall Manager Developer
 * Guide</a>.
 * </p>
 * <p>
 * Some API actions require explicit resource permissions. For information, see the developer guide topic <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html">Firewall Manager required
 * permissions for API actions</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFMSAsyncClient extends AWSFMSClient implements AWSFMSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSFMSAsyncClientBuilder asyncBuilder() {
        return AWSFMSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FMS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSFMSAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FMS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSFMSAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(AssociateAdminAccountRequest request) {

        return associateAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(final AssociateAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAdminAccountRequest, AssociateAdminAccountResult> asyncHandler) {
        final AssociateAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAdminAccountResult>() {
            @Override
            public AssociateAdminAccountResult call() throws Exception {
                AssociateAdminAccountResult result = null;

                try {
                    result = executeAssociateAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateThirdPartyFirewallResult> associateThirdPartyFirewallAsync(AssociateThirdPartyFirewallRequest request) {

        return associateThirdPartyFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateThirdPartyFirewallResult> associateThirdPartyFirewallAsync(final AssociateThirdPartyFirewallRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateThirdPartyFirewallRequest, AssociateThirdPartyFirewallResult> asyncHandler) {
        final AssociateThirdPartyFirewallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateThirdPartyFirewallResult>() {
            @Override
            public AssociateThirdPartyFirewallResult call() throws Exception {
                AssociateThirdPartyFirewallResult result = null;

                try {
                    result = executeAssociateThirdPartyFirewall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourceResult> batchAssociateResourceAsync(BatchAssociateResourceRequest request) {

        return batchAssociateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateResourceResult> batchAssociateResourceAsync(final BatchAssociateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateResourceRequest, BatchAssociateResourceResult> asyncHandler) {
        final BatchAssociateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateResourceResult>() {
            @Override
            public BatchAssociateResourceResult call() throws Exception {
                BatchAssociateResourceResult result = null;

                try {
                    result = executeBatchAssociateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourceResult> batchDisassociateResourceAsync(BatchDisassociateResourceRequest request) {

        return batchDisassociateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateResourceResult> batchDisassociateResourceAsync(final BatchDisassociateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateResourceRequest, BatchDisassociateResourceResult> asyncHandler) {
        final BatchDisassociateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateResourceResult>() {
            @Override
            public BatchDisassociateResourceResult call() throws Exception {
                BatchDisassociateResourceResult result = null;

                try {
                    result = executeBatchDisassociateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(DeleteAppsListRequest request) {

        return deleteAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(final DeleteAppsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppsListRequest, DeleteAppsListResult> asyncHandler) {
        final DeleteAppsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppsListResult>() {
            @Override
            public DeleteAppsListResult call() throws Exception {
                DeleteAppsListResult result = null;

                try {
                    result = executeDeleteAppsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(DeleteNotificationChannelRequest request) {

        return deleteNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(final DeleteNotificationChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotificationChannelRequest, DeleteNotificationChannelResult> asyncHandler) {
        final DeleteNotificationChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotificationChannelResult>() {
            @Override
            public DeleteNotificationChannelResult call() throws Exception {
                DeleteNotificationChannelResult result = null;

                try {
                    result = executeDeleteNotificationChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {
        final DeletePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result = null;

                try {
                    result = executeDeletePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(DeleteProtocolsListRequest request) {

        return deleteProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(final DeleteProtocolsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProtocolsListRequest, DeleteProtocolsListResult> asyncHandler) {
        final DeleteProtocolsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProtocolsListResult>() {
            @Override
            public DeleteProtocolsListResult call() throws Exception {
                DeleteProtocolsListResult result = null;

                try {
                    result = executeDeleteProtocolsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest request) {

        return deleteResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(final DeleteResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceSetRequest, DeleteResourceSetResult> asyncHandler) {
        final DeleteResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceSetResult>() {
            @Override
            public DeleteResourceSetResult call() throws Exception {
                DeleteResourceSetResult result = null;

                try {
                    result = executeDeleteResourceSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(DisassociateAdminAccountRequest request) {

        return disassociateAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(final DisassociateAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAdminAccountRequest, DisassociateAdminAccountResult> asyncHandler) {
        final DisassociateAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAdminAccountResult>() {
            @Override
            public DisassociateAdminAccountResult call() throws Exception {
                DisassociateAdminAccountResult result = null;

                try {
                    result = executeDisassociateAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateThirdPartyFirewallResult> disassociateThirdPartyFirewallAsync(DisassociateThirdPartyFirewallRequest request) {

        return disassociateThirdPartyFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateThirdPartyFirewallResult> disassociateThirdPartyFirewallAsync(
            final DisassociateThirdPartyFirewallRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateThirdPartyFirewallRequest, DisassociateThirdPartyFirewallResult> asyncHandler) {
        final DisassociateThirdPartyFirewallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateThirdPartyFirewallResult>() {
            @Override
            public DisassociateThirdPartyFirewallResult call() throws Exception {
                DisassociateThirdPartyFirewallResult result = null;

                try {
                    result = executeDisassociateThirdPartyFirewall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(GetAdminAccountRequest request) {

        return getAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(final GetAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdminAccountRequest, GetAdminAccountResult> asyncHandler) {
        final GetAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdminAccountResult>() {
            @Override
            public GetAdminAccountResult call() throws Exception {
                GetAdminAccountResult result = null;

                try {
                    result = executeGetAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(GetAppsListRequest request) {

        return getAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(final GetAppsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppsListRequest, GetAppsListResult> asyncHandler) {
        final GetAppsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppsListResult>() {
            @Override
            public GetAppsListResult call() throws Exception {
                GetAppsListResult result = null;

                try {
                    result = executeGetAppsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(GetComplianceDetailRequest request) {

        return getComplianceDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(final GetComplianceDetailRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceDetailRequest, GetComplianceDetailResult> asyncHandler) {
        final GetComplianceDetailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceDetailResult>() {
            @Override
            public GetComplianceDetailResult call() throws Exception {
                GetComplianceDetailResult result = null;

                try {
                    result = executeGetComplianceDetail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(GetNotificationChannelRequest request) {

        return getNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(final GetNotificationChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNotificationChannelRequest, GetNotificationChannelResult> asyncHandler) {
        final GetNotificationChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNotificationChannelResult>() {
            @Override
            public GetNotificationChannelResult call() throws Exception {
                GetNotificationChannelResult result = null;

                try {
                    result = executeGetNotificationChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(GetProtectionStatusRequest request) {

        return getProtectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(final GetProtectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProtectionStatusRequest, GetProtectionStatusResult> asyncHandler) {
        final GetProtectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProtectionStatusResult>() {
            @Override
            public GetProtectionStatusResult call() throws Exception {
                GetProtectionStatusResult result = null;

                try {
                    result = executeGetProtectionStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(GetProtocolsListRequest request) {

        return getProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(final GetProtocolsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProtocolsListRequest, GetProtocolsListResult> asyncHandler) {
        final GetProtocolsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProtocolsListResult>() {
            @Override
            public GetProtocolsListResult call() throws Exception {
                GetProtocolsListResult result = null;

                try {
                    result = executeGetProtocolsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest request) {

        return getResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(final GetResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceSetRequest, GetResourceSetResult> asyncHandler) {
        final GetResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceSetResult>() {
            @Override
            public GetResourceSetResult call() throws Exception {
                GetResourceSetResult result = null;

                try {
                    result = executeGetResourceSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetThirdPartyFirewallAssociationStatusResult> getThirdPartyFirewallAssociationStatusAsync(
            GetThirdPartyFirewallAssociationStatusRequest request) {

        return getThirdPartyFirewallAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThirdPartyFirewallAssociationStatusResult> getThirdPartyFirewallAssociationStatusAsync(
            final GetThirdPartyFirewallAssociationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetThirdPartyFirewallAssociationStatusRequest, GetThirdPartyFirewallAssociationStatusResult> asyncHandler) {
        final GetThirdPartyFirewallAssociationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetThirdPartyFirewallAssociationStatusResult>() {
            @Override
            public GetThirdPartyFirewallAssociationStatusResult call() throws Exception {
                GetThirdPartyFirewallAssociationStatusResult result = null;

                try {
                    result = executeGetThirdPartyFirewallAssociationStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(GetViolationDetailsRequest request) {

        return getViolationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(final GetViolationDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetViolationDetailsRequest, GetViolationDetailsResult> asyncHandler) {
        final GetViolationDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetViolationDetailsResult>() {
            @Override
            public GetViolationDetailsResult call() throws Exception {
                GetViolationDetailsResult result = null;

                try {
                    result = executeGetViolationDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(ListAppsListsRequest request) {

        return listAppsListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(final ListAppsListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsListsRequest, ListAppsListsResult> asyncHandler) {
        final ListAppsListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsListsResult>() {
            @Override
            public ListAppsListsResult call() throws Exception {
                ListAppsListsResult result = null;

                try {
                    result = executeListAppsLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(ListComplianceStatusRequest request) {

        return listComplianceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(final ListComplianceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComplianceStatusRequest, ListComplianceStatusResult> asyncHandler) {
        final ListComplianceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComplianceStatusResult>() {
            @Override
            public ListComplianceStatusResult call() throws Exception {
                ListComplianceStatusResult result = null;

                try {
                    result = executeListComplianceStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(final ListDiscoveredResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {
        final ListDiscoveredResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDiscoveredResourcesResult>() {
            @Override
            public ListDiscoveredResourcesResult call() throws Exception {
                ListDiscoveredResourcesResult result = null;

                try {
                    result = executeListDiscoveredResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request) {

        return listMemberAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(final ListMemberAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler) {
        final ListMemberAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMemberAccountsResult>() {
            @Override
            public ListMemberAccountsResult call() throws Exception {
                ListMemberAccountsResult result = null;

                try {
                    result = executeListMemberAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {
        final ListPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
            @Override
            public ListPoliciesResult call() throws Exception {
                ListPoliciesResult result = null;

                try {
                    result = executeListPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(ListProtocolsListsRequest request) {

        return listProtocolsListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(final ListProtocolsListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProtocolsListsRequest, ListProtocolsListsResult> asyncHandler) {
        final ListProtocolsListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProtocolsListsResult>() {
            @Override
            public ListProtocolsListsResult call() throws Exception {
                ListProtocolsListsResult result = null;

                try {
                    result = executeListProtocolsLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourceSetResourcesResult> listResourceSetResourcesAsync(ListResourceSetResourcesRequest request) {

        return listResourceSetResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceSetResourcesResult> listResourceSetResourcesAsync(final ListResourceSetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceSetResourcesRequest, ListResourceSetResourcesResult> asyncHandler) {
        final ListResourceSetResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceSetResourcesResult>() {
            @Override
            public ListResourceSetResourcesResult call() throws Exception {
                ListResourceSetResourcesResult result = null;

                try {
                    result = executeListResourceSetResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest request) {

        return listResourceSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(final ListResourceSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceSetsRequest, ListResourceSetsResult> asyncHandler) {
        final ListResourceSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceSetsResult>() {
            @Override
            public ListResourceSetsResult call() throws Exception {
                ListResourceSetsResult result = null;

                try {
                    result = executeListResourceSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListThirdPartyFirewallFirewallPoliciesResult> listThirdPartyFirewallFirewallPoliciesAsync(
            ListThirdPartyFirewallFirewallPoliciesRequest request) {

        return listThirdPartyFirewallFirewallPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThirdPartyFirewallFirewallPoliciesResult> listThirdPartyFirewallFirewallPoliciesAsync(
            final ListThirdPartyFirewallFirewallPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThirdPartyFirewallFirewallPoliciesRequest, ListThirdPartyFirewallFirewallPoliciesResult> asyncHandler) {
        final ListThirdPartyFirewallFirewallPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThirdPartyFirewallFirewallPoliciesResult>() {
            @Override
            public ListThirdPartyFirewallFirewallPoliciesResult call() throws Exception {
                ListThirdPartyFirewallFirewallPoliciesResult result = null;

                try {
                    result = executeListThirdPartyFirewallFirewallPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(PutAppsListRequest request) {

        return putAppsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(final PutAppsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAppsListRequest, PutAppsListResult> asyncHandler) {
        final PutAppsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAppsListResult>() {
            @Override
            public PutAppsListResult call() throws Exception {
                PutAppsListResult result = null;

                try {
                    result = executePutAppsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(PutNotificationChannelRequest request) {

        return putNotificationChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(final PutNotificationChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutNotificationChannelRequest, PutNotificationChannelResult> asyncHandler) {
        final PutNotificationChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutNotificationChannelResult>() {
            @Override
            public PutNotificationChannelResult call() throws Exception {
                PutNotificationChannelResult result = null;

                try {
                    result = executePutNotificationChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest request) {

        return putPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(final PutPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler) {
        final PutPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPolicyResult>() {
            @Override
            public PutPolicyResult call() throws Exception {
                PutPolicyResult result = null;

                try {
                    result = executePutPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(PutProtocolsListRequest request) {

        return putProtocolsListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(final PutProtocolsListRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutProtocolsListRequest, PutProtocolsListResult> asyncHandler) {
        final PutProtocolsListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutProtocolsListResult>() {
            @Override
            public PutProtocolsListResult call() throws Exception {
                PutProtocolsListResult result = null;

                try {
                    result = executePutProtocolsList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutResourceSetResult> putResourceSetAsync(PutResourceSetRequest request) {

        return putResourceSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourceSetResult> putResourceSetAsync(final PutResourceSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourceSetRequest, PutResourceSetResult> asyncHandler) {
        final PutResourceSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourceSetResult>() {
            @Override
            public PutResourceSetResult call() throws Exception {
                PutResourceSetResult result = null;

                try {
                    result = executePutResourceSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
