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
package com.amazonaws.services.directconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VirtualInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualInterfaceMarshaller {

    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> VIRTUALINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceId").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> CONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionId").build();
    private static final MarshallingInfo<String> VIRTUALINTERFACETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceType").build();
    private static final MarshallingInfo<String> VIRTUALINTERFACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceName").build();
    private static final MarshallingInfo<Integer> VLAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vlan").build();
    private static final MarshallingInfo<Integer> ASN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asn").build();
    private static final MarshallingInfo<Long> AMAZONSIDEASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amazonSideAsn").build();
    private static final MarshallingInfo<String> AUTHKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authKey").build();
    private static final MarshallingInfo<String> AMAZONADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amazonAddress").build();
    private static final MarshallingInfo<String> CUSTOMERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerAddress").build();
    private static final MarshallingInfo<String> ADDRESSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addressFamily").build();
    private static final MarshallingInfo<String> VIRTUALINTERFACESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceState").build();
    private static final MarshallingInfo<String> CUSTOMERROUTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerRouterConfig").build();
    private static final MarshallingInfo<Integer> MTU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mtu").build();
    private static final MarshallingInfo<Boolean> JUMBOFRAMECAPABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jumboFrameCapable").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<List> ROUTEFILTERPREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeFilterPrefixes").build();
    private static final MarshallingInfo<List> BGPPEERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bgpPeers").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> AWSDEVICEV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsDeviceV2").build();

    private static final VirtualInterfaceMarshaller instance = new VirtualInterfaceMarshaller();

    public static VirtualInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualInterface virtualInterface, ProtocolMarshaller protocolMarshaller) {

        if (virtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualInterface.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVirtualInterfaceId(), VIRTUALINTERFACEID_BINDING);
            protocolMarshaller.marshall(virtualInterface.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(virtualInterface.getConnectionId(), CONNECTIONID_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVirtualInterfaceType(), VIRTUALINTERFACETYPE_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVirtualInterfaceName(), VIRTUALINTERFACENAME_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVlan(), VLAN_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAsn(), ASN_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAmazonSideAsn(), AMAZONSIDEASN_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAuthKey(), AUTHKEY_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAmazonAddress(), AMAZONADDRESS_BINDING);
            protocolMarshaller.marshall(virtualInterface.getCustomerAddress(), CUSTOMERADDRESS_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAddressFamily(), ADDRESSFAMILY_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVirtualInterfaceState(), VIRTUALINTERFACESTATE_BINDING);
            protocolMarshaller.marshall(virtualInterface.getCustomerRouterConfig(), CUSTOMERROUTERCONFIG_BINDING);
            protocolMarshaller.marshall(virtualInterface.getMtu(), MTU_BINDING);
            protocolMarshaller.marshall(virtualInterface.getJumboFrameCapable(), JUMBOFRAMECAPABLE_BINDING);
            protocolMarshaller.marshall(virtualInterface.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
            protocolMarshaller.marshall(virtualInterface.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(virtualInterface.getRouteFilterPrefixes(), ROUTEFILTERPREFIXES_BINDING);
            protocolMarshaller.marshall(virtualInterface.getBgpPeers(), BGPPEERS_BINDING);
            protocolMarshaller.marshall(virtualInterface.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(virtualInterface.getAwsDeviceV2(), AWSDEVICEV2_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
