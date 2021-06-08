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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransitGatewayConnectPeerAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransitGatewayConnectPeerAssociationMarshaller {

    private static final MarshallingInfo<String> TRANSITGATEWAYCONNECTPEERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransitGatewayConnectPeerArn").build();
    private static final MarshallingInfo<String> GLOBALNETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalNetworkId").build();
    private static final MarshallingInfo<String> DEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceId").build();
    private static final MarshallingInfo<String> LINKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LinkId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();

    private static final TransitGatewayConnectPeerAssociationMarshaller instance = new TransitGatewayConnectPeerAssociationMarshaller();

    public static TransitGatewayConnectPeerAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransitGatewayConnectPeerAssociation transitGatewayConnectPeerAssociation, ProtocolMarshaller protocolMarshaller) {

        if (transitGatewayConnectPeerAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transitGatewayConnectPeerAssociation.getTransitGatewayConnectPeerArn(), TRANSITGATEWAYCONNECTPEERARN_BINDING);
            protocolMarshaller.marshall(transitGatewayConnectPeerAssociation.getGlobalNetworkId(), GLOBALNETWORKID_BINDING);
            protocolMarshaller.marshall(transitGatewayConnectPeerAssociation.getDeviceId(), DEVICEID_BINDING);
            protocolMarshaller.marshall(transitGatewayConnectPeerAssociation.getLinkId(), LINKID_BINDING);
            protocolMarshaller.marshall(transitGatewayConnectPeerAssociation.getState(), STATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
