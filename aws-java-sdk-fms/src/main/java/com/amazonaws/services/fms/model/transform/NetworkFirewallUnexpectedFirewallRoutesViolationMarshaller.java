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
 * NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller {

    private static final MarshallingInfo<String> FIREWALLSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallSubnetId").build();
    private static final MarshallingInfo<List> VIOLATINGROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolatingRoutes").build();
    private static final MarshallingInfo<String> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();
    private static final MarshallingInfo<String> FIREWALLENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallEndpoint").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller instance = new NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller();

    public static NetworkFirewallUnexpectedFirewallRoutesViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkFirewallUnexpectedFirewallRoutesViolation networkFirewallUnexpectedFirewallRoutesViolation,
            ProtocolMarshaller protocolMarshaller) {

        if (networkFirewallUnexpectedFirewallRoutesViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkFirewallUnexpectedFirewallRoutesViolation.getFirewallSubnetId(), FIREWALLSUBNETID_BINDING);
            protocolMarshaller.marshall(networkFirewallUnexpectedFirewallRoutesViolation.getViolatingRoutes(), VIOLATINGROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallUnexpectedFirewallRoutesViolation.getRouteTableId(), ROUTETABLEID_BINDING);
            protocolMarshaller.marshall(networkFirewallUnexpectedFirewallRoutesViolation.getFirewallEndpoint(), FIREWALLENDPOINT_BINDING);
            protocolMarshaller.marshall(networkFirewallUnexpectedFirewallRoutesViolation.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
