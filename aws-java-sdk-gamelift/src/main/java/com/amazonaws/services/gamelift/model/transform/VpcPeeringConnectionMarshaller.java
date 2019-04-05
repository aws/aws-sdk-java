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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcPeeringConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcPeeringConnectionMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> IPV4CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpV4CidrBlock").build();
    private static final MarshallingInfo<String> VPCPEERINGCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcPeeringConnectionId").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<String> PEERVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeerVpcId").build();
    private static final MarshallingInfo<String> GAMELIFTVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameLiftVpcId").build();

    private static final VpcPeeringConnectionMarshaller instance = new VpcPeeringConnectionMarshaller();

    public static VpcPeeringConnectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcPeeringConnection vpcPeeringConnection, ProtocolMarshaller protocolMarshaller) {

        if (vpcPeeringConnection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcPeeringConnection.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(vpcPeeringConnection.getIpV4CidrBlock(), IPV4CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(vpcPeeringConnection.getVpcPeeringConnectionId(), VPCPEERINGCONNECTIONID_BINDING);
            protocolMarshaller.marshall(vpcPeeringConnection.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(vpcPeeringConnection.getPeerVpcId(), PEERVPCID_BINDING);
            protocolMarshaller.marshall(vpcPeeringConnection.getGameLiftVpcId(), GAMELIFTVPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
