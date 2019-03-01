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
import com.amazonaws.*;
import com.amazonaws.services.ec2.waiters.AmazonEC2Waiters;

/**
 * Abstract implementation of {@code AmazonEC2}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEC2 implements AmazonEC2 {

    protected AbstractAmazonEC2() {
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
    public AcceptReservedInstancesExchangeQuoteResult acceptReservedInstancesExchangeQuote(AcceptReservedInstancesExchangeQuoteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcceptTransitGatewayVpcAttachmentResult acceptTransitGatewayVpcAttachment(AcceptTransitGatewayVpcAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcceptVpcEndpointConnectionsResult acceptVpcEndpointConnections(AcceptVpcEndpointConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection() {
        return acceptVpcPeeringConnection(new AcceptVpcPeeringConnectionRequest());
    }

    @Override
    public AdvertiseByoipCidrResult advertiseByoipCidr(AdvertiseByoipCidrRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocateAddressResult allocateAddress(AllocateAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocateAddressResult allocateAddress() {
        return allocateAddress(new AllocateAddressRequest());
    }

    @Override
    public AllocateHostsResult allocateHosts(AllocateHostsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ApplySecurityGroupsToClientVpnTargetNetworkResult applySecurityGroupsToClientVpnTargetNetwork(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssignIpv6AddressesResult assignIpv6Addresses(AssignIpv6AddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssignPrivateIpAddressesResult assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateAddressResult associateAddress(AssociateAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateClientVpnTargetNetworkResult associateClientVpnTargetNetwork(AssociateClientVpnTargetNetworkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateDhcpOptionsResult associateDhcpOptions(AssociateDhcpOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateIamInstanceProfileResult associateIamInstanceProfile(AssociateIamInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateSubnetCidrBlockResult associateSubnetCidrBlock(AssociateSubnetCidrBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateTransitGatewayRouteTableResult associateTransitGatewayRouteTable(AssociateTransitGatewayRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateVpcCidrBlockResult associateVpcCidrBlock(AssociateVpcCidrBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachClassicLinkVpcResult attachClassicLinkVpc(AttachClassicLinkVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachInternetGatewayResult attachInternetGateway(AttachInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachVolumeResult attachVolume(AttachVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AuthorizeClientVpnIngressResult authorizeClientVpnIngress(AuthorizeClientVpnIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AuthorizeSecurityGroupEgressResult authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BundleInstanceResult bundleInstance(BundleInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelCapacityReservationResult cancelCapacityReservation(CancelCapacityReservationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelConversionTaskResult cancelConversionTask(CancelConversionTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelImportTaskResult cancelImportTask(CancelImportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelImportTaskResult cancelImportTask() {
        return cancelImportTask(new CancelImportTaskRequest());
    }

    @Override
    public CancelReservedInstancesListingResult cancelReservedInstancesListing(CancelReservedInstancesListingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelSpotFleetRequestsResult cancelSpotFleetRequests(CancelSpotFleetRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CopyFpgaImageResult copyFpgaImage(CopyFpgaImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CopyImageResult copyImage(CopyImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CopySnapshotResult copySnapshot(CopySnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCapacityReservationResult createCapacityReservation(CreateCapacityReservationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClientVpnEndpointResult createClientVpnEndpoint(CreateClientVpnEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClientVpnRouteResult createClientVpnRoute(CreateClientVpnRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDefaultSubnetResult createDefaultSubnet(CreateDefaultSubnetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDefaultVpcResult createDefaultVpc(CreateDefaultVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEgressOnlyInternetGatewayResult createEgressOnlyInternetGateway(CreateEgressOnlyInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFlowLogsResult createFlowLogs(CreateFlowLogsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFpgaImageResult createFpgaImage(CreateFpgaImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateImageResult createImage(CreateImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstanceExportTaskResult createInstanceExportTask(CreateInstanceExportTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInternetGatewayResult createInternetGateway() {
        return createInternetGateway(new CreateInternetGatewayRequest());
    }

    @Override
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLaunchTemplateResult createLaunchTemplate(CreateLaunchTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLaunchTemplateVersionResult createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNatGatewayResult createNatGateway(CreateNatGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNetworkAclEntryResult createNetworkAclEntry(CreateNetworkAclEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateNetworkInterfacePermissionResult createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePlacementGroupResult createPlacementGroup(CreatePlacementGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReservedInstancesListingResult createReservedInstancesListing(CreateReservedInstancesListingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRouteResult createRoute(CreateRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRouteTableResult createRouteTable(CreateRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSubnetResult createSubnet(CreateSubnetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTransitGatewayResult createTransitGateway(CreateTransitGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTransitGatewayRouteResult createTransitGatewayRoute(CreateTransitGatewayRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTransitGatewayRouteTableResult createTransitGatewayRouteTable(CreateTransitGatewayRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTransitGatewayVpcAttachmentResult createTransitGatewayVpcAttachment(CreateTransitGatewayVpcAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVolumeResult createVolume(CreateVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcResult createVpc(CreateVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcEndpointConnectionNotificationResult createVpcEndpointConnectionNotification(CreateVpcEndpointConnectionNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcEndpointServiceConfigurationResult createVpcEndpointServiceConfiguration(CreateVpcEndpointServiceConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection() {
        return createVpcPeeringConnection(new CreateVpcPeeringConnectionRequest());
    }

    @Override
    public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpnConnectionRouteResult createVpnConnectionRoute(CreateVpnConnectionRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClientVpnEndpointResult deleteClientVpnEndpoint(DeleteClientVpnEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClientVpnRouteResult deleteClientVpnRoute(DeleteClientVpnRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCustomerGatewayResult deleteCustomerGateway(DeleteCustomerGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDhcpOptionsResult deleteDhcpOptions(DeleteDhcpOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEgressOnlyInternetGatewayResult deleteEgressOnlyInternetGateway(DeleteEgressOnlyInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFleetsResult deleteFleets(DeleteFleetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFlowLogsResult deleteFlowLogs(DeleteFlowLogsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFpgaImageResult deleteFpgaImage(DeleteFpgaImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInternetGatewayResult deleteInternetGateway(DeleteInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLaunchTemplateResult deleteLaunchTemplate(DeleteLaunchTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLaunchTemplateVersionsResult deleteLaunchTemplateVersions(DeleteLaunchTemplateVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNetworkAclResult deleteNetworkAcl(DeleteNetworkAclRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNetworkInterfaceResult deleteNetworkInterface(DeleteNetworkInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNetworkInterfacePermissionResult deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePlacementGroupResult deletePlacementGroup(DeletePlacementGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRouteResult deleteRoute(DeleteRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription() {
        return deleteSpotDatafeedSubscription(new DeleteSpotDatafeedSubscriptionRequest());
    }

    @Override
    public DeleteSubnetResult deleteSubnet(DeleteSubnetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTransitGatewayRouteResult deleteTransitGatewayRoute(DeleteTransitGatewayRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTransitGatewayRouteTableResult deleteTransitGatewayRouteTable(DeleteTransitGatewayRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTransitGatewayVpcAttachmentResult deleteTransitGatewayVpcAttachment(DeleteTransitGatewayVpcAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpcResult deleteVpc(DeleteVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpcEndpointConnectionNotificationsResult deleteVpcEndpointConnectionNotifications(DeleteVpcEndpointConnectionNotificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpcEndpointServiceConfigurationsResult deleteVpcEndpointServiceConfigurations(DeleteVpcEndpointServiceConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpcEndpointsResult deleteVpcEndpoints(DeleteVpcEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpnConnectionResult deleteVpnConnection(DeleteVpnConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpnConnectionRouteResult deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVpnGatewayResult deleteVpnGateway(DeleteVpnGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeprovisionByoipCidrResult deprovisionByoipCidr(DeprovisionByoipCidrRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterImageResult deregisterImage(DeregisterImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes() {
        return describeAccountAttributes(new DescribeAccountAttributesRequest());
    }

    @Override
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAddressesResult describeAddresses() {
        return describeAddresses(new DescribeAddressesRequest());
    }

    @Override
    public DescribeAggregateIdFormatResult describeAggregateIdFormat(DescribeAggregateIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAvailabilityZonesResult describeAvailabilityZones() {
        return describeAvailabilityZones(new DescribeAvailabilityZonesRequest());
    }

    @Override
    public DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBundleTasksResult describeBundleTasks() {
        return describeBundleTasks(new DescribeBundleTasksRequest());
    }

    @Override
    public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCapacityReservationsResult describeCapacityReservations(DescribeCapacityReservationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClassicLinkInstancesResult describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClassicLinkInstancesResult describeClassicLinkInstances() {
        return describeClassicLinkInstances(new DescribeClassicLinkInstancesRequest());
    }

    @Override
    public DescribeClientVpnAuthorizationRulesResult describeClientVpnAuthorizationRules(DescribeClientVpnAuthorizationRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClientVpnEndpointsResult describeClientVpnEndpoints(DescribeClientVpnEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClientVpnRoutesResult describeClientVpnRoutes(DescribeClientVpnRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClientVpnTargetNetworksResult describeClientVpnTargetNetworks(DescribeClientVpnTargetNetworksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConversionTasksResult describeConversionTasks() {
        return describeConversionTasks(new DescribeConversionTasksRequest());
    }

    @Override
    public DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCustomerGatewaysResult describeCustomerGateways() {
        return describeCustomerGateways(new DescribeCustomerGatewaysRequest());
    }

    @Override
    public DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDhcpOptionsResult describeDhcpOptions() {
        return describeDhcpOptions(new DescribeDhcpOptionsRequest());
    }

    @Override
    public DescribeEgressOnlyInternetGatewaysResult describeEgressOnlyInternetGateways(DescribeEgressOnlyInternetGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticGpusResult describeElasticGpus(DescribeElasticGpusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeExportTasksResult describeExportTasks() {
        return describeExportTasks(new DescribeExportTasksRequest());
    }

    @Override
    public DescribeFleetHistoryResult describeFleetHistory(DescribeFleetHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFleetInstancesResult describeFleetInstances(DescribeFleetInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFleetsResult describeFleets(DescribeFleetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFlowLogsResult describeFlowLogs(DescribeFlowLogsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFlowLogsResult describeFlowLogs() {
        return describeFlowLogs(new DescribeFlowLogsRequest());
    }

    @Override
    public DescribeFpgaImageAttributeResult describeFpgaImageAttribute(DescribeFpgaImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFpgaImagesResult describeFpgaImages(DescribeFpgaImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHostReservationOfferingsResult describeHostReservationOfferings(DescribeHostReservationOfferingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHostReservationsResult describeHostReservations(DescribeHostReservationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHostsResult describeHosts(DescribeHostsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHostsResult describeHosts() {
        return describeHosts(new DescribeHostsRequest());
    }

    @Override
    public DescribeIamInstanceProfileAssociationsResult describeIamInstanceProfileAssociations(DescribeIamInstanceProfileAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIdFormatResult describeIdFormat(DescribeIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIdFormatResult describeIdFormat() {
        return describeIdFormat(new DescribeIdFormatRequest());
    }

    @Override
    public DescribeIdentityIdFormatResult describeIdentityIdFormat(DescribeIdentityIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages() {
        return describeImages(new DescribeImagesRequest());
    }

    @Override
    public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImportImageTasksResult describeImportImageTasks() {
        return describeImportImageTasks(new DescribeImportImageTasksRequest());
    }

    @Override
    public DescribeImportSnapshotTasksResult describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImportSnapshotTasksResult describeImportSnapshotTasks() {
        return describeImportSnapshotTasks(new DescribeImportSnapshotTasksRequest());
    }

    @Override
    public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstanceCreditSpecificationsResult describeInstanceCreditSpecifications(DescribeInstanceCreditSpecificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstanceStatusResult describeInstanceStatus() {
        return describeInstanceStatus(new DescribeInstanceStatusRequest());
    }

    @Override
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstancesResult describeInstances() {
        return describeInstances(new DescribeInstancesRequest());
    }

    @Override
    public DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInternetGatewaysResult describeInternetGateways() {
        return describeInternetGateways(new DescribeInternetGatewaysRequest());
    }

    @Override
    public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeKeyPairsResult describeKeyPairs() {
        return describeKeyPairs(new DescribeKeyPairsRequest());
    }

    @Override
    public DescribeLaunchTemplateVersionsResult describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLaunchTemplatesResult describeLaunchTemplates(DescribeLaunchTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMovingAddressesResult describeMovingAddresses(DescribeMovingAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMovingAddressesResult describeMovingAddresses() {
        return describeMovingAddresses(new DescribeMovingAddressesRequest());
    }

    @Override
    public DescribeNatGatewaysResult describeNatGateways(DescribeNatGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNetworkAclsResult describeNetworkAcls() {
        return describeNetworkAcls(new DescribeNetworkAclsRequest());
    }

    @Override
    public DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNetworkInterfacePermissionsResult describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNetworkInterfacesResult describeNetworkInterfaces() {
        return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest());
    }

    @Override
    public DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePlacementGroupsResult describePlacementGroups() {
        return describePlacementGroups(new DescribePlacementGroupsRequest());
    }

    @Override
    public DescribePrefixListsResult describePrefixLists(DescribePrefixListsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePrefixListsResult describePrefixLists() {
        return describePrefixLists(new DescribePrefixListsRequest());
    }

    @Override
    public DescribePrincipalIdFormatResult describePrincipalIdFormat(DescribePrincipalIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePublicIpv4PoolsResult describePublicIpv4Pools(DescribePublicIpv4PoolsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRegionsResult describeRegions(DescribeRegionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRegionsResult describeRegions() {
        return describeRegions(new DescribeRegionsRequest());
    }

    @Override
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedInstancesResult describeReservedInstances() {
        return describeReservedInstances(new DescribeReservedInstancesRequest());
    }

    @Override
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings(DescribeReservedInstancesListingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings() {
        return describeReservedInstancesListings(new DescribeReservedInstancesListingsRequest());
    }

    @Override
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications() {
        return describeReservedInstancesModifications(new DescribeReservedInstancesModificationsRequest());
    }

    @Override
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings() {
        return describeReservedInstancesOfferings(new DescribeReservedInstancesOfferingsRequest());
    }

    @Override
    public DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRouteTablesResult describeRouteTables() {
        return describeRouteTables(new DescribeRouteTablesRequest());
    }

    @Override
    public DescribeScheduledInstanceAvailabilityResult describeScheduledInstanceAvailability(DescribeScheduledInstanceAvailabilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScheduledInstancesResult describeScheduledInstances(DescribeScheduledInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSecurityGroupReferencesResult describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSecurityGroupsResult describeSecurityGroups() {
        return describeSecurityGroups(new DescribeSecurityGroupsRequest());
    }

    @Override
    public DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    @Override
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription() {
        return describeSpotDatafeedSubscription(new DescribeSpotDatafeedSubscriptionRequest());
    }

    @Override
    public DescribeSpotFleetInstancesResult describeSpotFleetInstances(DescribeSpotFleetInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotFleetRequestsResult describeSpotFleetRequests() {
        return describeSpotFleetRequests(new DescribeSpotFleetRequestsRequest());
    }

    @Override
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests() {
        return describeSpotInstanceRequests(new DescribeSpotInstanceRequestsRequest());
    }

    @Override
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory() {
        return describeSpotPriceHistory(new DescribeSpotPriceHistoryRequest());
    }

    @Override
    public DescribeStaleSecurityGroupsResult describeStaleSecurityGroups(DescribeStaleSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubnetsResult describeSubnets() {
        return describeSubnets(new DescribeSubnetsRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags() {
        return describeTags(new DescribeTagsRequest());
    }

    @Override
    public DescribeTransitGatewayAttachmentsResult describeTransitGatewayAttachments(DescribeTransitGatewayAttachmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTransitGatewayRouteTablesResult describeTransitGatewayRouteTables(DescribeTransitGatewayRouteTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTransitGatewaysResult describeTransitGateways(DescribeTransitGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVolumeAttributeResult describeVolumeAttribute(DescribeVolumeAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVolumeStatusResult describeVolumeStatus() {
        return describeVolumeStatus(new DescribeVolumeStatusRequest());
    }

    @Override
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVolumesResult describeVolumes() {
        return describeVolumes(new DescribeVolumesRequest());
    }

    @Override
    public DescribeVolumesModificationsResult describeVolumesModifications(DescribeVolumesModificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcAttributeResult describeVpcAttribute(DescribeVpcAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcClassicLinkResult describeVpcClassicLink(DescribeVpcClassicLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcClassicLinkResult describeVpcClassicLink() {
        return describeVpcClassicLink(new DescribeVpcClassicLinkRequest());
    }

    @Override
    public DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointConnectionNotificationsResult describeVpcEndpointConnectionNotifications(DescribeVpcEndpointConnectionNotificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointConnectionsResult describeVpcEndpointConnections(DescribeVpcEndpointConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointServiceConfigurationsResult describeVpcEndpointServiceConfigurations(DescribeVpcEndpointServiceConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointServicePermissionsResult describeVpcEndpointServicePermissions(DescribeVpcEndpointServicePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointServicesResult describeVpcEndpointServices() {
        return describeVpcEndpointServices(new DescribeVpcEndpointServicesRequest());
    }

    @Override
    public DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcEndpointsResult describeVpcEndpoints() {
        return describeVpcEndpoints(new DescribeVpcEndpointsRequest());
    }

    @Override
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() {
        return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest());
    }

    @Override
    public DescribeVpcsResult describeVpcs(DescribeVpcsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpcsResult describeVpcs() {
        return describeVpcs(new DescribeVpcsRequest());
    }

    @Override
    public DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpnConnectionsResult describeVpnConnections() {
        return describeVpnConnections(new DescribeVpnConnectionsRequest());
    }

    @Override
    public DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVpnGatewaysResult describeVpnGateways() {
        return describeVpnGateways(new DescribeVpnGatewaysRequest());
    }

    @Override
    public DetachClassicLinkVpcResult detachClassicLinkVpc(DetachClassicLinkVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachInternetGatewayResult detachInternetGateway(DetachInternetGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachNetworkInterfaceResult detachNetworkInterface(DetachNetworkInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachVolumeResult detachVolume(DetachVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachVpnGatewayResult detachVpnGateway(DetachVpnGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableTransitGatewayRouteTablePropagationResult disableTransitGatewayRouteTablePropagation(DisableTransitGatewayRouteTablePropagationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableVgwRoutePropagationResult disableVgwRoutePropagation(DisableVgwRoutePropagationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableVpcClassicLinkResult disableVpcClassicLink(DisableVpcClassicLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateAddressResult disassociateAddress(DisassociateAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateClientVpnTargetNetworkResult disassociateClientVpnTargetNetwork(DisassociateClientVpnTargetNetworkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateIamInstanceProfileResult disassociateIamInstanceProfile(DisassociateIamInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateRouteTableResult disassociateRouteTable(DisassociateRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateSubnetCidrBlockResult disassociateSubnetCidrBlock(DisassociateSubnetCidrBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateTransitGatewayRouteTableResult disassociateTransitGatewayRouteTable(DisassociateTransitGatewayRouteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateVpcCidrBlockResult disassociateVpcCidrBlock(DisassociateVpcCidrBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableTransitGatewayRouteTablePropagationResult enableTransitGatewayRouteTablePropagation(EnableTransitGatewayRouteTablePropagationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableVgwRoutePropagationResult enableVgwRoutePropagation(EnableVgwRoutePropagationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableVolumeIOResult enableVolumeIO(EnableVolumeIORequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableVpcClassicLinkResult enableVpcClassicLink(EnableVpcClassicLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport(EnableVpcClassicLinkDnsSupportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportClientVpnClientCertificateRevocationListResult exportClientVpnClientCertificateRevocationList(
            ExportClientVpnClientCertificateRevocationListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportClientVpnClientConfigurationResult exportClientVpnClientConfiguration(ExportClientVpnClientConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportTransitGatewayRoutesResult exportTransitGatewayRoutes(ExportTransitGatewayRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetConsoleScreenshotResult getConsoleScreenshot(GetConsoleScreenshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetHostReservationPurchasePreviewResult getHostReservationPurchasePreview(GetHostReservationPurchasePreviewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPasswordDataResult getPasswordData(GetPasswordDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuote(GetReservedInstancesExchangeQuoteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTransitGatewayAttachmentPropagationsResult getTransitGatewayAttachmentPropagations(GetTransitGatewayAttachmentPropagationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTransitGatewayRouteTableAssociationsResult getTransitGatewayRouteTableAssociations(GetTransitGatewayRouteTableAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTransitGatewayRouteTablePropagationsResult getTransitGatewayRouteTablePropagations(GetTransitGatewayRouteTablePropagationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportClientVpnClientCertificateRevocationListResult importClientVpnClientCertificateRevocationList(
            ImportClientVpnClientCertificateRevocationListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportImageResult importImage(ImportImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportImageResult importImage() {
        return importImage(new ImportImageRequest());
    }

    @Override
    public ImportInstanceResult importInstance(ImportInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportSnapshotResult importSnapshot(ImportSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportSnapshotResult importSnapshot() {
        return importSnapshot(new ImportSnapshotRequest());
    }

    @Override
    public ImportVolumeResult importVolume(ImportVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyCapacityReservationResult modifyCapacityReservation(ModifyCapacityReservationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyClientVpnEndpointResult modifyClientVpnEndpoint(ModifyClientVpnEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyFleetResult modifyFleet(ModifyFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyFpgaImageAttributeResult modifyFpgaImageAttribute(ModifyFpgaImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyHostsResult modifyHosts(ModifyHostsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyIdFormatResult modifyIdFormat(ModifyIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyIdentityIdFormatResult modifyIdentityIdFormat(ModifyIdentityIdFormatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceCapacityReservationAttributesResult modifyInstanceCapacityReservationAttributes(
            ModifyInstanceCapacityReservationAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceCreditSpecificationResult modifyInstanceCreditSpecification(ModifyInstanceCreditSpecificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstanceEventStartTimeResult modifyInstanceEventStartTime(ModifyInstanceEventStartTimeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyInstancePlacementResult modifyInstancePlacement(ModifyInstancePlacementRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyLaunchTemplateResult modifyLaunchTemplate(ModifyLaunchTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyReservedInstancesResult modifyReservedInstances(ModifyReservedInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifySnapshotAttributeResult modifySnapshotAttribute(ModifySnapshotAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifySpotFleetRequestResult modifySpotFleetRequest(ModifySpotFleetRequestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifySubnetAttributeResult modifySubnetAttribute(ModifySubnetAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyTransitGatewayVpcAttachmentResult modifyTransitGatewayVpcAttachment(ModifyTransitGatewayVpcAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVolumeAttributeResult modifyVolumeAttribute(ModifyVolumeAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcAttributeResult modifyVpcAttribute(ModifyVpcAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcEndpointResult modifyVpcEndpoint(ModifyVpcEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcEndpointConnectionNotificationResult modifyVpcEndpointConnectionNotification(ModifyVpcEndpointConnectionNotificationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcEndpointServiceConfigurationResult modifyVpcEndpointServiceConfiguration(ModifyVpcEndpointServiceConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcEndpointServicePermissionsResult modifyVpcEndpointServicePermissions(ModifyVpcEndpointServicePermissionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcPeeringConnectionOptionsResult modifyVpcPeeringConnectionOptions(ModifyVpcPeeringConnectionOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyVpcTenancyResult modifyVpcTenancy(ModifyVpcTenancyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public MonitorInstancesResult monitorInstances(MonitorInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ProvisionByoipCidrResult provisionByoipCidr(ProvisionByoipCidrRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PurchaseHostReservationResult purchaseHostReservation(PurchaseHostReservationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PurchaseScheduledInstancesResult purchaseScheduledInstances(PurchaseScheduledInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RebootInstancesResult rebootInstances(RebootInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterImageResult registerImage(RegisterImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RejectTransitGatewayVpcAttachmentResult rejectTransitGatewayVpcAttachment(RejectTransitGatewayVpcAttachmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RejectVpcEndpointConnectionsResult rejectVpcEndpointConnections(RejectVpcEndpointConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReleaseAddressResult releaseAddress(ReleaseAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceIamInstanceProfileAssociationResult replaceIamInstanceProfileAssociation(ReplaceIamInstanceProfileAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceNetworkAclEntryResult replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceRouteResult replaceRoute(ReplaceRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplaceTransitGatewayRouteResult replaceTransitGatewayRoute(ReplaceTransitGatewayRouteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RequestSpotFleetResult requestSpotFleet(RequestSpotFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetFpgaImageAttributeResult resetFpgaImageAttribute(ResetFpgaImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetImageAttributeResult resetImageAttribute(ResetImageAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetInstanceAttributeResult resetInstanceAttribute(ResetInstanceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetNetworkInterfaceAttributeResult resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetSnapshotAttributeResult resetSnapshotAttribute(ResetSnapshotAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreAddressToClassicResult restoreAddressToClassic(RestoreAddressToClassicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RevokeClientVpnIngressResult revokeClientVpnIngress(RevokeClientVpnIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RevokeSecurityGroupEgressResult revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RevokeSecurityGroupIngressResult revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public RevokeSecurityGroupIngressResult revokeSecurityGroupIngress() {
        return revokeSecurityGroupIngress(new RevokeSecurityGroupIngressRequest());
    }

    @Override
    public RunInstancesResult runInstances(RunInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RunScheduledInstancesResult runScheduledInstances(RunScheduledInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SearchTransitGatewayRoutesResult searchTransitGatewayRoutes(SearchTransitGatewayRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartInstancesResult startInstances(StartInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopInstancesResult stopInstances(StopInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateInstancesResult terminateInstances(TerminateInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnassignIpv6AddressesResult unassignIpv6Addresses(UnassignIpv6AddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnassignPrivateIpAddressesResult unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSecurityGroupRuleDescriptionsEgressResult updateSecurityGroupRuleDescriptionsEgress(UpdateSecurityGroupRuleDescriptionsEgressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSecurityGroupRuleDescriptionsIngressResult updateSecurityGroupRuleDescriptionsIngress(UpdateSecurityGroupRuleDescriptionsIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WithdrawByoipCidrResult withdrawByoipCidr(WithdrawByoipCidrRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public <X extends AmazonWebServiceRequest> DryRunResult<X> dryRun(DryRunSupportedRequest<X> request) throws AmazonServiceException, AmazonClientException {
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

    @Override
    public AmazonEC2Waiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
