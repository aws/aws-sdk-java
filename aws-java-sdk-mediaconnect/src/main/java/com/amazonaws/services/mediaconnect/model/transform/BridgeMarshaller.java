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
package com.amazonaws.services.mediaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BridgeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BridgeMarshaller {

    private static final MarshallingInfo<String> BRIDGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bridgeArn").build();
    private static final MarshallingInfo<List> BRIDGEMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bridgeMessages").build();
    private static final MarshallingInfo<String> BRIDGESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bridgeState").build();
    private static final MarshallingInfo<StructuredPojo> EGRESSGATEWAYBRIDGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("egressGatewayBridge").build();
    private static final MarshallingInfo<StructuredPojo> INGRESSGATEWAYBRIDGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ingressGatewayBridge").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputs").build();
    private static final MarshallingInfo<String> PLACEMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEFAILOVERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFailoverConfig").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();

    private static final BridgeMarshaller instance = new BridgeMarshaller();

    public static BridgeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Bridge bridge, ProtocolMarshaller protocolMarshaller) {

        if (bridge == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bridge.getBridgeArn(), BRIDGEARN_BINDING);
            protocolMarshaller.marshall(bridge.getBridgeMessages(), BRIDGEMESSAGES_BINDING);
            protocolMarshaller.marshall(bridge.getBridgeState(), BRIDGESTATE_BINDING);
            protocolMarshaller.marshall(bridge.getEgressGatewayBridge(), EGRESSGATEWAYBRIDGE_BINDING);
            protocolMarshaller.marshall(bridge.getIngressGatewayBridge(), INGRESSGATEWAYBRIDGE_BINDING);
            protocolMarshaller.marshall(bridge.getName(), NAME_BINDING);
            protocolMarshaller.marshall(bridge.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(bridge.getPlacementArn(), PLACEMENTARN_BINDING);
            protocolMarshaller.marshall(bridge.getSourceFailoverConfig(), SOURCEFAILOVERCONFIG_BINDING);
            protocolMarshaller.marshall(bridge.getSources(), SOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
