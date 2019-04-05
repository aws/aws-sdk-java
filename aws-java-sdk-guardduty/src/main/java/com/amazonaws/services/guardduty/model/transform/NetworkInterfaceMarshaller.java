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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkInterfaceMarshaller {

    private static final MarshallingInfo<List> IPV6ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipv6Addresses").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaceId").build();
    private static final MarshallingInfo<String> PRIVATEDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateDnsName").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateIpAddress").build();
    private static final MarshallingInfo<List> PRIVATEIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateIpAddresses").build();
    private static final MarshallingInfo<String> PUBLICDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicDnsName").build();
    private static final MarshallingInfo<String> PUBLICIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("publicIp").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroups").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vpcId").build();

    private static final NetworkInterfaceMarshaller instance = new NetworkInterfaceMarshaller();

    public static NetworkInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkInterface networkInterface, ProtocolMarshaller protocolMarshaller) {

        if (networkInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkInterface.getIpv6Addresses(), IPV6ADDRESSES_BINDING);
            protocolMarshaller.marshall(networkInterface.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(networkInterface.getPrivateDnsName(), PRIVATEDNSNAME_BINDING);
            protocolMarshaller.marshall(networkInterface.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
            protocolMarshaller.marshall(networkInterface.getPrivateIpAddresses(), PRIVATEIPADDRESSES_BINDING);
            protocolMarshaller.marshall(networkInterface.getPublicDnsName(), PUBLICDNSNAME_BINDING);
            protocolMarshaller.marshall(networkInterface.getPublicIp(), PUBLICIP_BINDING);
            protocolMarshaller.marshall(networkInterface.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(networkInterface.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(networkInterface.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
