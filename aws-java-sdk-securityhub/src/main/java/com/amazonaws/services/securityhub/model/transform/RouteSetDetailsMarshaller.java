/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteSetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteSetDetailsMarshaller {

    private static final MarshallingInfo<String> CARRIERGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CarrierGatewayId").build();
    private static final MarshallingInfo<String> CORENETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkArn").build();
    private static final MarshallingInfo<String> DESTINATIONCIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationCidrBlock").build();
    private static final MarshallingInfo<String> DESTINATIONIPV6CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIpv6CidrBlock").build();
    private static final MarshallingInfo<String> DESTINATIONPREFIXLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPrefixListId").build();
    private static final MarshallingInfo<String> EGRESSONLYINTERNETGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EgressOnlyInternetGatewayId").build();
    private static final MarshallingInfo<String> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GatewayId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INSTANCEOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceOwnerId").build();
    private static final MarshallingInfo<String> LOCALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalGatewayId").build();
    private static final MarshallingInfo<String> NATGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NatGatewayId").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceId").build();
    private static final MarshallingInfo<String> ORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Origin").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> TRANSITGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransitGatewayId").build();
    private static final MarshallingInfo<String> VPCPEERINGCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcPeeringConnectionId").build();

    private static final RouteSetDetailsMarshaller instance = new RouteSetDetailsMarshaller();

    public static RouteSetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteSetDetails routeSetDetails, ProtocolMarshaller protocolMarshaller) {

        if (routeSetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeSetDetails.getCarrierGatewayId(), CARRIERGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getCoreNetworkArn(), CORENETWORKARN_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getDestinationCidrBlock(), DESTINATIONCIDRBLOCK_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getDestinationIpv6CidrBlock(), DESTINATIONIPV6CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getDestinationPrefixListId(), DESTINATIONPREFIXLISTID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getEgressOnlyInternetGatewayId(), EGRESSONLYINTERNETGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getInstanceOwnerId(), INSTANCEOWNERID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getLocalGatewayId(), LOCALGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getNatGatewayId(), NATGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getOrigin(), ORIGIN_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getState(), STATE_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getTransitGatewayId(), TRANSITGATEWAYID_BINDING);
            protocolMarshaller.marshall(routeSetDetails.getVpcPeeringConnectionId(), VPCPEERINGCONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
