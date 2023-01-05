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
package com.amazonaws.services.networkmanager;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing NetworkManager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services enables you to centrally manage your Amazon Web Services Cloud WAN core network and your Transit
 * Gateway network across Amazon Web Services accounts, Regions, and on-premises locations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkManagerAsyncClient extends AWSNetworkManagerClient implements AWSNetworkManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSNetworkManagerAsyncClientBuilder asyncBuilder() {
        return AWSNetworkManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on NetworkManager using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on NetworkManager using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSNetworkManagerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptAttachmentResult> acceptAttachmentAsync(AcceptAttachmentRequest request) {

        return acceptAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptAttachmentResult> acceptAttachmentAsync(final AcceptAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptAttachmentRequest, AcceptAttachmentResult> asyncHandler) {
        final AcceptAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptAttachmentResult>() {
            @Override
            public AcceptAttachmentResult call() throws Exception {
                AcceptAttachmentResult result = null;

                try {
                    result = executeAcceptAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectPeerResult> associateConnectPeerAsync(AssociateConnectPeerRequest request) {

        return associateConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectPeerResult> associateConnectPeerAsync(final AssociateConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateConnectPeerRequest, AssociateConnectPeerResult> asyncHandler) {
        final AssociateConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateConnectPeerResult>() {
            @Override
            public AssociateConnectPeerResult call() throws Exception {
                AssociateConnectPeerResult result = null;

                try {
                    result = executeAssociateConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(AssociateCustomerGatewayRequest request) {

        return associateCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(final AssociateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateCustomerGatewayRequest, AssociateCustomerGatewayResult> asyncHandler) {
        final AssociateCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateCustomerGatewayResult>() {
            @Override
            public AssociateCustomerGatewayResult call() throws Exception {
                AssociateCustomerGatewayResult result = null;

                try {
                    result = executeAssociateCustomerGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(AssociateLinkRequest request) {

        return associateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(final AssociateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLinkRequest, AssociateLinkResult> asyncHandler) {
        final AssociateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLinkResult>() {
            @Override
            public AssociateLinkResult call() throws Exception {
                AssociateLinkResult result = null;

                try {
                    result = executeAssociateLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateTransitGatewayConnectPeerResult> associateTransitGatewayConnectPeerAsync(
            AssociateTransitGatewayConnectPeerRequest request) {

        return associateTransitGatewayConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTransitGatewayConnectPeerResult> associateTransitGatewayConnectPeerAsync(
            final AssociateTransitGatewayConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTransitGatewayConnectPeerRequest, AssociateTransitGatewayConnectPeerResult> asyncHandler) {
        final AssociateTransitGatewayConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTransitGatewayConnectPeerResult>() {
            @Override
            public AssociateTransitGatewayConnectPeerResult call() throws Exception {
                AssociateTransitGatewayConnectPeerResult result = null;

                try {
                    result = executeAssociateTransitGatewayConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConnectAttachmentResult> createConnectAttachmentAsync(CreateConnectAttachmentRequest request) {

        return createConnectAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectAttachmentResult> createConnectAttachmentAsync(final CreateConnectAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectAttachmentRequest, CreateConnectAttachmentResult> asyncHandler) {
        final CreateConnectAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectAttachmentResult>() {
            @Override
            public CreateConnectAttachmentResult call() throws Exception {
                CreateConnectAttachmentResult result = null;

                try {
                    result = executeCreateConnectAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConnectPeerResult> createConnectPeerAsync(CreateConnectPeerRequest request) {

        return createConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectPeerResult> createConnectPeerAsync(final CreateConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectPeerRequest, CreateConnectPeerResult> asyncHandler) {
        final CreateConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectPeerResult>() {
            @Override
            public CreateConnectPeerResult call() throws Exception {
                CreateConnectPeerResult result = null;

                try {
                    result = executeCreateConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(final CreateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {
        final CreateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectionResult>() {
            @Override
            public CreateConnectionResult call() throws Exception {
                CreateConnectionResult result = null;

                try {
                    result = executeCreateConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCoreNetworkResult> createCoreNetworkAsync(CreateCoreNetworkRequest request) {

        return createCoreNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCoreNetworkResult> createCoreNetworkAsync(final CreateCoreNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCoreNetworkRequest, CreateCoreNetworkResult> asyncHandler) {
        final CreateCoreNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCoreNetworkResult>() {
            @Override
            public CreateCoreNetworkResult call() throws Exception {
                CreateCoreNetworkResult result = null;

                try {
                    result = executeCreateCoreNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(CreateDeviceRequest request) {

        return createDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(final CreateDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceRequest, CreateDeviceResult> asyncHandler) {
        final CreateDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceResult>() {
            @Override
            public CreateDeviceResult call() throws Exception {
                CreateDeviceResult result = null;

                try {
                    result = executeCreateDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(CreateGlobalNetworkRequest request) {

        return createGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(final CreateGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGlobalNetworkRequest, CreateGlobalNetworkResult> asyncHandler) {
        final CreateGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGlobalNetworkResult>() {
            @Override
            public CreateGlobalNetworkResult call() throws Exception {
                CreateGlobalNetworkResult result = null;

                try {
                    result = executeCreateGlobalNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest request) {

        return createLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(final CreateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler) {
        final CreateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLinkResult>() {
            @Override
            public CreateLinkResult call() throws Exception {
                CreateLinkResult result = null;

                try {
                    result = executeCreateLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest request) {

        return createSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(final CreateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler) {
        final CreateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSiteResult>() {
            @Override
            public CreateSiteResult call() throws Exception {
                CreateSiteResult result = null;

                try {
                    result = executeCreateSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSiteToSiteVpnAttachmentResult> createSiteToSiteVpnAttachmentAsync(CreateSiteToSiteVpnAttachmentRequest request) {

        return createSiteToSiteVpnAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSiteToSiteVpnAttachmentResult> createSiteToSiteVpnAttachmentAsync(
            final CreateSiteToSiteVpnAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSiteToSiteVpnAttachmentRequest, CreateSiteToSiteVpnAttachmentResult> asyncHandler) {
        final CreateSiteToSiteVpnAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSiteToSiteVpnAttachmentResult>() {
            @Override
            public CreateSiteToSiteVpnAttachmentResult call() throws Exception {
                CreateSiteToSiteVpnAttachmentResult result = null;

                try {
                    result = executeCreateSiteToSiteVpnAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayPeeringResult> createTransitGatewayPeeringAsync(CreateTransitGatewayPeeringRequest request) {

        return createTransitGatewayPeeringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayPeeringResult> createTransitGatewayPeeringAsync(final CreateTransitGatewayPeeringRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayPeeringRequest, CreateTransitGatewayPeeringResult> asyncHandler) {
        final CreateTransitGatewayPeeringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayPeeringResult>() {
            @Override
            public CreateTransitGatewayPeeringResult call() throws Exception {
                CreateTransitGatewayPeeringResult result = null;

                try {
                    result = executeCreateTransitGatewayPeering(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableAttachmentResult> createTransitGatewayRouteTableAttachmentAsync(
            CreateTransitGatewayRouteTableAttachmentRequest request) {

        return createTransitGatewayRouteTableAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableAttachmentResult> createTransitGatewayRouteTableAttachmentAsync(
            final CreateTransitGatewayRouteTableAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteTableAttachmentRequest, CreateTransitGatewayRouteTableAttachmentResult> asyncHandler) {
        final CreateTransitGatewayRouteTableAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayRouteTableAttachmentResult>() {
            @Override
            public CreateTransitGatewayRouteTableAttachmentResult call() throws Exception {
                CreateTransitGatewayRouteTableAttachmentResult result = null;

                try {
                    result = executeCreateTransitGatewayRouteTableAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVpcAttachmentResult> createVpcAttachmentAsync(CreateVpcAttachmentRequest request) {

        return createVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcAttachmentResult> createVpcAttachmentAsync(final CreateVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcAttachmentRequest, CreateVpcAttachmentResult> asyncHandler) {
        final CreateVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcAttachmentResult>() {
            @Override
            public CreateVpcAttachmentResult call() throws Exception {
                CreateVpcAttachmentResult result = null;

                try {
                    result = executeCreateVpcAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAttachmentResult> deleteAttachmentAsync(DeleteAttachmentRequest request) {

        return deleteAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttachmentResult> deleteAttachmentAsync(final DeleteAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttachmentRequest, DeleteAttachmentResult> asyncHandler) {
        final DeleteAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttachmentResult>() {
            @Override
            public DeleteAttachmentResult call() throws Exception {
                DeleteAttachmentResult result = null;

                try {
                    result = executeDeleteAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectPeerResult> deleteConnectPeerAsync(DeleteConnectPeerRequest request) {

        return deleteConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectPeerResult> deleteConnectPeerAsync(final DeleteConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectPeerRequest, DeleteConnectPeerResult> asyncHandler) {
        final DeleteConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectPeerResult>() {
            @Override
            public DeleteConnectPeerResult call() throws Exception {
                DeleteConnectPeerResult result = null;

                try {
                    result = executeDeleteConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(final DeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {
        final DeleteConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectionResult>() {
            @Override
            public DeleteConnectionResult call() throws Exception {
                DeleteConnectionResult result = null;

                try {
                    result = executeDeleteConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreNetworkResult> deleteCoreNetworkAsync(DeleteCoreNetworkRequest request) {

        return deleteCoreNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreNetworkResult> deleteCoreNetworkAsync(final DeleteCoreNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCoreNetworkRequest, DeleteCoreNetworkResult> asyncHandler) {
        final DeleteCoreNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCoreNetworkResult>() {
            @Override
            public DeleteCoreNetworkResult call() throws Exception {
                DeleteCoreNetworkResult result = null;

                try {
                    result = executeDeleteCoreNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreNetworkPolicyVersionResult> deleteCoreNetworkPolicyVersionAsync(DeleteCoreNetworkPolicyVersionRequest request) {

        return deleteCoreNetworkPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreNetworkPolicyVersionResult> deleteCoreNetworkPolicyVersionAsync(
            final DeleteCoreNetworkPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCoreNetworkPolicyVersionRequest, DeleteCoreNetworkPolicyVersionResult> asyncHandler) {
        final DeleteCoreNetworkPolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCoreNetworkPolicyVersionResult>() {
            @Override
            public DeleteCoreNetworkPolicyVersionResult call() throws Exception {
                DeleteCoreNetworkPolicyVersionResult result = null;

                try {
                    result = executeDeleteCoreNetworkPolicyVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request) {

        return deleteDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(final DeleteDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler) {
        final DeleteDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceResult>() {
            @Override
            public DeleteDeviceResult call() throws Exception {
                DeleteDeviceResult result = null;

                try {
                    result = executeDeleteDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(DeleteGlobalNetworkRequest request) {

        return deleteGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(final DeleteGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGlobalNetworkRequest, DeleteGlobalNetworkResult> asyncHandler) {
        final DeleteGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGlobalNetworkResult>() {
            @Override
            public DeleteGlobalNetworkResult call() throws Exception {
                DeleteGlobalNetworkResult result = null;

                try {
                    result = executeDeleteGlobalNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest request) {

        return deleteLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(final DeleteLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler) {
        final DeleteLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLinkResult>() {
            @Override
            public DeleteLinkResult call() throws Exception {
                DeleteLinkResult result = null;

                try {
                    result = executeDeleteLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePeeringResult> deletePeeringAsync(DeletePeeringRequest request) {

        return deletePeeringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePeeringResult> deletePeeringAsync(final DeletePeeringRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePeeringRequest, DeletePeeringResult> asyncHandler) {
        final DeletePeeringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePeeringResult>() {
            @Override
            public DeletePeeringResult call() throws Exception {
                DeletePeeringResult result = null;

                try {
                    result = executeDeletePeering(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request) {

        return deleteSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(final DeleteSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler) {
        final DeleteSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSiteResult>() {
            @Override
            public DeleteSiteResult call() throws Exception {
                DeleteSiteResult result = null;

                try {
                    result = executeDeleteSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(DeregisterTransitGatewayRequest request) {

        return deregisterTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(final DeregisterTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTransitGatewayRequest, DeregisterTransitGatewayResult> asyncHandler) {
        final DeregisterTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTransitGatewayResult>() {
            @Override
            public DeregisterTransitGatewayResult call() throws Exception {
                DeregisterTransitGatewayResult result = null;

                try {
                    result = executeDeregisterTransitGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(DescribeGlobalNetworksRequest request) {

        return describeGlobalNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(final DescribeGlobalNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGlobalNetworksRequest, DescribeGlobalNetworksResult> asyncHandler) {
        final DescribeGlobalNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGlobalNetworksResult>() {
            @Override
            public DescribeGlobalNetworksResult call() throws Exception {
                DescribeGlobalNetworksResult result = null;

                try {
                    result = executeDescribeGlobalNetworks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectPeerResult> disassociateConnectPeerAsync(DisassociateConnectPeerRequest request) {

        return disassociateConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectPeerResult> disassociateConnectPeerAsync(final DisassociateConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConnectPeerRequest, DisassociateConnectPeerResult> asyncHandler) {
        final DisassociateConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConnectPeerResult>() {
            @Override
            public DisassociateConnectPeerResult call() throws Exception {
                DisassociateConnectPeerResult result = null;

                try {
                    result = executeDisassociateConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(DisassociateCustomerGatewayRequest request) {

        return disassociateCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(final DisassociateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateCustomerGatewayRequest, DisassociateCustomerGatewayResult> asyncHandler) {
        final DisassociateCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateCustomerGatewayResult>() {
            @Override
            public DisassociateCustomerGatewayResult call() throws Exception {
                DisassociateCustomerGatewayResult result = null;

                try {
                    result = executeDisassociateCustomerGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(DisassociateLinkRequest request) {

        return disassociateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(final DisassociateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLinkRequest, DisassociateLinkResult> asyncHandler) {
        final DisassociateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLinkResult>() {
            @Override
            public DisassociateLinkResult call() throws Exception {
                DisassociateLinkResult result = null;

                try {
                    result = executeDisassociateLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateTransitGatewayConnectPeerResult> disassociateTransitGatewayConnectPeerAsync(
            DisassociateTransitGatewayConnectPeerRequest request) {

        return disassociateTransitGatewayConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTransitGatewayConnectPeerResult> disassociateTransitGatewayConnectPeerAsync(
            final DisassociateTransitGatewayConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTransitGatewayConnectPeerRequest, DisassociateTransitGatewayConnectPeerResult> asyncHandler) {
        final DisassociateTransitGatewayConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTransitGatewayConnectPeerResult>() {
            @Override
            public DisassociateTransitGatewayConnectPeerResult call() throws Exception {
                DisassociateTransitGatewayConnectPeerResult result = null;

                try {
                    result = executeDisassociateTransitGatewayConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteCoreNetworkChangeSetResult> executeCoreNetworkChangeSetAsync(ExecuteCoreNetworkChangeSetRequest request) {

        return executeCoreNetworkChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteCoreNetworkChangeSetResult> executeCoreNetworkChangeSetAsync(final ExecuteCoreNetworkChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteCoreNetworkChangeSetRequest, ExecuteCoreNetworkChangeSetResult> asyncHandler) {
        final ExecuteCoreNetworkChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteCoreNetworkChangeSetResult>() {
            @Override
            public ExecuteCoreNetworkChangeSetResult call() throws Exception {
                ExecuteCoreNetworkChangeSetResult result = null;

                try {
                    result = executeExecuteCoreNetworkChangeSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectAttachmentResult> getConnectAttachmentAsync(GetConnectAttachmentRequest request) {

        return getConnectAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectAttachmentResult> getConnectAttachmentAsync(final GetConnectAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectAttachmentRequest, GetConnectAttachmentResult> asyncHandler) {
        final GetConnectAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectAttachmentResult>() {
            @Override
            public GetConnectAttachmentResult call() throws Exception {
                GetConnectAttachmentResult result = null;

                try {
                    result = executeGetConnectAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectPeerResult> getConnectPeerAsync(GetConnectPeerRequest request) {

        return getConnectPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectPeerResult> getConnectPeerAsync(final GetConnectPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectPeerRequest, GetConnectPeerResult> asyncHandler) {
        final GetConnectPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectPeerResult>() {
            @Override
            public GetConnectPeerResult call() throws Exception {
                GetConnectPeerResult result = null;

                try {
                    result = executeGetConnectPeer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectPeerAssociationsResult> getConnectPeerAssociationsAsync(GetConnectPeerAssociationsRequest request) {

        return getConnectPeerAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectPeerAssociationsResult> getConnectPeerAssociationsAsync(final GetConnectPeerAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectPeerAssociationsRequest, GetConnectPeerAssociationsResult> asyncHandler) {
        final GetConnectPeerAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectPeerAssociationsResult>() {
            @Override
            public GetConnectPeerAssociationsResult call() throws Exception {
                GetConnectPeerAssociationsResult result = null;

                try {
                    result = executeGetConnectPeerAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest request) {

        return getConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(final GetConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionsRequest, GetConnectionsResult> asyncHandler) {
        final GetConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionsResult>() {
            @Override
            public GetConnectionsResult call() throws Exception {
                GetConnectionsResult result = null;

                try {
                    result = executeGetConnections(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkResult> getCoreNetworkAsync(GetCoreNetworkRequest request) {

        return getCoreNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkResult> getCoreNetworkAsync(final GetCoreNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreNetworkRequest, GetCoreNetworkResult> asyncHandler) {
        final GetCoreNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreNetworkResult>() {
            @Override
            public GetCoreNetworkResult call() throws Exception {
                GetCoreNetworkResult result = null;

                try {
                    result = executeGetCoreNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkChangeEventsResult> getCoreNetworkChangeEventsAsync(GetCoreNetworkChangeEventsRequest request) {

        return getCoreNetworkChangeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkChangeEventsResult> getCoreNetworkChangeEventsAsync(final GetCoreNetworkChangeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreNetworkChangeEventsRequest, GetCoreNetworkChangeEventsResult> asyncHandler) {
        final GetCoreNetworkChangeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreNetworkChangeEventsResult>() {
            @Override
            public GetCoreNetworkChangeEventsResult call() throws Exception {
                GetCoreNetworkChangeEventsResult result = null;

                try {
                    result = executeGetCoreNetworkChangeEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkChangeSetResult> getCoreNetworkChangeSetAsync(GetCoreNetworkChangeSetRequest request) {

        return getCoreNetworkChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkChangeSetResult> getCoreNetworkChangeSetAsync(final GetCoreNetworkChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreNetworkChangeSetRequest, GetCoreNetworkChangeSetResult> asyncHandler) {
        final GetCoreNetworkChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreNetworkChangeSetResult>() {
            @Override
            public GetCoreNetworkChangeSetResult call() throws Exception {
                GetCoreNetworkChangeSetResult result = null;

                try {
                    result = executeGetCoreNetworkChangeSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkPolicyResult> getCoreNetworkPolicyAsync(GetCoreNetworkPolicyRequest request) {

        return getCoreNetworkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreNetworkPolicyResult> getCoreNetworkPolicyAsync(final GetCoreNetworkPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreNetworkPolicyRequest, GetCoreNetworkPolicyResult> asyncHandler) {
        final GetCoreNetworkPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreNetworkPolicyResult>() {
            @Override
            public GetCoreNetworkPolicyResult call() throws Exception {
                GetCoreNetworkPolicyResult result = null;

                try {
                    result = executeGetCoreNetworkPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(GetCustomerGatewayAssociationsRequest request) {

        return getCustomerGatewayAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(
            final GetCustomerGatewayAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomerGatewayAssociationsRequest, GetCustomerGatewayAssociationsResult> asyncHandler) {
        final GetCustomerGatewayAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomerGatewayAssociationsResult>() {
            @Override
            public GetCustomerGatewayAssociationsResult call() throws Exception {
                GetCustomerGatewayAssociationsResult result = null;

                try {
                    result = executeGetCustomerGatewayAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(GetDevicesRequest request) {

        return getDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(final GetDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicesRequest, GetDevicesResult> asyncHandler) {
        final GetDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicesResult>() {
            @Override
            public GetDevicesResult call() throws Exception {
                GetDevicesResult result = null;

                try {
                    result = executeGetDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(GetLinkAssociationsRequest request) {

        return getLinkAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(final GetLinkAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinkAssociationsRequest, GetLinkAssociationsResult> asyncHandler) {
        final GetLinkAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinkAssociationsResult>() {
            @Override
            public GetLinkAssociationsResult call() throws Exception {
                GetLinkAssociationsResult result = null;

                try {
                    result = executeGetLinkAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLinksResult> getLinksAsync(GetLinksRequest request) {

        return getLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinksResult> getLinksAsync(final GetLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinksRequest, GetLinksResult> asyncHandler) {
        final GetLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinksResult>() {
            @Override
            public GetLinksResult call() throws Exception {
                GetLinksResult result = null;

                try {
                    result = executeGetLinks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourceCountsResult> getNetworkResourceCountsAsync(GetNetworkResourceCountsRequest request) {

        return getNetworkResourceCountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourceCountsResult> getNetworkResourceCountsAsync(final GetNetworkResourceCountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkResourceCountsRequest, GetNetworkResourceCountsResult> asyncHandler) {
        final GetNetworkResourceCountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResourceCountsResult>() {
            @Override
            public GetNetworkResourceCountsResult call() throws Exception {
                GetNetworkResourceCountsResult result = null;

                try {
                    result = executeGetNetworkResourceCounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourceRelationshipsResult> getNetworkResourceRelationshipsAsync(
            GetNetworkResourceRelationshipsRequest request) {

        return getNetworkResourceRelationshipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourceRelationshipsResult> getNetworkResourceRelationshipsAsync(
            final GetNetworkResourceRelationshipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkResourceRelationshipsRequest, GetNetworkResourceRelationshipsResult> asyncHandler) {
        final GetNetworkResourceRelationshipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResourceRelationshipsResult>() {
            @Override
            public GetNetworkResourceRelationshipsResult call() throws Exception {
                GetNetworkResourceRelationshipsResult result = null;

                try {
                    result = executeGetNetworkResourceRelationships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourcesResult> getNetworkResourcesAsync(GetNetworkResourcesRequest request) {

        return getNetworkResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourcesResult> getNetworkResourcesAsync(final GetNetworkResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkResourcesRequest, GetNetworkResourcesResult> asyncHandler) {
        final GetNetworkResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResourcesResult>() {
            @Override
            public GetNetworkResourcesResult call() throws Exception {
                GetNetworkResourcesResult result = null;

                try {
                    result = executeGetNetworkResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkRoutesResult> getNetworkRoutesAsync(GetNetworkRoutesRequest request) {

        return getNetworkRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkRoutesResult> getNetworkRoutesAsync(final GetNetworkRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkRoutesRequest, GetNetworkRoutesResult> asyncHandler) {
        final GetNetworkRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkRoutesResult>() {
            @Override
            public GetNetworkRoutesResult call() throws Exception {
                GetNetworkRoutesResult result = null;

                try {
                    result = executeGetNetworkRoutes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkTelemetryResult> getNetworkTelemetryAsync(GetNetworkTelemetryRequest request) {

        return getNetworkTelemetryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkTelemetryResult> getNetworkTelemetryAsync(final GetNetworkTelemetryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkTelemetryRequest, GetNetworkTelemetryResult> asyncHandler) {
        final GetNetworkTelemetryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkTelemetryResult>() {
            @Override
            public GetNetworkTelemetryResult call() throws Exception {
                GetNetworkTelemetryResult result = null;

                try {
                    result = executeGetNetworkTelemetry(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetRouteAnalysisResult> getRouteAnalysisAsync(GetRouteAnalysisRequest request) {

        return getRouteAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRouteAnalysisResult> getRouteAnalysisAsync(final GetRouteAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRouteAnalysisRequest, GetRouteAnalysisResult> asyncHandler) {
        final GetRouteAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRouteAnalysisResult>() {
            @Override
            public GetRouteAnalysisResult call() throws Exception {
                GetRouteAnalysisResult result = null;

                try {
                    result = executeGetRouteAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSiteToSiteVpnAttachmentResult> getSiteToSiteVpnAttachmentAsync(GetSiteToSiteVpnAttachmentRequest request) {

        return getSiteToSiteVpnAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSiteToSiteVpnAttachmentResult> getSiteToSiteVpnAttachmentAsync(final GetSiteToSiteVpnAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSiteToSiteVpnAttachmentRequest, GetSiteToSiteVpnAttachmentResult> asyncHandler) {
        final GetSiteToSiteVpnAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSiteToSiteVpnAttachmentResult>() {
            @Override
            public GetSiteToSiteVpnAttachmentResult call() throws Exception {
                GetSiteToSiteVpnAttachmentResult result = null;

                try {
                    result = executeGetSiteToSiteVpnAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSitesResult> getSitesAsync(GetSitesRequest request) {

        return getSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSitesResult> getSitesAsync(final GetSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSitesRequest, GetSitesResult> asyncHandler) {
        final GetSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSitesResult>() {
            @Override
            public GetSitesResult call() throws Exception {
                GetSitesResult result = null;

                try {
                    result = executeGetSites(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayConnectPeerAssociationsResult> getTransitGatewayConnectPeerAssociationsAsync(
            GetTransitGatewayConnectPeerAssociationsRequest request) {

        return getTransitGatewayConnectPeerAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayConnectPeerAssociationsResult> getTransitGatewayConnectPeerAssociationsAsync(
            final GetTransitGatewayConnectPeerAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayConnectPeerAssociationsRequest, GetTransitGatewayConnectPeerAssociationsResult> asyncHandler) {
        final GetTransitGatewayConnectPeerAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayConnectPeerAssociationsResult>() {
            @Override
            public GetTransitGatewayConnectPeerAssociationsResult call() throws Exception {
                GetTransitGatewayConnectPeerAssociationsResult result = null;

                try {
                    result = executeGetTransitGatewayConnectPeerAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayPeeringResult> getTransitGatewayPeeringAsync(GetTransitGatewayPeeringRequest request) {

        return getTransitGatewayPeeringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayPeeringResult> getTransitGatewayPeeringAsync(final GetTransitGatewayPeeringRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayPeeringRequest, GetTransitGatewayPeeringResult> asyncHandler) {
        final GetTransitGatewayPeeringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayPeeringResult>() {
            @Override
            public GetTransitGatewayPeeringResult call() throws Exception {
                GetTransitGatewayPeeringResult result = null;

                try {
                    result = executeGetTransitGatewayPeering(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(GetTransitGatewayRegistrationsRequest request) {

        return getTransitGatewayRegistrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(
            final GetTransitGatewayRegistrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRegistrationsRequest, GetTransitGatewayRegistrationsResult> asyncHandler) {
        final GetTransitGatewayRegistrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayRegistrationsResult>() {
            @Override
            public GetTransitGatewayRegistrationsResult call() throws Exception {
                GetTransitGatewayRegistrationsResult result = null;

                try {
                    result = executeGetTransitGatewayRegistrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAttachmentResult> getTransitGatewayRouteTableAttachmentAsync(
            GetTransitGatewayRouteTableAttachmentRequest request) {

        return getTransitGatewayRouteTableAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAttachmentResult> getTransitGatewayRouteTableAttachmentAsync(
            final GetTransitGatewayRouteTableAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTableAttachmentRequest, GetTransitGatewayRouteTableAttachmentResult> asyncHandler) {
        final GetTransitGatewayRouteTableAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayRouteTableAttachmentResult>() {
            @Override
            public GetTransitGatewayRouteTableAttachmentResult call() throws Exception {
                GetTransitGatewayRouteTableAttachmentResult result = null;

                try {
                    result = executeGetTransitGatewayRouteTableAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVpcAttachmentResult> getVpcAttachmentAsync(GetVpcAttachmentRequest request) {

        return getVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVpcAttachmentResult> getVpcAttachmentAsync(final GetVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVpcAttachmentRequest, GetVpcAttachmentResult> asyncHandler) {
        final GetVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVpcAttachmentResult>() {
            @Override
            public GetVpcAttachmentResult call() throws Exception {
                GetVpcAttachmentResult result = null;

                try {
                    result = executeGetVpcAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAttachmentsResult> listAttachmentsAsync(ListAttachmentsRequest request) {

        return listAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachmentsResult> listAttachmentsAsync(final ListAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachmentsRequest, ListAttachmentsResult> asyncHandler) {
        final ListAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttachmentsResult>() {
            @Override
            public ListAttachmentsResult call() throws Exception {
                ListAttachmentsResult result = null;

                try {
                    result = executeListAttachments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectPeersResult> listConnectPeersAsync(ListConnectPeersRequest request) {

        return listConnectPeersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectPeersResult> listConnectPeersAsync(final ListConnectPeersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectPeersRequest, ListConnectPeersResult> asyncHandler) {
        final ListConnectPeersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectPeersResult>() {
            @Override
            public ListConnectPeersResult call() throws Exception {
                ListConnectPeersResult result = null;

                try {
                    result = executeListConnectPeers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCoreNetworkPolicyVersionsResult> listCoreNetworkPolicyVersionsAsync(ListCoreNetworkPolicyVersionsRequest request) {

        return listCoreNetworkPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreNetworkPolicyVersionsResult> listCoreNetworkPolicyVersionsAsync(
            final ListCoreNetworkPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoreNetworkPolicyVersionsRequest, ListCoreNetworkPolicyVersionsResult> asyncHandler) {
        final ListCoreNetworkPolicyVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoreNetworkPolicyVersionsResult>() {
            @Override
            public ListCoreNetworkPolicyVersionsResult call() throws Exception {
                ListCoreNetworkPolicyVersionsResult result = null;

                try {
                    result = executeListCoreNetworkPolicyVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCoreNetworksResult> listCoreNetworksAsync(ListCoreNetworksRequest request) {

        return listCoreNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreNetworksResult> listCoreNetworksAsync(final ListCoreNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoreNetworksRequest, ListCoreNetworksResult> asyncHandler) {
        final ListCoreNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoreNetworksResult>() {
            @Override
            public ListCoreNetworksResult call() throws Exception {
                ListCoreNetworksResult result = null;

                try {
                    result = executeListCoreNetworks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationServiceAccessStatusResult> listOrganizationServiceAccessStatusAsync(
            ListOrganizationServiceAccessStatusRequest request) {

        return listOrganizationServiceAccessStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationServiceAccessStatusResult> listOrganizationServiceAccessStatusAsync(
            final ListOrganizationServiceAccessStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationServiceAccessStatusRequest, ListOrganizationServiceAccessStatusResult> asyncHandler) {
        final ListOrganizationServiceAccessStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationServiceAccessStatusResult>() {
            @Override
            public ListOrganizationServiceAccessStatusResult call() throws Exception {
                ListOrganizationServiceAccessStatusResult result = null;

                try {
                    result = executeListOrganizationServiceAccessStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPeeringsResult> listPeeringsAsync(ListPeeringsRequest request) {

        return listPeeringsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPeeringsResult> listPeeringsAsync(final ListPeeringsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPeeringsRequest, ListPeeringsResult> asyncHandler) {
        final ListPeeringsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPeeringsResult>() {
            @Override
            public ListPeeringsResult call() throws Exception {
                ListPeeringsResult result = null;

                try {
                    result = executeListPeerings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutCoreNetworkPolicyResult> putCoreNetworkPolicyAsync(PutCoreNetworkPolicyRequest request) {

        return putCoreNetworkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutCoreNetworkPolicyResult> putCoreNetworkPolicyAsync(final PutCoreNetworkPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutCoreNetworkPolicyRequest, PutCoreNetworkPolicyResult> asyncHandler) {
        final PutCoreNetworkPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutCoreNetworkPolicyResult>() {
            @Override
            public PutCoreNetworkPolicyResult call() throws Exception {
                PutCoreNetworkPolicyResult result = null;

                try {
                    result = executePutCoreNetworkPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(RegisterTransitGatewayRequest request) {

        return registerTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(final RegisterTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTransitGatewayRequest, RegisterTransitGatewayResult> asyncHandler) {
        final RegisterTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTransitGatewayResult>() {
            @Override
            public RegisterTransitGatewayResult call() throws Exception {
                RegisterTransitGatewayResult result = null;

                try {
                    result = executeRegisterTransitGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectAttachmentResult> rejectAttachmentAsync(RejectAttachmentRequest request) {

        return rejectAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectAttachmentResult> rejectAttachmentAsync(final RejectAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectAttachmentRequest, RejectAttachmentResult> asyncHandler) {
        final RejectAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectAttachmentResult>() {
            @Override
            public RejectAttachmentResult call() throws Exception {
                RejectAttachmentResult result = null;

                try {
                    result = executeRejectAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestoreCoreNetworkPolicyVersionResult> restoreCoreNetworkPolicyVersionAsync(
            RestoreCoreNetworkPolicyVersionRequest request) {

        return restoreCoreNetworkPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreCoreNetworkPolicyVersionResult> restoreCoreNetworkPolicyVersionAsync(
            final RestoreCoreNetworkPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreCoreNetworkPolicyVersionRequest, RestoreCoreNetworkPolicyVersionResult> asyncHandler) {
        final RestoreCoreNetworkPolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreCoreNetworkPolicyVersionResult>() {
            @Override
            public RestoreCoreNetworkPolicyVersionResult call() throws Exception {
                RestoreCoreNetworkPolicyVersionResult result = null;

                try {
                    result = executeRestoreCoreNetworkPolicyVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartOrganizationServiceAccessUpdateResult> startOrganizationServiceAccessUpdateAsync(
            StartOrganizationServiceAccessUpdateRequest request) {

        return startOrganizationServiceAccessUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOrganizationServiceAccessUpdateResult> startOrganizationServiceAccessUpdateAsync(
            final StartOrganizationServiceAccessUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOrganizationServiceAccessUpdateRequest, StartOrganizationServiceAccessUpdateResult> asyncHandler) {
        final StartOrganizationServiceAccessUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartOrganizationServiceAccessUpdateResult>() {
            @Override
            public StartOrganizationServiceAccessUpdateResult call() throws Exception {
                StartOrganizationServiceAccessUpdateResult result = null;

                try {
                    result = executeStartOrganizationServiceAccessUpdate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartRouteAnalysisResult> startRouteAnalysisAsync(StartRouteAnalysisRequest request) {

        return startRouteAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRouteAnalysisResult> startRouteAnalysisAsync(final StartRouteAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRouteAnalysisRequest, StartRouteAnalysisResult> asyncHandler) {
        final StartRouteAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRouteAnalysisResult>() {
            @Override
            public StartRouteAnalysisResult call() throws Exception {
                StartRouteAnalysisResult result = null;

                try {
                    result = executeStartRouteAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest request) {

        return updateConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(final UpdateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResult> asyncHandler) {
        final UpdateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectionResult>() {
            @Override
            public UpdateConnectionResult call() throws Exception {
                UpdateConnectionResult result = null;

                try {
                    result = executeUpdateConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCoreNetworkResult> updateCoreNetworkAsync(UpdateCoreNetworkRequest request) {

        return updateCoreNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCoreNetworkResult> updateCoreNetworkAsync(final UpdateCoreNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCoreNetworkRequest, UpdateCoreNetworkResult> asyncHandler) {
        final UpdateCoreNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCoreNetworkResult>() {
            @Override
            public UpdateCoreNetworkResult call() throws Exception {
                UpdateCoreNetworkResult result = null;

                try {
                    result = executeUpdateCoreNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest request) {

        return updateDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(final UpdateDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler) {
        final UpdateDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceResult>() {
            @Override
            public UpdateDeviceResult call() throws Exception {
                UpdateDeviceResult result = null;

                try {
                    result = executeUpdateDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(UpdateGlobalNetworkRequest request) {

        return updateGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(final UpdateGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlobalNetworkRequest, UpdateGlobalNetworkResult> asyncHandler) {
        final UpdateGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlobalNetworkResult>() {
            @Override
            public UpdateGlobalNetworkResult call() throws Exception {
                UpdateGlobalNetworkResult result = null;

                try {
                    result = executeUpdateGlobalNetwork(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest request) {

        return updateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(final UpdateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler) {
        final UpdateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLinkResult>() {
            @Override
            public UpdateLinkResult call() throws Exception {
                UpdateLinkResult result = null;

                try {
                    result = executeUpdateLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkResourceMetadataResult> updateNetworkResourceMetadataAsync(UpdateNetworkResourceMetadataRequest request) {

        return updateNetworkResourceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkResourceMetadataResult> updateNetworkResourceMetadataAsync(
            final UpdateNetworkResourceMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNetworkResourceMetadataRequest, UpdateNetworkResourceMetadataResult> asyncHandler) {
        final UpdateNetworkResourceMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNetworkResourceMetadataResult>() {
            @Override
            public UpdateNetworkResourceMetadataResult call() throws Exception {
                UpdateNetworkResourceMetadataResult result = null;

                try {
                    result = executeUpdateNetworkResourceMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest request) {

        return updateSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(final UpdateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler) {
        final UpdateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSiteResult>() {
            @Override
            public UpdateSiteResult call() throws Exception {
                UpdateSiteResult result = null;

                try {
                    result = executeUpdateSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcAttachmentResult> updateVpcAttachmentAsync(UpdateVpcAttachmentRequest request) {

        return updateVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcAttachmentResult> updateVpcAttachmentAsync(final UpdateVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResult> asyncHandler) {
        final UpdateVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVpcAttachmentResult>() {
            @Override
            public UpdateVpcAttachmentResult call() throws Exception {
                UpdateVpcAttachmentResult result = null;

                try {
                    result = executeUpdateVpcAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
