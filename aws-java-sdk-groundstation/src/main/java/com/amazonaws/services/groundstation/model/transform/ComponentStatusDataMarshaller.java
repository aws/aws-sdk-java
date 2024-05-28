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
package com.amazonaws.services.groundstation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentStatusDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentStatusDataMarshaller {

    private static final MarshallingInfo<Long> BYTESRECEIVED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bytesReceived").build();
    private static final MarshallingInfo<Long> BYTESSENT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bytesSent").build();
    private static final MarshallingInfo<String> CAPABILITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilityArn").build();
    private static final MarshallingInfo<String> COMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentType").build();
    private static final MarshallingInfo<String> DATAFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataflowId").build();
    private static final MarshallingInfo<Long> PACKETSDROPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packetsDropped").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final ComponentStatusDataMarshaller instance = new ComponentStatusDataMarshaller();

    public static ComponentStatusDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentStatusData componentStatusData, ProtocolMarshaller protocolMarshaller) {

        if (componentStatusData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentStatusData.getBytesReceived(), BYTESRECEIVED_BINDING);
            protocolMarshaller.marshall(componentStatusData.getBytesSent(), BYTESSENT_BINDING);
            protocolMarshaller.marshall(componentStatusData.getCapabilityArn(), CAPABILITYARN_BINDING);
            protocolMarshaller.marshall(componentStatusData.getComponentType(), COMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(componentStatusData.getDataflowId(), DATAFLOWID_BINDING);
            protocolMarshaller.marshall(componentStatusData.getPacketsDropped(), PACKETSDROPPED_BINDING);
            protocolMarshaller.marshall(componentStatusData.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
