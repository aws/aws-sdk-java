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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowdevicemanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PhysicalNetworkInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PhysicalNetworkInterfaceMarshaller {

    private static final MarshallingInfo<String> DEFAULTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultGateway").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipAddress").build();
    private static final MarshallingInfo<String> IPADDRESSASSIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddressAssignment").build();
    private static final MarshallingInfo<String> MACADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("macAddress").build();
    private static final MarshallingInfo<String> NETMASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("netmask").build();
    private static final MarshallingInfo<String> PHYSICALCONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("physicalConnectorType").build();
    private static final MarshallingInfo<String> PHYSICALNETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("physicalNetworkInterfaceId").build();

    private static final PhysicalNetworkInterfaceMarshaller instance = new PhysicalNetworkInterfaceMarshaller();

    public static PhysicalNetworkInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PhysicalNetworkInterface physicalNetworkInterface, ProtocolMarshaller protocolMarshaller) {

        if (physicalNetworkInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(physicalNetworkInterface.getDefaultGateway(), DEFAULTGATEWAY_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getIpAddressAssignment(), IPADDRESSASSIGNMENT_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getMacAddress(), MACADDRESS_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getNetmask(), NETMASK_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getPhysicalConnectorType(), PHYSICALCONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(physicalNetworkInterface.getPhysicalNetworkInterfaceId(), PHYSICALNETWORKINTERFACEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
