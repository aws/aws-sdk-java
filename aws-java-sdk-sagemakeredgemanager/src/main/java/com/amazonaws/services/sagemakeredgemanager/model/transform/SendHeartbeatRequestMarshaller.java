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
package com.amazonaws.services.sagemakeredgemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakeredgemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendHeartbeatRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendHeartbeatRequestMarshaller {

    private static final MarshallingInfo<List> AGENTMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentMetrics").build();
    private static final MarshallingInfo<List> MODELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Models").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();
    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<String> DEVICEFLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceFleetName").build();

    private static final SendHeartbeatRequestMarshaller instance = new SendHeartbeatRequestMarshaller();

    public static SendHeartbeatRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendHeartbeatRequest sendHeartbeatRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendHeartbeatRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendHeartbeatRequest.getAgentMetrics(), AGENTMETRICS_BINDING);
            protocolMarshaller.marshall(sendHeartbeatRequest.getModels(), MODELS_BINDING);
            protocolMarshaller.marshall(sendHeartbeatRequest.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(sendHeartbeatRequest.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(sendHeartbeatRequest.getDeviceFleetName(), DEVICEFLEETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
