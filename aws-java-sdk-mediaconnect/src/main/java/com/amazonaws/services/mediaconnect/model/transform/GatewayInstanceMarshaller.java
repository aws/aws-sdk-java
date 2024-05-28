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
 * GatewayInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GatewayInstanceMarshaller {

    private static final MarshallingInfo<String> BRIDGEPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bridgePlacement").build();
    private static final MarshallingInfo<String> CONNECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionStatus").build();
    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gatewayArn").build();
    private static final MarshallingInfo<String> GATEWAYINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gatewayInstanceArn").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceId").build();
    private static final MarshallingInfo<List> INSTANCEMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceMessages").build();
    private static final MarshallingInfo<String> INSTANCESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceState").build();
    private static final MarshallingInfo<Integer> RUNNINGBRIDGECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningBridgeCount").build();

    private static final GatewayInstanceMarshaller instance = new GatewayInstanceMarshaller();

    public static GatewayInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GatewayInstance gatewayInstance, ProtocolMarshaller protocolMarshaller) {

        if (gatewayInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gatewayInstance.getBridgePlacement(), BRIDGEPLACEMENT_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getConnectionStatus(), CONNECTIONSTATUS_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getGatewayArn(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getGatewayInstanceArn(), GATEWAYINSTANCEARN_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getInstanceMessages(), INSTANCEMESSAGES_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getInstanceState(), INSTANCESTATE_BINDING);
            protocolMarshaller.marshall(gatewayInstance.getRunningBridgeCount(), RUNNINGBRIDGECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
