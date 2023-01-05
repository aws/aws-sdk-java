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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FirewallSubnetMissingVPCEndpointViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallSubnetMissingVPCEndpointViolationMarshaller {

    private static final MarshallingInfo<String> FIREWALLSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallSubnetId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZone").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZoneId").build();

    private static final FirewallSubnetMissingVPCEndpointViolationMarshaller instance = new FirewallSubnetMissingVPCEndpointViolationMarshaller();

    public static FirewallSubnetMissingVPCEndpointViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallSubnetMissingVPCEndpointViolation firewallSubnetMissingVPCEndpointViolation, ProtocolMarshaller protocolMarshaller) {

        if (firewallSubnetMissingVPCEndpointViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallSubnetMissingVPCEndpointViolation.getFirewallSubnetId(), FIREWALLSUBNETID_BINDING);
            protocolMarshaller.marshall(firewallSubnetMissingVPCEndpointViolation.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(firewallSubnetMissingVPCEndpointViolation.getSubnetAvailabilityZone(), SUBNETAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(firewallSubnetMissingVPCEndpointViolation.getSubnetAvailabilityZoneId(), SUBNETAVAILABILITYZONEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
