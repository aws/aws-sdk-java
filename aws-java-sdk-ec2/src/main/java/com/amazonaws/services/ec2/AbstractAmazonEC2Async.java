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
package com.amazonaws.services.ec2;

import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;

/**
 * Abstract implementation of {@code AmazonEC2Async}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEC2Async extends AbstractAmazonEC2 implements AmazonEC2Async {

    protected AbstractAmazonEC2Async() {
    }

    @Override
    public java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            AcceptReservedInstancesExchangeQuoteRequest request) {

        return acceptReservedInstancesExchangeQuoteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            AcceptReservedInstancesExchangeQuoteRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptReservedInstancesExchangeQuoteRequest, AcceptReservedInstancesExchangeQuoteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AcceptTransitGatewayVpcAttachmentResult> acceptTransitGatewayVpcAttachmentAsync(
            AcceptTransitGatewayVpcAttachmentRequest request) {

        return acceptTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptTransitGatewayVpcAttachmentResult> acceptTransitGatewayVpcAttachmentAsync(
            AcceptTransitGatewayVpcAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptTransitGatewayVpcAttachmentRequest, AcceptTransitGatewayVpcAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(AcceptVpcEndpointConnectionsRequest request) {

        return acceptVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(AcceptVpcEndpointConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptVpcEndpointConnectionsRequest, AcceptVpcEndpointConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest request) {

        return acceptVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest)
     */
    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync() {

        return acceptVpcPeeringConnectionAsync(new AcceptVpcPeeringConnectionRequest());
    }

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {

        return acceptVpcPeeringConnectionAsync(new AcceptVpcPeeringConnectionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest request) {

        return advertiseByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest request,
            com.amazonaws.handlers.AsyncHandler<AdvertiseByoipCidrRequest, AdvertiseByoipCidrResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest request) {

        return allocateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AllocateAddress operation.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest)
     */
    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync() {

        return allocateAddressAsync(new AllocateAddressRequest());
    }

    /**
     * Simplified method form for invoking the AllocateAddress operation with an AsyncHandler.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(
            com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler) {

        return allocateAddressAsync(new AllocateAddressRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(AllocateHostsRequest request) {

        return allocateHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(AllocateHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocateHostsRequest, AllocateHostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ApplySecurityGroupsToClientVpnTargetNetworkResult> applySecurityGroupsToClientVpnTargetNetworkAsync(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest request) {

        return applySecurityGroupsToClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplySecurityGroupsToClientVpnTargetNetworkResult> applySecurityGroupsToClientVpnTargetNetworkAsync(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest request,
            com.amazonaws.handlers.AsyncHandler<ApplySecurityGroupsToClientVpnTargetNetworkRequest, ApplySecurityGroupsToClientVpnTargetNetworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(AssignIpv6AddressesRequest request) {

        return assignIpv6AddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(AssignIpv6AddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssignIpv6AddressesRequest, AssignIpv6AddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest request) {

        return assignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest request) {

        return associateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateAddressRequest, AssociateAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateClientVpnTargetNetworkResult> associateClientVpnTargetNetworkAsync(
            AssociateClientVpnTargetNetworkRequest request) {

        return associateClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateClientVpnTargetNetworkResult> associateClientVpnTargetNetworkAsync(
            AssociateClientVpnTargetNetworkRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateClientVpnTargetNetworkRequest, AssociateClientVpnTargetNetworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest request) {

        return associateDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateDhcpOptionsRequest, AssociateDhcpOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(AssociateIamInstanceProfileRequest request) {

        return associateIamInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(AssociateIamInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateIamInstanceProfileRequest, AssociateIamInstanceProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest request) {

        return associateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateRouteTableRequest, AssociateRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(AssociateSubnetCidrBlockRequest request) {

        return associateSubnetCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(AssociateSubnetCidrBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateSubnetCidrBlockRequest, AssociateSubnetCidrBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateTransitGatewayRouteTableResult> associateTransitGatewayRouteTableAsync(
            AssociateTransitGatewayRouteTableRequest request) {

        return associateTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTransitGatewayRouteTableResult> associateTransitGatewayRouteTableAsync(
            AssociateTransitGatewayRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateTransitGatewayRouteTableRequest, AssociateTransitGatewayRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(AssociateVpcCidrBlockRequest request) {

        return associateVpcCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(AssociateVpcCidrBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateVpcCidrBlockRequest, AssociateVpcCidrBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest request) {

        return attachClassicLinkVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachClassicLinkVpcRequest, AttachClassicLinkVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest request) {

        return attachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachInternetGatewayRequest, AttachInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest request) {

        return attachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request) {

        return attachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest request) {

        return attachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachVpnGatewayRequest, AttachVpnGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AuthorizeClientVpnIngressResult> authorizeClientVpnIngressAsync(AuthorizeClientVpnIngressRequest request) {

        return authorizeClientVpnIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeClientVpnIngressResult> authorizeClientVpnIngressAsync(AuthorizeClientVpnIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeClientVpnIngressRequest, AuthorizeClientVpnIngressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest request) {

        return authorizeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest request) {

        return authorizeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest request) {

        return bundleInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<BundleInstanceRequest, BundleInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest request) {

        return cancelBundleTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelBundleTaskRequest, CancelBundleTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelCapacityReservationResult> cancelCapacityReservationAsync(CancelCapacityReservationRequest request) {

        return cancelCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCapacityReservationResult> cancelCapacityReservationAsync(CancelCapacityReservationRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelCapacityReservationRequest, CancelCapacityReservationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest request) {

        return cancelConversionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelConversionTaskRequest, CancelConversionTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest request) {

        return cancelImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CancelImportTask operation.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest)
     */
    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync() {

        return cancelImportTaskAsync(new CancelImportTaskRequest());
    }

    /**
     * Simplified method form for invoking the CancelImportTask operation with an AsyncHandler.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(
            com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler) {

        return cancelImportTaskAsync(new CancelImportTaskRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(CancelReservedInstancesListingRequest request) {

        return cancelReservedInstancesListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(CancelReservedInstancesListingRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelReservedInstancesListingRequest, CancelReservedInstancesListingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest request) {

        return cancelSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest request) {

        return cancelSpotInstanceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest request) {

        return confirmProductInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmProductInstanceRequest, ConfirmProductInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(CopyFpgaImageRequest request) {

        return copyFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(CopyFpgaImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyFpgaImageRequest, CopyFpgaImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest request) {

        return copyImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCapacityReservationResult> createCapacityReservationAsync(CreateCapacityReservationRequest request) {

        return createCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCapacityReservationResult> createCapacityReservationAsync(CreateCapacityReservationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCapacityReservationRequest, CreateCapacityReservationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnEndpointResult> createClientVpnEndpointAsync(CreateClientVpnEndpointRequest request) {

        return createClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnEndpointResult> createClientVpnEndpointAsync(CreateClientVpnEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClientVpnEndpointRequest, CreateClientVpnEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnRouteResult> createClientVpnRouteAsync(CreateClientVpnRouteRequest request) {

        return createClientVpnRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnRouteResult> createClientVpnRouteAsync(CreateClientVpnRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClientVpnRouteRequest, CreateClientVpnRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest request) {

        return createCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomerGatewayRequest, CreateCustomerGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(CreateDefaultSubnetRequest request) {

        return createDefaultSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(CreateDefaultSubnetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDefaultSubnetRequest, CreateDefaultSubnetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(CreateDefaultVpcRequest request) {

        return createDefaultVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(CreateDefaultVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDefaultVpcRequest, CreateDefaultVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest request) {

        return createDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            CreateEgressOnlyInternetGatewayRequest request) {

        return createEgressOnlyInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            CreateEgressOnlyInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEgressOnlyInternetGatewayRequest, CreateEgressOnlyInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest request) {

        return createFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFlowLogsRequest, CreateFlowLogsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(CreateFpgaImageRequest request) {

        return createFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(CreateFpgaImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFpgaImageRequest, CreateFpgaImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest request) {

        return createInstanceExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest request) {

        return createInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateInternetGateway operation.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync() {

        return createInternetGatewayAsync(new CreateInternetGatewayRequest());
    }

    /**
     * Simplified method form for invoking the CreateInternetGateway operation with an AsyncHandler.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(
            com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler) {

        return createInternetGatewayAsync(new CreateInternetGatewayRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request) {

        return createKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(CreateLaunchTemplateRequest request) {

        return createLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(CreateLaunchTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateRequest, CreateLaunchTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(CreateLaunchTemplateVersionRequest request) {

        return createLaunchTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(CreateLaunchTemplateVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateVersionRequest, CreateLaunchTemplateVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest request) {

        return createNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest request) {

        return createNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkAclRequest, CreateNetworkAclResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest request) {

        return createNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkAclEntryRequest, CreateNetworkAclEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest request) {

        return createNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            CreateNetworkInterfacePermissionRequest request) {

        return createNetworkInterfacePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            CreateNetworkInterfacePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfacePermissionRequest, CreateNetworkInterfacePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest request) {

        return createPlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePlacementGroupRequest, CreatePlacementGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest request) {

        return createReservedInstancesListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request) {

        return createRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest request) {

        return createRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest request) {

        return createSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityGroupRequest, CreateSecurityGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest request) {

        return createSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest request) {

        return createSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetRequest, CreateSubnetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayResult> createTransitGatewayAsync(CreateTransitGatewayRequest request) {

        return createTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayResult> createTransitGatewayAsync(CreateTransitGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRequest, CreateTransitGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteResult> createTransitGatewayRouteAsync(CreateTransitGatewayRouteRequest request) {

        return createTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteResult> createTransitGatewayRouteAsync(CreateTransitGatewayRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteRequest, CreateTransitGatewayRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableResult> createTransitGatewayRouteTableAsync(CreateTransitGatewayRouteTableRequest request) {

        return createTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableResult> createTransitGatewayRouteTableAsync(CreateTransitGatewayRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteTableRequest, CreateTransitGatewayRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayVpcAttachmentResult> createTransitGatewayVpcAttachmentAsync(
            CreateTransitGatewayVpcAttachmentRequest request) {

        return createTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayVpcAttachmentResult> createTransitGatewayVpcAttachmentAsync(
            CreateTransitGatewayVpcAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayVpcAttachmentRequest, CreateTransitGatewayVpcAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request) {

        return createVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest request) {

        return createVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpcRequest, CreateVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request) {

        return createVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            CreateVpcEndpointConnectionNotificationRequest request) {

        return createVpcEndpointConnectionNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            CreateVpcEndpointConnectionNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointConnectionNotificationRequest, CreateVpcEndpointConnectionNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            CreateVpcEndpointServiceConfigurationRequest request) {

        return createVpcEndpointServiceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            CreateVpcEndpointServiceConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointServiceConfigurationRequest, CreateVpcEndpointServiceConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest request) {

        return createVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync() {

        return createVpcPeeringConnectionAsync(new CreateVpcPeeringConnectionRequest());
    }

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {

        return createVpcPeeringConnectionAsync(new CreateVpcPeeringConnectionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest request) {

        return createVpnConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRequest, CreateVpnConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest request) {

        return createVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest request) {

        return createVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVpnGatewayRequest, CreateVpnGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnEndpointResult> deleteClientVpnEndpointAsync(DeleteClientVpnEndpointRequest request) {

        return deleteClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnEndpointResult> deleteClientVpnEndpointAsync(DeleteClientVpnEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClientVpnEndpointRequest, DeleteClientVpnEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnRouteResult> deleteClientVpnRouteAsync(DeleteClientVpnRouteRequest request) {

        return deleteClientVpnRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnRouteResult> deleteClientVpnRouteAsync(DeleteClientVpnRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClientVpnRouteRequest, DeleteClientVpnRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest request) {

        return deleteCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomerGatewayRequest, DeleteCustomerGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest request) {

        return deleteDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            DeleteEgressOnlyInternetGatewayRequest request) {

        return deleteEgressOnlyInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            DeleteEgressOnlyInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEgressOnlyInternetGatewayRequest, DeleteEgressOnlyInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetsResult> deleteFleetsAsync(DeleteFleetsRequest request) {

        return deleteFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetsResult> deleteFleetsAsync(DeleteFleetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetsRequest, DeleteFleetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest request) {

        return deleteFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowLogsRequest, DeleteFlowLogsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(DeleteFpgaImageRequest request) {

        return deleteFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(DeleteFpgaImageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFpgaImageRequest, DeleteFpgaImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest request) {

        return deleteInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(DeleteLaunchTemplateRequest request) {

        return deleteLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(DeleteLaunchTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateRequest, DeleteLaunchTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(DeleteLaunchTemplateVersionsRequest request) {

        return deleteLaunchTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(DeleteLaunchTemplateVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateVersionsRequest, DeleteLaunchTemplateVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest request) {

        return deleteNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest request) {

        return deleteNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclRequest, DeleteNetworkAclResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest request) {

        return deleteNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest request) {

        return deleteNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            DeleteNetworkInterfacePermissionRequest request) {

        return deleteNetworkInterfacePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            DeleteNetworkInterfacePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfacePermissionRequest, DeleteNetworkInterfacePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest request) {

        return deletePlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePlacementGroupRequest, DeletePlacementGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request) {

        return deleteRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest request) {

        return deleteRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {

        return deleteSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityGroupRequest, DeleteSecurityGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest request) {

        return deleteSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync() {

        return deleteSpotDatafeedSubscriptionAsync(new DeleteSpotDatafeedSubscriptionRequest());
    }

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler) {

        return deleteSpotDatafeedSubscriptionAsync(new DeleteSpotDatafeedSubscriptionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(DeleteSubnetRequest request) {

        return deleteSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(DeleteSubnetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayResult> deleteTransitGatewayAsync(DeleteTransitGatewayRequest request) {

        return deleteTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayResult> deleteTransitGatewayAsync(DeleteTransitGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRequest, DeleteTransitGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteResult> deleteTransitGatewayRouteAsync(DeleteTransitGatewayRouteRequest request) {

        return deleteTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteResult> deleteTransitGatewayRouteAsync(DeleteTransitGatewayRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRouteRequest, DeleteTransitGatewayRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteTableResult> deleteTransitGatewayRouteTableAsync(DeleteTransitGatewayRouteTableRequest request) {

        return deleteTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteTableResult> deleteTransitGatewayRouteTableAsync(DeleteTransitGatewayRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRouteTableRequest, DeleteTransitGatewayRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayVpcAttachmentResult> deleteTransitGatewayVpcAttachmentAsync(
            DeleteTransitGatewayVpcAttachmentRequest request) {

        return deleteTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayVpcAttachmentResult> deleteTransitGatewayVpcAttachmentAsync(
            DeleteTransitGatewayVpcAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayVpcAttachmentRequest, DeleteTransitGatewayVpcAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest request) {

        return deleteVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcRequest, DeleteVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            DeleteVpcEndpointConnectionNotificationsRequest request) {

        return deleteVpcEndpointConnectionNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            DeleteVpcEndpointConnectionNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointConnectionNotificationsRequest, DeleteVpcEndpointConnectionNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            DeleteVpcEndpointServiceConfigurationsRequest request) {

        return deleteVpcEndpointServiceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            DeleteVpcEndpointServiceConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointServiceConfigurationsRequest, DeleteVpcEndpointServiceConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest request) {

        return deleteVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointsRequest, DeleteVpcEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(DeleteVpcPeeringConnectionRequest request) {

        return deleteVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(DeleteVpcPeeringConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request) {

        return deleteVpnConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRequest, DeleteVpnConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest request) {

        return deleteVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest request) {

        return deleteVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVpnGatewayRequest, DeleteVpnGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest request) {

        return deprovisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest request,
            com.amazonaws.handlers.AsyncHandler<DeprovisionByoipCidrRequest, DeprovisionByoipCidrResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest request) {

        return deregisterImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterImageRequest, DeregisterImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync() {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest request) {

        return describeAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAddresses operation.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync() {

        return describeAddressesAsync(new DescribeAddressesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAddresses operation with an AsyncHandler.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        return describeAddressesAsync(new DescribeAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateIdFormatResult> describeAggregateIdFormatAsync(DescribeAggregateIdFormatRequest request) {

        return describeAggregateIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateIdFormatResult> describeAggregateIdFormatAsync(DescribeAggregateIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregateIdFormatRequest, DescribeAggregateIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest request) {

        return describeAvailabilityZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync() {

        return describeAvailabilityZonesAsync(new DescribeAvailabilityZonesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation with an AsyncHandler.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler) {

        return describeAvailabilityZonesAsync(new DescribeAvailabilityZonesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest request) {

        return describeBundleTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync() {

        return describeBundleTasksAsync(new DescribeBundleTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation with an AsyncHandler.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler) {

        return describeBundleTasksAsync(new DescribeBundleTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeByoipCidrsResult> describeByoipCidrsAsync(DescribeByoipCidrsRequest request) {

        return describeByoipCidrsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeByoipCidrsResult> describeByoipCidrsAsync(DescribeByoipCidrsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeByoipCidrsRequest, DescribeByoipCidrsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCapacityReservationsResult> describeCapacityReservationsAsync(DescribeCapacityReservationsRequest request) {

        return describeCapacityReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCapacityReservationsResult> describeCapacityReservationsAsync(DescribeCapacityReservationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCapacityReservationsRequest, DescribeCapacityReservationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest request) {

        return describeClassicLinkInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync() {

        return describeClassicLinkInstancesAsync(new DescribeClassicLinkInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation with an AsyncHandler.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {

        return describeClassicLinkInstancesAsync(new DescribeClassicLinkInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnAuthorizationRulesResult> describeClientVpnAuthorizationRulesAsync(
            DescribeClientVpnAuthorizationRulesRequest request) {

        return describeClientVpnAuthorizationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnAuthorizationRulesResult> describeClientVpnAuthorizationRulesAsync(
            DescribeClientVpnAuthorizationRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientVpnAuthorizationRulesRequest, DescribeClientVpnAuthorizationRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnConnectionsResult> describeClientVpnConnectionsAsync(DescribeClientVpnConnectionsRequest request) {

        return describeClientVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnConnectionsResult> describeClientVpnConnectionsAsync(DescribeClientVpnConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientVpnConnectionsRequest, DescribeClientVpnConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnEndpointsResult> describeClientVpnEndpointsAsync(DescribeClientVpnEndpointsRequest request) {

        return describeClientVpnEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnEndpointsResult> describeClientVpnEndpointsAsync(DescribeClientVpnEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientVpnEndpointsRequest, DescribeClientVpnEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnRoutesResult> describeClientVpnRoutesAsync(DescribeClientVpnRoutesRequest request) {

        return describeClientVpnRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnRoutesResult> describeClientVpnRoutesAsync(DescribeClientVpnRoutesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientVpnRoutesRequest, DescribeClientVpnRoutesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnTargetNetworksResult> describeClientVpnTargetNetworksAsync(
            DescribeClientVpnTargetNetworksRequest request) {

        return describeClientVpnTargetNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnTargetNetworksResult> describeClientVpnTargetNetworksAsync(
            DescribeClientVpnTargetNetworksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClientVpnTargetNetworksRequest, DescribeClientVpnTargetNetworksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest request) {

        return describeConversionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync() {

        return describeConversionTasksAsync(new DescribeConversionTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation with an AsyncHandler.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler) {

        return describeConversionTasksAsync(new DescribeConversionTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest request) {

        return describeCustomerGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync() {

        return describeCustomerGatewaysAsync(new DescribeCustomerGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation with an AsyncHandler.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler) {

        return describeCustomerGatewaysAsync(new DescribeCustomerGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest request) {

        return describeDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync() {

        return describeDhcpOptionsAsync(new DescribeDhcpOptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation with an AsyncHandler.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler) {

        return describeDhcpOptionsAsync(new DescribeDhcpOptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            DescribeEgressOnlyInternetGatewaysRequest request) {

        return describeEgressOnlyInternetGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            DescribeEgressOnlyInternetGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEgressOnlyInternetGatewaysRequest, DescribeEgressOnlyInternetGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(DescribeElasticGpusRequest request) {

        return describeElasticGpusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(DescribeElasticGpusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticGpusRequest, DescribeElasticGpusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeExportTasks operation.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync() {

        return describeExportTasksAsync(new DescribeExportTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeExportTasks operation with an AsyncHandler.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        return describeExportTasksAsync(new DescribeExportTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetHistoryResult> describeFleetHistoryAsync(DescribeFleetHistoryRequest request) {

        return describeFleetHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetHistoryResult> describeFleetHistoryAsync(DescribeFleetHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetHistoryRequest, DescribeFleetHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetInstancesResult> describeFleetInstancesAsync(DescribeFleetInstancesRequest request) {

        return describeFleetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetInstancesResult> describeFleetInstancesAsync(DescribeFleetInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetInstancesRequest, DescribeFleetInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request) {

        return describeFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest request) {

        return describeFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync() {

        return describeFlowLogsAsync(new DescribeFlowLogsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation with an AsyncHandler.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {

        return describeFlowLogsAsync(new DescribeFlowLogsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(DescribeFpgaImageAttributeRequest request) {

        return describeFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(DescribeFpgaImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFpgaImageAttributeRequest, DescribeFpgaImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(DescribeFpgaImagesRequest request) {

        return describeFpgaImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(DescribeFpgaImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFpgaImagesRequest, DescribeFpgaImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest request) {

        return describeHostReservationOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest request) {

        return describeHostReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHostReservationsRequest, DescribeHostReservationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest request) {

        return describeHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeHosts operation.
     *
     * @see #describeHostsAsync(DescribeHostsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync() {

        return describeHostsAsync(new DescribeHostsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHosts operation with an AsyncHandler.
     *
     * @see #describeHostsAsync(DescribeHostsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {

        return describeHostsAsync(new DescribeHostsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            DescribeIamInstanceProfileAssociationsRequest request) {

        return describeIamInstanceProfileAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            DescribeIamInstanceProfileAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIamInstanceProfileAssociationsRequest, DescribeIamInstanceProfileAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest request) {

        return describeIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeIdFormat operation.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync() {

        return describeIdFormatAsync(new DescribeIdFormatRequest());
    }

    /**
     * Simplified method form for invoking the DescribeIdFormat operation with an AsyncHandler.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler) {

        return describeIdFormatAsync(new DescribeIdFormatRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(DescribeIdentityIdFormatRequest request) {

        return describeIdentityIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(DescribeIdentityIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityIdFormatRequest, DescribeIdentityIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest request) {

        return describeImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImageAttributeRequest, DescribeImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeImages operation.
     *
     * @see #describeImagesAsync(DescribeImagesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync() {

        return describeImagesAsync(new DescribeImagesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImages operation with an AsyncHandler.
     *
     * @see #describeImagesAsync(DescribeImagesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        return describeImagesAsync(new DescribeImagesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(DescribeImportImageTasksRequest request) {

        return describeImportImageTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(DescribeImportImageTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync() {

        return describeImportImageTasksAsync(new DescribeImportImageTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation with an AsyncHandler.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler) {

        return describeImportImageTasksAsync(new DescribeImportImageTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest request) {

        return describeImportSnapshotTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync() {

        return describeImportSnapshotTasksAsync(new DescribeImportSnapshotTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation with an AsyncHandler.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler) {

        return describeImportSnapshotTasksAsync(new DescribeImportSnapshotTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest request) {

        return describeInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            DescribeInstanceCreditSpecificationsRequest request) {

        return describeInstanceCreditSpecificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            DescribeInstanceCreditSpecificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceCreditSpecificationsRequest, DescribeInstanceCreditSpecificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest request) {

        return describeInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync() {

        return describeInstanceStatusAsync(new DescribeInstanceStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation with an AsyncHandler.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler) {

        return describeInstanceStatusAsync(new DescribeInstanceStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeInstances operation.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync() {

        return describeInstancesAsync(new DescribeInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInstances operation with an AsyncHandler.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        return describeInstancesAsync(new DescribeInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest request) {

        return describeInternetGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync() {

        return describeInternetGatewaysAsync(new DescribeInternetGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation with an AsyncHandler.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler) {

        return describeInternetGatewaysAsync(new DescribeInternetGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest request) {

        return describeKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync() {

        return describeKeyPairsAsync(new DescribeKeyPairsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation with an AsyncHandler.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler) {

        return describeKeyPairsAsync(new DescribeKeyPairsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(DescribeLaunchTemplateVersionsRequest request) {

        return describeLaunchTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(DescribeLaunchTemplateVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplateVersionsRequest, DescribeLaunchTemplateVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(DescribeLaunchTemplatesRequest request) {

        return describeLaunchTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(DescribeLaunchTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplatesRequest, DescribeLaunchTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest request) {

        return describeMovingAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync() {

        return describeMovingAddressesAsync(new DescribeMovingAddressesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation with an AsyncHandler.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler) {

        return describeMovingAddressesAsync(new DescribeMovingAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(DescribeNatGatewaysRequest request) {

        return describeNatGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(DescribeNatGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNatGatewaysRequest, DescribeNatGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest request) {

        return describeNetworkAclsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync() {

        return describeNetworkAclsAsync(new DescribeNetworkAclsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation with an AsyncHandler.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler) {

        return describeNetworkAclsAsync(new DescribeNetworkAclsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            DescribeNetworkInterfaceAttributeRequest request) {

        return describeNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            DescribeNetworkInterfaceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            DescribeNetworkInterfacePermissionsRequest request) {

        return describeNetworkInterfacePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            DescribeNetworkInterfacePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacePermissionsRequest, DescribeNetworkInterfacePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest request) {

        return describeNetworkInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync() {

        return describeNetworkInterfacesAsync(new DescribeNetworkInterfacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation with an AsyncHandler.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler) {

        return describeNetworkInterfacesAsync(new DescribeNetworkInterfacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest request) {

        return describePlacementGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync() {

        return describePlacementGroupsAsync(new DescribePlacementGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation with an AsyncHandler.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler) {

        return describePlacementGroupsAsync(new DescribePlacementGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(DescribePrefixListsRequest request) {

        return describePrefixListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(DescribePrefixListsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribePrefixLists operation.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync() {

        return describePrefixListsAsync(new DescribePrefixListsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePrefixLists operation with an AsyncHandler.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler) {

        return describePrefixListsAsync(new DescribePrefixListsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalIdFormatResult> describePrincipalIdFormatAsync(DescribePrincipalIdFormatRequest request) {

        return describePrincipalIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalIdFormatResult> describePrincipalIdFormatAsync(DescribePrincipalIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePrincipalIdFormatRequest, DescribePrincipalIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePublicIpv4PoolsResult> describePublicIpv4PoolsAsync(DescribePublicIpv4PoolsRequest request) {

        return describePublicIpv4PoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePublicIpv4PoolsResult> describePublicIpv4PoolsAsync(DescribePublicIpv4PoolsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePublicIpv4PoolsRequest, DescribePublicIpv4PoolsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest request) {

        return describeRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeRegions operation.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync() {

        return describeRegionsAsync(new DescribeRegionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeRegions operation with an AsyncHandler.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler) {

        return describeRegionsAsync(new DescribeRegionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest request) {

        return describeReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync() {

        return describeReservedInstancesAsync(new DescribeReservedInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler) {

        return describeReservedInstancesAsync(new DescribeReservedInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            DescribeReservedInstancesListingsRequest request) {

        return describeReservedInstancesListingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            DescribeReservedInstancesListingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync() {

        return describeReservedInstancesListingsAsync(new DescribeReservedInstancesListingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler) {

        return describeReservedInstancesListingsAsync(new DescribeReservedInstancesListingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            DescribeReservedInstancesModificationsRequest request) {

        return describeReservedInstancesModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            DescribeReservedInstancesModificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync() {

        return describeReservedInstancesModificationsAsync(new DescribeReservedInstancesModificationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler) {

        return describeReservedInstancesModificationsAsync(new DescribeReservedInstancesModificationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            DescribeReservedInstancesOfferingsRequest request) {

        return describeReservedInstancesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            DescribeReservedInstancesOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync() {

        return describeReservedInstancesOfferingsAsync(new DescribeReservedInstancesOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler) {

        return describeReservedInstancesOfferingsAsync(new DescribeReservedInstancesOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest request) {

        return describeRouteTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeRouteTables operation.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync() {

        return describeRouteTablesAsync(new DescribeRouteTablesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeRouteTables operation with an AsyncHandler.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler) {

        return describeRouteTablesAsync(new DescribeRouteTablesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            DescribeScheduledInstanceAvailabilityRequest request) {

        return describeScheduledInstanceAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            DescribeScheduledInstanceAvailabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstanceAvailabilityRequest, DescribeScheduledInstanceAvailabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(DescribeScheduledInstancesRequest request) {

        return describeScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(DescribeScheduledInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstancesRequest, DescribeScheduledInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest request) {

        return describeSecurityGroupReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest request) {

        return describeSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync() {

        return describeSecurityGroupsAsync(new DescribeSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler) {

        return describeSecurityGroupsAsync(new DescribeSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest request) {

        return describeSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            DescribeSpotDatafeedSubscriptionRequest request) {

        return describeSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            DescribeSpotDatafeedSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync() {

        return describeSpotDatafeedSubscriptionAsync(new DescribeSpotDatafeedSubscriptionRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler) {

        return describeSpotDatafeedSubscriptionAsync(new DescribeSpotDatafeedSubscriptionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(DescribeSpotFleetInstancesRequest request) {

        return describeSpotFleetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(DescribeSpotFleetInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetInstancesRequest, DescribeSpotFleetInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest request) {

        return describeSpotFleetRequestHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest request) {

        return describeSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync() {

        return describeSpotFleetRequestsAsync(new DescribeSpotFleetRequestsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation with an AsyncHandler.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler) {

        return describeSpotFleetRequestsAsync(new DescribeSpotFleetRequestsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest request) {

        return describeSpotInstanceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync() {

        return describeSpotInstanceRequestsAsync(new DescribeSpotInstanceRequestsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation with an AsyncHandler.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler) {

        return describeSpotInstanceRequestsAsync(new DescribeSpotInstanceRequestsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest request) {

        return describeSpotPriceHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync() {

        return describeSpotPriceHistoryAsync(new DescribeSpotPriceHistoryRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation with an AsyncHandler.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler) {

        return describeSpotPriceHistoryAsync(new DescribeSpotPriceHistoryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(DescribeStaleSecurityGroupsRequest request) {

        return describeStaleSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(DescribeStaleSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStaleSecurityGroupsRequest, DescribeStaleSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest request) {

        return describeSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSubnets operation.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync() {

        return describeSubnetsAsync(new DescribeSubnetsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSubnets operation with an AsyncHandler.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler) {

        return describeSubnetsAsync(new DescribeSubnetsRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayAttachmentsResult> describeTransitGatewayAttachmentsAsync(
            DescribeTransitGatewayAttachmentsRequest request) {

        return describeTransitGatewayAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayAttachmentsResult> describeTransitGatewayAttachmentsAsync(
            DescribeTransitGatewayAttachmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayAttachmentsRequest, DescribeTransitGatewayAttachmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayRouteTablesResult> describeTransitGatewayRouteTablesAsync(
            DescribeTransitGatewayRouteTablesRequest request) {

        return describeTransitGatewayRouteTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayRouteTablesResult> describeTransitGatewayRouteTablesAsync(
            DescribeTransitGatewayRouteTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayRouteTablesRequest, DescribeTransitGatewayRouteTablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayVpcAttachmentsResult> describeTransitGatewayVpcAttachmentsAsync(
            DescribeTransitGatewayVpcAttachmentsRequest request) {

        return describeTransitGatewayVpcAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayVpcAttachmentsResult> describeTransitGatewayVpcAttachmentsAsync(
            DescribeTransitGatewayVpcAttachmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayVpcAttachmentsRequest, DescribeTransitGatewayVpcAttachmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewaysResult> describeTransitGatewaysAsync(DescribeTransitGatewaysRequest request) {

        return describeTransitGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewaysResult> describeTransitGatewaysAsync(DescribeTransitGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewaysRequest, DescribeTransitGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest request) {

        return describeVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest request) {

        return describeVolumeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync() {

        return describeVolumeStatusAsync(new DescribeVolumeStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation with an AsyncHandler.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler) {

        return describeVolumeStatusAsync(new DescribeVolumeStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVolumes operation.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync() {

        return describeVolumesAsync(new DescribeVolumesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVolumes operation with an AsyncHandler.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        return describeVolumesAsync(new DescribeVolumesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(DescribeVolumesModificationsRequest request) {

        return describeVolumesModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(DescribeVolumesModificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesModificationsRequest, DescribeVolumesModificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest request) {

        return describeVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcAttributeRequest, DescribeVpcAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest request) {

        return describeVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync() {

        return describeVpcClassicLinkAsync(new DescribeVpcClassicLinkRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation with an AsyncHandler.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler) {

        return describeVpcClassicLinkAsync(new DescribeVpcClassicLinkRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            DescribeVpcClassicLinkDnsSupportRequest request) {

        return describeVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            DescribeVpcClassicLinkDnsSupportRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkDnsSupportRequest, DescribeVpcClassicLinkDnsSupportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            DescribeVpcEndpointConnectionNotificationsRequest request) {

        return describeVpcEndpointConnectionNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            DescribeVpcEndpointConnectionNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionNotificationsRequest, DescribeVpcEndpointConnectionNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(DescribeVpcEndpointConnectionsRequest request) {

        return describeVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(DescribeVpcEndpointConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionsRequest, DescribeVpcEndpointConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            DescribeVpcEndpointServiceConfigurationsRequest request) {

        return describeVpcEndpointServiceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            DescribeVpcEndpointServiceConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServiceConfigurationsRequest, DescribeVpcEndpointServiceConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            DescribeVpcEndpointServicePermissionsRequest request) {

        return describeVpcEndpointServicePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            DescribeVpcEndpointServicePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicePermissionsRequest, DescribeVpcEndpointServicePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest request) {

        return describeVpcEndpointServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync() {

        return describeVpcEndpointServicesAsync(new DescribeVpcEndpointServicesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler) {

        return describeVpcEndpointServicesAsync(new DescribeVpcEndpointServicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest request) {

        return describeVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync() {

        return describeVpcEndpointsAsync(new DescribeVpcEndpointsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler) {

        return describeVpcEndpointsAsync(new DescribeVpcEndpointsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest request) {

        return describeVpcPeeringConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync() {

        return describeVpcPeeringConnectionsAsync(new DescribeVpcPeeringConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation with an AsyncHandler.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler) {

        return describeVpcPeeringConnectionsAsync(new DescribeVpcPeeringConnectionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest request) {

        return describeVpcsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpcs operation.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync() {

        return describeVpcsAsync(new DescribeVpcsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcs operation with an AsyncHandler.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler) {

        return describeVpcsAsync(new DescribeVpcsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest request) {

        return describeVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync() {

        return describeVpnConnectionsAsync(new DescribeVpnConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation with an AsyncHandler.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler) {

        return describeVpnConnectionsAsync(new DescribeVpnConnectionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest request) {

        return describeVpnGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync() {

        return describeVpnGatewaysAsync(new DescribeVpnGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation with an AsyncHandler.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler) {

        return describeVpnGatewaysAsync(new DescribeVpnGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(DetachClassicLinkVpcRequest request) {

        return detachClassicLinkVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(DetachClassicLinkVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachClassicLinkVpcRequest, DetachClassicLinkVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest request) {

        return detachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachInternetGatewayRequest, DetachInternetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest request) {

        return detachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachNetworkInterfaceRequest, DetachNetworkInterfaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request) {

        return detachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest request) {

        return detachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachVpnGatewayRequest, DetachVpnGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableTransitGatewayRouteTablePropagationResult> disableTransitGatewayRouteTablePropagationAsync(
            DisableTransitGatewayRouteTablePropagationRequest request) {

        return disableTransitGatewayRouteTablePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableTransitGatewayRouteTablePropagationResult> disableTransitGatewayRouteTablePropagationAsync(
            DisableTransitGatewayRouteTablePropagationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableTransitGatewayRouteTablePropagationRequest, DisableTransitGatewayRouteTablePropagationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest request) {

        return disableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest request) {

        return disableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkRequest, DisableVpcClassicLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest request) {

        return disableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest request) {

        return disassociateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateAddressRequest, DisassociateAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateClientVpnTargetNetworkResult> disassociateClientVpnTargetNetworkAsync(
            DisassociateClientVpnTargetNetworkRequest request) {

        return disassociateClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateClientVpnTargetNetworkResult> disassociateClientVpnTargetNetworkAsync(
            DisassociateClientVpnTargetNetworkRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateClientVpnTargetNetworkRequest, DisassociateClientVpnTargetNetworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(DisassociateIamInstanceProfileRequest request) {

        return disassociateIamInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(DisassociateIamInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateIamInstanceProfileRequest, DisassociateIamInstanceProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest request) {

        return disassociateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateRouteTableRequest, DisassociateRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(DisassociateSubnetCidrBlockRequest request) {

        return disassociateSubnetCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(DisassociateSubnetCidrBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateSubnetCidrBlockRequest, DisassociateSubnetCidrBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateTransitGatewayRouteTableResult> disassociateTransitGatewayRouteTableAsync(
            DisassociateTransitGatewayRouteTableRequest request) {

        return disassociateTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTransitGatewayRouteTableResult> disassociateTransitGatewayRouteTableAsync(
            DisassociateTransitGatewayRouteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateTransitGatewayRouteTableRequest, DisassociateTransitGatewayRouteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(DisassociateVpcCidrBlockRequest request) {

        return disassociateVpcCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(DisassociateVpcCidrBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateVpcCidrBlockRequest, DisassociateVpcCidrBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableTransitGatewayRouteTablePropagationResult> enableTransitGatewayRouteTablePropagationAsync(
            EnableTransitGatewayRouteTablePropagationRequest request) {

        return enableTransitGatewayRouteTablePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableTransitGatewayRouteTablePropagationResult> enableTransitGatewayRouteTablePropagationAsync(
            EnableTransitGatewayRouteTablePropagationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableTransitGatewayRouteTablePropagationRequest, EnableTransitGatewayRouteTablePropagationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest request) {

        return enableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest request) {

        return enableVolumeIOAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest request,
            com.amazonaws.handlers.AsyncHandler<EnableVolumeIORequest, EnableVolumeIOResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest request) {

        return enableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkRequest, EnableVpcClassicLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(EnableVpcClassicLinkDnsSupportRequest request) {

        return enableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(EnableVpcClassicLinkDnsSupportRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientCertificateRevocationListResult> exportClientVpnClientCertificateRevocationListAsync(
            ExportClientVpnClientCertificateRevocationListRequest request) {

        return exportClientVpnClientCertificateRevocationListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientCertificateRevocationListResult> exportClientVpnClientCertificateRevocationListAsync(
            ExportClientVpnClientCertificateRevocationListRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportClientVpnClientCertificateRevocationListRequest, ExportClientVpnClientCertificateRevocationListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientConfigurationResult> exportClientVpnClientConfigurationAsync(
            ExportClientVpnClientConfigurationRequest request) {

        return exportClientVpnClientConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientConfigurationResult> exportClientVpnClientConfigurationAsync(
            ExportClientVpnClientConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportClientVpnClientConfigurationRequest, ExportClientVpnClientConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportTransitGatewayRoutesResult> exportTransitGatewayRoutesAsync(ExportTransitGatewayRoutesRequest request) {

        return exportTransitGatewayRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportTransitGatewayRoutesResult> exportTransitGatewayRoutesAsync(ExportTransitGatewayRoutesRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportTransitGatewayRoutesRequest, ExportTransitGatewayRoutesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest request) {

        return getConsoleOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConsoleOutputRequest, GetConsoleOutputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest request) {

        return getConsoleScreenshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConsoleScreenshotRequest, GetConsoleScreenshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest request) {

        return getHostReservationPurchasePreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(GetLaunchTemplateDataRequest request) {

        return getLaunchTemplateDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(GetLaunchTemplateDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLaunchTemplateDataRequest, GetLaunchTemplateDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest request) {

        return getPasswordDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPasswordDataRequest, GetPasswordDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest request) {

        return getReservedInstancesExchangeQuoteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayAttachmentPropagationsResult> getTransitGatewayAttachmentPropagationsAsync(
            GetTransitGatewayAttachmentPropagationsRequest request) {

        return getTransitGatewayAttachmentPropagationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayAttachmentPropagationsResult> getTransitGatewayAttachmentPropagationsAsync(
            GetTransitGatewayAttachmentPropagationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayAttachmentPropagationsRequest, GetTransitGatewayAttachmentPropagationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAssociationsResult> getTransitGatewayRouteTableAssociationsAsync(
            GetTransitGatewayRouteTableAssociationsRequest request) {

        return getTransitGatewayRouteTableAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAssociationsResult> getTransitGatewayRouteTableAssociationsAsync(
            GetTransitGatewayRouteTableAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTableAssociationsRequest, GetTransitGatewayRouteTableAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTablePropagationsResult> getTransitGatewayRouteTablePropagationsAsync(
            GetTransitGatewayRouteTablePropagationsRequest request) {

        return getTransitGatewayRouteTablePropagationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTablePropagationsResult> getTransitGatewayRouteTablePropagationsAsync(
            GetTransitGatewayRouteTablePropagationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTablePropagationsRequest, GetTransitGatewayRouteTablePropagationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportClientVpnClientCertificateRevocationListResult> importClientVpnClientCertificateRevocationListAsync(
            ImportClientVpnClientCertificateRevocationListRequest request) {

        return importClientVpnClientCertificateRevocationListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportClientVpnClientCertificateRevocationListResult> importClientVpnClientCertificateRevocationListAsync(
            ImportClientVpnClientCertificateRevocationListRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportClientVpnClientCertificateRevocationListRequest, ImportClientVpnClientCertificateRevocationListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest request) {

        return importImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ImportImage operation.
     *
     * @see #importImageAsync(ImportImageRequest)
     */
    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync() {

        return importImageAsync(new ImportImageRequest());
    }

    /**
     * Simplified method form for invoking the ImportImage operation with an AsyncHandler.
     *
     * @see #importImageAsync(ImportImageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(
            com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler) {

        return importImageAsync(new ImportImageRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest request) {

        return importInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportInstanceRequest, ImportInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest request) {

        return importSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ImportSnapshot operation.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest)
     */
    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync() {

        return importSnapshotAsync(new ImportSnapshotRequest());
    }

    /**
     * Simplified method form for invoking the ImportSnapshot operation with an AsyncHandler.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(
            com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler) {

        return importSnapshotAsync(new ImportSnapshotRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest request) {

        return importVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportVolumeRequest, ImportVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyCapacityReservationResult> modifyCapacityReservationAsync(ModifyCapacityReservationRequest request) {

        return modifyCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyCapacityReservationResult> modifyCapacityReservationAsync(ModifyCapacityReservationRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyCapacityReservationRequest, ModifyCapacityReservationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyClientVpnEndpointResult> modifyClientVpnEndpointAsync(ModifyClientVpnEndpointRequest request) {

        return modifyClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClientVpnEndpointResult> modifyClientVpnEndpointAsync(ModifyClientVpnEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClientVpnEndpointRequest, ModifyClientVpnEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyFleetResult> modifyFleetAsync(ModifyFleetRequest request) {

        return modifyFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyFleetResult> modifyFleetAsync(ModifyFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyFleetRequest, ModifyFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(ModifyFpgaImageAttributeRequest request) {

        return modifyFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(ModifyFpgaImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyFpgaImageAttributeRequest, ModifyFpgaImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest request) {

        return modifyHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyHostsRequest, ModifyHostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest request) {

        return modifyIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyIdFormatRequest, ModifyIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest request) {

        return modifyIdentityIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest request) {

        return modifyImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyImageAttributeRequest, ModifyImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest request) {

        return modifyInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceAttributeRequest, ModifyInstanceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCapacityReservationAttributesResult> modifyInstanceCapacityReservationAttributesAsync(
            ModifyInstanceCapacityReservationAttributesRequest request) {

        return modifyInstanceCapacityReservationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCapacityReservationAttributesResult> modifyInstanceCapacityReservationAttributesAsync(
            ModifyInstanceCapacityReservationAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceCapacityReservationAttributesRequest, ModifyInstanceCapacityReservationAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            ModifyInstanceCreditSpecificationRequest request) {

        return modifyInstanceCreditSpecificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            ModifyInstanceCreditSpecificationRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceCreditSpecificationRequest, ModifyInstanceCreditSpecificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceEventStartTimeResult> modifyInstanceEventStartTimeAsync(ModifyInstanceEventStartTimeRequest request) {

        return modifyInstanceEventStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceEventStartTimeResult> modifyInstanceEventStartTimeAsync(ModifyInstanceEventStartTimeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceEventStartTimeRequest, ModifyInstanceEventStartTimeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest request) {

        return modifyInstancePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstancePlacementRequest, ModifyInstancePlacementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(ModifyLaunchTemplateRequest request) {

        return modifyLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(ModifyLaunchTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyLaunchTemplateRequest, ModifyLaunchTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest request) {

        return modifyNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest request) {

        return modifyReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyReservedInstancesRequest, ModifyReservedInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest request) {

        return modifySnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotAttributeRequest, ModifySnapshotAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest request) {

        return modifySpotFleetRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySpotFleetRequestRequest, ModifySpotFleetRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest request) {

        return modifySubnetAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySubnetAttributeRequest, ModifySubnetAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyTransitGatewayVpcAttachmentResult> modifyTransitGatewayVpcAttachmentAsync(
            ModifyTransitGatewayVpcAttachmentRequest request) {

        return modifyTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyTransitGatewayVpcAttachmentResult> modifyTransitGatewayVpcAttachmentAsync(
            ModifyTransitGatewayVpcAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyTransitGatewayVpcAttachmentRequest, ModifyTransitGatewayVpcAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(ModifyVolumeRequest request) {

        return modifyVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(ModifyVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVolumeRequest, ModifyVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest request) {

        return modifyVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVolumeAttributeRequest, ModifyVolumeAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest request) {

        return modifyVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcAttributeRequest, ModifyVpcAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest request) {

        return modifyVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointRequest, ModifyVpcEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            ModifyVpcEndpointConnectionNotificationRequest request) {

        return modifyVpcEndpointConnectionNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            ModifyVpcEndpointConnectionNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointConnectionNotificationRequest, ModifyVpcEndpointConnectionNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            ModifyVpcEndpointServiceConfigurationRequest request) {

        return modifyVpcEndpointServiceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            ModifyVpcEndpointServiceConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServiceConfigurationRequest, ModifyVpcEndpointServiceConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            ModifyVpcEndpointServicePermissionsRequest request) {

        return modifyVpcEndpointServicePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            ModifyVpcEndpointServicePermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServicePermissionsRequest, ModifyVpcEndpointServicePermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest request) {

        return modifyVpcPeeringConnectionOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(ModifyVpcTenancyRequest request) {

        return modifyVpcTenancyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(ModifyVpcTenancyRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyVpcTenancyRequest, ModifyVpcTenancyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest request) {

        return monitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<MonitorInstancesRequest, MonitorInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest request) {

        return moveAddressToVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<MoveAddressToVpcRequest, MoveAddressToVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest request) {

        return provisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest request,
            com.amazonaws.handlers.AsyncHandler<ProvisionByoipCidrRequest, ProvisionByoipCidrResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest request) {

        return purchaseHostReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseHostReservationRequest, PurchaseHostReservationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest request) {

        return purchaseReservedInstancesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(PurchaseScheduledInstancesRequest request) {

        return purchaseScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(PurchaseScheduledInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest request) {

        return rebootInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootInstancesRequest, RebootInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest request) {

        return registerImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterImageRequest, RegisterImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectTransitGatewayVpcAttachmentResult> rejectTransitGatewayVpcAttachmentAsync(
            RejectTransitGatewayVpcAttachmentRequest request) {

        return rejectTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectTransitGatewayVpcAttachmentResult> rejectTransitGatewayVpcAttachmentAsync(
            RejectTransitGatewayVpcAttachmentRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectTransitGatewayVpcAttachmentRequest, RejectTransitGatewayVpcAttachmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(RejectVpcEndpointConnectionsRequest request) {

        return rejectVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(RejectVpcEndpointConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectVpcEndpointConnectionsRequest, RejectVpcEndpointConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(RejectVpcPeeringConnectionRequest request) {

        return rejectVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(RejectVpcPeeringConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest request) {

        return releaseAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<ReleaseAddressRequest, ReleaseAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest request) {

        return releaseHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<ReleaseHostsRequest, ReleaseHostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            ReplaceIamInstanceProfileAssociationRequest request) {

        return replaceIamInstanceProfileAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            ReplaceIamInstanceProfileAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceIamInstanceProfileAssociationRequest, ReplaceIamInstanceProfileAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest request) {

        return replaceNetworkAclAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest request) {

        return replaceNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest request) {

        return replaceRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceRouteRequest, ReplaceRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest request) {

        return replaceRouteTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplaceTransitGatewayRouteResult> replaceTransitGatewayRouteAsync(ReplaceTransitGatewayRouteRequest request) {

        return replaceTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceTransitGatewayRouteResult> replaceTransitGatewayRouteAsync(ReplaceTransitGatewayRouteRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceTransitGatewayRouteRequest, ReplaceTransitGatewayRouteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest request) {

        return reportInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<ReportInstanceStatusRequest, ReportInstanceStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest request) {

        return requestSpotFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestSpotFleetRequest, RequestSpotFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest request) {

        return requestSpotInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestSpotInstancesRequest, RequestSpotInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(ResetFpgaImageAttributeRequest request) {

        return resetFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(ResetFpgaImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetFpgaImageAttributeRequest, ResetFpgaImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest request) {

        return resetImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetImageAttributeRequest, ResetImageAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest request) {

        return resetInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetInstanceAttributeRequest, ResetInstanceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest request) {

        return resetNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest request) {

        return resetSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetSnapshotAttributeRequest, ResetSnapshotAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest request) {

        return restoreAddressToClassicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreAddressToClassicRequest, RestoreAddressToClassicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokeClientVpnIngressResult> revokeClientVpnIngressAsync(RevokeClientVpnIngressRequest request) {

        return revokeClientVpnIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeClientVpnIngressResult> revokeClientVpnIngressAsync(RevokeClientVpnIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeClientVpnIngressRequest, RevokeClientVpnIngressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest request) {

        return revokeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest request) {

        return revokeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync() {

        return revokeSecurityGroupIngressAsync(new RevokeSecurityGroupIngressRequest());
    }

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation with an AsyncHandler.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler) {

        return revokeSecurityGroupIngressAsync(new RevokeSecurityGroupIngressRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest request) {

        return runInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<RunInstancesRequest, RunInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest request) {

        return runScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<RunScheduledInstancesRequest, RunScheduledInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchTransitGatewayRoutesResult> searchTransitGatewayRoutesAsync(SearchTransitGatewayRoutesRequest request) {

        return searchTransitGatewayRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTransitGatewayRoutesResult> searchTransitGatewayRoutesAsync(SearchTransitGatewayRoutesRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchTransitGatewayRoutesRequest, SearchTransitGatewayRoutesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest request) {

        return startInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<StartInstancesRequest, StartInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest request) {

        return stopInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<StopInstancesRequest, StopInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateClientVpnConnectionsResult> terminateClientVpnConnectionsAsync(TerminateClientVpnConnectionsRequest request) {

        return terminateClientVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateClientVpnConnectionsResult> terminateClientVpnConnectionsAsync(TerminateClientVpnConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateClientVpnConnectionsRequest, TerminateClientVpnConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest request) {

        return terminateInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateInstancesRequest, TerminateInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(UnassignIpv6AddressesRequest request) {

        return unassignIpv6AddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(UnassignIpv6AddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<UnassignIpv6AddressesRequest, UnassignIpv6AddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest request) {

        return unassignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest request) {

        return unmonitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<UnmonitorInstancesRequest, UnmonitorInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            UpdateSecurityGroupRuleDescriptionsEgressRequest request) {

        return updateSecurityGroupRuleDescriptionsEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            UpdateSecurityGroupRuleDescriptionsEgressRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsEgressRequest, UpdateSecurityGroupRuleDescriptionsEgressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            UpdateSecurityGroupRuleDescriptionsIngressRequest request) {

        return updateSecurityGroupRuleDescriptionsIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            UpdateSecurityGroupRuleDescriptionsIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsIngressRequest, UpdateSecurityGroupRuleDescriptionsIngressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest request) {

        return withdrawByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest request,
            com.amazonaws.handlers.AsyncHandler<WithdrawByoipCidrRequest, WithdrawByoipCidrResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
