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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteHasOutOfScopeEndpointViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteHasOutOfScopeEndpointViolationMarshaller {

    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();
    private static final MarshallingInfo<List> VIOLATINGROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolatingRoutes").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZone").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZoneId").build();
    private static final MarshallingInfo<String> CURRENTFIREWALLSUBNETROUTETABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentFirewallSubnetRouteTable").build();
    private static final MarshallingInfo<String> FIREWALLSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallSubnetId").build();
    private static final MarshallingInfo<List> FIREWALLSUBNETROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallSubnetRoutes").build();
    private static final MarshallingInfo<String> INTERNETGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetGatewayId").build();
    private static final MarshallingInfo<String> CURRENTINTERNETGATEWAYROUTETABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentInternetGatewayRouteTable").build();
    private static final MarshallingInfo<List> INTERNETGATEWAYROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetGatewayRoutes").build();

    private static final RouteHasOutOfScopeEndpointViolationMarshaller instance = new RouteHasOutOfScopeEndpointViolationMarshaller();

    public static RouteHasOutOfScopeEndpointViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteHasOutOfScopeEndpointViolation routeHasOutOfScopeEndpointViolation, ProtocolMarshaller protocolMarshaller) {

        if (routeHasOutOfScopeEndpointViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getRouteTableId(), ROUTETABLEID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getViolatingRoutes(), VIOLATINGROUTES_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getSubnetAvailabilityZone(), SUBNETAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getSubnetAvailabilityZoneId(), SUBNETAVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getCurrentFirewallSubnetRouteTable(), CURRENTFIREWALLSUBNETROUTETABLE_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getFirewallSubnetId(), FIREWALLSUBNETID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getFirewallSubnetRoutes(), FIREWALLSUBNETROUTES_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getInternetGatewayId(), INTERNETGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getCurrentInternetGatewayRouteTable(), CURRENTINTERNETGATEWAYROUTETABLE_BINDING);
            protocolMarshaller.marshall(routeHasOutOfScopeEndpointViolation.getInternetGatewayRoutes(), INTERNETGATEWAYROUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
