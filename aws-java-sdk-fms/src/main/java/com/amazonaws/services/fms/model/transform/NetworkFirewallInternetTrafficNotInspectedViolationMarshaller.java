/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * NetworkFirewallInternetTrafficNotInspectedViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkFirewallInternetTrafficNotInspectedViolationMarshaller {

    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZone").build();
    private static final MarshallingInfo<String> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();
    private static final MarshallingInfo<List> VIOLATINGROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolatingRoutes").build();
    private static final MarshallingInfo<Boolean> ISROUTETABLEUSEDINDIFFERENTAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsRouteTableUsedInDifferentAZ").build();
    private static final MarshallingInfo<String> CURRENTFIREWALLSUBNETROUTETABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentFirewallSubnetRouteTable").build();
    private static final MarshallingInfo<String> EXPECTEDFIREWALLENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedFirewallEndpoint").build();
    private static final MarshallingInfo<String> FIREWALLSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallSubnetId").build();
    private static final MarshallingInfo<List> EXPECTEDFIREWALLSUBNETROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedFirewallSubnetRoutes").build();
    private static final MarshallingInfo<List> ACTUALFIREWALLSUBNETROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualFirewallSubnetRoutes").build();
    private static final MarshallingInfo<String> INTERNETGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetGatewayId").build();
    private static final MarshallingInfo<String> CURRENTINTERNETGATEWAYROUTETABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentInternetGatewayRouteTable").build();
    private static final MarshallingInfo<List> EXPECTEDINTERNETGATEWAYROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedInternetGatewayRoutes").build();
    private static final MarshallingInfo<List> ACTUALINTERNETGATEWAYROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualInternetGatewayRoutes").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final NetworkFirewallInternetTrafficNotInspectedViolationMarshaller instance = new NetworkFirewallInternetTrafficNotInspectedViolationMarshaller();

    public static NetworkFirewallInternetTrafficNotInspectedViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkFirewallInternetTrafficNotInspectedViolation networkFirewallInternetTrafficNotInspectedViolation,
            ProtocolMarshaller protocolMarshaller) {

        if (networkFirewallInternetTrafficNotInspectedViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getSubnetAvailabilityZone(), SUBNETAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getRouteTableId(), ROUTETABLEID_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getViolatingRoutes(), VIOLATINGROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getIsRouteTableUsedInDifferentAZ(),
                    ISROUTETABLEUSEDINDIFFERENTAZ_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getCurrentFirewallSubnetRouteTable(),
                    CURRENTFIREWALLSUBNETROUTETABLE_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getExpectedFirewallEndpoint(), EXPECTEDFIREWALLENDPOINT_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getFirewallSubnetId(), FIREWALLSUBNETID_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getExpectedFirewallSubnetRoutes(),
                    EXPECTEDFIREWALLSUBNETROUTES_BINDING);
            protocolMarshaller
                    .marshall(networkFirewallInternetTrafficNotInspectedViolation.getActualFirewallSubnetRoutes(), ACTUALFIREWALLSUBNETROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getInternetGatewayId(), INTERNETGATEWAYID_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getCurrentInternetGatewayRouteTable(),
                    CURRENTINTERNETGATEWAYROUTETABLE_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getExpectedInternetGatewayRoutes(),
                    EXPECTEDINTERNETGATEWAYROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getActualInternetGatewayRoutes(),
                    ACTUALINTERNETGATEWAYROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallInternetTrafficNotInspectedViolation.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
