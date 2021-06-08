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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoRaWANUpdateGatewayTaskCreateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANUpdateGatewayTaskCreateMarshaller {

    private static final MarshallingInfo<String> UPDATESIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateSignature").build();
    private static final MarshallingInfo<Long> SIGKEYCRC_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SigKeyCrc").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentVersion").build();
    private static final MarshallingInfo<StructuredPojo> UPDATEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateVersion").build();

    private static final LoRaWANUpdateGatewayTaskCreateMarshaller instance = new LoRaWANUpdateGatewayTaskCreateMarshaller();

    public static LoRaWANUpdateGatewayTaskCreateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANUpdateGatewayTaskCreate loRaWANUpdateGatewayTaskCreate, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANUpdateGatewayTaskCreate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANUpdateGatewayTaskCreate.getUpdateSignature(), UPDATESIGNATURE_BINDING);
            protocolMarshaller.marshall(loRaWANUpdateGatewayTaskCreate.getSigKeyCrc(), SIGKEYCRC_BINDING);
            protocolMarshaller.marshall(loRaWANUpdateGatewayTaskCreate.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(loRaWANUpdateGatewayTaskCreate.getUpdateVersion(), UPDATEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
