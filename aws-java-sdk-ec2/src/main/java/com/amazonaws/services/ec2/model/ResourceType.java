/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceType {

    CapacityReservation("capacity-reservation"),
    ClientVpnEndpoint("client-vpn-endpoint"),
    CustomerGateway("customer-gateway"),
    CarrierGateway("carrier-gateway"),
    CoipPool("coip-pool"),
    DedicatedHost("dedicated-host"),
    DhcpOptions("dhcp-options"),
    EgressOnlyInternetGateway("egress-only-internet-gateway"),
    ElasticIp("elastic-ip"),
    ElasticGpu("elastic-gpu"),
    ExportImageTask("export-image-task"),
    ExportInstanceTask("export-instance-task"),
    Fleet("fleet"),
    FpgaImage("fpga-image"),
    HostReservation("host-reservation"),
    Image("image"),
    ImportImageTask("import-image-task"),
    ImportSnapshotTask("import-snapshot-task"),
    Instance("instance"),
    InstanceEventWindow("instance-event-window"),
    InternetGateway("internet-gateway"),
    Ipam("ipam"),
    IpamPool("ipam-pool"),
    IpamScope("ipam-scope"),
    Ipv4poolEc2("ipv4pool-ec2"),
    Ipv6poolEc2("ipv6pool-ec2"),
    KeyPair("key-pair"),
    LaunchTemplate("launch-template"),
    LocalGateway("local-gateway"),
    LocalGatewayRouteTable("local-gateway-route-table"),
    LocalGatewayVirtualInterface("local-gateway-virtual-interface"),
    LocalGatewayVirtualInterfaceGroup("local-gateway-virtual-interface-group"),
    LocalGatewayRouteTableVpcAssociation("local-gateway-route-table-vpc-association"),
    LocalGatewayRouteTableVirtualInterfaceGroupAssociation("local-gateway-route-table-virtual-interface-group-association"),
    Natgateway("natgateway"),
    NetworkAcl("network-acl"),
    NetworkInterface("network-interface"),
    NetworkInsightsAnalysis("network-insights-analysis"),
    NetworkInsightsPath("network-insights-path"),
    NetworkInsightsAccessScope("network-insights-access-scope"),
    NetworkInsightsAccessScopeAnalysis("network-insights-access-scope-analysis"),
    PlacementGroup("placement-group"),
    PrefixList("prefix-list"),
    ReplaceRootVolumeTask("replace-root-volume-task"),
    ReservedInstances("reserved-instances"),
    RouteTable("route-table"),
    SecurityGroup("security-group"),
    SecurityGroupRule("security-group-rule"),
    Snapshot("snapshot"),
    SpotFleetRequest("spot-fleet-request"),
    SpotInstancesRequest("spot-instances-request"),
    Subnet("subnet"),
    SubnetCidrReservation("subnet-cidr-reservation"),
    TrafficMirrorFilter("traffic-mirror-filter"),
    TrafficMirrorSession("traffic-mirror-session"),
    TrafficMirrorTarget("traffic-mirror-target"),
    TransitGateway("transit-gateway"),
    TransitGatewayAttachment("transit-gateway-attachment"),
    TransitGatewayConnectPeer("transit-gateway-connect-peer"),
    TransitGatewayMulticastDomain("transit-gateway-multicast-domain"),
    TransitGatewayPolicyTable("transit-gateway-policy-table"),
    TransitGatewayRouteTable("transit-gateway-route-table"),
    TransitGatewayRouteTableAnnouncement("transit-gateway-route-table-announcement"),
    Volume("volume"),
    Vpc("vpc"),
    VpcEndpoint("vpc-endpoint"),
    VpcEndpointConnection("vpc-endpoint-connection"),
    VpcEndpointService("vpc-endpoint-service"),
    VpcEndpointServicePermission("vpc-endpoint-service-permission"),
    VpcPeeringConnection("vpc-peering-connection"),
    VpnConnection("vpn-connection"),
    VpnGateway("vpn-gateway"),
    VpcFlowLog("vpc-flow-log"),
    CapacityReservationFleet("capacity-reservation-fleet"),
    TrafficMirrorFilterRule("traffic-mirror-filter-rule"),
    VpcEndpointConnectionDeviceType("vpc-endpoint-connection-device-type"),
    VpnConnectionDeviceType("vpn-connection-device-type");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ResourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceType enumEntry : ResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
