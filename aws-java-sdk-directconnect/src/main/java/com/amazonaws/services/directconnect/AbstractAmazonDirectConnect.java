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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonDirectConnect}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDirectConnect implements AmazonDirectConnect {

    protected AbstractAmazonDirectConnect() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateConnectionWithLagResult associateConnectionWithLag(AssociateConnectionWithLagRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateHostedConnectionResult associateHostedConnection(AssociateHostedConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateVirtualInterfaceResult associateVirtualInterface(AssociateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDirectConnectGatewayResult createDirectConnectGateway(CreateDirectConnectGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(CreateDirectConnectGatewayAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDirectConnectGatewayAssociationProposalResult createDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInterconnectResult createInterconnect(CreateInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLagResult createLag(CreateLagRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDirectConnectGatewayResult deleteDirectConnectGateway(DeleteDirectConnectGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(DeleteDirectConnectGatewayAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDirectConnectGatewayAssociationProposalResult deleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLagResult deleteLag(DeleteLagRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionsResult describeConnections() {
        return describeConnections(new DescribeConnectionsRequest());
    }

    @Override
    @Deprecated
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectConnectGatewayAssociationProposalsResult describeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(DescribeDirectConnectGatewayAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(DescribeDirectConnectGatewayAttachmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectConnectGatewaysResult describeDirectConnectGateways(DescribeDirectConnectGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHostedConnectionsResult describeHostedConnections(DescribeHostedConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects() {
        return describeInterconnects(new DescribeInterconnectsRequest());
    }

    @Override
    public DescribeLagsResult describeLags(DescribeLagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoaResult describeLoa(DescribeLoaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLocationsResult describeLocations(DescribeLocationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLocationsResult describeLocations() {
        return describeLocations(new DescribeLocationsRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways() {
        return describeVirtualGateways(new DescribeVirtualGatewaysRequest());
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }

    @Override
    public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDirectConnectGatewayAssociationResult updateDirectConnectGatewayAssociation(UpdateDirectConnectGatewayAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateLagResult updateLag(UpdateLagRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributes(UpdateVirtualInterfaceAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
