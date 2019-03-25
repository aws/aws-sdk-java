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
package com.amazonaws.services.directconnect;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;

/**
 * Abstract implementation of {@code AmazonDirectConnectAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDirectConnectAsync extends AbstractAmazonDirectConnect implements AmazonDirectConnectAsync {

    protected AbstractAmazonDirectConnectAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            AcceptDirectConnectGatewayAssociationProposalRequest request) {

        return acceptDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            AcceptDirectConnectGatewayAssociationProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptDirectConnectGatewayAssociationProposalRequest, AcceptDirectConnectGatewayAssociationProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest request) {

        return allocateConnectionOnInterconnectAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest request) {

        return allocateHostedConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocateHostedConnectionRequest, AllocateHostedConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest request) {

        return allocatePrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocatePrivateVirtualInterfaceRequest, AllocatePrivateVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(AllocatePublicVirtualInterfaceRequest request) {

        return allocatePublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(AllocatePublicVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(AssociateConnectionWithLagRequest request) {

        return associateConnectionWithLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(AssociateConnectionWithLagRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateConnectionWithLagRequest, AssociateConnectionWithLagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(AssociateHostedConnectionRequest request) {

        return associateHostedConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(AssociateHostedConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateHostedConnectionRequest, AssociateHostedConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(AssociateVirtualInterfaceRequest request) {

        return associateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(AssociateVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateVirtualInterfaceRequest, AssociateVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest request) {

        return confirmConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(ConfirmPrivateVirtualInterfaceRequest request) {

        return confirmPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(ConfirmPrivateVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmPrivateVirtualInterfaceRequest, ConfirmPrivateVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(ConfirmPublicVirtualInterfaceRequest request) {

        return confirmPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(ConfirmPublicVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest request) {

        return createBGPPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBGPPeerRequest, CreateBGPPeerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(CreateDirectConnectGatewayRequest request) {

        return createDirectConnectGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(CreateDirectConnectGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayRequest, CreateDirectConnectGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            CreateDirectConnectGatewayAssociationRequest request) {

        return createDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            CreateDirectConnectGatewayAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationRequest, CreateDirectConnectGatewayAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            CreateDirectConnectGatewayAssociationProposalRequest request) {

        return createDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            CreateDirectConnectGatewayAssociationProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationProposalRequest, CreateDirectConnectGatewayAssociationProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest request) {

        return createInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest request) {

        return createLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLagRequest, CreateLagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(CreatePrivateVirtualInterfaceRequest request) {

        return createPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(CreatePrivateVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(CreatePublicVirtualInterfaceRequest request) {

        return createPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(CreatePublicVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest request) {

        return deleteBGPPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBGPPeerRequest, DeleteBGPPeerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(DeleteDirectConnectGatewayRequest request) {

        return deleteDirectConnectGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(DeleteDirectConnectGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayRequest, DeleteDirectConnectGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            DeleteDirectConnectGatewayAssociationRequest request) {

        return deleteDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            DeleteDirectConnectGatewayAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationRequest, DeleteDirectConnectGatewayAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            DeleteDirectConnectGatewayAssociationProposalRequest request) {

        return deleteDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            DeleteDirectConnectGatewayAssociationProposalRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationProposalRequest, DeleteDirectConnectGatewayAssociationProposalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest request) {

        return deleteInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest request) {

        return deleteLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLagRequest, DeleteLagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest request) {

        return deleteVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest request) {

        return describeConnectionLoaAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionLoaRequest, DescribeConnectionLoaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest request) {

        return describeConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConnections operation.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync() {

        return describeConnectionsAsync(new DescribeConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConnections operation with an AsyncHandler.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        return describeConnectionsAsync(new DescribeConnectionsRequest(), asyncHandler);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest request) {

        return describeConnectionsOnInterconnectAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            DescribeDirectConnectGatewayAssociationProposalsRequest request) {

        return describeDirectConnectGatewayAssociationProposalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            DescribeDirectConnectGatewayAssociationProposalsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationProposalsRequest, DescribeDirectConnectGatewayAssociationProposalsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            DescribeDirectConnectGatewayAssociationsRequest request) {

        return describeDirectConnectGatewayAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            DescribeDirectConnectGatewayAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationsRequest, DescribeDirectConnectGatewayAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            DescribeDirectConnectGatewayAttachmentsRequest request) {

        return describeDirectConnectGatewayAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            DescribeDirectConnectGatewayAttachmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAttachmentsRequest, DescribeDirectConnectGatewayAttachmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(DescribeDirectConnectGatewaysRequest request) {

        return describeDirectConnectGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(DescribeDirectConnectGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewaysRequest, DescribeDirectConnectGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(DescribeHostedConnectionsRequest request) {

        return describeHostedConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(DescribeHostedConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHostedConnectionsRequest, DescribeHostedConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest request) {

        return describeInterconnectLoaAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectLoaRequest, DescribeInterconnectLoaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest request) {

        return describeInterconnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync() {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInterconnects operation with an AsyncHandler.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest request) {

        return describeLagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLagsRequest, DescribeLagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest request) {

        return describeLoaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoaRequest, DescribeLoaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest request) {

        return describeLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync() {

        return describeLocationsAsync(new DescribeLocationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLocations operation with an AsyncHandler.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {

        return describeLocationsAsync(new DescribeLocationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest request) {

        return describeVirtualGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync() {

        return describeVirtualGatewaysAsync(new DescribeVirtualGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation with an AsyncHandler.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {

        return describeVirtualGatewaysAsync(new DescribeVirtualGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest request) {

        return describeVirtualInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync() {

        return describeVirtualInterfacesAsync(new DescribeVirtualInterfacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation with an AsyncHandler.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {

        return describeVirtualInterfacesAsync(new DescribeVirtualInterfacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(DisassociateConnectionFromLagRequest request) {

        return disassociateConnectionFromLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(DisassociateConnectionFromLagRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectionFromLagRequest, DisassociateConnectionFromLagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            UpdateDirectConnectGatewayAssociationRequest request) {

        return updateDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            UpdateDirectConnectGatewayAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDirectConnectGatewayAssociationRequest, UpdateDirectConnectGatewayAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest request) {

        return updateLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLagRequest, UpdateLagResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            UpdateVirtualInterfaceAttributesRequest request) {

        return updateVirtualInterfaceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            UpdateVirtualInterfaceAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualInterfaceAttributesRequest, UpdateVirtualInterfaceAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
